package esclavo;

import java.rmi.RemoteException;
import javax.swing.JOptionPane;
import sop_rmi.ImpEsclavo;

public class Esclavo {
    public static void main(String[] args) {
        try {
            Tecnico tecnico = new Tecnico(args, new ImpEsclavo());
            tecnico.setVisible(true);
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(null, "No Se Ha Podido Referenciar Al Objeto Esclavo","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}