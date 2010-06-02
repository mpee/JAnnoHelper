package de.el.jannohelper;

import de.el.jannohelper.buildings.Building;
import java.util.LinkedHashMap;

/**
 *
 * @author PEH
 */
public class BuildingList extends LinkedHashMap<Building, Integer> {

	public BuildingList() {
		super.put(Building.FISHERMANS_HUT, 0);
		super.put(Building.SPICE_FARM, 0);
		super.put(Building.BAKERY, 0);
		super.put(Building.BUTCHERS_SHOP, 0);
		super.put(Building.CIDER_FARM, 0);
		super.put(Building.MONASTERY_BREWERY, 0);
		super.put(Building.WINE_PRESS, 0);
		super.put(Building.WEAVERS_HUT, 0);
		super.put(Building.TANNERY, 0);
		super.put(Building.FURRIERS_WORKSHOP, 0);
		super.put(Building.SILK_WEAVING_MILL, 0);
		super.put(Building.PRINTING_HOUSE, 0);
		super.put(Building.REDSMITHS_WORKSHOP, 0);
		super.put(Building.OPTICIANS_WORKSHOP, 0);
		super.put(Building.DATE_PLANTATION, 0);
		super.put(Building.GOAT_FARM, 0);
		super.put(Building.CARPET_WORKSHOP, 0);
		super.put(Building.ROASTING_HOUSE, 0);
		super.put(Building.PEARL_WORKSHOP, 0);
		super.put(Building.PERFUMERY, 0);
		super.put(Building.CONFECTIONERS_WORKSHOP, 0);
	}

	public void update(Building b, int amount) {
		Integer currentAmount = super.get(b);
		super.put(b, currentAmount + amount);
	}
}
