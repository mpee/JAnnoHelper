package de.el.jannohelper.citizens;

import de.el.jannohelper.products.Product;
import java.util.Map;

/**
 *
 * @author PEH
 */
public class Begger extends CitizenType {

    public Begger(int population) {
        super("Bettler", population, 500);
    }

    @Override
    public Map<Product, Double> getNeedingsPerHabitant() {
        needings.clear();
        needings.put(Product.FISH, 0.007);
        needings.put(Product.CIDER, 0.003);
        return needings;
    }
}
