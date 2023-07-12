package controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.mConductor;
import modelo.tablas.Conductor;
import java.sql.ResultSet;
import java.sql.SQLException;
import vista.vConductor;

public class cConductor {
    private final mConductor modelo;
    private final vConductor vista;
    
    List<Conductor> conductores = new ArrayList<>();
    
    
    DefaultTableModel dtm;
    String[] columnas = {"ID", "ID empleado", "Licencia" ,"Tipo de licencia", "Precio/Hora"};
    int id;
    String modo = "Nuevo";
    ResultSet rs = null;

    public cConductor(mConductor modelo, vConductor vista) {
        this.modelo = modelo;
        this.vista = vista;
        iniciar();
        this.vista.setVisible(true);
    }
    
    public void iniciar(){
        listar();
        seleccionar(vista.getJtConductores());
        
        //....
    }
    
    public void listar(){
        dtm = new DefaultTableModel(null,columnas);
        
        conductores = modelo.listar(0);
        conductores.stream().forEach(c -> dtm.addRow(new Object[]{c.getId_con(), c.getId_empleado(), c.getLicencia(),
        c.getTipo_licencia(),c.getPrecio_hora()}));
        
        vista.getJtConductores().setModel(dtm);
        vista.getJtConductores().setRowHeight(30);
    }
    
    public void seleccionar(JTable t){
        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    id = Integer.parseInt(t.getValueAt(t.getSelectedRow(), 0).toString());
                    llenar();
                }
            }
        });
    }
    public void crear(){
        
    }
    
    public void actualizar(){
        
    }
    
    public void eliminar(){
        
    }
    
    public void llenar(){
        rs = modelo.join(id);
        if (rs != null) {
            try {
                vista.getTxtCedula().setText(rs.getString(1));
                vista.getTxtNombre1().setText(rs.getString(2));
                vista.getTxtNombre2().setText(rs.getString(3));
                vista.getTxtApellido1().setText(rs.getString(4));
                vista.getTxtApellido2().setText(rs.getString(5));
                vista.getJdcFechaNac().setDate(rs.getDate(6));
                vista.getTxtTelefono().setText(rs.getString(7));
                vista.getTxtDireccion().setText(rs.getString(8));
                vista.getTxtCorreo().setText(rs.getString(9));
                vista.getCbSexo().setSelectedItem(rs.getString(10));
                //vista.getLbFoto().setText(rs.getString(11)); -- PARA SETEAR LA FOTO
                vista.getTxtSueldo().setText(""+rs.getDouble(12));
                vista.getTxtLicencia().setText(rs.getString(13));
                vista.getCbTipoLicencia().setSelectedItem(rs.getString(14));
                vista.getTxtPrecioHora().setText(""+rs.getDouble(15));
            } catch (SQLException ex) {
            }
        }
    }
}
