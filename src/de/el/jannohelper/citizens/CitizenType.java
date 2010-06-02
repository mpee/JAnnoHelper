package de.el.jannohelper.citizens;

import de.el.jannohelper.products.Product;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.swt.graphics.Image;

/**
 *
 * @author PEH
 */
public abstract class CitizenType {

	public CitizenType(String name, int population, int populationPerHouse, Image image) {
		this.name = name;
		this.population = population;
		this.populationPerHouse = populationPerHouse;
		this.needings = new HashMap<Product, Double>();
		this.image = image;
	}

	String name;
	int population;
	int populationPerHouse;
	Map<Product, Double> needings;
	private Image image;

	public int getPopulation() {
		return this.population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getPopulationPerHouse() {
		return this.populationPerHouse;
	}

	public int getNeededHouses() {
		if (population != 0) {
			return (int) (population / populationPerHouse);
		}
		return 0;
	}

	public Image getImage(){
		return this.image;
	}

	public String getName() {
		return this.name;
	}

	public abstract Map<Product, Double> getNeedingsPerHabitant();
}
