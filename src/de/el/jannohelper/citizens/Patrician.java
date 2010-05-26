package de.el.jannohelper.citizens;

import de.el.jannohelper.products.Product.Products;
import java.util.Map;

/**
 *
 * @author PEH
 */
public class Patrician extends CitizenType {

    public Patrician(int population) {
        super("Patrizier", population, 25);
    }

    @Override
    public Map<Products, Double> getNeedingsPerHabitant() {
        needings.clear();
        needings.put(Products.FISH, 0.00110011);
        needings.put(Products.SPICES, 0.00110011);
        needings.put(Products.BREAD, 0.001375516);
        needings.put(Products.CIDER, 0.001533742);
        if (population >= 610) {
            needings.put(Products.BEER, 0.0016);
        }
        needings.put(Products.LINEN_GARMENTS, 0.00095057);
        if (population >= 690) {
            needings.put(Products.LEATHER_JERKINS, 0.00070028);

        }
        if (population >= 940) {
            needings.put(Products.BOOKS, 0.001142857);
        }
        if (population >= 2500) {
            needings.put(Products.CANDLESTICKS, 0.0004);
        }
        return needings;
    }
}
