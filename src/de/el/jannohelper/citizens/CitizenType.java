package de.el.jannohelper.citizens;

import de.el.jannohelper.products.Product.Products;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PEH
 */
public abstract class CitizenType {

	public CitizenType(String name, int population, int populationPerHouse){
		this.name = name;
		this.population = population;
                this.populationPerHouse = populationPerHouse;
                this.needings = new HashMap<Products, Double>();
	}

	String name;
	int population;
        int populationPerHouse;
        Map<Products, Double> needings;

	public int getPopulation(){
		return this.population;
	}

        public void setPopulation(int population){
            this.population = population;
        }

        public int getPopulationPerHouse(){
		return this.populationPerHouse;
	}

        public int getNeededHouses(){
            if(population != 0){
                return (int) Math.round(population / populationPerHouse + 0.5d);
            }
            return 0;
        }

	public String getName(){
		return this.name;
	}

	public abstract Map<Products, Double> getNeedingsPerHabitant();

}
