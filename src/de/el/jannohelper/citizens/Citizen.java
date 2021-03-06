package de.el.jannohelper.citizens;

import de.el.jannohelper.products.Product;
import java.util.Map;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 *
 * @author PEH
 */
public class Citizen extends CitizenType{

    public Citizen(int population) {
        super("Buerger", population, 15, new Image(Display.getDefault(), CitizenType.class.getResourceAsStream("resources/citizen.png")));
    }

    @Override
    public Map<Product, Double> getNeedingsPerHabitant() {
        needings.clear();
        needings.put(Product.FISH, 0.004);
        needings.put(Product.SPICE, 0.004);
        needings.put(Product.CIDER, 0.0044);
        needings.put(Product.LINEN_GARMENT, 0.00420);
        return needings;
    }

}
