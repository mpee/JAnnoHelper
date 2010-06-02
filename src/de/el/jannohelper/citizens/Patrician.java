package de.el.jannohelper.citizens;

import de.el.jannohelper.products.Product;
import java.util.Map;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 *
 * @author PEH
 */
public class Patrician extends CitizenType {

    public Patrician(int population) {
        super("Patrizier", population, 25, new Image(Display.getDefault(), CitizenType.class.getResourceAsStream("resources/patrician.png")));
    }

    @Override
    public Map<Product, Double> getNeedingsPerHabitant() {
        needings.clear();
        needings.put(Product.FISH, 0.0022);
        needings.put(Product.SPICE, 0.0022);
        needings.put(Product.BREAD, 0.0055);
        needings.put(Product.CIDER, 0.0023);
        if (population >= 610) {
            needings.put(Product.BEER, 0.0024);
        }
        needings.put(Product.LINEN_GARMENT, 0.0019);
        if (population >= 690) {
            needings.put(Product.LEATHER_JERKINS, 0.0028);

        }
        if (population >= 940) {
            needings.put(Product.BOOKS, 0.0016);
        }
        if (population >= 2500) {
            needings.put(Product.CANDLESTICKS, 0.0008);
        }
        return needings;
    }
}
