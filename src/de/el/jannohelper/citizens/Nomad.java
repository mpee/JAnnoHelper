package de.el.jannohelper.citizens;

import de.el.jannohelper.products.Product;
import java.util.Map;

/**
 *
 * @author PEH
 */
public class Nomad extends CitizenType {

	public Nomad(int population) {
		super("Nomaden", population, 15);
	}

	@Override
	public Map<Product, Double> getNeedingsPerHabitant() {
		needings.clear();
		needings.put(Product.DATES, 0.006666666);
		if (population >= 145) {
			needings.put(Product.MILK, 0.00344);
		}
		if (population >= 295) {
			needings.put(Product.CARPETS, 0.00165);
		}
		return needings;
	}
}
