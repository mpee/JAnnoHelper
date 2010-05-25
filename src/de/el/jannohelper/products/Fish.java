package de.el.jannohelper.products;

import de.el.jannohelper.buildings.Building;
import de.el.jannohelper.buildings.FishHut;

/**
 *
 * @author PEH
 */
public class Fish extends Product{

	public Fish() {
		super("Fish");
	}

	@Override
	public Building getProducingBuilding() {
		return new FishHut(this);
	}

}
