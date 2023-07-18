/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores_movimiento;

import Paneles_movimiento.Forma_leer;
import com.formdev.flatlaf.FlatClientProperties;

/**
 *
 * @author LENOVO
 */
public class Controlador_leer {
    private Forma_leer vista;

    public Controlador_leer() {
        Iniciar();
    }

    public Controlador_leer(Forma_leer vista) {
        this.vista = vista;
        Iniciar();
    }
    
    public void Iniciar(){
        vista.getLb().putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
    }
}
