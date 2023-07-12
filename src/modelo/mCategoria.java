package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.tablas.Categoria;

public class mCategoria extends Categoria{
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
    public List<Categoria> listar(String id) {
        List<Categoria> Categoria = new ArrayList<>();
        try {
            if ("".equals(id)) {
                sql = "SELECT id, nombre FROM categoria";
            } else {
                sql = "SELECT id, nombre FROM categoria WHERE id='"+id+"'";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Categoria categoria = new Categoria(rs.getInt(1),rs.getString(2));
                  Categoria.add(categoria);
                }
            }
            con.close();
            return Categoria;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public boolean crear() {
        sql = "INSERT INTO categoria(nombre)"
                + " VALUES ('" + getNombre()+")";
        return con.accion(sql);
    }
    
    public boolean actualizar() {
        sql = "UPDATE categoria SET nombre='"
                +getNombre()+ " WHERE id='"+getId()+"'";
        return con.accion(sql);
    }
    public boolean eliminar(int id){
        sql = "DELETE FROM categoria WHERE id='"+id+"'";
        System.out.println(sql);
        return con.accion(sql);
    }

    public List<Categoria> buscar(String txt, String campo) {
        List<Categoria> Categoria = new ArrayList<>();
        try {
            sql = "SELECT id, nombre FROM categoria WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Categoria categoria = new Categoria(rs.getInt(1),rs.getString(2));
                    Categoria.add(categoria);
                }
            }
            con.close();
            return Categoria;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean existeCategoria(String id) {
        boolean exist = false;
        try {
            sql = "SELECT COUNT(id)FROM categoria WHERE id=" + id + "";
            System.out.println(sql);
            rs = con.consulta(sql);
            if (rs != null) {
                rs.next();
                if (rs.getInt(1) == 0) {
                    exist = false;
                } else {
                    exist = true;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(mEstado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist;
    }
}
