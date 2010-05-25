package de.el.jannohelper.buildings;

import de.el.jannohelper.products.Product;
import java.util.Map;

/**
 *
 * @author PEH
 */
public class FishHut extends Building{

	public FishHut(Product producedProduct) {
		super("FishHut", 2, producedProduct);
	}

	@Override
	public Map<Product, Integer> getNeededProducts() {
		return null;
	}

}
