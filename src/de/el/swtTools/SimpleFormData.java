package de.el.swtTools;

import org.eclipse.swt.layout.FormAttachment;

/**
 *
 * @author PEH
 */
public class SimpleFormData {

    public FormAttachment getSimpleFormAttachment(int attachment, int padding){
        return new FormAttachment(attachment, padding);
    }

}
