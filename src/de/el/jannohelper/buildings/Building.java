package de.el.jannohelper.buildings;

import de.el.jannohelper.products.Product;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author PEH
 */
public abstract class Building {

	public Building(String buildingName, double productionPerMinute, Product producedProduct){
		this.buildingName = buildingName;
		this.productionPerMinute = productionPerMinute;
		this.producedProduct = producedProduct;
	}

	private double productionPerMinute;
	private Product producedProduct;
	private String buildingName;

	public String getBuildingName(){
		return this.buildingName;
	}

	public double getProductionPerMinute(){
		return productionPerMinute;
	}

	public Product getProducedProduct(){
		return this.producedProduct;
	}

	public abstract Map<Product, Integer> getNeededProducts();
	

}
