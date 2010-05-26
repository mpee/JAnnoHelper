package de.el.jannohelper.buildings;

import de.el.jannohelper.products.Product;
import de.el.jannohelper.products.Product.Products;
import java.util.Map;

/**
 *
 * @author PEH
 */
public class FishHut extends Building{

	public FishHut(Product producedProduct) {
		super("FishHut", 2, Products.FISH);
	}

	@Override
	public Map<Products, Integer> getNeededProducts() {
		return null;
	}

}
