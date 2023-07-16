package controlador;

import controlador.otros.Validar;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.mCliente;
import modelo.mPersona;
import modelo.tablas.Cliente;
import vista.vCliente;

public class cCliente {
    private final mCliente modelo;
    mPersona modelop=new mPersona(); 
    private final vCliente vista;
    public static ResultSet rs = null;
    List<Cliente> clientes = new ArrayList<>();
    DefaultTableModel dtm;
    String[] columnas = {"Codigo", "Cedula", "Contraseña"};
    String id;
    String mod = null;

    public cCliente(mCliente modelo, vCliente vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        visualizar(0);
        seleccionar(vista.getJtClientes());
        iniciarCtrlBtn();
        controlKey();
    }
      public void iniciarCtrlBtn() {
        vista.getJb_ModoEditar().addActionListener(l -> editarmodo());
        vista.getJb_ModoNuevo().addActionListener(l -> crearmodo());
        vista.getJb_ModoVista().addActionListener(l -> eliminarver());
        vista.getJbOK().addActionListener(l -> accionboton());

    }
    private void visualizar(int id) {
        dtm = new DefaultTableModel(null, columnas);
        clientes = modelo.listar(id);
        clientes.stream().forEach(p -> dtm.addRow(new Object[]{p.getId(), p.getCedula_per(), p.getContraseña()}));
        
        vista.getJtClientes().setModel(dtm);
        vista.getJtClientes().setRowHeight(30);
    }
    public void editarmodo() {       
        desckboton();
        vista.getTxtCedula().setEditable(false);
        vista.getJbOK().setText("MODIFICAR");
    }
     public void crearmodo() {
       vaciarperfil();
       desckboton();
        vista.getTxtCedula().setEditable(true);
        vista.getJbOK().setText("REGISTRAR"); 
        
    }
     public void eliminarver() {
        blockboton();
        vista.getJbOK().setText("ELIMINAR");
    }
     
      public void accionboton() {

          if (vista.getJbOK().getText().equals("MODIFICAR")) {
              if (lleno()) {
                  if (fechavalida() == null) {
                  } else {
                      setearDatosmod();
                      modelop.actualizar();
                      modelo.actualizar();
                      visualizar(0);
                      JOptionPane.showMessageDialog(null, "Modificado correctamente");
                  }
              }
          }
          if (vista.getJbOK().getText().equals("REGISTRAR")) {
              if (lleno()) {
                  if (fechavalida()==null||existep()==1||!cedcorrect()||!emailcorrect()) {
                      
                  } else {
                      setearDatoscre();
                      modelop.crear();
                      modelo.crear();
                      visualizar(0);
                      JOptionPane.showMessageDialog(null, "Registrado correctamente");
                  }

              }
          }
        if (vista.getJbOK().getText().equals("ELIMINAR")) {
            if (llenoeli()){ 
                modelo.setId(Integer.parseInt(vista.getTxtIdCliente().getText()));
                modelo.eliminar();
                modelop.setCedula(vista.getTxtCedula().getText());
                modelop.eliminar(id);
                visualizar(0);
                vaciarperfil();
                JOptionPane.showMessageDialog(null, "Eliminado correctamente");
                 
            }


        }

    }
    
