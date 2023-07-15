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
        sql = "INSERT INTO Auto (matricula, id_categoria, modelo, color, precio_diario, potencia)"
                + " VALUES ('" + getMatricula()
                + "'," + getId_categoria()
                + "," + getId_modelo()
                + ",'" + getColor()
                + "'," + getPrecio_diario()
                + "," + getPotencia()+")";
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
    
    public ResultSet join(int id) {
        try {
            sql = "SELECT p.cedula, p.nombre1, p.nombre2, p.apellido1, p.apellido2, p.fecha_nac, p.telefono, p.direccion, p.correo, \n"
                    + "p.sexo, p.id_imagen, e.salario , c.licencia, c.tipo_licencia, c.precio_hora \n"
                    + "FROM conductor c JOIN empleado e ON(c.id_empleado = e.id)JOIN persona p ON(e.cedula_per = p.cedula) WHERE c.id = " + id;
            rs = con.consulta(sql);
            rs.next();
            return rs;
        } catch (SQLException ex) {
            return null;
        }
    }
}
