package de.el.jannohelper.citizens;

import de.el.jannohelper.products.Product;
import java.util.Map;

/**
 *
 * @author PEH
 */
public class Envoy extends CitizenType {

	public Envoy(int population) {
		super("Gesandte", population, 25);
	}

	@Override
	public Map<Product, Double> getNeedingsPerHabitant() {
		needings.clear();
		needings.put(Product.DATES, 0.005);
		if (population >= 4360) {
			needings.put(Product.MARZIPAN, 0.00163);
		}
		needings.put(Product.MILK, 0.00225);
		needings.put(Product.COFFEE, 0.001);
		needings.put(Product.CARPETS, 0.001);
		if (population >= 1040) {
			needings.put(Product.PEARL_NECKLACES, 0.00133);
		}
		if (population >= 2600) {
			needings.put(Product.PERFUME, 0.0008);
		}
		return needings;
	}
}
