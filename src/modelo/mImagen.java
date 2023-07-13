package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.tablas.Imagen;

public class mImagen extends Imagen {
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
    
    public List<Imagen> listar(int id) {
        List<Imagen> imagenes = new ArrayList<>();
        try {
            if (id == 0) {
                sql = "SELECT id, nombre, valor FROM imagen";
            } else {
                sql = "SSELECT id, nombre, valor  FROM imagen WHERE id=" + id;
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Imagen imagens = new Imagen(rs.getInt(1), rs.getString(2), rs.getBytes(3));
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
         sql = "INSERT INTO imagen(nombre, valor) VALUES ('"+ getNombre() + "'," + getValor()+ ")";
        return con.accion(sql);
    }
     
   public boolean actualizar() {
        sql = "UPDATE imagen SET nombre='"+getNombre()+"', valor="+getValor()+" WHERE id="+getId();
        return con.accion(sql);
    } 
   
    public int ultimoID() {
        int id = 0;
        try {
            sql = "SELECT * FROM (SELECT ID FROM IMAGEN ORDER BY ID DESC) WHERE ROWNUM <= 1";
            rs = con.consulta(sql);
            rs.next();
            id = rs.getInt(1);
        } catch (SQLException ex) {
        }
        return id;
    }
    
    
}
