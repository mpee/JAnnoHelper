package de.el.jannohelper.buildings;

import de.el.jannohelper.products.Product;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PEH
 */
public class Building {

	public Building(String buildingName, double productionPerMinute, Product producedProduct) {
		this.buildingName = buildingName;
		this.productionPerMinute = productionPerMinute;
		this.producedProduct = producedProduct;
		neededProducts = new HashMap<Product, Double>();
	}

	public Building(String buildingName, double productionPerMinute, Product producedProduct, Product neededProduct1, Double needeProduct1Count) {
		this(buildingName, productionPerMinute, producedProduct);
		this.neededProducts.put(neededProduct1, needeProduct1Count);
	}

	public Building(String buildingName, double productionPerMinute, Product producedProduct, Product neededProduct1, Double needeProduct1Count, Product neededProduct2, Double needeProduct2Count) {
		this(buildingName, productionPerMinute, producedProduct, neededProduct1, needeProduct1Count);
		this.neededProducts.put(neededProduct2, needeProduct2Count);
	}
	private double productionPerMinute;
	private Product producedProduct;
	private Map<Product, Double> neededProducts;
	private String buildingName;
	public static final Building CIDER_FARM = new Building("Cider farm", 1.5, Product.CIDER);
	public static final Building HEMP_PLANTATION = new Building("Hemp Plantage", 1, Product.HEMP);
	public static final Building SPICE_FARM = new Building("Spice Farm", 2, Product.SPICE);
	public static final Building ALMOND_PLANTATION = new Building("Almond Plantation", 2, Product.ALMOND);
	public static final Building CROP_FARM = new Building("Crop Farm", 2, Product.WHEAT);
	public static final Building MONASTERY_GARDEN = new Building("Monastery Garden", 2, Product.HERBS);
	public static final Building VINEYARD = new Building("Vineyard", 0.666, Product.GRAPES);
	public static final Building APIARY = new Building("Apiary", 0.666, Product.BEESWAX);
	public static final Building COFFEE_PLANTATION = new Building("Coffee Plantation", 1, Product.COFFEE_BEANS);
	public static final Building ROSE_NUSERY = new Building("Rose Nursery", 0.5, Product.ROSE_OIL);
	public static final Building SUGAR_CANE_PLANTATION = new Building("Sugar Cane Plantation", 2, Product.SUGAR_CANE);
	public static final Building INDIGO_FARM = new Building("Indigo Farm", 1.5, Product.INDIGO);
	public static final Building SILK_PLANTATION = new Building("Silk Plantation", 1.5, Product.SILK);
	public static final Building DATE_PLANTATION = new Building("Date Plantation", 3, Product.DATES);
	public static final Building GOAT_FARM = new Building("Goat Farm", 1.5, Product.MILK);
	public static final Building CATTLE_FARM = new Building("Cattle Farm", 1.25, Product.CATTLE);
	public static final Building PIG_FARM = new Building("Pig Farm", 2.0, Product.ANIMAL_HIDES);
	public static final Building CLAY_PIT = new Building("Clay Pit", 1.2, Product.CLAY);
	public static final Building LUMBERJACKS_HUT = new Building("Lumberjack's Hut", 1.5, Product.WOOD);
	public static final Building FORREST_GLASSWORKS = new Building("Forrest Glassworks", 2, Product.POTASH);
	public static final Building CHARCOAL_BURNERS_HUT = new Building("Charcoal Burner's Hut", 2, Product.COAL);
	public static final Building FISHERMANS_HUT = new Building("Fisherman's Hut", 2, Product.FISH);
	public static final Building PEARLS_FISHERS_HUT = new Building("Pearl Fisher's hut", 1, Product.PEARLS);
	public static final Building QUARTZ_QUARRY = new Building("Quartz Quarry", 1.333333, Product.QUARTZ);
	public static final Building STONEMASONS_HUT = new Building("Stonemason's Hut", 2, Product.STONE);
	public static final Building ORE_MINE = new Building("Ore Mine", 2, Product.IRON_ORE);
	public static final Building SALT_MINE = new Building("Salt Mine", 4, Product.BRINE);
	public static final Building COPPER_MINE = new Building("Copper Mine", 1.333, Product.COPPER_ORE);
	public static final Building COAL_MINE = new Building("Coal Mine", 4, Product.COAL);
	public static final Building GOLD_MINE = new Building("Gold Mine", 1.5, Product.GOLD_ORE);
	public static final Building TRAPPERS_LODGE = new Building("Trapper's Lodge", 2.5, Product.FURS);
	public static final Building TANNERY = new Building("Tannery", 4, Product.LEATHER_JERKINS, Product.ANIMAL_HIDES, 1.0, Product.SALT, 0.5);
	public static final Building SUGAR_MILL = new Building("Sugar Mill", 4, Product.SUGAR, Product.SUGAR_CANE, 1.0);
	public static final Building PAPER_MILL = new Building("Paper Mill", 3, Product.PAPER, Product.WOOD, 1.0);
	public static final Building FURRIERS_WORKSHOP = new Building("Furrier's Workshop", 2.5, Product.FUR_COATS, Product.FURS, 1.0, Product.SALT, 0.331);
	public static final Building WEAVERS_HUT = new Building("Weavers Hut", 2, Product.LINEN_GARMENT, Product.HEMP, 1.0);
	public static final Building TOOLMAKERS_WORKSHOP = new Building("Toolmakers Workshop", 2, Product.TOOLS, Product.IRON, 0.5);
	public static final Building MOSAIC_WORKSHOP = new Building("Mosaik Workshop", 2.4, Product.MOSAIC, Product.CLAY, 1.0, Product.QUARTZ, 0.5);
	public static final Building MILL = new Building("Mill", 4, Product.FLOUR, Product.WHEAT, 1.0);
	public static final Building BAKERY = new Building("Bakery", 4, Product.BREAD, Product.FLOUR, 1.0);
	public static final Building MONASTERY_BREWERY = new Building("Monastery Brewery", 1.5, Product.BEER, Product.HERBS, 1.333, Product.WHEAT, 1.333);
	public static final Building IRON_SMELTER = new Building("Iron Smelter", 2, Product.IRON, Product.IRON_ORE, 1.0, Product.COAL, 1.0);
	public static final Building ROPEYARD = new Building("Ropeyard", 2, Product.ROPES, Product.HEMP, 0.5);
	public static final Building WEAPON_SMITHY = new Building("Weapon Smithy", 2, Product.WEAPONS, Product.IRON, 1.0);
	public static final Building SALT_WORKS = new Building("Salt Works", 4, Product.SALT, Product.BRINE, 1.0, Product.COAL, 0.5);
	public static final Building BUTCHERS_SHOP = new Building("Butcher's Shop", 2.5, Product.MEAT, Product.CATTLE, 1.0, Product.SALT, 0.8);
	public static final Building BARREL_COOPERAGE = new Building("Barrel Cooperage", 2, Product.BARRELS, Product.WOOD, 0.5, Product.IRON, 0.5);
	public static final Building WINE_PRESS = new Building("Wine Press", 2, Product.WINE, Product.GRAPES, 1.0, Product.BARRELS, 1.0);
	public static final Building ROASTING_HOUSE = new Building("Roasting House", 1, Product.COFFEE, Product.COFFEE_BEANS, 2.0);
	public static final Building WAR_MACHINES_WORKSHOP = new Building("War Machines Workshop", 1.5, Product.WAR_MACHINES, Product.WOOD, 2.0, Product.ROPES, 2.0);
	public static final Building COPPER_SMELTER = new Building("Copper Smelter", 1.333, Product.BRASS, Product.COPPER_ORE, 1.0, Product.COAL, 1.0);
	public static final Building OPTICIANS_WORKSHOP = new Building("Opticia's Workshop", 2, Product.GLASSES, Product.BRASS, 0.5, Product.QUARTZ, 0.5);
	public static final Building CANDLERMAKERS_WORKSHOP = new Building("Candlemaker's Workshop", 1.333, Product.CANDLES, Product.BEESWAX, 1.0, Product.HEMP, 0.75);
	public static final Building REDSMITHS_WORKSHOP = new Building("Redsmith's Workshop", 2, Product.CANDLESTICKS, Product.BRASS, 1.0, Product.CANDLES, 1.0);
	public static final Building PERFUMERY = new Building("Perfumery", 1, Product.PERFUME, Product.ROSE_OIL, 1.5);
	public static final Building CONFECTIONERS_WORKSHOP = new Building("Confectioner's Workshop", 4, Product.MARZIPAN, Product.ALMOND, 1.0, Product.SUGAR, 1.0);
	public static final Building SILK_WEAVING_MILL = new Building("Silk Weaving Mill", 3, Product.BROCADE_ROBES, Product.SILK, 1.0, Product.GOLD, 0.5);
	public static final Building CARPET_WORKSHOP = new Building("Carpet Workshop", 1.5, Product.CARPETS, Product.SILK, 1.0, Product.INDIGO, 1.0);
	public static final Building GOLD_SMELTER = new Building("Gold Smelter", 1.5, Product.GOLD, Product.GOLD_ORE, 1.0, Product.COAL, 1.0);
	public static final Building PEARL_WORKSHOP = new Building("Pearl Workshop", 1, Product.PEARL_NECKLACES, Product.PEARLS, 1.0);
	public static final Building CANON_FOUNDRY = new Building("Canon Foundry", 1, Product.CANNONS, Product.IRON, 1.5, Product.WOOD, 3.0);
	public static final Building PRINTING_HOUSE = new Building("Printing House", 3, Product.BOOKS, Product.PAPER, 0.5, Product.INDIGO, 1.0);
	public static final Building GLASS_SMELTER = new Building("Glass Smelter", 1, Product.GLASS, Product.POTASH, 1.0, Product.QUARTZ, 0.5);

	public String getName() {
		return this.buildingName;
	}

	public double getProductionPerMinute() {
		return productionPerMinute;
	}

	public Product getProducedProduct() {
		return this.producedProduct;
	}

	public int getNeededProductsCount() {
		return this.neededProducts.size();
	}

	public Map<Product, Double> getNeededProducts() {
		return this.neededProducts;
	}
}
