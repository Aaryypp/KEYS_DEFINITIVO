/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Controladores_movimiento.MainForm;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.SwingUtilities;
import raven.toast.Notifications;
import vista.Vprinci_slide;
import vista.Vprinci_slide.mainForm;

/**
 *
 * @author LENOVO
 */
public class Controlador_slide {
    
    private static Vprinci_slide vista = new Vprinci_slide();
    
    public Controlador_slide() {
        vista.setSize(new Dimension(1200, 768));
        vista.setLocationRelativeTo(null);
        Notifications.getInstance().setJFrame(vista);
    }

    public static void showForm(Component component) {
        component.applyComponentOrientation(vista.getComponentOrientation());
        vista.getMainForm().showForm(component);
    }

//    public static void logout() {
//        FlatAnimatedLafChange.showSnapshot();
//        vista.getApp().setContentPane(vista.getApp().loginForm);
//        app.loginForm.applyComponentOrientation(app.getComponentOrientation());
//        SwingUtilities.updateComponentTreeUI(app.loginForm);
//        FlatAnimatedLafChange.hideSnapshotWithAnimation();
//    }

    public static void setSelectedMenu(int index, int subIndex) {
        vista.getMainForm().setSelectedMenu(index, subIndex);
    }
}
