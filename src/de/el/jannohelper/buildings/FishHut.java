package de.el.jannohelper.buildings;

import de.el.jannohelper.products.Product;
import java.util.Map;

/**
 *
 * @author PEH
 */
public class FishHut extends Building{

	public FishHut() {
		super("FishHut", 2, Product.FISH);
	}

	@Override
	public Map<Product, Integer> getNeededProducts() {
		return null;
	}

}
