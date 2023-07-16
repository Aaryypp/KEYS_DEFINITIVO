/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.tablas.Cliente;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ariel
 */
public class mCliente extends Cliente {

    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;

    public List<Cliente> listar(int codigo) {

        List<Cliente> clientes = new ArrayList<>();
        try {
            if (codigo == 0) {
                sql = "SELECT id, cedula_per, contraseña FROM Cliente";

            } else {
                sql = "SELECT id, cedula_per, contraseña FROM Cliente WHERE id=" + codigo;
            }

            rs = con.consulta(sql);
            if (rs != null) {

                while (rs.next()) {
                    Cliente cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3));
                    clientes.add(cliente);
                }
            }
            con.close();
            return clientes;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean crear() {
        sql = "INSERT INTO Cliente (cedula_per, contraseña) VALUES ('" + getCedula_per() + "', '" + getContraseña() + "')";
        return con.accion(sql);
    }

    public boolean actualizar() {
        sql = "UPDATE Cliente SET contraseña = '" + getContraseña() + "' WHERE id ='" + getId() + "'";

        return con.accion(sql);
    }

    public boolean eliminar() {
        sql = "DELETE FROM Cliente WHERE id = '" + getId() + "'";
        return con.accion(sql);
    }

    public List<Cliente> buscar(String txt, String campo) {
        List<Cliente> clientes = new ArrayList<>();
        try {
            sql = "SELECT id, cedula_per, contraseña FROM Cliente WHERE" + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Cliente cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3));
                    clientes.add(cliente);
                }
            }
            con.close();
            return clientes;
        } catch (SQLException ex) {
            return null;
        }
    }

    public ResultSet obtener_cliente(String cedula) {

        sql = "SELECT * FROM Cliente JOIN Persona ON Cliente.cedula_per = Persona.cedula WHERE Persona.cedula ='" + cedula + "'";
        rs = con.consulta(sql);
        return rs;

    }

    public int existecliente(String cedula) {
        int cont = 0;
        sql = "SELECT COUNT(CEDULA) FROM persona WHERE cedula = '" + cedula + "'";
        
        rs = con.consulta(sql);
        try {
            rs.next();
            cont = rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(mCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cont;
    }

}
