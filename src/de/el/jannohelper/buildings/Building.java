package de.el.jannohelper.buildings;

import de.el.jannohelper.products.Product;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PEH
 */
public class Building {

	public Building(String buildingName, double productionPerMinute, Product producedProduct) {
		this.buildingName = buildingName;
		this.productionPerMinute = productionPerMinute;
		this.producedProduct = producedProduct;
		neededProducts = new HashMap<Product, Double>();
	}

	public Building(String buildingName, double productionPerMinute, Product producedProduct, Product neededProduct1, Double needeProduct1Count) {
		this(buildingName, productionPerMinute, producedProduct);
		this.neededProducts.put(neededProduct1, needeProduct1Count);
	}

	public Building(String buildingName, double productionPerMinute, Product producedProduct, Product[] neededProducts, Product neededProduct1, Double needeProduct1Count, Product neededProduct2, Double needeProduct2Count) {
		this(buildingName, productionPerMinute, producedProduct, neededProduct1, needeProduct1Count);
		this.neededProducts.put(neededProduct2, needeProduct2Count);
	}
	private double productionPerMinute;
	private Product producedProduct;
	private Map<Product, Double> neededProducts;
	private String buildingName;

	public String getBuildingName() {
		return this.buildingName;
	}

	public double getProductionPerMinute() {
		return productionPerMinute;
	}

	public Product getProducedProduct() {
		return this.producedProduct;
	}

	public int getNeededProductsSize() {
		return this.neededProducts.size();
	}

	public Map<Product, Double> getNeededProducts() {
		return this.neededProducts;
	}

	public static Building getBuildingByProducedProduct(Product p){
		if(p == Product.FISH)
			return FISH_HUT;
		else if(p == Product.WOOD)
			return LUMBER_HUT;
		else if(p == Product.CIDER)
			return CIDER_FARM;
		else if(p == Product.HEMP)
			return HEMP_PLANT;
		else if(p == Product.LINEN_GARMENT)
			return WEAVERS_HUT;
		return null;
	}
	public static final Building FISH_HUT = new Building("Fisherman's hut", 2, Product.FISH);
	public static final Building LUMBER_HUT = new Building("Lumberjack's hut", 1.5, Product.WOOD);
	public static final Building CIDER_FARM = new Building("Cider farm", 1.5, Product.CIDER);
	public static final Building HEMP_PLANT = new Building("Hemp Plantage", 1, Product.HEMP);
	public static final Building WEAVERS_HUT = new Building("Weaver's hut", 1, Product.LINEN_GARMENT, Product.HEMP, 2.0);
}
