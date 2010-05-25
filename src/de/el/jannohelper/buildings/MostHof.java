package de.el.jannohelper.buildings;

import de.el.jannohelper.products.Product;
import java.util.Map;

/**
 *
 * @author PEH
 */
public class MostHof extends Building {

	public MostHof(Product producedProduct) {
		super("Mosthof", 1.5, producedProduct);
	}

	@Override
	public Map<Product, Integer> getNeededProducts() {
		return null;
	}
}