    public void seleccionar(JTable t) {
        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    id = t.getValueAt(t.getSelectedRow(), 1).toString();
//                    blockboton();
                    llenarPerfil();
                    blockboton();
                    
                }
            }
        });
    }

    public void llenarPerfil() {
        rs = modelo.obtener_cliente(id);

        if (rs != null) {
            try {
                while (rs.next()) {
                    vista.getTxtIdCliente().setText(String.valueOf(rs.getInt(1)));
                    vista.getTxtCedula().setText(rs.getString(2));//cedula
                    vista.getTxtContraseña().setText(rs.getString(3));//CONTRA
                    vista.getTxtNombre1().setText(rs.getString(5));//nombe1
                    vista.getTxtNombre2().setText(rs.getString(6));//NOMBRE2
                    vista.getTxtApellido1().setText(rs.getString(7));//apellido1
                    vista.getTxtApellido2().setText(rs.getString(8));//apellido2
                    vista.getJdcFechaNac().setDate(rs.getDate(9));//FECHA
                    vista.getTxtTelefono().setText(rs.getString(10));//TELEFONO
                    vista.getTxtDireccion().setText(rs.getString(11));//DIRECCION
                    vista.getTxtCorreo().setText(rs.getString(12));//CORREO
                    if (rs.getString(13).equals("Masculino")) {
                        vista.getCbSexo().setSelectedIndex(1);
                    } else {
                        vista.getCbSexo().setSelectedIndex(2);
                    }
                    int idfoto = rs.getInt(14);

                }
            } catch (SQLException ex) {
                Logger.getLogger(cCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
       public void blockboton() {
           vista.getTxtCedula().setEditable(false);//cedula
           vista.getTxtContraseña().setEditable(false);//CONTRA
           vista.getTxtNombre1().setEditable(false);//nombe1
           vista.getTxtNombre2().setEditable(false);//NOMBRE2
           vista.getTxtApellido1().setEditable(false);//apellido1
           vista.getTxtApellido2().setEditable(false);//apellido2
           vista.getJdcFechaNac().setEnabled(false);//FECHA
           vista.getTxtTelefono().setEditable(false);//TELEFONO
           vista.getTxtDireccion().setEditable(false);//DIRECCION
           vista.getTxtCorreo().setEditable(false);//CORREO
           vista.getCbSexo().setEnabled(false);//SEXO

    }
          public void desckboton() {
           vista.getTxtCedula().setEditable(true);//cedula
           vista.getTxtContraseña().setEditable(true);//CONTRA
           vista.getTxtNombre1().setEditable(true);//nombe1
           vista.getTxtNombre2().setEditable(true);//NOMBRE2
           vista.getTxtApellido1().setEditable(true);//apellido1
           vista.getTxtApellido2().setEditable(true);//apellido2
           vista.getJdcFechaNac().setEnabled(true);//FECHA
           vista.getTxtTelefono().setEditable(true);//TELEFONO
           vista.getTxtDireccion().setEditable(true);//DIRECCION
           vista.getTxtCorreo().setEditable(true);//CORREO
           vista.getCbSexo().setEnabled(true);//SEXO

    }
        public void vaciarperfil() {

        vista.getTxtIdCliente().setText("Autoasignado");//cedula     
        vista.getTxtCedula().setText("");//cedula
        vista.getTxtContraseña().setText("");//CONTRA
        vista.getTxtNombre1().setText("");//nombe1
        vista.getTxtNombre2().setText("");//NOMBRE2
        vista.getTxtApellido1().setText("");//apellido1
        vista.getTxtApellido2().setText("");//apellido2
        vista.getJdcFechaNac().setCalendar(null);//FECHA
        vista.getTxtTelefono().setText("");//TELEFONO
        vista.getTxtDireccion().setText("");//DIRECCION
        vista.getTxtCorreo().setText("");//CORREO
        vista.getCbSexo().setSelectedIndex(0);//SEXO

    }
          
      public void setearDatosmod() {
        modelo.setId(Integer.parseInt(vista.getTxtIdCliente().getText()));
        modelo.setCedula_per(vista.getTxtCedula().getText());
        modelo.setContraseña(String.valueOf(vista.getTxtContraseña().getPassword()));
        modelop.setCedula(vista.getTxtCedula().getText());
        modelop.setNombre1(vista.getTxtNombre1().getText());
        modelop.setNombre2(vista.getTxtNombre2().getText());
        modelop.setApellido1(vista.getTxtApellido1().getText());
        modelop.setApellido2(vista.getTxtApellido2().getText());
        Date fecha = vista.getJdcFechaNac().getDate();
        Long d = fecha.getTime();
        java.sql.Date fecha_via = new java.sql.Date(d);
        modelop.setFecha_nac(fecha_via); 
        modelop.setTelefono(vista.getTxtTelefono().getText());
        modelop.setDireccion(vista.getTxtDireccion().getText());
        modelop.setCorreo(vista.getTxtCorreo().getText());
        modelop.setSexo(vista.getCbSexo().getSelectedItem().toString());
    }
       public void setearDatoscre() {    
        modelo.setCedula_per(vista.getTxtCedula().getText());
        modelo.setContraseña(String.valueOf(vista.getTxtContraseña().getPassword()));
        modelop.setCedula(vista.getTxtCedula().getText());
        modelop.setNombre1(vista.getTxtNombre1().getText());
        modelop.setNombre2(vista.getTxtNombre2().getText());
        modelop.setApellido1(vista.getTxtApellido1().getText());
        modelop.setApellido2(vista.getTxtApellido2().getText());
        Date fecha = vista.getJdcFechaNac().getDate();
        Long d = fecha.getTime();
        java.sql.Date fecha_via = new java.sql.Date(d);
        modelop.setFecha_nac(fecha_via); 
        modelop.setTelefono(vista.getTxtTelefono().getText());
        modelop.setDireccion(vista.getTxtDireccion().getText());
        modelop.setCorreo(vista.getTxtCorreo().getText());
        modelop.setSexo(vista.getCbSexo().getSelectedItem().toString());
    }
      
    public boolean lleno() {
        boolean llen = false;
        if (vista.getTxtNombre1().getText().isEmpty() || vista.getTxtNombre2().getText().isEmpty() || vista.getTxtApellido1().getText().isEmpty() || vista.getTxtApellido2().getText().isEmpty()
                || vista.getTxtCedula().getText().isEmpty() || vista.getTxtContraseña().getText().isEmpty() || vista.getTxtTelefono().getText().isEmpty() || vista.getTxtDireccion().getText().isEmpty()
                || vista.getTxtCorreo().getText().isEmpty()||vista.getCbSexo().getSelectedIndex()==0 ){
            llen = false;
                JOptionPane.showMessageDialog(null, "COMPLETE TODOS LOS CAMPOS"); 
        } else {
            
            llen = true;
            
        }
        return llen;
    }
     public boolean llenoeli() {
        boolean llen = false;
        if (vista.getTxtNombre1().getText().isEmpty() || vista.getTxtNombre2().getText().isEmpty() || vista.getTxtApellido1().getText().isEmpty() || vista.getTxtApellido2().getText().isEmpty()
                || vista.getTxtCedula().getText().isEmpty() || vista.getTxtContraseña().getText().isEmpty() || vista.getTxtTelefono().getText().isEmpty() || vista.getTxtDireccion().getText().isEmpty()
                || vista.getTxtCorreo().getText().isEmpty()||vista.getCbSexo().getSelectedIndex()==0 ){
            llen = false;
                JOptionPane.showMessageDialog(null, "Seleccione un registro"); 
        } else {
            
            llen = true;
            
        }
        return llen;
    }
    public Date fechavalida() {
        Date fecha;
        fecha = vista.getJdcFechaNac().getDate();
        if (fecha == null) {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta");
           
        }
        return fecha;

    }
      public int existep() {
       int ex=modelo.existecliente(vista.getTxtCedula().getText());
          if (ex==1) {
               JOptionPane.showMessageDialog(null, "Ya se encuentra registrado");    
          }
        return ex;
         
        
    }
    public boolean cedcorrect() {
        boolean valid = Validar.cedula(vista.getTxtCedula().getText());
        if (valid) {

        } else {
            JOptionPane.showMessageDialog(null, "Cedula invalida");
        }

        return valid;

    }
        public boolean emailcorrect() {
        boolean valid = Validar.correo(vista.getTxtCorreo());
        if (valid) {
        } else {
            JOptionPane.showMessageDialog(null, "Correo invalido");
        }
        return valid;

    }
    
          public void controlKey() {
        vista.getTxtCedula().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.numero(vista.getTxtCedula(), 10); 
            }
        });
        vista.getTxtNombre1().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras(vista.getTxtNombre1(), 30); 
            }
        });
        vista.getTxtNombre2().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras(vista.getTxtNombre2(), 30); 
            }
        });
        vista.getTxtApellido1().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras(vista.getTxtApellido1(), 30); 
            }
        });
        vista.getTxtApellido2().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras(vista.getTxtApellido2(), 30); 
            }
        });
        vista.getTxtDireccion().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.nombre_compuesto(vista.getTxtDireccion(), 60); 
            }
        });
        vista.getTxtTelefono().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.numero(vista.getTxtTelefono(), 10); 
            }
        });

    }

    
    
    
    
    
}
