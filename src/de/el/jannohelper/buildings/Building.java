package de.el.jannohelper.buildings;

import de.el.jannohelper.products.Product;
import de.el.jannohelper.products.Product.Products;
import java.util.Map;

/**
 *
 * @author PEH
 */
public abstract class Building {

	public Building(String buildingName, double productionPerMinute, Product.Products product){
		this.buildingName = buildingName;
		this.productionPerMinute = productionPerMinute;
		this.producedProduct = producedProduct;
	}

	private double productionPerMinute;
	private Products producedProduct;
	private String buildingName;

	public String getBuildingName(){
		return this.buildingName;
	}

	public double getProductionPerMinute(){
		return productionPerMinute;
	}

	public Products getProducedProduct(){
		return this.producedProduct;
	}

	public abstract Map<Products, Integer> getNeededProducts();
	

}
