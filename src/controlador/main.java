package controlador;

import java.io.IOException;
import vista.vPrincipal;

public class main {

    public static void main(String[] args) {
        try {
            cPrincipal control = new cPrincipal(new vPrincipal());
            control.iniciar();
            control.setTema("FlatIntelliJLaf");
        } catch (IOException ex) {
        }
    }
}
