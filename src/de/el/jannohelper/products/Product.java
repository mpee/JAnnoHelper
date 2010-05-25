package de.el.jannohelper.products;

import de.el.jannohelper.buildings.Building;
import java.util.Map.Entry;

/**
 *
 * @author PEH
 */
public abstract class Product {

	public Product(String productName){
		this.productName = productName;
	}

	private String productName;

	public String getProductName(){
		return this.productName;
	}

	public abstract Building getProducingBuilding();
}
