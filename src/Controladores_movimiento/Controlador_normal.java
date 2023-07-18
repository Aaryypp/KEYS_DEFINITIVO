/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores_movimiento;

import Paneles_movimiento.Forma_normal;
import com.formdev.flatlaf.FlatClientProperties;

/**
 *
 * @author LENOVO
 */
public class Controlador_normal {
    private Forma_normal vista;

    public Controlador_normal(Forma_normal vista) {
        this.vista = vista;
        vista.getLb().putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
    }
    
    
}
