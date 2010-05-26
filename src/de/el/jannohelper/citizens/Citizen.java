package de.el.jannohelper.citizens;

import de.el.jannohelper.products.Product.Products;
import java.util.Map;

/**
 *
 * @author PEH
 */
public class Citizen extends CitizenType{

    public Citizen(int population) {
        super("Buerger", population, 15);
    }

    @Override
    public Map<Products, Double> getNeedingsPerHabitant() {
        needings.clear();
        needings.put(Products.FISH, 0.002);
        needings.put(Products.SPICES, 0.002);
        needings.put(Products.CIDER, 0.002941176);
        needings.put(Products.LINEN_GARMENTS, 0.00210084);
        return needings;
    }

}
