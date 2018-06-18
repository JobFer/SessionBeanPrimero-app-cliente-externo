package sessionbeanprimeroappclienteexterno;

import com.videotutoriales.sessionbeanprimero.ejb.RepetirRemote;
import javax.ejb.EJB;
import javax.swing.JOptionPane;

public class Main {

    @EJB
    private static RepetirRemote repetir;

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, repetir.repetir("Curso de EJB. Cliente externo."));
    }
    
}
