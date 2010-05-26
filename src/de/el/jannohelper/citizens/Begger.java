package de.el.jannohelper.citizens;

import de.el.jannohelper.products.Product.Products;
import java.util.Map;

/**
 *
 * @author philipp
 */
public class Begger extends CitizenType {

    public Begger(int population) {
        super("Bettler", population, 500);
    }

    @Override
    public Map<Products, Double> getNeedingsPerHabitant() {
        needings.clear();
        needings.put(Products.FISH, 0.003508772);
        needings.put(Products.CIDER, 0.002);
        return needings;
    }
}
