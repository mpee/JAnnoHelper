package de.el.jannohelper.buildings;

import de.el.jannohelper.products.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author PEH
 */
public class BuildingFactory {

	private static final Logger LOG = LoggerFactory.getLogger(BuildingFactory.class);

	/**
	 * Returns the Building wich produces the given Product
	 * @param p the Product produced
	 * @return the Building the given Product is produced by
	 */
	public static Building getBuildingByProduct(Product p) {
		if (p == Product.FISH) {
			return Building.FISHERMANS_HUT;
		} else if (p == Product.WOOD) {
			return Building.LUMBERJACKS_HUT;
		} else if (p == Product.CIDER) {
			return Building.CIDER_FARM;
		} else if (p == Product.HEMP) {
			return Building.HEMP_PLANTATION;
		} else if (p == Product.LINEN_GARMENT) {
			return Building.WEAVERS_HUT;
		} else if (p == Product.SPICE) {
			return Building.SPICE_FARM;
		} else if (p == Product.BREAD) {
			return Building.BAKERY;
		} else if (p == Product.LEATHER_JERKINS) {
			return Building.TANNERY;
		} else if (p == Product.BEER) {
			return Building.MONASTERY_BREWERY;
		} else if (p == Product.MEAT) {
			return Building.BUTCHERS_SHOP;
		} else if (p == Product.DATES) {
			return Building.DATE_PLANTATION;
		} else if (p == Product.COFFEE) {
			return Building.ROASTING_HOUSE;
		} else if (p == Product.BOOKS) {
			return Building.PRINTING_HOUSE;
		} else if (p == Product.CANDLESTICKS) {
			return Building.REDSMITHS_WORKSHOP;
		} else if (p == Product.WINE) {
			return Building.WINE_PRESS;
		} else if (p == Product.BROCADE_ROBES) {
			return Building.SILK_WEAVING_MILL;
		} else if (p == Product.FUR_COATS) {
			return Building.FURRIERS_WORKSHOP;
		} else if (p == Product.GLASSES) {
			return Building.OPTICIANS_WORKSHOP;
		} else if (p == Product.MILK) {
			return Building.GOAT_FARM;
		} else if (p == Product.CARPETS) {
			return Building.CARPET_WORKSHOP;
		} else if (p == Product.MARZIPAN) {
			return Building.CONFECTIONERS_WORKSHOP;
		} else if (p == Product.PEARL_NECKLACES) {
			return Building.PEARL_WORKSHOP;
		} else if (p == Product.PERFUME) {
			return Building.PERFUMERY;
		} else if (p == Product.SALT) {
			return Building.SALT_WORKS;
		} else if (p == Product.ANIMAL_HIDES) {
			return Building.PIG_FARM;
		} else if (p == Product.CATTLE) {
			return Building.CATTLE_FARM;
		} else if (p == Product.FLOUR) {
			return Building.MILL;
		} else if (p == Product.WHEAT) {
			return Building.CROP_FARM;
		} else if (p == Product.HERBS) {
			return Building.MONASTERY_GARDEN;
		} else if (p == Product.INDIGO) {
			return Building.INDIGO_FARM;
		} else if (p == Product.PAPER) {
			return Building.PAPER_MILL;
		} else if (p == Product.COFFEE_BEANS) {
			return Building.COFFEE_PLANTATION;
		} else if (p == Product.SILK) {
			return Building.SILK_PLANTATION;
		} else if (p == Product.CANDLES) {
			return Building.CANDLERMAKERS_WORKSHOP;
		} else if (p == Product.BRASS) {
			return Building.COPPER_SMELTER;
		} else if (p == Product.QUARTZ) {
			return Building.QUARTZ_QUARRY;
		} else if (p == Product.FURS) {
			return Building.TRAPPERS_LODGE;
		} else if (p == Product.PEARLS) {
			return Building.PEARLS_FISHERS_HUT;
		} else if (p == Product.SUGAR) {
			return Building.SUGAR_CANE_PLANTATION;
		} else if (p == Product.ALMOND) {
			return Building.ALMOND_PLANTATION;
		} else if (p == Product.ROSE_OIL) {
			return Building.ROSE_NUSERY;
		} else if (p == Product.COAL) {
			return Building.CHARCOAL_BURNERS_HUT;
		} else if (p == Product.COPPER_ORE) {
			return Building.COPPER_MINE;
		} else if (p == Product.GRAPES) {
			return Building.VINEYARD;
		} else if (p == Product.BARRELS) {
			return Building.BARREL_COOPERAGE;
		} else if (p == Product.GOLD) {
			return Building.GOLD_SMELTER;
		} else if (p == Product.IRON) {
			return Building.IRON_SMELTER;
		} else if (p == Product.GOLD_ORE) {
			return Building.GOLD_MINE;
		} else if (p == Product.IRON_ORE) {
			return Building.ORE_MINE;
		} else if (p == Product.BRINE) {
			return Building.SALT_MINE;
		} else if (p == Product.IRON_ORE) {
			return Building.ORE_MINE;
		} else if (p == Product.BEESWAX) {
			return Building.APIARY;
		} else {
			LOG.warn("no building implementation for {}", p.getName());
			return null;
		}
	}
}