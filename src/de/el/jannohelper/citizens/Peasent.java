package de.el.jannohelper.citizens;

import de.el.jannohelper.products.Product;
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
    public Map<Product, Double> getNeedingsPerHabitant() {
        needings.clear();
        needings.put(Product.FISH, 0.001);
        if(population > 60)
            needings.put(Product.CIDER, 0.0044);
        return needings;
    }

}
