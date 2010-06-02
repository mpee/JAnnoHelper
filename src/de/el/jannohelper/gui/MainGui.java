package de.el.jannohelper.gui;

import de.el.jannohelper.BuildingList;
import de.el.jannohelper.PopulationList;
import de.el.jannohelper.buildings.Building;
import de.el.jannohelper.buildings.BuildingFactory;
import de.el.jannohelper.citizens.CitizenType;
import de.el.jannohelper.products.Product;
import java.util.Map.Entry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author PEH
 */
public class MainGui {

	public MainGui() {
		display = Display.getDefault();
		shell = new Shell(display);
		shell.setLayout(new FillLayout());
		populationList = new PopulationList();
		buildingList = new BuildingList();
		shell.setText("JAnnoHelper" + VERSION);
		images = new Images(display);
		initMenu();
		initGui();
	}
	private static final Logger LOG = LoggerFactory.getLogger(MainGui.class);
//	private static final String SAMPLE = "bettler.500:bauern.150:buerger.25:patrizier.0:adlige.0:nomaden.0:gesandte.0";
	private static final String SAMPLE = "bettler.300000:bauern.300000:buerger.300000:patrizier.300000:adlige.300000:nomaden.300000:gesandte.300000";
	private PopulationList populationList;
	private BuildingList buildingList;
	private Shell shell;
	private Display display;
	private Composite comp;
	private Text importStringText;
	private static final String VERSION = "0.1 pre_alpha";
	private Group populationGroup, productGroup;
	private Images images;
	private HabitantWidget[] habitantWidgets = new HabitantWidget[7];
	private BuildingWidget[] buildingWidgets = new BuildingWidget[21];

	private void initGui() {
		comp = new Composite(shell, SWT.NONE);
		comp.setLayout(new FormLayout());


		FormData f = new FormData();
		f.left = new FormAttachment(0, 5);
		f.top = new FormAttachment(0, 5);
		f.right = new FormAttachment(100, -5);
		f.width = 500;

		importStringText = new Text(comp, SWT.BORDER);
		importStringText.setLayoutData(f);
		importStringText.addModifyListener(new ImportStringModifyListener());

		initCitizenGroup();
		initProductGroup();

	}

	private void initProductGroup() {
		productGroup = new Group(comp, SWT.NONE);
		FormData f = new FormData();
		f.top = new FormAttachment(populationGroup, 5);
		f.left = new FormAttachment(0, 5);
		f.right = new FormAttachment(100, -5);
		productGroup.setLayoutData(f);
		productGroup.setText("Products");
		RowLayout r = new RowLayout(SWT.HORIZONTAL);
		r.justify = true;
		productGroup.setLayout(r);
		{
			int i = 0;
			for (Entry<Building, Integer> building : buildingList.entrySet()) {
				f = new FormData();
				f.top = new FormAttachment(0, 5);
				if (i == 0) {
					f.left = new FormAttachment(0, 5);
				} else {
					f.left = new FormAttachment(buildingWidgets[i - 1], 5);
				}
				buildingWidgets[i] = new BuildingWidget(productGroup, SWT.NONE, building.getKey());
//				buildingWidgets[i].setLayoutData(f);
				i++;
			}
		}
	}

	private void initCitizenGroup() {
		populationGroup = new Group(comp, SWT.NONE);
		FormData f = new FormData();
		f.top = new FormAttachment(importStringText, 5);
		f.left = new FormAttachment(0, 5);
		f.right = new FormAttachment(100, -5);
		populationGroup.setLayoutData(f);
		populationGroup.setText("Population");
		RowLayout r = new RowLayout(SWT.HORIZONTAL);
		r.justify = true;
		populationGroup.setLayout(r);
		{
			for (int i = 0; i < populationList.size(); i++) {
				habitantWidgets[i] = new HabitantWidget(populationGroup, SWT.NONE, populationList.get(i));
				habitantWidgets[i].addSpinnerSelectionListener(new SelectionAdapter() {

					@Override
					public void widgetSelected(SelectionEvent e) {
						HabitantWidget hw = (HabitantWidget) (((Spinner) e.getSource()).getParent());
						hw.getHabitant().setPopulation(hw.getSpinnerSelection() * hw.getHabitant().getPopulationPerHouse());
						hw.updateFields();
						listUpdated();
					}
				});

			}
		}
	}

	private void initMenu() {
		Menu menuBar = new Menu(shell, SWT.BAR);
		MenuItem fileMenuHeader = new MenuItem(menuBar, SWT.CASCADE);
		fileMenuHeader.setText("&File");
		{
			Menu fileMenu = new Menu(shell, SWT.DROP_DOWN);
			{
				MenuItem exitItem = new MenuItem(fileMenu, SWT.NONE);
				exitItem.setText("&Exit");
				exitItem.addSelectionListener(new SelectionAdapter() {

					@Override
					public void widgetSelected(SelectionEvent e) {
						shell.dispose();
					}
				});
			}
			fileMenuHeader.setMenu(fileMenu);

		}

		shell.setMenuBar(menuBar);
	}

	public void open() {
		shell.pack();
		shell.open();
		importStringText.setText(SAMPLE);
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	private void getRequirementsForPopulationList(PopulationList populationList) {
		buildingList = new BuildingList();
		for (CitizenType habitant : populationList) {
			for (Entry<Product, Double> requiredProduct : habitant.getNeedingsPerHabitant().entrySet()) {
				Building b = BuildingFactory.getBuildingByProduct(requiredProduct.getKey());
				if (b != null) {
					double productsNeeded = requiredProduct.getValue() * habitant.getPopulation();
					int buildingsNeeded = (int) (productsNeeded / b.getProductionPerMinute() + 0.5) + buildingList.get(b);
					buildingList.put(b, buildingsNeeded);
//					buildingList.update(b, buildingList.get(b) + buildingsNeeded);
				}
			}
		}
		updateBuildingWidgets();
	}

	private void updateBuildingWidgets() {
		for (Entry<Building, Integer> buildingE : buildingList.entrySet()) {
			for (BuildingWidget b : buildingWidgets) {
				if (b.getBuilding() == buildingE.getKey()) {
					b.updateAmount(buildingE.getValue());
				}
			}
		}
	}

	private void listUpdated() {
		for (HabitantWidget hw : habitantWidgets) {
			hw.updateFields();
		}
		getRequirementsForPopulationList(populationList);
	}

	private class ImportStringModifyListener implements ModifyListener {

		public void modifyText(ModifyEvent e) {
			try {
				populationList.update(importStringText.getText());
				listUpdated();
			} catch (NumberFormatException ex) {
			LOG.debug("only numbers allowed");
			}
		}
	}
}
