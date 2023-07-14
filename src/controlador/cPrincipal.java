package controlador;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatMaterialDesignDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.*;
import controlador.otros.RoundedLabel;
import java.io.IOException;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import modelo.mCliente;
import modelo.mConductor;
import vista.vCliente;
import vista.vConductor;
import vista.vPrincipal;

public final class cPrincipal {
    vPrincipal vista;
    vCliente vcliente;
    vConductor vconductor;

    public cPrincipal(vPrincipal vista) throws IOException {
        this.vista = vista;
    }

    public void iniciar() {
        vista.setVisible(true);
        vista.setExtendedState(vPrincipal.MAXIMIZED_BOTH);
        setBordeButton();
        vista.getJmTemas().addActionListener(l-> verJdTemas(true));
        vista.getJbGuardarTema().addActionListener(l-> guardarTema());
        vista.getJmSalir().addActionListener(l-> verJdLogin(true));
        vista.getMiCliente().addActionListener(l->menuPersona());
        vista.getMiConductor().addActionListener(l-> menuConductor());
        
        String imagePath = "src/vista/img/logo.png";
        try {
            RoundedLabel rl = new RoundedLabel();
            rl.setRoundedImage(imagePath,vista.getLbLogo());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    
    public void guardarTema(){
        setTema(vista.getJlTemas().getSelectedValue());
    }
    
    public void setTema(String tema) {
        tema = tema.replaceAll("[0-9. ]", "");
        try {
            switch (tema) {
                case "NimbusLookAndFeel":
                    UIManager.setLookAndFeel(new NimbusLookAndFeel());
                    break;
                case "FlatArcDarkIJTheme":
                    UIManager.setLookAndFeel(new FlatArcDarkIJTheme());
                    break;
                case "FlatArcDarkOrangeIJTheme":
                    UIManager.setLookAndFeel(new FlatArcDarkOrangeIJTheme());
                    break;
                case "FlatArcOrangeIJTheme":
                    UIManager.setLookAndFeel(new FlatArcOrangeIJTheme());
                    break;
                case "FlatDarkPurpleIJTheme":
                    UIManager.setLookAndFeel(new FlatDarkPurpleIJTheme());
                    break;
                case "FlatDarculaLaf":
                    UIManager.setLookAndFeel(new FlatDarculaLaf());
                    break;
                case "FlatGitHubIJTheme":
                    UIManager.setLookAndFeel(new FlatGitHubIJTheme());
                    break;
                case "FlatIntelliJLaf":
                    UIManager.setLookAndFeel(new FlatIntelliJLaf());
                    break;
                case "FlatLightLaf":
                    UIManager.setLookAndFeel(new FlatLightLaf());
                    break;
                case "FlatMaterialDarkIJTheme":
                    UIManager.setLookAndFeel(new FlatMaterialDarkerIJTheme());
                    break;
                case "FlatMaterialDeepOceanIJTheme":
                    UIManager.setLookAndFeel(new FlatMaterialDeepOceanIJTheme());
                    break;
                case "FlatMaterialDesignDarkIJTheme":
                    UIManager.setLookAndFeel(new FlatMaterialDesignDarkIJTheme());
                    break;
                case "FlatMaterialLighterIJTheme":
                    UIManager.setLookAndFeel(new FlatMaterialLighterIJTheme());
                    break;
                case "FlatMaterialOceanicIJTheme":
                    UIManager.setLookAndFeel(new FlatMaterialOceanicIJTheme());
                    break;
                case "FlatMaterialPalenightIJTheme":
                    UIManager.setLookAndFeel(new FlatMaterialPalenightIJTheme());
                    break;
            }
            verJdTemas(false);
            vista.dispose();

            vista = new vPrincipal();
            vista.setVisible(true);
            iniciar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setBordeButton() {
        UIManager.put("Button.arc", 100);
        UIManager.put("Component.arc", 100);
        UIManager.put("ProgressBar.arc", 100);
        UIManager.put("TextComponent.arc", 100);
    }

    public void verJdTemas(boolean ver) {
        vista.getJdTemas().setTitle("Listado de temas");
        vista.getJdTemas().setSize(300, 358);
        vista.getJdTemas().setLocationRelativeTo(vista);
        vista.getJdTemas().setVisible(ver);
    }
    
    public void verJdLogin(boolean ver) {
        vista.getJdLogin().setTitle("Iniciar Sesión");
        vista.getJdLogin().setSize(640, 535);
        vista.getJdLogin().setLocationRelativeTo(vista);
        vista.getJdLogin().setVisible(ver);
    }
    public void menuPersona() {

        mCliente modper = new mCliente();
        try {
            vista.getJdPrincipal().add(vcliente);
        } catch (Exception e) {
            vcliente = new vCliente();
            vista.getJdPrincipal().add(vcliente);
        }
        
        cCliente controlador = new cCliente(modper, vcliente);
//        controlador.iniciarCtrlBtn();
        
    }
    
    public void menuConductor() {

        mConductor m_conductor = new mConductor();
        try {
            vista.getJdPrincipal().add(vconductor);
        } catch (Exception e) {
            vconductor = new vConductor();
            vista.getJdPrincipal().add(vconductor);
        }
        
        cConductor c_conductor = new cConductor(m_conductor, vconductor);
    }
}
