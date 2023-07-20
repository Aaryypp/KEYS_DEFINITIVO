package controlador;

//import com.formdev.flatlaf.FlatDarculaLaf;
//import com.formdev.flatlaf.FlatIntelliJLaf;
//import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatMaterialDesignDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import modelo.mAuto;
import modelo.mCliente;
import modelo.mConductor;
import modelo.mEmpleado;
import modelo.mExtra;
import vista.cabecera;
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
    private DrawerController dave;
    
//    
//    
    public cPrincipal(vPrincipal vista) throws IOException {
        this.vista = vista;
        dave = Drawer.newDrawer(this.vista).header(new cabecera())
                .space(5)
                .separator(2, new Color(173,173,173))
                .background(new Color(135,206,250))
                .backgroundTransparent(0.3f)
                .duration(300)
                .enableScroll(true)
                .addChild(new DrawerItem("CLIENTES").icon(new ImageIcon(getClass().getResource("/vista/img/menu/user.png"))).build())
                .addChild(new DrawerItem("AUTOS").icon(new ImageIcon(getClass().getResource("/vista/img/menu/data.png"))).build())
                .addChild(new DrawerItem("EXTRAS").icon(new ImageIcon(getClass().getResource("/vista/img/menu/income.png"))).build())
                .addChild(new DrawerItem("MULTAS").icon(new ImageIcon(getClass().getResource("/vista/img/menu/expense.png"))).build())
                .addChild(new DrawerItem("REPORTE DE CLIENTES").icon(new ImageIcon(getClass().getResource("/vista/img/menu/report.png"))).build())
                .addChild(new DrawerItem("BAROU").icon(new ImageIcon(getClass().getResource("/vista/img/menu/data.png"))).build())
                .addFooter(new DrawerItem("SALIR ").icon(new ImageIcon(getClass().getResource("/vista/img/menu/exit.png"))).build())
                .event(new EventDrawer(){
                @Override
                public void selected(int i, DrawerItem di) {
                    System.out.println(i);
                    switch (i){
                        case 0:
                            menuPersona();
                            break;
                        case 1:
                            MenuAutos();
                            break;
                        case 2:
                            menuExtras();
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            
                            break;
                        case 5:
                            
                            break;
                        case 6:
                            verJdLogin(true);
                            break;
                }
                }
                })
                .build();
    }

    public void iniciar() {
//        
//        vista.setVisible(true);
        vista.getJdLogin().setSize(640, 535);
        vista.getExitTxt().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Cerrar();
            }
        });
        vista.getJdLogin().setLocationRelativeTo(vista);
        vista.getJdLogin().setVisible(true);
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
        vista.getMenu_desplegable().addActionListener(l-> Desplegar());
        vista.getJmSalir().addActionListener(l->Perfil());
    }
    
    
    public void guardarTema(){
//        setTema(vista.getJlTemas().getSelectedValue());
    }
    
//    public void setTema(String tema) {
//        tema = tema.replaceAll("[0-9. ]", "");
//        try {
//            switch (tema) {
//                case "NimbusLookAndFeel":
//                    UIManager.setLookAndFeel(new NimbusLookAndFeel());
//                    break;
//                case "FlatArcDarkIJTheme":
//                    UIManager.setLookAndFeel(new FlatArcDarkIJTheme());
//                    break;
//                case "FlatArcDarkOrangeIJTheme":
//                    UIManager.setLookAndFeel(new FlatArcDarkOrangeIJTheme());
//                    break;
//                case "FlatArcOrangeIJTheme":
//                    UIManager.setLookAndFeel(new FlatArcOrangeIJTheme());
//                    break;
//                case "FlatDarkPurpleIJTheme":
//                    UIManager.setLookAndFeel(new FlatDarkPurpleIJTheme());
//                    break;
//                case "FlatDarculaLaf":
//                    UIManager.setLookAndFeel(new FlatDarculaLaf());
//                    break;
//                case "FlatGitHubIJTheme":
//                    UIManager.setLookAndFeel(new FlatGitHubIJTheme());
//                    break;
//                case "FlatIntelliJLaf":
//                    UIManager.setLookAndFeel(new FlatIntelliJLaf());
//                    break;
//                case "FlatLightLaf":
//                    UIManager.setLookAndFeel(new FlatLightLaf());
//                    break;
//                case "FlatMaterialDarkIJTheme":
//                    UIManager.setLookAndFeel(new FlatMaterialDarkerIJTheme());
//                    break;
//                case "FlatMaterialDeepOceanIJTheme":
//                    UIManager.setLookAndFeel(new FlatMaterialDeepOceanIJTheme());
//                    break;
//                case "FlatMaterialDesignDarkIJTheme":
//                    UIManager.setLookAndFeel(new FlatMaterialDesignDarkIJTheme());
//                    break;
//                case "FlatMaterialLighterIJTheme":
//                    UIManager.setLookAndFeel(new FlatMaterialLighterIJTheme());
//                    break;
//                case "FlatMaterialOceanicIJTheme":
//                    UIManager.setLookAndFeel(new FlatMaterialOceanicIJTheme());
//                    break;
//                case "FlatMaterialPalenightIJTheme":
//                    UIManager.setLookAndFeel(new FlatMaterialPalenightIJTheme());
//                    break;
//            }
//            verJdTemas(false);
//            vista.dispose();
//
//            vista = new vPrincipal();
//            vista.setVisible(true);
//            iniciar();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

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
        vista.setVisible(false);
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
           
    
    
    public void Desplegar(){
        if(dave.isShow()){
            dave.hide();
        }else{
            dave.show();
        }
    }
    
    public void Cerrar(){
        System.exit(0);
    }
    
    public void Perfil(){
        
    }
}
