package giris.ayarlar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Dialogs {
    
    public static void bosOlamazMesajGoster(JFrame frame){
        
        JOptionPane.showMessageDialog(frame, "Tüm alanlar dolu olmalıdır");
    }
    
    public static void ozelMesajGoster(JFrame frame,String message){
        
        JOptionPane.showMessageDialog(frame, message);
    }
    public static int onayMesajGoster(JFrame frame,String mesaj){
        int optionType = JOptionPane.YES_NO_OPTION;
        int selected = JOptionPane.showConfirmDialog(frame, mesaj, "UYARU", optionType);
        if (optionType == selected) {
            return 1;
        }
        return 0;
    }
}
