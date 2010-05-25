package de.el.jannohelper.citizens;

import de.el.jannohelper.products.Fish;
import de.el.jannohelper.products.Most;
import de.el.jannohelper.products.Product;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author philipp
 */
public class Bettler extends CitizenType{

	public Bettler(int population) {
		super("Bettler", population);
	}

	@Override
	public Map<Product, Double> getNeedings() {
		Map<Product, Double> ret = new HashMap<Product, Double>();
		ret.put(new Fish(), 0.007);
		ret.put(new Most(), 0.002);
		return ret;
	}

}
