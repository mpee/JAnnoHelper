package de.el.jannohelper.products;

import de.el.jannohelper.buildings.Building;

/**
 *
 * @author PEH
 */
public abstract class Product {

    public Product(String Name) {
        this.Name = Name;
    }
    private String Name;

    public String getName() {
        return this.Name;
    }

    public abstract Building getProducingBuilding();

    public static enum Products {

        FISH,
        CIDER,
        SPICES,
        LINEN_GARMENTS,
        BREAD,
        BEER,
        LEATHER_JERKINS,
        BOOKS,
        CANDLESTICKS
    }
}
