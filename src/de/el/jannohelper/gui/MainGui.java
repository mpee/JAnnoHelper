package de.el.jannohelper.gui;

import de.el.swtTools.SimpleFormData;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 *
 * @author PEH
 */
public class MainGui {

    public MainGui() {
        display = Display.getDefault();
        shell = new Shell(display);
        shell.setLayout(new FillLayout());
        shell.setText("JAnnoHelper" + VERSION);
        imageMap = new ImageMap();
        initMenu();
        initGui();
    }
    private Shell shell;
    private Display display;
    private Composite comp;
    private Text importString;
    private SimpleFormData SFD;
    private ImageMap imageMap;
    private static final String VERSION = "0.1 pre_alpha";

    private void initGui() {
        comp = new Composite(shell, SWT.NONE);
        comp.setLayout(new FormLayout());

        SFD = new SimpleFormData();

        FormData f = new FormData();
        f.left = SFD.getSimpleFormAttachment(0, 5);
        f.top = SFD.getSimpleFormAttachment(0, 5);
        f.right = SFD.getSimpleFormAttachment(100, -5);
        f.width = 500;

        importString = new Text(comp, SWT.BORDER);
        importString.setLayoutData(f);

        Label bla = new Label(comp, SWT.NONE);
        f = new FormData();
        f.left = SFD.getSimpleFormAttachment(0, 5);
        f.top = new FormAttachment(importString, 5);
        f.width = 50;
        f.height = 50;
        bla.setLayoutData(f);
        bla.setImage(new Image(display, imageMap.getImageByEnum()));
        
    }

    private void initMenu() {
        Menu menuBar = new Menu(shell, SWT.BAR);
        MenuItem fileMenuHeader = new MenuItem(menuBar, SWT.CASCADE);
        fileMenuHeader.setText("&File");
        {
            Menu fileMenu = new Menu(shell, SWT.DROP_DOWN);
            {
                MenuItem exitItem = new MenuItem(fileMenu, SWT.NONE);
                exitItem.setText("&Exit");
                exitItem.addSelectionListener(new SelectionAdapter() {

                    @Override
                    public void widgetSelected(SelectionEvent e) {
                        shell.dispose();
                    }
                });
            }
            fileMenuHeader.setMenu(fileMenu);

        }

        shell.setMenuBar(menuBar);
    }

    public void open() {
        shell.pack();
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
    }
}
