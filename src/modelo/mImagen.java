package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.tablas.Imagen;

public class mImagen extends Imagen {
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
    public List<Imagen> listar(String id) {
        List<Imagen> imagenes = new ArrayList<>();
        try {
            if ("".equals(id)) {
                sql = "SELECT id, nombre, valor FROM imagen";
            } else {
                sql = "SSELECT id, nombre, valor  FROM imagen WHERE id='"+id+"'";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Imagen imagens = new Imagen(rs.getInt(1),rs.getString(2), rs.getBytes(3));
                  imagenes.add(imagens);
                }
            }
            con.close();
            return imagenes;
        } catch (SQLException ex) {
            return null;
        }
    }
    
     public boolean crear() {
         sql = "INSERT INTO imagen(id, nombre, valor)"
                 + " VALUES ('" + getId()
                 + "','" + getNombre() + "','" + getValor()
                 + ")";
        return con.accion(sql);
    }
     
   public boolean actualizar() {
        sql = "UPDATE imagen SET id='"
                +getId()+"', nombre='"
                +getNombre()+"', valor='"+getValor()+" WHERE cedula='"+getId()+"'";
        return con.accion(sql);
    } 
   
   public boolean eliminar(String id){
        sql = "DELETE FROM imagen WHERE id='"+id+"'";
        System.out.println(sql);
        return con.accion(sql);
    }
   
   public List<Imagen> buscar(String txt, String campo) {
        List<Imagen> imagens = new ArrayList<>();
        try {
            sql = "SELECT id, nombre, valor FROM imagen WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Imagen imagen = new Imagen(rs.getInt(1), rs.getString(2), rs.getBytes(3));
                    imagens.add(imagen);
                }
            }
            con.close();
            return imagens;
        } catch (SQLException ex) {
            return null;
        }
    }
   
    public int ultimoCodigo() {
        int id = 0;
        try {
            sql = "SELECT * FROM (SELECT ID FROM MARCA ORDER BY ID DESC) WHERE ROWNUM <= 1";
            rs = con.consulta(sql);
            rs.next();
            id = rs.getInt(1);
        } catch (SQLException ex) {
        }
        return id;
    }
}
