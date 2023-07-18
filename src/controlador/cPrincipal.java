package controlador;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatMaterialDesignDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.*;
import java.awt.Dimension;
import java.io.IOException;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import modelo.mAuto;
import modelo.mCliente;
import modelo.mConductor;
import modelo.mEmpleado;
import modelo.mExtra;
import vista.vAuto;
import vista.vCliente;
import vista.vConductor;
import vista.vEmpleado;
import vista.vExtras;
import vista.vPrincipal;

public final class cPrincipal {
    vPrincipal vista;
    vCliente vcliente;
    vConductor vconductor;
    vEmpleado vempleado;
    vAuto vauto;
    vExtras vextras;
//    private static Application app;
//    private final MainForm mainForm;
//    private final LoginForm loginForm;
    
//    
//    
    public cPrincipal(vPrincipal vista) throws IOException {
        this.vista = vista;
    }

    public void iniciar() {
//        setSize(new Dimension(1200, 768));
//        setLocationRelativeTo(null);
//        mainForm = new MainForm();
//        loginForm = new LoginForm();
//        setContentPane(loginForm);
//        Notifications.getInstance().setJFrame(this);
        vista.setVisible(true);
        vista.setExtendedState(vPrincipal.MAXIMIZED_BOTH);
        setBordeButton();
        vista.getJmTemas().addActionListener(l-> verJdTemas(true));
        vista.getJbGuardarTema().addActionListener(l-> guardarTema());
        vista.getJmSalir().addActionListener(l-> verJdLogin(true));
        vista.getMiCliente().addActionListener(l->menuPersona());
        vista.getMiConductor().addActionListener(l-> menuConductor());
        vista.getMiAutomovil().addActionListener(l-> MenuAutos()); 
        vista.getMiExtras().addActionListener(l->menuExtras());
        vista.getMiEmpleado().addActionListener(l-> menuEmpelado());
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
    
    public void menuEmpelado() {

        mEmpleado m_empleado = new mEmpleado();
        try {
            vista.getJdPrincipal().add(vempleado);
        } catch (Exception e) {
            vempleado = new vEmpleado();
            vista.getJdPrincipal().add(vempleado);
        }
        
        cEmpleado c_empleado = new cEmpleado(m_empleado, vempleado);
    }
    
    public void MenuAutos(){
        mAuto modeloAutos = new mAuto();
        try {
            vista.getJdPrincipal().add(vauto);
        } catch (Exception e) {
            vauto = new vAuto();
            vista.getJdPrincipal().add(vauto);
        }
        cAuto contolAutomovil = new cAuto(modeloAutos,vauto);
        contolAutomovil.iniciarCtrlBtn();
    }
           public void menuExtras() {

        mExtra modextra = new mExtra();
        try {
            vista.getJdPrincipal().add(vextras);
        } catch (Exception e) {
            vextras = new vExtras();
            vista.getJdPrincipal().add(vextras);
        }
        
        cExtra controlador = new cExtra(modextra, vextras);
        
    }
}
