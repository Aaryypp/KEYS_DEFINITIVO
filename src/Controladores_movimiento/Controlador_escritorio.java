/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores_movimiento;

import Paneles_movimiento.Fondo_escritorio;
import com.formdev.flatlaf.FlatClientProperties;

/**
 *
 * @author LENOVO
 */
public class Controlador_escritorio {
    private Fondo_escritorio vista;
    
    
    public void Iniciar() {
        vista.getLb().putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
    }

    public Controlador_escritorio(Fondo_escritorio vista) {
        this.vista = vista;
        Iniciar();
    }
    
}
