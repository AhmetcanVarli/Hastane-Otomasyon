package giris.ayarlar;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class IconAyarları {
    
    private static Icon originalIcon;
    
    public static void IconDegis(JLabel label,String filename){
        originalIcon = label.getIcon();
        label.setIcon( new ImageIcon(Package.getPackages().getClass().getResource("/giris/iconlar/"+filename+".png")));
        
    }
    public static void originalIcon(JLabel label){
        label.setIcon(originalIcon);
    }
    
}
