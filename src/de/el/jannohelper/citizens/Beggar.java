package de.el.jannohelper.citizens;

import de.el.jannohelper.products.Product;
import java.util.Map;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 *
 * @author PEH
 */
public class Beggar extends CitizenType {

    public Beggar(int population) {
        super("Bettler", population, 500, new Image(Display.getDefault(), CitizenType.class.getResourceAsStream("resources/beggar.png")));
    }

    @Override
    public Map<Product, Double> getNeedingsPerHabitant() {
        needings.clear();
        needings.put(Product.FISH, 0.007);
        needings.put(Product.CIDER, 0.003);
        return needings;
    }
}
