package de.el.jannohelper.products;

import de.el.jannohelper.gui.ImageMap;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;

/**
 *
 * @author PEH
 */
public class Product {

	public Product(String name) {
		this.name = name;
		this.imageMapPosition = new Point(10, 16);
	}

	public Product(String name, int x, int y){
		this(name);
		this.imageMapPosition = new Point(x, y);
	}
	private String name;
	private Point imageMapPosition;
	private int y;

	public Point getPoint(){
		return this.imageMapPosition;
	}

	public Image getImage(){
		return ImageMap.getImage(this);
	}

	public String getName() {
		return this.name;
	}
	public static final Product FISH = new Product("Fish", 18, 0);
	public static final Product CIDER = new Product("Cider", 12, 1);
	public static final Product SPICE = new Product("Spice", 11 , 1);
	public static final Product LINEN_GARMENT = new Product("Linen Garment", 0, 2);
	public static final Product BREAD = new Product("Bread", 5, 1);
	public static final Product BEER = new Product("Beer", 14, 1);
	public static final Product LEATHER_JERKINS = new Product("Leather jerkins", 2, 2);
	public static final Product BOOKS = new Product("Books", 11, 2);
	public static final Product CANDLESTICKS = new Product("Candlesticks", 14, 2);
	public static final Product WOOD = new Product("Wood", 1, 0);
	public static final Product HEMP = new Product("Hemp", 21, 1);
	public static final Product WHEAT = new Product("Wheat", 3, 1);
	public static final Product HERBS = new Product("Herbs", 13, 1);
	public static final Product GRAPES = new Product("Grapes", 16, 1);
	public static final Product BEESWAX = new Product("Beeswax", 12, 2);
	public static final Product COFFEE_BEANS = new Product("Coffee Beans", 18 , 1);
	public static final Product ROSE_OIL = new Product("Rose Oil", 0, 3);
	public static final Product SUGAR_CANE = new Product("Sugar Cane", 7, 1);
	public static final Product INDIGO = new Product("Indigo", 3, 3);
	public static final Product ALMOND = new Product("Almond", 6, 1);
	public static final Product SILK = new Product("Silk", 2, 3);
	public static final Product DATES = new Product("Dates");
	public static final Product MILK = new Product("Milk");
	public static final Product CATTLE = new Product("Cattle");
	public static final Product ANIMAL_HIDES = new Product("Animal Hides");
	public static final Product POTASH = new Product("Potash");
	public static final Product CLAY = new Product("Clay");
	public static final Product COAL = new Product("Coal");
	public static final Product PEARLS = new Product("Pearls");
	public static final Product QUARTZ = new Product("Quartz");
	public static final Product STONE = new Product("Stone");
	public static final Product IRON_ORE = new Product("Iron Ore");
	public static final Product BRINE = new Product("Brine");
	public static final Product COPPER_ORE = new Product("Copper Ore");
	public static final Product GOLD_ORE = new Product("Gold Ore");
	public static final Product FURS = new Product("Furs");
	public static final Product SUGAR = new Product("Sugar");
	public static final Product PAPER = new Product("Paper");
	public static final Product FUR_COATS = new Product("Fur Coats");
	public static final Product TOOLS = new Product("Tools");
	public static final Product MOSAIC = new Product("Mosaic");
	public static final Product FLOUR = new Product("Flour");
	public static final Product IRON = new Product("IRON");
	public static final Product ROPES = new Product("Ropes");
	public static final Product WEAPONS = new Product("Weapons");
	public static final Product SALT = new Product("Salt");
	public static final Product MEAT = new Product("Meat");
	public static final Product BARRELS = new Product("Barrels");
	public static final Product WINE = new Product("Wine");
	public static final Product COFFEE = new Product("Coffee");
	public static final Product WAR_MACHINES = new Product("War Machines");
	public static final Product BRASS = new Product("Brass");
	public static final Product GLASSES = new Product("Glasses");
	public static final Product CANDLES = new Product("Candles");
	public static final Product PERFUME = new Product("Perfume");
	public static final Product MARZIPAN = new Product("Marzipan");
	public static final Product BROCADE_ROBES = new Product("Brocade Robes");
	public static final Product CARPETS = new Product("Carpets");
	public static final Product GOLD = new Product("Gold");
	public static final Product PEARL_NECKLACES = new Product("Pearl Necklaces");
	public static final Product CANNONS = new Product("Cannons");
	public static final Product GLASS = new Product("Glass");
}