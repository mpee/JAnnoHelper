package de.el.jannohelper.products;

import de.el.jannohelper.buildings.Building;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author PEH
 */
public class ProductionData {

	public static Map<Product, Double> getNeededProduct(Building building){
		productionMap.clear();
		return productionMap;
	}

	private static Map<Product, Double> productionMap = new HashMap<Product, Double>();
}
