package de.el.jannohelper.products;

/**
 *
 * @author PEH
 */
public class Product {

    public Product(String Name) {
        this.Name = Name;
    }
    private String Name;

    public String getName() {
        return this.Name;
    }

//    public abstract Building getProducingBuilding();

	public static final Product FISH = new Product("Fish");
	public static final Product CIDER = new Product("Cider");
	public static final Product SPICE = new Product("Spice");
	public static final Product LINEN_GARMENT = new Product("Linen Garment");
	public static final Product BREAD = new Product("Bread");
	public static final Product BEER = new Product("Beer");
	public static final Product LEATHER_JERKINS = new Product("Leather jerkins");
	public static final Product BOOKS = new Product("Books");
	public static final Product CANDLESTICKS = new Product("Candlesticks");

}
