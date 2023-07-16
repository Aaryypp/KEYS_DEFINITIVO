package controlador;

import controlador.otros.Validaciones;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modelo.mAuto;
import vista.vAuto;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.mCategoria;
import modelo.mMarca;
import modelo.mModelo;
import modelo.tablas.Auto;
import modelo.tablas.Categoria;
import modelo.tablas.Marca;
import modelo.tablas.Modelo;

public final class cAuto {
    private mAuto modeloAuto;
    private mCategoria combobox1 = new mCategoria();
    private mMarca combobox2 = new mMarca();
    private mModelo combobox3 = new mModelo();
    private vAuto vista;
    public static ResultSet rs = null;
    List<Auto> autos = new ArrayList<>();
    List<Categoria> categorias = new ArrayList<>();
    List<Marca> marcas = new ArrayList<>();
    List<Modelo> modelos = new ArrayList<>();
    DefaultTableModel dtm;
    String[] columnas = {"Matrícula", "ID_categoría", "ID_modelo","Color","Precio diario","ID_estado","Capacidad","Potencia","ID_imagen"};
    String ruta = "";
    Validaciones validar = new Validaciones();
    String id = "";
    
    
    public cAuto(mAuto modeloAuto,vAuto vista) {
        this.modeloAuto = modeloAuto;
        this.vista = vista;
        vista.setVisible(true);
//        visualizar("");
        mostrarCategoria();
        mostrarMarcas();
    }
    
    private void visualizar(String id) {
        dtm = new DefaultTableModel(null, columnas);
        autos = modeloAuto.listar(id);
        autos.stream().forEach(p -> dtm.addRow(new Object[]{p.getMatricula(), p.getId_categoria(), p.getId_modelo(),p.getColor(),p.getPrecio_diario(),p.getId_estado(),p.getCapacidad(),p.getPotencia()}));
        vista.getJtAutos().setModel(dtm);
        vista.getJtAutos().setRowHeight(30);
    }
    
    public void seleccionar(JTable t) {
        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
//                    id = t.getValueAt(t.getSelectedRow(), 1).toString();
////                    blockboton();
//                    llenarPerfil();
                }
            }
        });
    }
    
    public void iniciarCtrlBtn() {
//        vista.getBtn_ModoEditar().addActionListener(l -> editarmodo());
        
        vista.getTxtMatricula().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                
            }
        });

        vista.getTxtPrecio().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validar.Decimales(evt);
            }
        });
        
        vista.getJbOK().addActionListener(l-> Ingresar());
        
        vista.getTxtColor().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validar.letras(evt);
            }
        });
        
        vista.getTxtPotencia().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validar.Numeros(evt);
            }
        });
        
        vista.getCbMarca().addActionListener(l-> ObtenerModelos());
    }
    
    public void modo(String modo) {
        boolean editable = true;
        if (modo.equals("Registrar")) {
            vista.getTxtMatricula().setEditable(true);
            vista.getTxtColor().setEditable(true);
            vista.getBtnExaminar().setEnabled(true);
            vista.getTxtPrecio().setEnabled(true);
            vista.getCbCategoria().setEnabled(true);
            vista.getCbMarca().setEnabled(true);
            vista.getTxtMatricula().setText("");
            vista.getTxtColor().setText("");
            vista.getTxtPrecio().setText("");
            vista.getCbCategoria().setSelectedIndex(0);
            vista.getCbMarca().setSelectedIndex(0);
            /*
        ELIMINAR IMAGEN
        OBTENER ID IMAGEN
            
            mp.setId_imagen(id);
             */
        } else {
//            llenar();
            vista.getTxtMatricula().setEditable(false);
            vista.getTxtColor().setEditable(false);
            
            if (modo.equals("Eliminar")) {
                editable = false;
            }
            
        }
            vista.getTxtMatricula().setEditable(editable);
            vista.getTxtColor().setEditable(editable);
            vista.getTxtPrecio().setEditable(editable);
            vista.getCbCategoria().setEnabled(editable);
            vista.getCbMarca().setEditable(editable);
            vista.getBtnExaminar().setEnabled(editable);
            vista.getCbCategoria().setSelectedIndex(0);
            vista.getCbMarca().setSelectedIndex(0);
    }
    
    public void examinarImagen(){
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter( "Seleccione una imagen JPG, PNG & GIF","jpg","png","gif");
        fileChooser.setFileFilter(extensionFilter);
        if (fileChooser.showOpenDialog(vista)== JFileChooser.APPROVE_OPTION) {
            ruta = fileChooser.getSelectedFile().getAbsolutePath();
            Image image = new ImageIcon(ruta).getImage();
            ImageIcon icon = new ImageIcon(image.getScaledInstance(vista.getLbFoto().getWidth(), vista.getLbFoto().getHeight(), 0));
            vista.getLbFoto().setIcon(icon);
//            setImagen();
        }
        
        
    }
    
