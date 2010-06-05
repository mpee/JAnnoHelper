package de.el.jannohelper.gui;

import de.el.jannohelper.products.Product;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Display;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author PEH
 */
public class ImageMap {

	private static final Map<Product, Integer> IMAGE_MAP = initImageMap();
	private static final Image MAP_IMAGE = initMapImage();
	private static final Logger LOG = LoggerFactory.getLogger(ImageMap.class);

	public static Image getImage(Product p) {
		int size = 47;
		Image ret = new Image(Display.getDefault(), size, size);
		int x = 0;
		int y = 0;
		if (IMAGE_MAP.get(p) != null) {
			x = (IMAGE_MAP.get(p) % 22);
			x = x * size - x;
			y = (IMAGE_MAP.get(p) / 22);
			y = y * size - y;
		} else {
			LOG.warn("no map entry found for: {}", p.getName());
		}
		GC gc = new GC(ret);
		gc.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
		gc.fillRectangle(0, 0, size, size);
		gc.drawImage(MAP_IMAGE, x, y, size, size, 0, 0, size, size);
		gc.dispose();
		return ret;
	}

	private static Map<Product, Integer> initImageMap() {
		Map<Product, Integer> ret = new HashMap<Product, Integer>();
		ret.put(Product.ALMOND, 28);
		ret.put(Product.ANIMAL_HIDES, 45);
		ret.put(Product.BARRELS, 37);
		ret.put(Product.BEER, 36);
		ret.put(Product.BEESWAX, 56);
		ret.put(Product.BOOKS, 55);
		ret.put(Product.BRASS, 61);
		ret.put(Product.BREAD, 27);
		ret.put(Product.BRINE, 20);
		ret.put(Product.BROCADE_ROBES, 53);
		ret.put(Product.CANDLES, 57);
		ret.put(Product.CANDLESTICKS, 58);
		ret.put(Product.CANNONS, 92);
		ret.put(Product.CARPETS, 70);
		ret.put(Product.CATTLE, 22);
		ret.put(Product.CIDER, 34);
		ret.put(Product.CLAY, 16);
		ret.put(Product.COAL, 8);
		ret.put(Product.COFFEE, 41);
		ret.put(Product.COFFEE_BEANS, 40);
		ret.put(Product.COPPER_ORE, 60);
		ret.put(Product.DATES, 32);
		ret.put(Product.FISH, 18);
		ret.put(Product.FLOUR, 26);
		ret.put(Product.FURS, 48);
		ret.put(Product.FUR_COATS, 49);
		ret.put(Product.GLASS, 14);
		ret.put(Product.GLASSES, 62);
		ret.put(Product.GOLD, 52);
		ret.put(Product.GOLD_ORE, 51);
		ret.put(Product.GRAPES, 38);
		ret.put(Product.HEMP, 43);
		ret.put(Product.HERBS, 35);
		ret.put(Product.INDIGO, 69);
		ret.put(Product.IRON, 4);
		ret.put(Product.IRON_ORE, 3);
		ret.put(Product.LEATHER_JERKINS, 46);
		ret.put(Product.LINEN_GARMENT, 44);
		ret.put(Product.MARZIPAN, 31);
		ret.put(Product.MEAT, 24);
		ret.put(Product.MILK, 42);
		ret.put(Product.MOSAIC, 17);
		ret.put(Product.PAPER, 54);
		ret.put(Product.PEARLS, 64);
		ret.put(Product.PEARL_NECKLACES, 65);
		ret.put(Product.PERFUME, 67);
		ret.put(Product.POTASH, 13);
		ret.put(Product.QUARTZ, 15);
		ret.put(Product.ROPES, 73);
		ret.put(Product.ROSE_OIL, 66);
		ret.put(Product.SALT, 21);
		ret.put(Product.SILK, 68);
		ret.put(Product.SPICE, 33);
		ret.put(Product.STONE, 13);
		ret.put(Product.SUGAR, 30);
		ret.put(Product.SUGAR_CANE, 29);
		ret.put(Product.TOOLS, 6);
		ret.put(Product.WAR_MACHINES, 91);
		ret.put(Product.WEAPONS, 90);
		ret.put(Product.WHEAT, 25);
		ret.put(Product.WINE, 39);
		ret.put(Product.WOOD, 1);
		return ret;
	}

	private static Image initMapImage() {
		return new Image(Display.getDefault(), ImageMap.class.getResourceAsStream("resources/map.png"));
	}
}
