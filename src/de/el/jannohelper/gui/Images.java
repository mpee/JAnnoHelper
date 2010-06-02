package de.el.jannohelper.gui;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 *
 * @author PEH
 */
public class Images {

	public Images(Display d){
		this.display = d;
		this.beggar = new Image(display, this.getClass().getResourceAsStream("resources/beggar.png"));
		this.peasant = new Image(display, this.getClass().getResourceAsStream("resources/peasant.png"));
		this.citizen = new Image(display, this.getClass().getResourceAsStream("resources/citizen.png"));
		this.patrician = new Image(display, this.getClass().getResourceAsStream("resources/patrician.png"));
		this.nobleman = new Image(display, this.getClass().getResourceAsStream("resources/nobleman.png"));
		this.nomad = new Image(display, this.getClass().getResourceAsStream("resources/nomad.png"));
		this.envoy = new Image(display, this.getClass().getResourceAsStream("resources/envoy.png"));
		
	}

	private Display display;

	public Image beggar, peasant, citizen, patrician, nobleman, nomad, envoy;
}
