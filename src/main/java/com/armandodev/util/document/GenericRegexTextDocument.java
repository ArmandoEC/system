package com.armandodev.util.document;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class GenericRegexTextDocument extends PlainDocument {

    private int maxLength;
    private String regex;
    
    public GenericRegexTextDocument(int maxlen, String regex) {
        super();
        this.regex = regex;
        if (maxlen > 0) maxLength = maxlen;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {

        if (str == null || getLength() == maxLength) {
            return;
        }

        int totalLen = (getLength() + str.length());
        if (totalLen <= maxLength) {
            super.insertString(offset, str.replaceAll(regex, ""), attr);
            return;
        }

        String newStr = str.substring(0, (maxLength - getLength()));
        super.insertString(offset, newStr, attr);

    }
    
}
