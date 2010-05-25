package de.el.jannohelper.citizens;

import de.el.jannohelper.products.Product;
import java.util.Map;

/**
 *
 * @author PEH
 */
public abstract class CitizenType {

	public CitizenType(String name, int population){
		this.name = name;
		this.population = population;
	}

	private String name;
	private int population;

	public int getPopulation(){
		return this.population;
	}

	public String getName(){
		return this.name;
	}

	public abstract Map<Product, Double> getNeedings();

}
