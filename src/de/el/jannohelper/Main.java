package de.el.jannohelper;

import de.el.jannohelper.buildings.Building;
import de.el.jannohelper.citizens.CitizenType;
import de.el.jannohelper.products.Product;
import java.util.Map.Entry;
import java.util.Timer;
import java.util.TimerTask;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.widgets.Display;

/**
 *
 * @author PEH
 */
public class Main {

	private static String clipboardContent;
	private static final String SAMPLE = "bettler.300:bauern.0:buerger.0:patrizier.0:adlige.0:nomaden.0:gesandte.0";

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		for(CitizenType c : Util.getCitizensFromPasteString(SAMPLE)){
			System.out.println(c.getName());
			for(Entry<Product, Double> e : c.getNeedings().entrySet()){
				Product p = e.getKey();
				Building b = p.getProducingBuilding();
				double neededProducts = e.getValue() * c.getPopulation();
				System.out.println(p.getProductName() +  ":" + neededProducts + "per minute (" + (int)((neededProducts / b.getProductionPerMinute()) + 0.5d) + " buildings)");
			}
		}
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
