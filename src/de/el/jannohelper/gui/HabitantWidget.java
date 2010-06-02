package de.el.jannohelper.gui;

import de.el.jannohelper.citizens.CitizenType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;

/**
 * A Special widget combining an Image, Text and Spinner
 * @author PEH
 */
public class HabitantWidget extends Composite {

	public HabitantWidget(Composite parent, int style, CitizenType c) {
		super(parent, style);
		this.habitant = c;
		this.setLayout(new FormLayout());
		initLabel();
		initText();
		initSpinner();
	}

	private CitizenType habitant;
	private Text text;
	private Spinner spinner;
	private Label label;

	private void initLabel() {
		FormData f = new FormData();
		f.top = new FormAttachment(0);
		f.left = new FormAttachment(0);
		f.right = new FormAttachment(100);
		this.label = new Label(this, SWT.CENTER);
		this.label.setLayoutData(f);
		this.label.setImage(habitant.getImage());
		this.label.setToolTipText(habitant.getName());
	}

	private void initText(){
		this.text = new Text(this, SWT.NONE);
		FormData f = new FormData();
		f.top = new FormAttachment(label, 5);
		f.left = new FormAttachment(0);
		f.right = new FormAttachment(100);
		this.text.setLayoutData(f);
		this.text.setEditable(false);
	}

	private void initSpinner(){
		this.spinner = new Spinner(this, SWT.NONE);
		FormData f = new FormData();
		f.top = new FormAttachment(text, 5);
		f.left = new FormAttachment(0);
		f.right = new FormAttachment(100);
		this.spinner.setLayoutData(f);
		this.spinner.setMaximum(Integer.MAX_VALUE);
		this.spinner.setIncrement(1);
	}

	public CitizenType getHabitant(){
		return this.habitant;
	}

	public void updateFields(){
		this.text.setText(String.valueOf(habitant.getPopulation()));
		this.spinner.setSelection(habitant.getNeededHouses());
	}

	public void setSpinnerText(String text){
		this.spinner.setSelection(Integer.valueOf(text));
	}

	public void setTextText(String text){
		this.text.setText(String.valueOf(habitant.getPopulation()));
		this.spinner.setSelection(habitant.getNeededHouses());
	}

	public void addSpinnerSelectionListener(SelectionListener l){
		this.spinner.addSelectionListener(l);
	}

	public void addSpinnerModifyListener(ModifyListener l){
		this.spinner.addModifyListener(l);
	}

	public void addTextModifyListener(ModifyListener l){
		this.text.addModifyListener(l);
	}

	public String getTextText(){
		return this.text.getText();
	}

	public int getSpinnerSelection(){
		return this.spinner.getSelection();
	}
}
