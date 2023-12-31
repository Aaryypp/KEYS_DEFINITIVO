package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.tablas.Alquiler;

public class mAlquiler extends Alquiler {

    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;

    public List<Alquiler> listar(int id) {
        List<Alquiler> Alquiler = new ArrayList<>();
        try {
            if ("".equals(id)) {
                sql = "SELECT id, fecha, dias, total, matricula_auto, id_cliente FROM alquiler";
            } else {
                sql = "SELECT id, fecha, dias, total, matricula_auto, id_cliente FROM alquiler WHERE id='" + id + "'";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Alquiler alquiler = new Alquiler(rs.getInt(1), rs.getDate(2), rs.getInt(3), rs.getDouble(4),
                            rs.getString(5), rs.getInt(6));
                    Alquiler.add(alquiler);
                }
            }
            con.close();
            return Alquiler;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean crear() {
        sql = "INSERT INTO alquiler(fecha, dias, total, matricula_auto)"
                + " VALUES (TO_DATE('" + getFecha()
                + "','YYYY-MM-DD')"
                + "'," + getDias()
                + "'," + getTotal()
                + ",'" + getMatricula_auto() + "')";
        System.out.println(sql);
        return con.accion(sql);
    }

    public boolean actualizar() {
        sql = "UPDATE alquiler SET fecha="
                + "(TO_DATE('" + getFecha()+ "','YYYY-MM-DD')"
                + "', dias="
                + getDias() + "', total="
                + getTotal() + " WHERE id='" + getId() + "'";
        System.out.println(sql);
        return con.accion(sql);
    }

    public boolean eliminar(String id) {
        sql = "DELETE FROM alquiler WHERE id=" + id + "";
        System.out.println(sql);
        return con.accion(sql);
    }

    public List<Alquiler> buscar(String txt, String campo) {
        List<Alquiler> Alquiler = new ArrayList<>();
        try {
            sql = "SELECT id, fecha, dias, total, matricula_auto, id_cliente FROM alquiler WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Alquiler alquiler = new Alquiler(rs.getInt(1), rs.getDate(2), rs.getInt(3), rs.getDouble(4),
                            rs.getString(5), rs.getInt(6));
                    Alquiler.add(alquiler);
                }
            }
            con.close();
            return Alquiler;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean existealquiler(String id) {
        boolean exist = false;
        try {
            sql = "SELECT COUNT(id)FROM alquiler WHERE id=" + id + "";
            System.out.println(sql);
            rs = con.consulta(sql);
            if (rs != null) {
                rs.next();
                if (rs.getInt(1) == 0) {
                    exist = true;
                } else {
                    exist = false;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(mAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist;
    }
}
