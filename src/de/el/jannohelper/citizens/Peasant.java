package de.el.jannohelper.citizens;

import de.el.jannohelper.products.Product;
import java.util.Map;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 *
 * @author PEH
 */
public class Peasant extends CitizenType{

    public Peasant(int population) {
        super("Bauern", population, 8, new Image(Display.getDefault(), CitizenType.class.getResourceAsStream("resources/peasant.png")));
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
