package jannohelper;

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

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Timer t = new Timer("asd");
		t.schedule(new TimerTask() {

			@Override
			public void run() {
				Clipboard c = new Clipboard(Display.getDefault());
				String data = (String) c.getContents(TextTransfer.getInstance());
				if(data != null && !data.equals(clipboardContent)){
					clipboardContent = data;
					System.out.println(data);
				}
			}
		}, 1000, 1000);
	}
}
