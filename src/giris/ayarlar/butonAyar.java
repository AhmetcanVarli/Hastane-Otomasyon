package giris.ayarlar;

import java.awt.Color;
import javax.swing.JButton;

public class butonAyar {
    /*
    ARKA PLAN VE YAZI RENGİ AYARLARI
    */
    private static Color originalBgColor,originalFgColor;
    
    public static void setBgFg(JButton button,Color bgColor, Color fgColor) {
        originalBgColor = button.getBackground();
        originalFgColor = button.getForeground();
        button.setBackground(bgColor);
        button.setForeground(fgColor);
        
    }
    public static void setOriginalBgFg(JButton button){
        button.setBackground(originalBgColor);
        button.setForeground(originalFgColor);
        
    }
}
