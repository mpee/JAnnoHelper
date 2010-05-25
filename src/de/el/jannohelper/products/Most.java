package de.el.jannohelper.products;

import de.el.jannohelper.buildings.Building;
import de.el.jannohelper.buildings.MostHof;

/**
 *
 * @author PEH
 */
public class Most extends Product{

	public Most() {
		super("Most");
	}

	@Override
	public Building getProducingBuilding() {
		return new MostHof(this);
	}



}
