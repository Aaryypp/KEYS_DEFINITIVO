
package controlador;

import static controlador.cCliente.rs;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.mCategoria;
import modelo.mExtra;
import modelo.tablas.Categoria;
import modelo.tablas.Extra;
import vista.vExtras;

/**
 *
 * @author ariel
 */
public class cExtra {
    private final mExtra modelo;
    private final vExtras vista;
    public static ResultSet rs2 = null;
    mCategoria modeloc = new mCategoria();
    List<Extra> extras = new ArrayList<>();
    List<Categoria> categorias = new ArrayList<>();
    DefaultTableModel dtm;
    String[] columnas = {"Codigo","Nombre", "Precio","Existencias","Categoria"};
    int id;
    public cExtra(mExtra modelo, vExtras vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        visualizar(0);
        iniciarCtrlBtn();
        seleccionar(vista.getJtExtras());
        llenarcate(vista.getCbCategoria());
        accionboton();
    }
    public void iniciarCtrlBtn() {
        vista.getJb_ModoEditar().addActionListener(l -> editarmodo());
        vista.getJb_ModoNuevo().addActionListener(l -> crearmodo());
        vista.getJb_ModoVista().addActionListener(l -> eliminarver());
        vista.getJbOK().addActionListener(l->accionboton());
        

    }
    private void visualizar(int id) {
        dtm = new DefaultTableModel(null, columnas);
        extras = modelo.listar(id);
        extras.stream().forEach(p -> dtm.addRow(new Object[]{p.getCodigo(), p.getNombre(), p.getPrecio(),p.getExistencias(),p.getId_categoria()}));
        vista.getJtExtras().setModel(dtm);
        vista.getJtExtras().setRowHeight(30);
    }
      public void editarmodo() {       
//        desckboton();
//        vista.getTxtCedula().setEditable(false);
        vista.getJbOK().setText("MODIFICAR");
        vista.getLbModo().setText("Actualizar extras");
    }
     public void crearmodo() {
//       vaciarperfil();
//       desckboton();
//        vista.getTxtCedula().setEditable(true);
        vista.getJbOK().setText("REGISTRAR"); 
        vista.getLbModo().setText("Registrar extras");
        
    }
     public void eliminarver() {
//        blockboton();
        vista.getJbOK().setText("ELIMINAR");
         vista.getLbModo().setText("Eliminar extras");
    }
           public void accionboton() {

          if (vista.getJbOK().getText().equals("MODIFICAR")) {
              
//              if (lleno()) {
//                  if (fechavalida() == null||!emailcorrect()||!fechcorrect()) {
//                  } else {
//                      setearDatosmod();
//                      modelop.actualizar();
//                      modelo.actualizar();
//                      visualizar(0);
//                      JOptionPane.showMessageDialog(null, "Modificado correctamente");
//                  }
//              }
          }
          if (vista.getJbOK().getText().equals("REGISTRAR")) {
              System.out.println("hace algo");
//              if (lleno()) {
//                  if (fechavalida()==null||existep()==1||!cedcorrect()||!emailcorrect()||!fechcorrect()) {
//                      
//                  } else {
                        setearDatos();
                        modelo.crear();
//                      modelo.crear();
//                      visualizar(0);
//                      JOptionPane.showMessageDialog(null, "Registrado correctamente");
//                  }
//
//              }
          }
        if (vista.getJbOK().getText().equals("ELIMINAR")) {
//            if (llenoeli()){ 
//                modelo.setId(Integer.parseInt(vista.getTxtIdCliente().getText()));
//                modelo.eliminar();
//                modelop.setCedula(vista.getTxtCedula().getText());
//                modelop.eliminar(id);
//                visualizar(0);
//                vaciarperfil();
//                JOptionPane.showMessageDialog(null, "Eliminado correctamente");
//                 
//            }


        }

    }
        public void setearDatos() {
        try {
            modelo.setNombre(vista.getTxtNombre().getText());
            modelo.setPrecio(Double.valueOf(vista.getTxtPrecio().getText()));
            modelo.setExistencias(Integer.parseInt(vista.getTxtExistencias().getText()));
            rs2=modeloc.obtener_idcate(vista.getCbCategoria().getSelectedItem().toString());
            rs2.next();
            int nom=rs2.getInt(1);
            modelo.setId_categoria(nom);
        } catch (SQLException ex) {
            Logger.getLogger(cExtra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
        public void seleccionar(JTable t) {
        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    String p= t.getValueAt(t.getSelectedRow(), 0).toString();
                    id=Integer.parseInt(p);
                    String p2= t.getValueAt(t.getSelectedRow(), 0).toString();
                    id=Integer.parseInt(p);
                    
////                    blockboton();
                    llenarPerfil();
//                    blockboton();
                    
                }
            }
        });
    }
        public void llenarPerfil() {
        rs = modelo.obtener_extra(id);
        if (rs != null) {
            try {
                while (rs.next()) {
                    vista.getTxtIdExtras().setText(String.valueOf(rs.getInt(1)));//codigo
                    vista.getTxtNombre().setText(rs.getString(2));//nombre
                    vista.getTxtPrecio().setText(rs.getString(3));//precio
                    categorias=modeloc.listar(rs.getInt(4));
                    vista.getCbCategoria().setSelectedItem(categorias.get(0).getNombre());
                    vista.getTxtExistencias().setText(rs.getString(5));//existencias
                }
            } catch (SQLException ex) {
                Logger.getLogger(cCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    public void llenarcate(JComboBox cb) {
        try {
            cb.removeAllItems();
            cb.addItem("Seleccione...");
            rs=modeloc.obtener_cate();
            while (rs.next()) {
                cb.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
        }
    } 
    
    
//       public void SELECT(JComboBox cb) {
//        try {
//           
//            }
//        } catch (SQLException ex) {
//        }
//    }  
//    
//     
//    
    
    
    
    
}
