package de.el.jannohelper.gui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

/**
 *
 * @author PEH
 */
public class ImageLabel extends Composite {

	public ImageLabel(Composite parent, int style, boolean horizontal, boolean imageFirst) {
		super(parent, style);
		this.imageFirst = imageFirst;
		if (horizontal) {
			this.setLayout(new GridLayout(2, true));
		} else {
			this.setLayout(new GridLayout(1, true));
		}
		if (imageFirst) {
			initImage();
			initText();
		} else {
			initText();
			initImage();
		}
	}
	private Label image;
	private Label text;
	private boolean imageFirst;

	private void initImage() {
		this.image = new Label(this, SWT.CENTER);
		this.image.setImage(new Image(Display.getDefault(), getClass().getResourceAsStream("resources/blank.png")));
		if (imageFirst) {
			GridData d = new GridData(SWT.CENTER, SWT.CENTER, true, true);
			image.setLayoutData(d);
		}
	}

	private void initText() {
		this.text = new Label(this, SWT.CENTER | SWT.BORDER);
		if (imageFirst) {
			GridData d = new GridData(SWT.CENTER, SWT.CENTER, true, true);
			text.setLayoutData(d);
		}
	}

	;

	public void setImage(Image image) {
		this.image.setImage(image);
		this.image.pack();
		this.pack();
	}

	public void setText(String text) {
		this.text.setText(text);
		this.text.pack();
		this.pack();
	}

	public void reset(){
		this.image.setImage(new Image(Display.getDefault(), getClass().getResourceAsStream("resources/blank.png")));
		this.text.setText("");
	}
}
