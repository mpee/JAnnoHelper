package de.el.jannohelper.citizens;

import de.el.jannohelper.products.Product.Products;
import java.util.Map;

/**
 *
 * @author PEH
 */
public class Peasent extends CitizenType{

    public Peasent(int population) {
        super("Bauern", population, 8);
    }

    @Override
    public Map<Products, Double> getNeedingsPerHabitant() {
        needings.clear();
        needings.put(Products.FISH, 0.005);
        if(population > 60)
            needings.put(Products.CIDER, 0.002941176);
        return needings;
    }

}
