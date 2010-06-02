package de.el.jannohelper.citizens;

import de.el.jannohelper.products.Product;
import java.util.Map;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 *
 * @author PEH
 */
public class Nobleman extends CitizenType {

	public Nobleman(int population) {
		super("Adlige", population, 40, new Image(Display.getDefault(), CitizenType.class.getResourceAsStream("resources/nobleman.png")));
	}

	@Override
	public Map<Product, Double> getNeedingsPerHabitant() {
		needings.clear();
		needings.put(Product.FISH, 0.0016);
		needings.put(Product.SPICE, 0.0016);
		needings.put(Product.BREAD, 0.0039);
		needings.put(Product.MEAT, 0.0022);
		needings.put(Product.CIDER, 0.0013);
		needings.put(Product.BEER, 0.0014);
		if (population >= 1500) {
			needings.put(Product.WINE, 0.002);
		}
		needings.put(Product.LINEN_GARMENT, 0.0008);
		needings.put(Product.LEATHER_JERKINS, 0.0016);
		if (population >= 950) {
			needings.put(Product.FUR_COATS, 0.0016);
		}
		if (population >= 4000) {
			needings.put(Product.BROCADE_ROBES, 0.00142);
		}
		needings.put(Product.BOOKS, 0.0009);
		if (population >= 2200) {
			needings.put(Product.GLASSES, 0.0017);
		}
		if (population >= 30000) {
			needings.put(Product.CANDLESTICKS, 0.0006);
		}
		return needings;
	}
}
