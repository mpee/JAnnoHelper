package de.el.jannohelper;

import de.el.jannohelper.citizens.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PEH
 */
public class Util {

    public static List<CitizenType> getCitizensFromPasteString(String data) {
        if (data.isEmpty()) {
            return null;
        }
        List<CitizenType> ret = new ArrayList<CitizenType>(7);
        String[] dataArray = data.split(":");
        for (String dataItem : dataArray) {
            String[] typeData = dataItem.split("\\.");
            if (typeData.length == 2) {
                CitizenType c = getCitizenTypeByName(typeData[0], Integer.parseInt(typeData[1]));
                if (c != null) {
                    ret.add(c);
                }
            }
        }

        return ret;

    }

    public static CitizenType getCitizenTypeByName(String name, int population) {
        CitizenType ret = null;
        if (name.equals("bettler")) {
            ret = new Beggar(population);
        }
        return ret;
    }
}

//bettler.0:bauern.0:buerger.0:patrizier.0:adlige.0:nomaden.0:gesandte.0