//    public void llenar(){
//        rs = modeloAuto.join(id);
//        if (rs != null) {
//            try {
//                vista.getTxtCedula().setText(rs.getString(1));
//                vista.getTxtNombre1().setText(rs.getString(2));
//                vista.getTxtNombre2().setText(rs.getString(3));
//                vista.getTxtApellido1().setText(rs.getString(4));
//                vista.getTxtApellido2().setText(rs.getString(5));
//                vista.getJdcFechaNac().setDate(rs.getDate(6));
//                vista.getTxtTelefono().setText(rs.getString(7));
//                vista.getTxtDireccion().setText(rs.getString(8));
//                vista.getTxtCorreo().setText(rs.getString(9));
//                vista.getCbSexo().setSelectedItem(rs.getString(10));
//                setIcon(rs.getInt(11));
//                vista.getTxtSueldo().setText(""+rs.getDouble(12));
//                vista.getTxtLicencia().setText(rs.getString(13));
//                vista.getCbTipoLicencia().setSelectedItem(rs.getString(14));
//                vista.getTxtPrecioHora().setText(""+rs.getDouble(15));
//            } catch (SQLException ex) {
//            }
//        }
//    }
//    
    public void Ingresar(){
        if(!ValiMatricula()){
            JOptionPane.showMessageDialog(null,"EL FORMATO DE MATRICULA ES INCORRECTO");
        }else{
            try{
                int ID_Categoria = buscarIDCategoria();
            int ID_Marca = buscarMarca();
            int ID_modelo = buscarModelo();
            modeloAuto.setMatricula(vista.getTxtMatricula().getText());
            modeloAuto.setId_categoria(ID_Categoria);
            modeloAuto.setId_modelo(ID_modelo);
            modeloAuto.setColor(vista.getTxtColor().getText());
            modeloAuto.setPrecio_diario(Double.parseDouble(vista.getTxtPrecio().getText()));
            modeloAuto.setPotencia(Integer.parseInt(vista.getTxtPotencia().getText()));
            modeloAuto.crear();
            JOptionPane.showMessageDialog(null, "SE HA INGRESADO CORRECTAMENTE EL AUTO");
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "SE HA PRODUCIDO UN ERROR");
            }
            
        }
       
    }
    
    public void mostrarCategoria(){
        categorias = combobox1.listar(0);
        System.out.println(categorias.size());
        vista.getCbCategoria().removeAllItems();
        categorias.stream().forEach(p -> vista.getCbCategoria().addItem(p.getNombre()));
    }
    public void mostrarMarcas(){
        marcas = combobox2.listar(0);
        vista.getCbMarca().removeAllItems();
        marcas.stream().forEach(p -> vista.getCbMarca().addItem(p.getNombre()));
    }
    
    public boolean ValiMatricula(){
        boolean matricula = false;
        if (vista.getTxtMatricula().getText().matches("^[A-Z]{3}-[0-9]{4}$")) {
            System.out.println("La matrícula es correcta");
            matricula = true;
        } else {
            System.out.println("La matrícula es incorrecta");
            matricula = false;
        }
        return matricula;
    }
    
    public int buscarIDCategoria(){
        int regreso = 0;
        for (Categoria categoria : categorias) {
            if (categoria.getNombre().equals(vista.getCbCategoria().getSelectedItem().toString())) {
                regreso = categoria.getId();
            }
        }
        return regreso;
    }
    
    public int buscarMarca(){
        int regreso = 0;
        for (Marca marcas : marcas) {
            if (marcas.getNombre().equals(vista.getCbMarca().getSelectedItem().toString())) {
                regreso = marcas.getId();
            }
        }
        return regreso;
    }
    
    public void ObtenerModelos(){
        int regreso = 0;
        for (Marca marcas : marcas) {
            if (marcas.getNombre().equals(vista.getCbMarca().getSelectedItem().toString())) {
                regreso = marcas.getId();
            }
        }
        modelos = combobox3.listar(regreso);
        vista.getCbModelo().removeAllItems();
        modelos.stream().forEach(p -> vista.getCbModelo().addItem(p.getNombre()));
    }
    
    public int buscarModelo(){
        int regreso = 0;
        for (Modelo marcas : modelos) {
            if (marcas.getNombre().equals(vista.getCbMarca().getSelectedItem().toString())) {
                regreso = marcas.getId();
            }
        }
        return regreso;
    }
}

