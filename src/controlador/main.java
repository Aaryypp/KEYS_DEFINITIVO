package controlador;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.vPrincipal;

public class main {

    public static void main(String[] args) {
        try {
            /* componentes individuales:
            myButton.putClientProperty( "JButton.buttonType", "roundRect" );
            myComboBox.putClientProperty( "JComponent.roundRect", true );
            mySpinner.putClientProperty( "JComponent.roundRect", true );
            myTextField.putClientProperty( "JComponent.roundRect", true );
            */
            cPrincipal control = new cPrincipal(new vPrincipal());
            control.iniciar();
            System.out.println("COMIT DE PRUEBA");
            
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        

    }
    
    
}
