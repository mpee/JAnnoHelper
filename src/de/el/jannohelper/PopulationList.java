package de.el.jannohelper;

import de.el.jannohelper.citizens.*;
import java.util.ArrayList;

/**
 *
 * @author PEH
 */
public class PopulationList extends ArrayList<CitizenType> {

    public PopulationList() {
        super.add(new Begger(0));
        super.add(new Peasent(0));
        super.add(new Citizen(0));
        super.add(new Patrician(0));
    }

    public void update(String updateString) {
        String[] dataArray = updateString.split(":");
        for (String dataItem : dataArray) {
            String[] typeData = dataItem.split("\\.");
            if (typeData.length == 2) {
                for (CitizenType c : this) {
                    if (c.getName().toLowerCase().equals(typeData[0])) {
                        c.setPopulation(Integer.parseInt(typeData[1]));
                    }
                }
            }
        }
    }
}
