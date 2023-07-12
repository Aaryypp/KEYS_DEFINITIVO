package modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.tablas.Auto;

public class mAuto extends Auto {

    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;

    public List<Auto> listar(String matricula) {
        List<Auto> autos = new ArrayList<>();
        try {
            if ("".equals(matricula)) {
                sql = "SELECT matricula, id_categoria, id_modelo, color, precio_diario, id_estado, capacidad, potencia, id_estado, capacidad, potencia, id_imagen FROM auto";
            } else {
                sql = "SELECT matricula, id_categoria, id_modelo, color, precio_diario, id_estado, capacidad, potencia, id_estado, capacidad, potencia, id_imagen  FROM auto WHERE matricula='" + matricula + "'";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Auto auto = new Auto(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getDouble(5),
                            rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9));
                    autos.add(auto);
                }
            }
            con.close();
            return autos;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean crear() {
        sql = "INSERT INTO Auto (matricula, id_categoria, id_modelo, color, precio_diario, id_estado, capacidad, potencia, id_imagen)"
                + " VALUES ('" + getMatricula()
                + "'," + getId_categoria()
                + "," + getId_modelo()
                + ",'" + getColor()
                + "'," + getPrecio_diario()
                + "," + getId_estado()
                + "," + getCapacidad()
                + "," + getPotencia()
                + "," + getId_imagen() + ")";
        return con.accion(sql);
    }

    public boolean actualizar() {
        sql = "UPDATE auto SET id_categoria="
                + getId_categoria() + ", id_modelo="
                + getId_modelo() + ", color='"
                + getColor() + "', precio_diario="
                + getPrecio_diario() + ", id_estado"
                + getId_estado() + ", capacidad"
                + getCapacidad() + ", potencia"
                + getPotencia() + ", id_imagen"
                + getId_imagen() + "' WHERE matricula='" + getMatricula() + "'";
        System.out.println(sql);
        return con.accion(sql);
    }

    public boolean eliminar(String matricula) {
        sql = "DELETE FROM auto WHERE matricula='" + matricula + "'";
        try {
            return con.accion(sql);
        } catch (Exception e) {
            return false;
        }
    }

    public List<Auto> buscar(String txt, String campo) {
        List<Auto> autos = new ArrayList<>();
        try {
            sql = "SELECT matricula, id_categoria, id_modelo, color, precio_diario, id_estado, capacidad, potencia, id_estado, capacidad, potencia, id_imagen FROM auto WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Auto auto = new Auto(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getDouble(5),
                            rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9));
                    autos.add(auto);
                }
            }
            con.close();
            return autos;
        } catch (SQLException ex) {
            return null;
        }
    }
}
