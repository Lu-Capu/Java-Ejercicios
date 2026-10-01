package Vista;

import Contro.Arreglo_Objetos;
import Modelo.Cliente;
import Modelo.Operacion_Prestamo;
import Modelo.Tipo_Prestamo;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {
    Arreglo_Objetos objArreglo_Cliente = new Arreglo_Objetos("cliente");
    Arreglo_Objetos objArreglo_TipoPrestamo = new Arreglo_Objetos("tipo_prestamo");
    Arreglo_Objetos objArreglo_OperacionPrestamo = new Arreglo_Objetos("operacion_prestamo");
    
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Cliente = new javax.swing.JTable();
        btn_Guardar_Cliente = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_NombreCompleto_Cliente = new javax.swing.JTextField();
        txt_IngresoMensual_Cliente = new javax.swing.JTextField();
        txt_Ci_Cliente = new javax.swing.JTextField();
        btn_Salir_Cliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_TipoPrestamo = new javax.swing.JTable();
        btn_Guardar_TipoPrestamo = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_Codigo_TipoPrestamo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spn_PlazoMaximo_TipoPrestamo = new javax.swing.JSpinner();
        txt_Tipo_TipoPrestamo = new javax.swing.JTextField();
        btn_Salir_TipoPrestamo = new javax.swing.JButton();
        spn_TasaInteresAnual_TipoPrestamo = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_OpPrestamo = new javax.swing.JTable();
        btn_Guardar_OpPrestamo = new javax.swing.JButton();
        btn_Editar_OpPrestamo = new javax.swing.JButton();
        btn_Eliminar_OpPrestamo = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_MontoInicial_OpPrestamo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cbo_ClienteAsignado_OpPrestamo = new javax.swing.JComboBox<>();
        cbo_TipoAsignado_OpPrestamo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_SaldoPendiente_OpPrestamo = new javax.swing.JTextField();
        btn_Salir_OperacionPrestamo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbo_FiltroTipo_OperacionPrestamo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txt_BusquedaCliente_OperacionPrestamo = new javax.swing.JTextField();
        btn_MostrarTodos_OperacionPrestamo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control de Préstamos Bancarios y Clientes");
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_Cliente);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 510, 310));

        btn_Guardar_Cliente.setBackground(new java.awt.Color(204, 255, 255));
        btn_Guardar_Cliente.setForeground(new java.awt.Color(0, 0, 0));
        btn_Guardar_Cliente.setText("Guardar");
        btn_Guardar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Guardar_ClienteActionPerformed(evt);
            }
        });
        jPanel4.add(btn_Guardar_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 100, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CLIENTE");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingreso Mensual:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Completo:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CI:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        txt_NombreCompleto_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreCompleto_ClienteActionPerformed(evt);
            }
        });
        jPanel4.add(txt_NombreCompleto_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 120, -1));
        jPanel4.add(txt_IngresoMensual_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 130, -1));
        jPanel4.add(txt_Ci_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 200, -1));

        btn_Salir_Cliente.setBackground(new java.awt.Color(255, 255, 255));
        btn_Salir_Cliente.setForeground(new java.awt.Color(0, 0, 0));
        btn_Salir_Cliente.setText("Salir");
        btn_Salir_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Salir_ClienteActionPerformed(evt);
            }
        });
        jPanel4.add(btn_Salir_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 100, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Cliente", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_TipoPrestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbl_TipoPrestamo);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 510, 290));

        btn_Guardar_TipoPrestamo.setBackground(new java.awt.Color(204, 255, 255));
        btn_Guardar_TipoPrestamo.setForeground(new java.awt.Color(0, 0, 0));
        btn_Guardar_TipoPrestamo.setText("Guardar");
        btn_Guardar_TipoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Guardar_TipoPrestamoActionPerformed(evt);
            }
        });
        jPanel6.add(btn_Guardar_TipoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 100, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 2, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TIPO DE PRÉSTAMO");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Código:");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tipo:");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tasa de Interes Anual: ");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));
        jPanel6.add(txt_Codigo_TipoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 150, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Meses");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 40, 20));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Plazo Máximo:");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 20));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("%");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 20, 20));

        spn_PlazoMaximo_TipoPrestamo.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel6.add(spn_PlazoMaximo_TipoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 70, -1));
        jPanel6.add(txt_Tipo_TipoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 160, -1));

        btn_Salir_TipoPrestamo.setBackground(new java.awt.Color(255, 153, 153));
        btn_Salir_TipoPrestamo.setForeground(new java.awt.Color(0, 0, 0));
        btn_Salir_TipoPrestamo.setText("Salir");
        btn_Salir_TipoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Salir_TipoPrestamoActionPerformed(evt);
            }
        });
        jPanel6.add(btn_Salir_TipoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 100, -1));

        spn_TasaInteresAnual_TipoPrestamo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jPanel6.add(spn_TasaInteresAnual_TipoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 80, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Tipo de Prestamo", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_OpPrestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_OpPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_OpPrestamoMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_OpPrestamo);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 510, 250));

        btn_Guardar_OpPrestamo.setBackground(new java.awt.Color(204, 255, 255));
        btn_Guardar_OpPrestamo.setForeground(new java.awt.Color(0, 0, 0));
        btn_Guardar_OpPrestamo.setText("Guardar");
        btn_Guardar_OpPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Guardar_OpPrestamoActionPerformed(evt);
            }
        });
        jPanel8.add(btn_Guardar_OpPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 100, -1));

        btn_Editar_OpPrestamo.setBackground(new java.awt.Color(255, 255, 204));
        btn_Editar_OpPrestamo.setForeground(new java.awt.Color(0, 0, 0));
        btn_Editar_OpPrestamo.setText("Editar");
        btn_Editar_OpPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Editar_OpPrestamoActionPerformed(evt);
            }
        });
        jPanel8.add(btn_Editar_OpPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 100, -1));

        btn_Eliminar_OpPrestamo.setBackground(new java.awt.Color(255, 51, 51));
        btn_Eliminar_OpPrestamo.setForeground(new java.awt.Color(0, 0, 0));
        btn_Eliminar_OpPrestamo.setText("Eliminar");
        btn_Eliminar_OpPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Eliminar_OpPrestamoActionPerformed(evt);
            }
        });
        jPanel8.add(btn_Eliminar_OpPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 100, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 2, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("OPERACIÓN DE PRÉSTAMO");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Tipo Asignado:");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Cliente Asignado:");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));
        jPanel8.add(txt_MontoInicial_OpPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 140, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Monto Inicial:");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        cbo_ClienteAsignado_OpPrestamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel8.add(cbo_ClienteAsignado_OpPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 130, -1));

        cbo_TipoAsignado_OpPrestamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel8.add(cbo_TipoAsignado_OpPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 130, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Saldo Pendiente:");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 20));
        jPanel8.add(txt_SaldoPendiente_OpPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 130, -1));

        btn_Salir_OperacionPrestamo.setBackground(new java.awt.Color(255, 255, 255));
        btn_Salir_OperacionPrestamo.setForeground(new java.awt.Color(0, 0, 0));
        btn_Salir_OperacionPrestamo.setText("Salir");
        btn_Salir_OperacionPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Salir_OperacionPrestamoActionPerformed(evt);
            }
        });
        jPanel8.add(btn_Salir_OperacionPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 100, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar Operaciones por Tipo:");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        cbo_FiltroTipo_OperacionPrestamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_FiltroTipo_OperacionPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_FiltroTipo_OperacionPrestamoActionPerformed(evt);
            }
        });
        jPanel8.add(cbo_FiltroTipo_OperacionPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 210, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Buscar Cliente por CI:");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 20));

        txt_BusquedaCliente_OperacionPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txt_BusquedaCliente_OperacionPrestamoMouseReleased(evt);
            }
        });
        txt_BusquedaCliente_OperacionPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BusquedaCliente_OperacionPrestamoActionPerformed(evt);
            }
        });
        txt_BusquedaCliente_OperacionPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BusquedaCliente_OperacionPrestamoKeyReleased(evt);
            }
        });
        jPanel8.add(txt_BusquedaCliente_OperacionPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 150, -1));

        btn_MostrarTodos_OperacionPrestamo.setBackground(new java.awt.Color(255, 255, 255));
        btn_MostrarTodos_OperacionPrestamo.setForeground(new java.awt.Color(0, 0, 0));
        btn_MostrarTodos_OperacionPrestamo.setText("Mostrar Todos");
        btn_MostrarTodos_OperacionPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MostrarTodos_OperacionPrestamoActionPerformed(evt);
            }
        });
        jPanel8.add(btn_MostrarTodos_OperacionPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 170, -1));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Operación de Préstamo", jPanel3);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreCompleto_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreCompleto_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreCompleto_ClienteActionPerformed

    private void btn_Guardar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Guardar_ClienteActionPerformed
        try{    
            int ci_Cliente = Integer.parseInt(txt_Ci_Cliente.getText());
            String nombreCompleto_Cliente = txt_NombreCompleto_Cliente.getText();
            double ingresoMensual_Cliente = Double.parseDouble(txt_IngresoMensual_Cliente.getText());       

            Cliente objCliente = new Cliente(ci_Cliente, nombreCompleto_Cliente, ingresoMensual_Cliente);

            objArreglo_Cliente.Registrar_Cliente(objCliente);
            objArreglo_Cliente.Listar_CLiente(tbl_Cliente);
            objArreglo_Cliente.Listar_Cliente_Cbox(cbo_ClienteAsignado_OpPrestamo);
        }
        catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "¡¡COMPLETE CORRECTAMENTE LOS CAMPOS!!","Alerta", 2);
        }
        txt_Ci_Cliente.setText("");
        txt_NombreCompleto_Cliente.setText("");
        txt_IngresoMensual_Cliente.setText("");
    }//GEN-LAST:event_btn_Guardar_ClienteActionPerformed

    private void btn_Guardar_TipoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Guardar_TipoPrestamoActionPerformed
        try{  
            int codigoPrestamo = Integer.parseInt(txt_Codigo_TipoPrestamo.getText());
            String tipoPrestamo = txt_Tipo_TipoPrestamo.getText();
            int tasaInteresAnual = Integer.parseInt(spn_TasaInteresAnual_TipoPrestamo.getValue().toString());
            int plazoMaximoMeses = Integer.parseInt(spn_PlazoMaximo_TipoPrestamo.getValue().toString());

            Tipo_Prestamo objTipoPrestamo = new Tipo_Prestamo(codigoPrestamo, tipoPrestamo, tasaInteresAnual, plazoMaximoMeses);
            
            objArreglo_TipoPrestamo.Registrar_TipoPrestamo(objTipoPrestamo);
            objArreglo_TipoPrestamo.Listar_TipoPrestamo(tbl_TipoPrestamo);
            objArreglo_TipoPrestamo.Listar_TipoPrestamo_Cbox(cbo_TipoAsignado_OpPrestamo);
            objArreglo_TipoPrestamo.Listar_TipoPrestamo_Cbox(cbo_FiltroTipo_OperacionPrestamo);
        }
        catch (NumberFormatException error){
            JOptionPane.showMessageDialog(null, "¡¡COMPLETE CORRECTAMENTE LOS CAMPOS!!","Alerta", 2);
        }
        txt_Codigo_TipoPrestamo.setText("");
        txt_Tipo_TipoPrestamo.setText("");
        spn_TasaInteresAnual_TipoPrestamo.setValue(0);
        spn_PlazoMaximo_TipoPrestamo.setValue(0);
    }//GEN-LAST:event_btn_Guardar_TipoPrestamoActionPerformed

    private void btn_Guardar_OpPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Guardar_OpPrestamoActionPerformed
        try{  
            if(cbo_ClienteAsignado_OpPrestamo.getSelectedItem() == null){
                JOptionPane.showMessageDialog(null, "¡¡REGISTRE UN CLIENTE A ASIGNAR!!");
                return;
            }
            if(cbo_TipoAsignado_OpPrestamo.getSelectedItem() == null){
                JOptionPane.showMessageDialog(null, "¡¡INGRESE UN TIPO DE PRÉSTAMO A ASIGNAR!!");
                return;
            }
            int clienteAsignado = Integer.parseInt(cbo_ClienteAsignado_OpPrestamo.getSelectedItem().toString());
            String tipoAsignado = cbo_TipoAsignado_OpPrestamo.getSelectedItem().toString();
            double montoInicial = Double.parseDouble(txt_MontoInicial_OpPrestamo.getText());
            double saldoPendiente = Double.parseDouble(txt_SaldoPendiente_OpPrestamo.getText());
            
            objArreglo_Cliente.CalcularTotalDeudaAcumulada(clienteAsignado, tipoAsignado, montoInicial, tbl_Cliente);
            
            Operacion_Prestamo objOperacionPrestamo = new Operacion_Prestamo(clienteAsignado, tipoAsignado, montoInicial, saldoPendiente);
            
            objArreglo_OperacionPrestamo.Agregar_OperacionesPrestamo(objOperacionPrestamo);
            objArreglo_OperacionPrestamo.Mostrar_OperacionesPrestamo(tbl_OpPrestamo);
        }
        catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "¡¡COMPLETE CORRECTAMENTE LOS CAMPOS!!","Alerta", 2);
        }
        cbo_ClienteAsignado_OpPrestamo.setSelectedIndex(0);
        cbo_TipoAsignado_OpPrestamo.setSelectedIndex(0);
        txt_MontoInicial_OpPrestamo.setText("");
        txt_SaldoPendiente_OpPrestamo.setText("");
    }//GEN-LAST:event_btn_Guardar_OpPrestamoActionPerformed

    private void btn_Editar_OpPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Editar_OpPrestamoActionPerformed
        int pos_Editar = tbl_OpPrestamo.getSelectedRow();
        try { 
            int clienteAsignado = Integer.parseInt(cbo_ClienteAsignado_OpPrestamo.getSelectedItem().toString());
            String tipoAsignado = cbo_TipoAsignado_OpPrestamo.getSelectedItem().toString();
            double montoInicial = Double.parseDouble(txt_MontoInicial_OpPrestamo.getText());
            double saldoPendiente = Double.parseDouble(txt_SaldoPendiente_OpPrestamo.getText());

            objArreglo_OperacionPrestamo.Editar_OperacionesPrestamo(pos_Editar, tbl_OpPrestamo, clienteAsignado, tipoAsignado, montoInicial, saldoPendiente);
        }
        catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "¡¡SELECCIONE UNA FILA!!", "Información", 1 );
        }
        cbo_ClienteAsignado_OpPrestamo.setSelectedIndex(0);
        cbo_TipoAsignado_OpPrestamo.setSelectedIndex(0);
        txt_MontoInicial_OpPrestamo.setText("");
        txt_SaldoPendiente_OpPrestamo.setText("");

    }//GEN-LAST:event_btn_Editar_OpPrestamoActionPerformed

    private void btn_Eliminar_OpPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Eliminar_OpPrestamoActionPerformed
        int fila_Eliminar = tbl_OpPrestamo.getSelectedRow();

        if(fila_Eliminar != -1){
            objArreglo_OperacionPrestamo.Eliminar_OperacionesPrestamo(fila_Eliminar, tbl_OpPrestamo);        }
        else{
            JOptionPane.showMessageDialog(null, "¡¡SELECCIONE UNA FILA!!", "Información", 1 );
        }
    }//GEN-LAST:event_btn_Eliminar_OpPrestamoActionPerformed

    private void btn_Salir_TipoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Salir_TipoPrestamoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_Salir_TipoPrestamoActionPerformed

    private void btn_Salir_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Salir_ClienteActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_Salir_ClienteActionPerformed

    private void btn_Salir_OperacionPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Salir_OperacionPrestamoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_Salir_OperacionPrestamoActionPerformed

    private void cbo_FiltroTipo_OperacionPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_FiltroTipo_OperacionPrestamoActionPerformed
        String filtro_Tipo = cbo_FiltroTipo_OperacionPrestamo.getSelectedItem().toString();
        
        objArreglo_OperacionPrestamo.FiltroTipo_Mostrar_OperacionesPrestamo(filtro_Tipo, tbl_OpPrestamo);
    }//GEN-LAST:event_cbo_FiltroTipo_OperacionPrestamoActionPerformed

    private void btn_MostrarTodos_OperacionPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MostrarTodos_OperacionPrestamoActionPerformed
        objArreglo_OperacionPrestamo.Mostrar_OperacionesPrestamo(tbl_OpPrestamo);
    }//GEN-LAST:event_btn_MostrarTodos_OperacionPrestamoActionPerformed

    private void tbl_OpPrestamoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_OpPrestamoMouseReleased
        int fila_Selecionada = tbl_OpPrestamo.getSelectedRow();
        
        if(fila_Selecionada != -1){
            cbo_ClienteAsignado_OpPrestamo.setSelectedItem(tbl_OpPrestamo.getValueAt(fila_Selecionada, 0));
            cbo_TipoAsignado_OpPrestamo.setSelectedItem(tbl_OpPrestamo.getValueAt(fila_Selecionada, 1));
            txt_MontoInicial_OpPrestamo.setText(tbl_OpPrestamo.getValueAt(fila_Selecionada, 2).toString());
            txt_SaldoPendiente_OpPrestamo.setText(tbl_OpPrestamo.getValueAt(fila_Selecionada, 3).toString());
        }
    }//GEN-LAST:event_tbl_OpPrestamoMouseReleased

    private void txt_BusquedaCliente_OperacionPrestamoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_BusquedaCliente_OperacionPrestamoMouseReleased

    }//GEN-LAST:event_txt_BusquedaCliente_OperacionPrestamoMouseReleased

    private void txt_BusquedaCliente_OperacionPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BusquedaCliente_OperacionPrestamoActionPerformed
        
    }//GEN-LAST:event_txt_BusquedaCliente_OperacionPrestamoActionPerformed

    private void txt_BusquedaCliente_OperacionPrestamoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BusquedaCliente_OperacionPrestamoKeyReleased
        String filtroBusquedaNombreCliente = txt_BusquedaCliente_OperacionPrestamo.getText();
        
        objArreglo_OperacionPrestamo.BusquedaCliente_Mostrar_OperacionesPrestamo(filtroBusquedaNombreCliente, tbl_OpPrestamo);
    }//GEN-LAST:event_txt_BusquedaCliente_OperacionPrestamoKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Editar_OpPrestamo;
    private javax.swing.JButton btn_Eliminar_OpPrestamo;
    private javax.swing.JButton btn_Guardar_Cliente;
    private javax.swing.JButton btn_Guardar_OpPrestamo;
    private javax.swing.JButton btn_Guardar_TipoPrestamo;
    private javax.swing.JButton btn_MostrarTodos_OperacionPrestamo;
    private javax.swing.JButton btn_Salir_Cliente;
    private javax.swing.JButton btn_Salir_OperacionPrestamo;
    private javax.swing.JButton btn_Salir_TipoPrestamo;
    private javax.swing.JComboBox<String> cbo_ClienteAsignado_OpPrestamo;
    private javax.swing.JComboBox<String> cbo_FiltroTipo_OperacionPrestamo;
    private javax.swing.JComboBox<String> cbo_TipoAsignado_OpPrestamo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JSpinner spn_PlazoMaximo_TipoPrestamo;
    private javax.swing.JSpinner spn_TasaInteresAnual_TipoPrestamo;
    private javax.swing.JTable tbl_Cliente;
    private javax.swing.JTable tbl_OpPrestamo;
    private javax.swing.JTable tbl_TipoPrestamo;
    private javax.swing.JTextField txt_BusquedaCliente_OperacionPrestamo;
    private javax.swing.JTextField txt_Ci_Cliente;
    private javax.swing.JTextField txt_Codigo_TipoPrestamo;
    private javax.swing.JTextField txt_IngresoMensual_Cliente;
    private javax.swing.JTextField txt_MontoInicial_OpPrestamo;
    private javax.swing.JTextField txt_NombreCompleto_Cliente;
    private javax.swing.JTextField txt_SaldoPendiente_OpPrestamo;
    private javax.swing.JTextField txt_Tipo_TipoPrestamo;
    // End of variables declaration//GEN-END:variables
}
