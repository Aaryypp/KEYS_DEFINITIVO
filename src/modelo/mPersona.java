package modelo;
import modelo.tablas.Persona;
import java.sql.*;

public class mPersona extends Persona {
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
    public boolean crear() {
        sql = "INSERT INTO Persona (cedula, nombre1, nombre2, apellido1, apellido2, fecha_nac, telefono, direccion, correo, sexo, id_imagen)"
                + " VALUES ('" + getCedula() + "','" + getNombre1() + "', '" + getNombre2() + "', '" + getApellido1() + "', '" + getApellido2() + "',to_date('" + getFecha_nac() + "', 'YYYY-MM-DD'), '" + getTelefono() + "', '" + getDireccion() + "', '" + getCorreo() + "', '" + getSexo() + "','" + getId_imagen() + "')";
        return con.accion(sql);
    }
  
    public boolean actualizar() {
       
        sql = "UPDATE Persona SET nombre1='" + getNombre1() + "'"
                + ", nombre2='" + getNombre2() + "'"
                + ", apellido1='" + getApellido1() + "'"
                + ", apellido2='" + getApellido2() + "'"
                 + ", fecha_nac= to_date('" + getFecha_nac() + "', 'YYYY-MM-DD')"
                
                + ", telefono='" + getTelefono() + "'"
                + ", direccion='" + getDireccion() + "'"
                + ", correo='" + getCorreo() + "'"
                + ", sexo='" + getSexo() + "'"
                + ", id_imagen='" +1+ "' "
                + "WHERE cedula='" + getCedula() + "'";
        
        return con.accion(sql);
    }
    public boolean eliminar(String cedula) {
        sql = "DELETE FROM Persona WHERE cedula='"+getCedula();
        return con.accion(sql);
    }
}
