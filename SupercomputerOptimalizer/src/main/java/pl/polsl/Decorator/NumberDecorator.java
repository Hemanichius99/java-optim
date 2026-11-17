/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Decorator;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 * @version 1.4
 * @author uzytkownikr 
 * AI GENERATED CLASS
 */
public class NumberDecorator extends DocumentFilter {

    private final DocumentFilter inner;

    /**
     *
     * @param inner wrapped document filter by decorator
     */
    public NumberDecorator(DocumentFilter inner) {
        this.inner = inner;
    }

    private DocumentFilter next() {
        return inner != null ? inner : new DocumentFilter();
    }

    /**
     * Overwritten insertString method, here is validation done
     *
     * @param fb filter bypass that insertString needs to perform demanded
     * operations
     * @param off offset
     * @param str string value
     * @param a set of attributes
     * @throws BadLocationException
     */
    @Override
    public void insertString(FilterBypass fb, int off, String str, AttributeSet a)
            throws BadLocationException {
        if (str != null && str.matches("\\d*")) {
            next().insertString(fb, off, str, a);
        }
    }

    /**
     * Overwritten replace method, here is validation done aswell
     *
     * @param fb
     * @param off
     * @param len lenght of string
     * @param str
     * @param a
     * @throws BadLocationException
     */
    @Override
    public void replace(FilterBypass fb, int off, int len, String str, AttributeSet a)
            throws BadLocationException {
        if (str == null || str.matches("\\d*")) {
            next().replace(fb, off, len, str, a);
        }
    }

    /**
     * removes typed character, doesnt need validation
     *
     * @param fb
     * @param off
     * @param len
     * @throws BadLocationException
     */
    @Override
    public void remove(FilterBypass fb, int off, int len) throws BadLocationException {
        next().remove(fb, off, len);
    }
}
