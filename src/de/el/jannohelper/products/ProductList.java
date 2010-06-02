package de.el.jannohelper.products;

import java.util.LinkedHashMap;


/**
 * This map represents all requirements
 * @author PEH
 */
public class ProductList extends LinkedHashMap<Product, Double>{

	public ProductList(){
		super.put(Product.FISH, 0.0);
		super.put(Product.SPICE, 0.0);
		super.put(Product.BREAD, 0.0);
		super.put(Product.MEAT, 0.0);
		super.put(Product.CIDER, 0.0);
		super.put(Product.BEER, 0.0);
		super.put(Product.WINE, 0.0);
		super.put(Product.LINEN_GARMENT, 0.0);
		super.put(Product.LEATHER_JERKINS, 0.0);
		super.put(Product.FUR_COATS, 0.0);
		super.put(Product.BROCADE_ROBES, 0.0);
		super.put(Product.BOOKS, 0.0);
		super.put(Product.CANDLESTICKS, 0.0);
		super.put(Product.GLASSES, 0.0);
		super.put(Product.DATES, 0.0);
		super.put(Product.MILK, 0.0);
		super.put(Product.CARPETS, 0.0);
		super.put(Product.COFFEE, 0.0);
		super.put(Product.PEARL_NECKLACES, 0.0);
		super.put(Product.PERFUME, 0.0);
		super.put(Product.MARZIPAN, 0.0);
	}
}
