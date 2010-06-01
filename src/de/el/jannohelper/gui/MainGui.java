package de.el.jannohelper.gui;

import de.el.jannohelper.PopulationList;
import de.el.jannohelper.buildings.Building;
import de.el.jannohelper.buildings.BuildingFactory;
import de.el.jannohelper.citizens.Begger;
import de.el.jannohelper.citizens.Citizen;
import de.el.jannohelper.citizens.CitizenType;
import de.el.jannohelper.citizens.Envoy;
import de.el.jannohelper.citizens.Nobleman;
import de.el.jannohelper.citizens.Nomad;
import de.el.jannohelper.citizens.Patrician;
import de.el.jannohelper.citizens.Peasent;
import de.el.jannohelper.products.Product;
import java.util.Map;
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
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
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
		shell.setText("JAnnoHelper" + VERSION);
		initMenu();
		initGui();
	}
	private static final Logger LOG = LoggerFactory.getLogger(MainGui.class);
//	private static final String SAMPLE = "bettler.500:bauern.150:buerger.25:patrizier.0:adlige.0:nomaden.0:gesandte.0";
	private static final String SAMPLE = "bettler.300000:bauern.300000:buerger.300000:patrizier.300000:adlige.300000:nomaden.300000:gesandte.300000";
	private PopulationList populationList;
	private Shell shell;
	private Display display;
	private Composite comp;
	private Text importStringText;
	private static final String VERSION = "0.1 pre_alpha";
	private Label beggerLabel, peasentLabel, citizenLabel, patricianLabel, noblemanLabel, nomadLabel, envoyLabel;
	private Text beggerText, peasentText, citizenText, patricianText, noblemanText, nomadText, envoyText;
	private Spinner beggerHouses, peasentHouses, citizenHouses, patricianHouses, noblemanHouses, nomadHouses, envoyHouses;
	private Group populationGroup;

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

	}

	private void initCitizenGroup() {
		populationGroup = new Group(comp, SWT.NONE);
		FormData f = new FormData();
		f.top = new FormAttachment(importStringText, 5);
		f.left = new FormAttachment(0, 5);
		f.right = new FormAttachment(100, -5);
		populationGroup.setLayoutData(f);
		populationGroup.setText("population");
		populationGroup.setLayout(new GridLayout(7, true));
		{
			beggerLabel = new Label(populationGroup, SWT.CENTER);
			peasentLabel = new Label(populationGroup, SWT.CENTER);
			citizenLabel = new Label(populationGroup, SWT.CENTER);
			patricianLabel = new Label(populationGroup, SWT.CENTER);
			noblemanLabel = new Label(populationGroup, SWT.CENTER);
			nomadLabel = new Label(populationGroup, SWT.CENTER);
			envoyLabel = new Label(populationGroup, SWT.CENTER);

			beggerLabel.setText("Begger");
			peasentLabel.setText("Peasent");
			citizenLabel.setText("Citizen");
			patricianLabel.setText("Patrician");
			noblemanLabel.setText("Noblem");
			nomadLabel.setText("Nomad");
			envoyLabel.setText("Envoy");

			beggerText = new Text(populationGroup, SWT.NONE);
			peasentText = new Text(populationGroup, SWT.NONE);
			citizenText = new Text(populationGroup, SWT.NONE);
			patricianText = new Text(populationGroup, SWT.NONE);
			noblemanText = new Text(populationGroup, SWT.NONE);
			nomadText = new Text(populationGroup, SWT.NONE);
			envoyText = new Text(populationGroup, SWT.NONE);

			// TODO: check prefs wether house or population method should be used
			if (true) {
				beggerText.setEnabled(false);
				peasentText.setEnabled(false);
				citizenText.setEnabled(false);
				patricianText.setEnabled(false);
				noblemanText.setEnabled(false);
				nomadText.setEnabled(false);
				envoyText.setEnabled(false);
			}


			beggerHouses = new Spinner(populationGroup, SWT.NONE);
			peasentHouses = new Spinner(populationGroup, SWT.NONE);
			citizenHouses = new Spinner(populationGroup, SWT.NONE);
			patricianHouses = new Spinner(populationGroup, SWT.NONE);
			noblemanHouses = new Spinner(populationGroup, SWT.NONE);
			nomadHouses = new Spinner(populationGroup, SWT.NONE);
			envoyHouses = new Spinner(populationGroup, SWT.NONE);

			beggerHouses.setData(Begger.class);

			beggerHouses.setMaximum(Integer.MAX_VALUE);
			peasentHouses.setMaximum(Integer.MAX_VALUE);
			citizenHouses.setMaximum(Integer.MAX_VALUE);
			patricianHouses.setMaximum(Integer.MAX_VALUE);
			noblemanHouses.setMaximum(Integer.MAX_VALUE);
			nomadHouses.setMaximum(Integer.MAX_VALUE);
			envoyHouses.setMaximum(Integer.MAX_VALUE);


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

	private Map<Building, Double> getNeededBuildingsByBuilding(Building b){
		for(Entry<Product, Double> e : b.getNeededProducts().entrySet()){
			Building c = BuildingFactory.getBuildingByProduct(e.getKey());
			while(c != null){
				
			}
		}
		return null;
	}

	private void getNeedingsForPopulationList(PopulationList populationList) {
		for (CitizenType c : populationList) {
			LOG.debug(c.getName());
			for (Entry<Product, Double> habitant : c.getNeedingsPerHabitant().entrySet()) {
				Building b = BuildingFactory.getBuildingByProduct(habitant.getKey());
				if (b != null) {
					double productsNeeded = habitant.getValue() * c.getPopulation();
					double buildingsNeeded = productsNeeded / b.getProductionPerMinute();
					LOG.debug(" {} -> {} ({})", new Object[]{habitant.getKey().getName(), productsNeeded, buildingsNeeded});
					int neededCount = b.getNeededProductsCount();
					while(neededCount != 0){
						neededCount = 0;
						for(Entry<Product, Double> e : b.getNeededProducts().entrySet()){
							b = BuildingFactory.getBuildingByProduct(e.getKey());
							if(b != null){
								LOG.debug("  {}", b.getBuildingName());
								neededCount = b.getNeededProductsCount();
							}
						}
					}
				}
			}
		}
	}

	private class ImportStringModifyListener implements ModifyListener {

		public void modifyText(ModifyEvent e) {
			populationList.update(importStringText.getText());
			for (CitizenType c : populationList) {
				if (c instanceof Begger) {
					beggerText.setText("" + c.getPopulation());
					beggerHouses.setSelection(c.getNeededHouses());
				} else if (c instanceof Peasent) {
					peasentText.setText("" + c.getPopulation());
					peasentHouses.setSelection(c.getNeededHouses());
				} else if (c instanceof Citizen) {
					citizenText.setText("" + c.getPopulation());
					citizenHouses.setSelection(c.getNeededHouses());
				} else if (c instanceof Patrician) {
					patricianText.setText("" + c.getPopulation());
					patricianHouses.setSelection(c.getNeededHouses());
				} else if(c instanceof Nobleman){
					noblemanText.setText("" + c.getPopulation());
					noblemanHouses.setSelection(c.getNeededHouses());
				} else if(c instanceof Nomad){
					nomadText.setText("" + c.getPopulation());
					nomadHouses.setSelection(c.getNeededHouses());
				} else if(c instanceof Envoy){
					envoyText.setText("" + c.getPopulation());
					envoyHouses.setSelection(c.getNeededHouses());
				}
			}
			getNeedingsForPopulationList(populationList);
		}
	}
}
