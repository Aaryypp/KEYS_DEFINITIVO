package vista;


public class vAlquiler extends javax.swing.JInternalFrame {

    public vAlquiler() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdDialog = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtRegistros = new javax.swing.JTable();
        lbTitulo = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        cbColumnas = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        sep_pro = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar = new javax.swing.JProgressBar();
        tpEnvios = new javax.swing.JTabbedPane();
        jpAlquiler = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        xid_conductor = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        xprovincia = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        xfecha_viaje = new com.toedter.calendar.JDateChooser();
        xmatricula = new javax.swing.JTextField();
        jbElejirMatricula = new javax.swing.JButton();
        JTextField3 = new javax.swing.JTextField();
        xprecio1 = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jbElejirConductor1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        xid_conductor1 = new javax.swing.JTextField();
        jbElejirConductor2 = new javax.swing.JButton();
        jSeparator19 = new javax.swing.JSeparator();
        jbSiguienteAlquiler = new javax.swing.JButton();
        jpContrato = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        xid_conductor2 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        xprovincia1 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        xfecha_viaje1 = new com.toedter.calendar.JDateChooser();
        xmatricula1 = new javax.swing.JTextField();
        jbElejirMatricula1 = new javax.swing.JButton();
        JTextField4 = new javax.swing.JTextField();
        xprecio2 = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jbElejirConductor3 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        xid_conductor3 = new javax.swing.JTextField();
        jbElejirConductor4 = new javax.swing.JButton();
        jSeparator21 = new javax.swing.JSeparator();
        jbSiguienteAlquiler1 = new javax.swing.JButton();
        jbSaltarAlquiler1 = new javax.swing.JButton();
        jpExtras = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        JTextField5 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jbElejirConductor5 = new javax.swing.JButton();
        xprecio4 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        JTextField6 = new javax.swing.JTextField();
        JTextField7 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        JTextField8 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        xprecio5 = new javax.swing.JTextField();
        xprecio6 = new javax.swing.JTextField();
        xprecio7 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        JTextField9 = new javax.swing.JTextField();
        xprecio8 = new javax.swing.JTextField();
        xprecio9 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        JTextField10 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        t_detalles = new javax.swing.JTable();
        jbSiguienteAlquiler2 = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jtRegistros = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtRegistros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jtRegistros.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jtRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtRegistros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtRegistros.setOpaque(false);
        jtRegistros.setRowHeight(40);
        jtRegistros.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jtRegistros.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jtRegistros.getTableHeader().setResizingAllowed(false);
        jtRegistros.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtRegistros);

        lbTitulo.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lbTitulo.setText("Listado de ...");

        jPanel7.setBackground(new java.awt.Color(239, 239, 239));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        cbColumnas.setBackground(new java.awt.Color(239, 239, 239));
        cbColumnas.setBorder(null);

        txtBuscar.setBackground(new java.awt.Color(239, 239, 239));
        txtBuscar.setBorder(null);

        btnBuscar.setBackground(new java.awt.Color(239, 239, 239));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/lupa (1).png"))); // NOI18N
        btnBuscar.setBorder(null);

        btnLimpiar.setBackground(new java.awt.Color(239, 239, 239));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/marca-x.png"))); // NOI18N
        btnLimpiar.setBorder(null);

        sep_pro.setOrientation(javax.swing.SwingConstants.VERTICAL);
        sep_pro.setToolTipText("");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setToolTipText("");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbColumnas, 0, 184, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(sep_pro)
                    .addComponent(txtBuscar)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbColumnas, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbTitulo)
                .addGap(17, 17, 17)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jdDialogLayout = new javax.swing.GroupLayout(jdDialog.getContentPane());
        jdDialog.getContentPane().setLayout(jdDialogLayout);
        jdDialogLayout.setHorizontalGroup(
            jdDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jdDialogLayout.setVerticalGroup(
            jdDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(840, 480));
        setMinimumSize(new java.awt.Dimension(840, 480));
        setPreferredSize(new java.awt.Dimension(840, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        jPanel1.setMaximumSize(new java.awt.Dimension(805, 440));
        jPanel1.setMinimumSize(new java.awt.Dimension(805, 440));
        jPanel1.setPreferredSize(new java.awt.Dimension(805, 440));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¡En esta sección puedes registrar paso a paso un alquiler!");

        jProgressBar.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tpEnvios.setBackground(new java.awt.Color(255, 255, 255));
        tpEnvios.setOpaque(true);

        jpAlquiler.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(350, 32767));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Matrícula de automóvil:");

        xid_conductor.setEditable(false);
        xid_conductor.setBackground(new java.awt.Color(255, 255, 255));
        xid_conductor.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        xid_conductor.setForeground(new java.awt.Color(204, 204, 204));
        xid_conductor.setText("Autoasignado");
        xid_conductor.setBorder(null);

        jSeparator7.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator7.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator7.setOpaque(true);
        jSeparator7.setPreferredSize(new java.awt.Dimension(50, 1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("ID de alquiler:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Fecha de alquiler:");

        xprovincia.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xprovincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "1 día", "2 días", "3 días", "4 días", "5 días", "6 días", "7 días", "15 días", "1 mes", "2 meses", "3 meses" }));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Duración:");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Total:");

        xfecha_viaje.setDateFormatString("yyyy-MM-dd");
        xfecha_viaje.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xfecha_viaje.setPreferredSize(new java.awt.Dimension(85, 27));

        xmatricula.setEditable(false);
        xmatricula.setBackground(new java.awt.Color(255, 255, 255));
        xmatricula.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        xmatricula.setForeground(new java.awt.Color(204, 204, 204));
        xmatricula.setText("Autoasignado");
        xmatricula.setBorder(null);

        jbElejirMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/agregar.png"))); // NOI18N
        jbElejirMatricula.setBorder(null);
        jbElejirMatricula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        JTextField3.setEditable(false);
        JTextField3.setBackground(new java.awt.Color(255, 255, 255));
        JTextField3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        JTextField3.setText("$.");
        JTextField3.setBorder(null);

        xprecio1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xprecio1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        xprecio1.setBorder(null);

        jSeparator16.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator16.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator16.setOpaque(true);
        jSeparator16.setPreferredSize(new java.awt.Dimension(50, 1));

        jSeparator18.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator18.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator18.setOpaque(true);
        jSeparator18.setPreferredSize(new java.awt.Dimension(50, 1));

        jbElejirConductor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/anadir.png"))); // NOI18N
        jbElejirConductor1.setBorder(null);
        jbElejirConductor1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("ID de cliente:");

        xid_conductor1.setEditable(false);
        xid_conductor1.setBackground(new java.awt.Color(255, 255, 255));
        xid_conductor1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        xid_conductor1.setForeground(new java.awt.Color(204, 204, 204));
        xid_conductor1.setText("Autoasignado");
        xid_conductor1.setBorder(null);

        jbElejirConductor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/anadir.png"))); // NOI18N
        jbElejirConductor2.setBorder(null);
        jbElejirConductor2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator19.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator19.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator19.setOpaque(true);
        jSeparator19.setPreferredSize(new java.awt.Dimension(50, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(xid_conductor, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbElejirConductor1))
                            .addComponent(xmatricula)
                            .addComponent(xfecha_viaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xprovincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(xid_conductor1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbElejirConductor2))
                            .addComponent(jSeparator19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addComponent(jbElejirMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(xprecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(JTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(xmatricula)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbElejirMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(xfecha_viaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xprecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(xid_conductor))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbElejirConductor1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(xid_conductor1))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbElejirConductor2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jbSiguienteAlquiler.setBackground(new java.awt.Color(0, 204, 0));
        jbSiguienteAlquiler.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jbSiguienteAlquiler.setForeground(new java.awt.Color(255, 255, 255));
        jbSiguienteAlquiler.setText("Siguiente");
        jbSiguienteAlquiler.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpAlquilerLayout = new javax.swing.GroupLayout(jpAlquiler);
        jpAlquiler.setLayout(jpAlquilerLayout);
        jpAlquilerLayout.setHorizontalGroup(
            jpAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlquilerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jbSiguienteAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jpAlquilerLayout.setVerticalGroup(
            jpAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlquilerLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jbSiguienteAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpAlquilerLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpEnvios.addTab("Alquilar auto", jpAlquiler);

        jpContrato.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setMaximumSize(new java.awt.Dimension(350, 32767));

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("ID de conductor:");

        xid_conductor2.setEditable(false);
        xid_conductor2.setBackground(new java.awt.Color(255, 255, 255));
        xid_conductor2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        xid_conductor2.setForeground(new java.awt.Color(204, 204, 204));
        xid_conductor2.setText("Autoasignado");
        xid_conductor2.setBorder(null);

        jSeparator8.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator8.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator8.setOpaque(true);
        jSeparator8.setPreferredSize(new java.awt.Dimension(50, 1));

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Código de contrato:");

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Fecha de contrato:");

        xprovincia1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xprovincia1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "1 hora", "2 horas", "3 horas", "4 horas", "5 horas", "6 horas", "5 horas", "7 horas", "8 horas" }));

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Duración:");

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Total:");

        xfecha_viaje1.setDateFormatString("yyyy-MM-dd");
        xfecha_viaje1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xfecha_viaje1.setPreferredSize(new java.awt.Dimension(85, 27));

        xmatricula1.setEditable(false);
        xmatricula1.setBackground(new java.awt.Color(255, 255, 255));
        xmatricula1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        xmatricula1.setForeground(new java.awt.Color(204, 204, 204));
        xmatricula1.setText("Autoasignado");
        xmatricula1.setBorder(null);

        jbElejirMatricula1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/agregar.png"))); // NOI18N
        jbElejirMatricula1.setBorder(null);
        jbElejirMatricula1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        JTextField4.setEditable(false);
        JTextField4.setBackground(new java.awt.Color(255, 255, 255));
        JTextField4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        JTextField4.setText("$.");
        JTextField4.setBorder(null);

        xprecio2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xprecio2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        xprecio2.setBorder(null);

        jSeparator17.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator17.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator17.setOpaque(true);
        jSeparator17.setPreferredSize(new java.awt.Dimension(50, 1));

        jSeparator20.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator20.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator20.setOpaque(true);
        jSeparator20.setPreferredSize(new java.awt.Dimension(50, 1));

        jbElejirConductor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/anadir.png"))); // NOI18N
        jbElejirConductor3.setBorder(null);
        jbElejirConductor3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("ID de alquiler:");

        xid_conductor3.setEditable(false);
        xid_conductor3.setBackground(new java.awt.Color(255, 255, 255));
        xid_conductor3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        xid_conductor3.setForeground(new java.awt.Color(204, 204, 204));
        xid_conductor3.setText("Autoasignado");
        xid_conductor3.setBorder(null);

        jbElejirConductor4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/anadir.png"))); // NOI18N
        jbElejirConductor4.setBorder(null);
        jbElejirConductor4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator21.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator21.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator21.setOpaque(true);
        jSeparator21.setPreferredSize(new java.awt.Dimension(50, 1));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(xid_conductor2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbElejirConductor3))
                            .addComponent(xmatricula1)
                            .addComponent(xfecha_viaje1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xprovincia1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(xid_conductor3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbElejirConductor4))
                            .addComponent(jSeparator21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addComponent(jbElejirMatricula1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(xprecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(JTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(xmatricula1)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbElejirMatricula1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(xfecha_viaje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xprovincia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xprecio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(xid_conductor2))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbElejirConductor3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(xid_conductor3))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbElejirConductor4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jbSiguienteAlquiler1.setBackground(new java.awt.Color(0, 204, 0));
        jbSiguienteAlquiler1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jbSiguienteAlquiler1.setForeground(new java.awt.Color(255, 255, 255));
        jbSiguienteAlquiler1.setText("Siguiente");
        jbSiguienteAlquiler1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jbSaltarAlquiler1.setBackground(new java.awt.Color(0, 153, 255));
        jbSaltarAlquiler1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbSaltarAlquiler1.setForeground(new java.awt.Color(255, 255, 255));
        jbSaltarAlquiler1.setText("Saltar");
        jbSaltarAlquiler1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpContratoLayout = new javax.swing.GroupLayout(jpContrato);
        jpContrato.setLayout(jpContratoLayout);
        jpContratoLayout.setHorizontalGroup(
            jpContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContratoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jpContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbSiguienteAlquiler1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(jbSaltarAlquiler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jpContratoLayout.setVerticalGroup(
            jpContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContratoLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jbSiguienteAlquiler1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jbSaltarAlquiler1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpContratoLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpEnvios.addTab("Contratar conductor", jpContrato);

        jpExtras.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMaximumSize(new java.awt.Dimension(350, 32767));

        jLabel32.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setText("Total extras:");

        JTextField5.setEditable(false);
        JTextField5.setBackground(new java.awt.Color(255, 255, 255));
        JTextField5.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        JTextField5.setText("$.");
        JTextField5.setBorder(null);

        jLabel33.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));

        jbElejirConductor5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/anadir.png"))); // NOI18N
        jbElejirConductor5.setText("¡Seleccionar extra!  ");
        jbElejirConductor5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbElejirConductor5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        xprecio4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xprecio4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel34.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("Alquiler vehículo:");

        JTextField6.setEditable(false);
        JTextField6.setBackground(new java.awt.Color(255, 255, 255));
        JTextField6.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        JTextField6.setText("$.");
        JTextField6.setBorder(null);

        JTextField7.setEditable(false);
        JTextField7.setBackground(new java.awt.Color(255, 255, 255));
        JTextField7.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        JTextField7.setText("$.");
        JTextField7.setBorder(null);

        jLabel35.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setText("Contrato conductor:");

        JTextField8.setEditable(false);
        JTextField8.setBackground(new java.awt.Color(255, 255, 255));
        JTextField8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        JTextField8.setText("$.");
        JTextField8.setBorder(null);

        jLabel36.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 51));
        jLabel36.setText("Subtotal:");

        xprecio5.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xprecio5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        xprecio6.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xprecio6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        xprecio7.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xprecio7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel37.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 51));
        jLabel37.setText("IVA 12%:");

        JTextField9.setEditable(false);
        JTextField9.setBackground(new java.awt.Color(255, 255, 255));
        JTextField9.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        JTextField9.setText("$.");
        JTextField9.setBorder(null);

        xprecio8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xprecio8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        xprecio9.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        xprecio9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel38.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("Total a pagar:");

        JTextField10.setEditable(false);
        JTextField10.setBackground(new java.awt.Color(255, 255, 255));
        JTextField10.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        JTextField10.setText("$.");
        JTextField10.setBorder(null);

        t_detalles = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        t_detalles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        t_detalles.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        t_detalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        t_detalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t_detalles.setOpaque(false);
        t_detalles.setSelectionBackground(new java.awt.Color(0, 102, 204));
        t_detalles.setSelectionForeground(new java.awt.Color(255, 255, 255));
        t_detalles.getTableHeader().setResizingAllowed(false);
        t_detalles.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(t_detalles);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbElejirConductor5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(xprecio4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(xprecio5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(xprecio6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(xprecio7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(xprecio8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(xprecio9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(92, 92, 92)))
                .addGap(16, 16, 16))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xprecio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbElejirConductor5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(xprecio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(xprecio6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(xprecio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(xprecio8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(xprecio9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(148, 148, 148)
                .addComponent(jLabel33)
                .addContainerGap())
        );

        jbSiguienteAlquiler2.setBackground(new java.awt.Color(0, 204, 0));
        jbSiguienteAlquiler2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jbSiguienteAlquiler2.setForeground(new java.awt.Color(255, 255, 255));
        jbSiguienteAlquiler2.setText("FINALIZAR");
        jbSiguienteAlquiler2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpExtrasLayout = new javax.swing.GroupLayout(jpExtras);
        jpExtras.setLayout(jpExtrasLayout);
        jpExtrasLayout.setHorizontalGroup(
            jpExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpExtrasLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpExtrasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSiguienteAlquiler2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jpExtrasLayout.setVerticalGroup(
            jpExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpExtrasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jbSiguienteAlquiler2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        tpEnvios.addTab("Alquilar extra/s", jpExtras);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpEnvios, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tpEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextField10;
    private javax.swing.JTextField JTextField3;
    private javax.swing.JTextField JTextField4;
    private javax.swing.JTextField JTextField5;
    private javax.swing.JTextField JTextField6;
    private javax.swing.JTextField JTextField7;
    private javax.swing.JTextField JTextField8;
    private javax.swing.JTextField JTextField9;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbColumnas;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JButton jbElejirConductor1;
    private javax.swing.JButton jbElejirConductor2;
    private javax.swing.JButton jbElejirConductor3;
    private javax.swing.JButton jbElejirConductor4;
    private javax.swing.JButton jbElejirConductor5;
    private javax.swing.JButton jbElejirMatricula;
    private javax.swing.JButton jbElejirMatricula1;
    private javax.swing.JButton jbSaltarAlquiler1;
    private javax.swing.JButton jbSiguienteAlquiler;
    private javax.swing.JButton jbSiguienteAlquiler1;
    private javax.swing.JButton jbSiguienteAlquiler2;
    private javax.swing.JDialog jdDialog;
    private javax.swing.JPanel jpAlquiler;
    private javax.swing.JPanel jpContrato;
    private javax.swing.JPanel jpExtras;
    private javax.swing.JTable jtRegistros;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JSeparator sep_pro;
    private javax.swing.JTable t_detalles;
    private javax.swing.JTabbedPane tpEnvios;
    private javax.swing.JTextField txtBuscar;
    private com.toedter.calendar.JDateChooser xfecha_viaje;
    private com.toedter.calendar.JDateChooser xfecha_viaje1;
    private javax.swing.JTextField xid_conductor;
    private javax.swing.JTextField xid_conductor1;
    private javax.swing.JTextField xid_conductor2;
    private javax.swing.JTextField xid_conductor3;
    private javax.swing.JTextField xmatricula;
    private javax.swing.JTextField xmatricula1;
    private javax.swing.JTextField xprecio1;
    private javax.swing.JTextField xprecio2;
    private javax.swing.JTextField xprecio4;
    private javax.swing.JTextField xprecio5;
    private javax.swing.JTextField xprecio6;
    private javax.swing.JTextField xprecio7;
    private javax.swing.JTextField xprecio8;
    private javax.swing.JTextField xprecio9;
    private javax.swing.JComboBox<String> xprovincia;
    private javax.swing.JComboBox<String> xprovincia1;
    // End of variables declaration//GEN-END:variables
}
