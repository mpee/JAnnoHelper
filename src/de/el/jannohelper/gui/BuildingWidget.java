package de.el.jannohelper.gui;

import de.el.jannohelper.buildings.Building;
import de.el.jannohelper.products.Product;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

/**
 *
 * @author PEH
 */
public class BuildingWidget extends Composite {

	public BuildingWidget(Composite parent, int style, Building b) {
		super(parent, style);
		super.setLayout(new FormLayout());
		this.building = b;
		initImage();
		initAmount();
		initUtilization();
		initChain();
	}
	private Building building;
	private Label image;
	private Label amount;
	private Label utilization;
	private Button chain;
	private static final Image chainImage = new Image(Display.getDefault(), Product.class.getResourceAsStream("resources/chain.png"));

	public Building getBuilding() {
		return this.building;
	}

	public void updateAmount(Integer i){
		amount.setText(String.valueOf(i));
	}

	public void updateUtilization(int i){
		utilization.setText(String.valueOf(i));
	}

	private void initImage() {
		FormData f = new FormData();
		f.top = new FormAttachment(0);
		f.left = new FormAttachment(0);
		f.right = new FormAttachment(100);
		image = new Label(this, SWT.NONE);

		image.setImage(building.getProducedProduct().getImage());
		image.setLayoutData(f);
		image.setToolTipText(building.getName());
	}

	private void initAmount() {
		FormData f = new FormData();
		f.top = new FormAttachment(image);
		f.left = new FormAttachment(0);
		f.right = new FormAttachment(100);
		amount = new Label(this, SWT.CENTER);
		amount.setLayoutData(f);
	}

	private void initUtilization(){
		FormData f = new FormData();
		f.top = new FormAttachment(amount);
		f.left = new FormAttachment(0);
		f.right = new FormAttachment(100);
		utilization = new Label(this, SWT.CENTER);
		utilization.setLayoutData(f);
	}

	private void initChain(){
		FormData f = new FormData();
		f.top = new FormAttachment(utilization);
		f.left = new FormAttachment(0);
		f.right = new FormAttachment(100);
		chain = new Button(this, SWT.NONE);
		chain.setLayoutData(f);
		chain.setImage(chainImage);
	}

	public void addButtonSelectionListener(SelectionListener listener){
		this.chain.addSelectionListener(listener);
	}
}
