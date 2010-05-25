package de.el.jannohelper.gui;

import org.eclipse.swt.graphics.ImageData;

/**
 *
 * @author PEH
 */
public class ImageMap {

    public ImageMap(){
        this.imageData = new ImageData(getClass().getResourceAsStream("resources/map.png"));
    }

    private ImageData imageData;

    public ImageData getImageByEnum(){
        System.out.println(imageData.x);
        imageData.x = 47;
        imageData.y = 47;
        return this.imageData;
    }
}
