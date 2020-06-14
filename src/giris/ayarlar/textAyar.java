package giris.ayarlar;

import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.PlainDocument;

public class textAyar {

    private static String originalText;
    private static Color originalFgColor;

    public static void metinKontrol(JTextField textField, String org) {
        originalText = org;
        if (textField.getText().trim().equals(org)) {
            originalFgColor = textField.getForeground();
            textField.setText("");
        }
        textField.setForeground(Color.BLUE);
    }

    public static void metinBos(JTextField textField) {
        if (textField.getText().trim().equals("")) {
            textField.setText(originalText);
            textField.setForeground(originalFgColor);
        } else {
            textField.setForeground(Color.black);
        }
    }

    public static void sayıAyarla(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }

        });
    }

    public static void harfAyarla(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isAlphabetic(c)) {
                    e.consume();
                }
            }

        });
    }
    
    public static boolean uzunlukAyarı(int length,String str){
        return (str.length() < length);
    }
    
    public static boolean textAlanlariDolumu(JPanel panel){
        Component[] components = panel.getComponents();
        for(Component c:components){
            if (c instanceof JTextField) {
                JTextField textField = (JTextField)c;
                if (textField.getText().trim().equals("") && textField.isEnabled()) {
                    return false;
                }
            }
        }
        return true;
    }
    private static int limit;

    public static void limitAyar(JTextField textField, int lim) {
        limit = lim;
        textField.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str == null) {
                    return;
                }
                if ((getLength() + str.length()) <= limit) {
                super.insertString(offs, str, a); 
            }
            }    

        });
    }
    private static int ayar;
    public static void ReceteAyar(JTextPane textPane) {
        ayar = 200;
        textPane.setDocument(new DefaultStyledDocument(){
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
                if (getLength() + str.length() <= ayar) {
                    super.insertString(offs, str, a);
                }else{
                    Toolkit.getDefaultToolkit().beep();
                }
                
            }
        });
        
    }

}
