package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class vAuto extends javax.swing.JInternalFrame {
    
    public vAuto() {
        initComponents();
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JButton getBtnExaminar() {
        return btnExaminar;
    }

    public JButton getBtn_ModoEditar() {
        return btn_ModoEditar;
    }

    public JButton getBtn_ModoNuevo() {
        return btn_ModoNuevo;
    }

    public JButton getBtn_ModoVista() {
        return btn_ModoVista;
    }

    public JComboBox<String> getCbCategoria() {
        return cbCategoria;
    }

    public JComboBox<String> getCbColumnas() {
        return cbColumnas;
    }

    public JComboBox<String> getCbMarca() {
        return cbMarca;
    }

    public JButton getJbOK() {
        return jbOK;
    }

    public JTable getJtAutos() {
        return jtAutos;
    }

    public JLabel getLbFoto() {
        return lbFoto;
    }

    public JLabel getLbModo() {
        return lbModo;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public JTextField getTxtMatricula() {
        return txtMatricula;
    }

    public JTextField getTxtPotencia() {
        return txtPotencia;
    }

    public JTextField getTxtPrecio() {
        return txtPrecio;
    }

    public JTextField getTxtColor() {
        return txtColor;
    }

    public void setTxtColor(JTextField txtColor) {
        this.txtColor = txtColor;
    }

    public JTextField getTxt_Modelo() {
        return txt_Modelo;
    }

    public void setTxt_Modelo(JTextField txt_Modelo) {
        this.txt_Modelo = txt_Modelo;
    }

    public JComboBox<String> getCbModelo() {
        return cbModelo;
    }

    public void setCbModelo(JComboBox<String> cbModelo) {
        this.cbModelo = cbModelo;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btn_ModoEditar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btn_ModoNuevo = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btn_ModoVista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbMarca = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JTextField1 = new javax.swing.JTextField();
        lbFoto = new javax.swing.JLabel();
        btnExaminar = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        txtMatricula = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        txtPrecio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPotencia = new javax.swing.JTextField();
        JTextField2 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        txt_Modelo = new javax.swing.JTextField();
        cbModelo = new javax.swing.JComboBox<>();
        jbOK = new javax.swing.JButton();
        lbModo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAutos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        cbColumnas = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JSeparator();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(840, 480));
        setMinimumSize(new java.awt.Dimension(840, 480));
        setPreferredSize(new java.awt.Dimension(840, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jToolBar1.setBackground(new java.awt.Color(0, 102, 153));
        jToolBar1.setRollover(true);

        jSeparator1.setSeparatorSize(new java.awt.Dimension(10, 0));
        jToolBar1.add(jSeparator1);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cambiar modo:");
        jToolBar1.add(jLabel1);

        jSeparator2.setSeparatorSize(new java.awt.Dimension(30, 0));
        jToolBar1.add(jSeparator2);

        btn_ModoEditar.setText("Editar ");
        btn_ModoEditar.setFocusable(false);
        btn_ModoEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ModoEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_ModoEditar);

        jSeparator6.setSeparatorSize(new java.awt.Dimension(30, 0));
        jToolBar1.add(jSeparator6);

        btn_ModoNuevo.setText("Nuevo");
        btn_ModoNuevo.setFocusable(false);
        btn_ModoNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ModoNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_ModoNuevo);

        jSeparator7.setSeparatorSize(new java.awt.Dimension(30, 0));
        jToolBar1.add(jSeparator7);

        btn_ModoVista.setText("Vista");
        btn_ModoVista.setFocusable(false);
        btn_ModoVista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ModoVista.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_ModoVista);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel3.setText("Matricula:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel4.setText("Categoria:");

        cbCategoria.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCategoria.setPreferredSize(new java.awt.Dimension(64, 26));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel5.setText("Marca:");

        cbMarca.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMarca.setPreferredSize(new java.awt.Dimension(64, 26));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel6.setText("Modelo:");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel8.setText("Color:");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel9.setText("Precio:");

        JTextField1.setEditable(false);
        JTextField1.setBackground(new java.awt.Color(255, 255, 255));
        JTextField1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        JTextField1.setText("$.");
        JTextField1.setBorder(null);

        lbFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnExaminar.setText("Examinar");
        btnExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExaminarActionPerformed(evt);
            }
        });

        jSeparator8.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator8.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator8.setOpaque(true);
        jSeparator8.setPreferredSize(new java.awt.Dimension(50, 1));

        txtMatricula.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtMatricula.setForeground(new java.awt.Color(0, 153, 204));
        txtMatricula.setBorder(null);

        jSeparator12.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator12.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator12.setOpaque(true);
        jSeparator12.setPreferredSize(new java.awt.Dimension(50, 1));

        txtPrecio.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrecio.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel10.setText("Potencia:");

        txtPotencia.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtPotencia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPotencia.setBorder(null);

        JTextField2.setEditable(false);
        JTextField2.setBackground(new java.awt.Color(255, 255, 255));
        JTextField2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        JTextField2.setText("PH.");
        JTextField2.setBorder(null);

        jSeparator13.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator13.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator13.setOpaque(true);
        jSeparator13.setPreferredSize(new java.awt.Dimension(50, 1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel12.setText("Imagen:");

        txtColor.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtColor.setForeground(new java.awt.Color(0, 153, 204));
        txtColor.setBorder(null);

        jSeparator9.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator9.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator9.setOpaque(true);
        jSeparator9.setPreferredSize(new java.awt.Dimension(50, 1));

        txt_Modelo.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_Modelo.setForeground(new java.awt.Color(0, 153, 204));
        txt_Modelo.setBorder(null);

        cbModelo.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cbModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbModelo.setPreferredSize(new java.awt.Dimension(64, 26));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMatricula)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrecio)
                                    .addComponent(txtPotencia, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jSeparator13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtColor)
                            .addComponent(txt_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbModelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(txt_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(JTextField1))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPotencia, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(JTextField2))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExaminar)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel3);

        jbOK.setBackground(new java.awt.Color(0, 102, 153));
        jbOK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbOK.setForeground(new java.awt.Color(255, 255, 255));
        jbOK.setText("REGISTRAR");
        jbOK.setBorder(null);
        jbOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbModo.setBackground(new java.awt.Color(255, 255, 255));
        lbModo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbModo.setForeground(new java.awt.Color(0, 102, 153));
        lbModo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbModo.setText("(Modo) automóvil");
        lbModo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lbModo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbModo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbOK, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setBackground(new java.awt.Color(0, 102, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lista de automóviles");
        jLabel2.setOpaque(true);

        jtAutos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtAutos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtAutos);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        cbColumnas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbColumnas.setForeground(new java.awt.Color(51, 51, 51));
        cbColumnas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matrícula", "Modelo" }));
        cbColumnas.setBorder(null);
        cbColumnas.setPreferredSize(new java.awt.Dimension(121, 24));
        cbColumnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbColumnasActionPerformed(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtBuscar.setBorder(null);
        txtBuscar.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtBuscar.setPreferredSize(new java.awt.Dimension(64, 17));
        txtBuscar.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtBuscar.setSelectionColor(new java.awt.Color(204, 204, 204));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/buscar.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar...");
        btnBuscar.setBorder(null);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator15.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator15.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator15.setOpaque(true);
        jSeparator15.setPreferredSize(new java.awt.Dimension(50, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(cbColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cbColumnas, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExaminarActionPerformed

    private void cbColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbColumnasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbColumnasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextField1;
    private javax.swing.JTextField JTextField2;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExaminar;
    private javax.swing.JButton btn_ModoEditar;
    private javax.swing.JButton btn_ModoNuevo;
    private javax.swing.JButton btn_ModoVista;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbColumnas;
    private javax.swing.JComboBox<String> cbMarca;
    private javax.swing.JComboBox<String> cbModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbOK;
    private javax.swing.JTable jtAutos;
    private javax.swing.JLabel lbFoto;
    private javax.swing.JLabel lbModo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtPotencia;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txt_Modelo;
    // End of variables declaration//GEN-END:variables
}
