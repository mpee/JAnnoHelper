package de.el.jannohelper;

import de.el.jannohelper.buildings.Building;
import de.el.jannohelper.citizens.CitizenType;
import de.el.jannohelper.gui.MainGui;
import de.el.jannohelper.products.Product;
import java.util.Map.Entry;
import java.util.Timer;
import java.util.TimerTask;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.widgets.Display;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author PEH
 */
public class Main {

	private static String clipboardContent;
	
        private static final Logger LOG = LoggerFactory.getLogger(Main.class);
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
            new MainGui().open();
//		for(CitizenType c : Util.getCitizensFromPasteString(SAMPLE)){
//                    LOG.debug(String.format("%s :%d", c.getName(), c.getPopulation()));
//			System.out.println(c.getName() + ": " + c.getPopulation());
//			for(Entry<Product, Double> e : c.getNeedings().entrySet()){
//				Product p = e.getKey();
//				Building b = p.getProducingBuilding();
//				double neededProducts = e.getValue() * c.getPopulation();
//                                double neededHouses = neededProducts / p.getProducingBuilding().getProductionPerMinute();
//                                System.out.println((neededHouses%1) * 100);
//                                LOG.debug(p.getName() + " - "+ neededProducts + "per minute -> " + neededHouses);
////				System.out.println(p.getProductName() +  ":" + neededProducts + "per minute (" + (int)((neededProducts / b.getProductionPerMinute()) + 0.5d) + " buildings)");
//			}
//		}
//		Timer t = new Timer("asd");
//		t.schedule(new TimerTask() {
//
//			@Override
//			public void run() {
//				Clipboard c = new Clipboard(Display.getDefault());
//				String data = (String) c.getContents(TextTransfer.getInstance());
//				if(data != null && !data.equals(clipboardContent)){
//					clipboardContent = data;
//					System.out.println(data);
//				}
//			}
//		}, 1000, 1000);
	}
}
