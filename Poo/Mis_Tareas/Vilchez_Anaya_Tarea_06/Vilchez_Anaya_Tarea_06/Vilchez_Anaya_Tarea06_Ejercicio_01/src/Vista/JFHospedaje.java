package Vista;

import Molde.Habitacion;

import Molde.Hospedaje;
import Molde.Huesped;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class JFHospedaje extends javax.swing.JFrame {
  DefaultListModel molde_lts = new DefaultListModel();
  

  Hospedaje objHospedaje;
  Huesped ObjHuesped01;
  Huesped ObjHuesped02;
  Huesped ObjHuesped03;
  Huesped ObjHuesped04;
  Huesped ObjHuesped05;
  Huesped ObjHuesped06;
  Huesped ObjHuesped07;
  Huesped ObjHuesped08;
  Huesped ObjHuesped09;
  Habitacion objHabitacion00 = null;
  Huesped objHuesped00 = null;
  Huesped objhistorico01 = null;
  Huesped objhistorico02 = null;
  Huesped objhistorico03 = null;
  Huesped objhistorico04 = null;
  Huesped objhistorico05 = null;
  Huesped objhistorico06 = null;
  Huesped objhistorico07 = null;
  Huesped objhistorico08 = null;
  Huesped objhistorico09 = null;
   
   Habitacion objHabitacion01;
   Habitacion objHabitacion02;
   Habitacion objHabitacion03;
  int s=0;
  int bloquear =0;
   int bloquear01 =0;
    int bloquear02 =0;
int valores = 0;
int valores01 = 3;
int valores02 = 6;
    public JFHospedaje() {
        initComponents();
     molde_lts = new DefaultListModel();
    // lts_Huesped.setModel(molde_lts);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btn_Crear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lts_Huesped = new javax.swing.JList<>();
        cbo_Habitaciones = new javax.swing.JComboBox<>();
        btn_estado = new javax.swing.JButton();
        txt_estado = new javax.swing.JTextField();
        btn_Historial = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_historial = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_area_salida = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_ingreso_dias = new javax.swing.JTextField();
        btn_añadir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_Salir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_salida_dias = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_salida_meses = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_salida_año = new javax.swing.JTextField();
        btn_salir_guarda = new javax.swing.JButton();
        btn_encapsular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_ingreso_meses = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_ingreso_año = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Crear.setText("Crear Hospedaje");
        btn_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CrearActionPerformed(evt);
            }
        });

        lts_Huesped.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Huesped01", "Huesped02", "Huesped03" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lts_Huesped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lts_HuespedMouseClicked(evt);
            }
        });
        lts_Huesped.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lts_HuespedKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(lts_Huesped);

        cbo_Habitaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habitacion01", "Habitacion02", "Habitacion03", " ", " " }));
        cbo_Habitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_HabitacionesActionPerformed(evt);
            }
        });

        btn_estado.setText("Estado:");
        btn_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estadoActionPerformed(evt);
            }
        });

        btn_Historial.setText("Historial de ingreso");
        btn_Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HistorialActionPerformed(evt);
            }
        });

        txt_historial.setColumns(20);
        txt_historial.setRows(5);
        jScrollPane2.setViewportView(txt_historial);

        txt_area_salida.setColumns(20);
        txt_area_salida.setRows(5);
        jScrollPane3.setViewportView(txt_area_salida);

        jButton1.setText("Historial de salida");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(cbo_Habitaciones, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_estado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_estado, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Historial)
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbo_Habitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_estado)
                    .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Historial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Huesped", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Dni:");

        jLabel4.setText("Fecha de ingreso:");

        txt_ingreso_dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ingreso_diasActionPerformed(evt);
            }
        });

        btn_añadir.setText("Actualizar información");
        btn_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Salida del Huesped"));

        btn_Salir.setText("Salida del Huesped");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha de salida:");

        jLabel10.setText("Dia:");

        jLabel11.setText("Meses:");

        jLabel12.setText("Año:");

        jLabel13.setText("20");

        btn_salir_guarda.setText("Guardar");
        btn_salir_guarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir_guardaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_salida_dias, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_salida_año, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_salida_meses, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salir_guarda, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_salida_dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(txt_salida_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_salida_meses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salir_guarda)
                .addGap(18, 18, 18)
                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        btn_encapsular.setText("Encapsular");
        btn_encapsular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_encapsularActionPerformed(evt);
            }
        });

        jLabel6.setText("Día:");

        jLabel7.setText("Meses");

        jLabel8.setText("Año:");

        jLabel9.setText("20");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_añadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_apellido)
                                    .addComponent(txt_nombre)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_dni))
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_ingreso_meses))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_ingreso_dias)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(5, 5, 5)
                                .addComponent(txt_ingreso_año, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addComponent(btn_encapsular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ingreso_dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(txt_ingreso_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_ingreso_meses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btn_añadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_encapsular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Crear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Crear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirActionPerformed

        if(txt_ingreso_dias.getText().isEmpty() && (txt_ingreso_meses.getText().isEmpty()) &&  (txt_ingreso_año.getText().isEmpty())){
         //txt_ingreso.getText().isEmpty()= si el texto_ingreso esta vacio
         JOptionPane.showMessageDialog(this, "Ingresar la fecha de ingreso");
     }else if(!txt_salida_dias.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, """
                                               Es imposible ejecutar esta acci\u00f3n
                                               Borre los datos de fecha_salida""");
     }else if(!txt_ingreso_dias.getText().isEmpty() && (!txt_ingreso_meses.getText().isEmpty()) &&  (!txt_ingreso_año.getText().isEmpty()) &&(s<3)){
      int valor = lts_Huesped.getSelectedIndex();
           int pos = cbo_Habitaciones.getSelectedIndex();
         switch (pos) {
         case 0 -> {
             //Habitacion01
             if(valor==0){
                 //Habitacion01-Huesped01
                 ObjHuesped01.setApellido(txt_apellido.getText());
                 ObjHuesped01.setNombre(txt_nombre.getText());
                 ObjHuesped01.setDni(Integer.parseInt(txt_dni.getText()));
                 ObjHuesped01.setFecha_ingreso_dias(Integer.parseInt(txt_ingreso_dias.getText()));
                 ObjHuesped01.setFecha_ingreso_meses(Integer.parseInt(txt_ingreso_meses.getText()));
                 ObjHuesped01.setFecha_ingreso_año(Integer.parseInt(txt_ingreso_año.getText()));
             }else if(valor==1){
                 //Habitacion01-Huesped02
                 ObjHuesped02.setApellido(txt_apellido.getText());
                 ObjHuesped02.setNombre(txt_nombre.getText());
                 ObjHuesped02.setDni(Integer.parseInt(txt_dni.getText()));
                 ObjHuesped02.setFecha_ingreso_dias(Integer.parseInt(txt_ingreso_dias.getText()));
                 ObjHuesped02.setFecha_ingreso_meses(Integer.parseInt(txt_ingreso_meses.getText()));
                 ObjHuesped02.setFecha_ingreso_año(Integer.parseInt(txt_ingreso_año.getText()));
             }else if(valor==2){
                 //Habitacion01-Huesped03
                 ObjHuesped03.setApellido(txt_apellido.getText());
                 ObjHuesped03.setNombre(txt_nombre.getText());
                 ObjHuesped03.setDni(Integer.parseInt(txt_dni.getText()));
                 ObjHuesped03.setFecha_ingreso_dias(Integer.parseInt(txt_ingreso_dias.getText()));
                 ObjHuesped03.setFecha_ingreso_meses(Integer.parseInt(txt_ingreso_meses.getText()));
                 ObjHuesped03.setFecha_ingreso_año(Integer.parseInt(txt_ingreso_año.getText()));
             }
                }
      case 1 -> {
          //Habitacion02
          if(valor==0){
              //Habitacion02-Huesped04
              ObjHuesped04.setApellido(txt_apellido.getText());
              ObjHuesped04.setNombre(txt_nombre.getText());
              ObjHuesped04.setDni(Integer.parseInt(txt_dni.getText()));
              ObjHuesped04.setFecha_ingreso_dias(Integer.parseInt(txt_ingreso_dias.getText()));
              ObjHuesped04.setFecha_ingreso_meses(Integer.parseInt(txt_ingreso_meses.getText()));
              ObjHuesped04.setFecha_ingreso_año(Integer.parseInt(txt_ingreso_año.getText()));
          }else if(valor==1){
              //Habitacion02-Huesped05
              ObjHuesped05.setApellido(txt_apellido.getText());
              ObjHuesped05.setNombre(txt_nombre.getText());
              ObjHuesped05.setDni(Integer.parseInt(txt_dni.getText()));
              ObjHuesped05.setFecha_ingreso_dias(Integer.parseInt(txt_ingreso_dias.getText()));
              ObjHuesped05.setFecha_ingreso_meses(Integer.parseInt(txt_ingreso_meses.getText()));
              ObjHuesped05.setFecha_ingreso_año(Integer.parseInt(txt_ingreso_año.getText()));
          }else if(valor==2){
              //Habitacion02-Huesped06
              ObjHuesped06.setApellido(txt_apellido.getText());
              ObjHuesped06.setNombre(txt_nombre.getText());
              ObjHuesped06.setDni(Integer.parseInt(txt_dni.getText()));
              ObjHuesped06.setFecha_ingreso_dias(Integer.parseInt(txt_ingreso_dias.getText()));
              ObjHuesped06.setFecha_ingreso_meses(Integer.parseInt(txt_ingreso_meses.getText()));
              ObjHuesped06.setFecha_ingreso_año(Integer.parseInt(txt_ingreso_año.getText()));
          }
                }
     case 2 ->  {
         //Habitacion03
         if(valor==0){
             //Habitacion03-Huesped07
             ObjHuesped07.setApellido(txt_apellido.getText());
             ObjHuesped07.setNombre(txt_nombre.getText());
             ObjHuesped07.setDni(Integer.parseInt(txt_dni.getText()));
             ObjHuesped07.setFecha_ingreso_dias(Integer.parseInt(txt_ingreso_dias.getText()));
             ObjHuesped07.setFecha_ingreso_meses(Integer.parseInt(txt_ingreso_meses.getText()));
             ObjHuesped07.setFecha_ingreso_año(Integer.parseInt(txt_ingreso_año.getText()));
         }else if(valor==1){
             //Habitacion03-Huesped08
             ObjHuesped08.setApellido(txt_apellido.getText());
             ObjHuesped08.setNombre(txt_nombre.getText());
             ObjHuesped08.setDni(Integer.parseInt(txt_dni.getText()));
             ObjHuesped08.setFecha_ingreso_dias(Integer.parseInt(txt_ingreso_dias.getText()));
             ObjHuesped08.setFecha_ingreso_meses(Integer.parseInt(txt_ingreso_meses.getText()));
             ObjHuesped08.setFecha_ingreso_año(Integer.parseInt(txt_ingreso_año.getText()));
         }else if(valor==2){
             //Habitacion03-Huesped09
             ObjHuesped09.setApellido(txt_apellido.getText());
             ObjHuesped09.setNombre(txt_nombre.getText());
             ObjHuesped09.setDni(Integer.parseInt(txt_dni.getText()));
             ObjHuesped09.setFecha_ingreso_dias(Integer.parseInt(txt_ingreso_dias.getText()));
             ObjHuesped09.setFecha_ingreso_meses(Integer.parseInt(txt_ingreso_meses.getText()));
             ObjHuesped09.setFecha_ingreso_año(Integer.parseInt(txt_ingreso_año.getText()));
         }
                }
       
     }
         
    }
 
    }//GEN-LAST:event_btn_añadirActionPerformed

    private void btn_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearActionPerformed

  ObjHuesped01 = new Huesped(01, "Apellido01", "Nombre01", 1);
  ObjHuesped02 = new Huesped(02, "Apellido02", "Nombre02", 2);    
  ObjHuesped03 = new Huesped(03, "Apellido03", "Nombre03", 3);
  ObjHuesped04 = new Huesped(01, "Apellido04", "Nombre04",4);
  ObjHuesped05 = new Huesped(02, "Apellido05", "Nombre05",5);    
  ObjHuesped06 = new Huesped(03, "Apellido06", "Nombre06",6);
  ObjHuesped07 = new Huesped(01, "Apellido07", "Nombre07",7);
  ObjHuesped08 = new Huesped(02, "Apellido08", "Nombre08",8);    
  ObjHuesped09 = new Huesped(03, "Apellido09", "Nombre09",9);
 objHabitacion01 = new Habitacion(1, "Disponible", ObjHuesped01, ObjHuesped02, ObjHuesped03);
 objHabitacion02= new Habitacion(2, "Disponible", ObjHuesped04, ObjHuesped05, ObjHuesped06);
 objHabitacion03 = new Habitacion(3, "Disponible", ObjHuesped07, ObjHuesped08, ObjHuesped09);
 objHospedaje = new Hospedaje(objHabitacion01, objHabitacion02, objHabitacion03);
//Con el molde lista ponemos ahi objHabitacion01 y este funcionara como un contenedor aparte del objHabitacion02, objHabitacion03
  //Aunque contengan lo mismo, son contenedorres distintos y asi podremos hacer la lista para que cada uno sea distinto
    }//GEN-LAST:event_btn_CrearActionPerformed

    private void lts_HuespedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lts_HuespedMouseClicked
 
     int valor = lts_Huesped.getSelectedIndex();
     int pos = cbo_Habitaciones.getSelectedIndex();
     
     if(pos == 0){
      //Habitacion01   
        switch (valor) {
     case 0://Huesped01
             txt_apellido.setText(ObjHuesped01.getApellido());
             txt_nombre.setText(ObjHuesped01.getNombre());
             txt_dni.setText(ObjHuesped01.getDni() +"");
             txt_ingreso_dias.setText(ObjHuesped01.getFecha_ingreso_dias()+"");
             
       if(bloquear==1){
           bloquear();
       }else if(bloquear ==2){
           bloquear();
       }
             
             
                break;
     case 1://Huesped02
            txt_apellido.setText(ObjHuesped02.getApellido());
            txt_nombre.setText(ObjHuesped02.getNombre());
            txt_dni.setText(ObjHuesped02.getDni() +"");  
            if(bloquear==1){
           abrir();
       }else if(bloquear ==2){
           bloquear();
       }
     
            
                break;
    case 2://inquilino03
              txt_apellido.setText(ObjHuesped03.getApellido());
              txt_nombre.setText(ObjHuesped03.getNombre());
              txt_dni.setText(ObjHuesped03.getDni() +"");
              if(bloquear==3){
                  bloquear();
              }else if(bloquear ==2){
                  abrir();
              }else if(bloquear==1){
                  abrir();
              }
              
                break;
        }
     }else if(pos ==1){
         //Habitacion02
           switch (valor) {
     case 0://Inquilino01
              txt_apellido.setText(ObjHuesped04.getApellido());
              txt_nombre.setText(ObjHuesped04.getNombre());
              txt_dni.setText(ObjHuesped04.getDni() +"");
           if(bloquear01==4){
               bloquear();
           }else if (bloquear01==3){
               abrir();
      }   else if(bloquear01 ==5){
           bloquear();
       }
             
                break;
     case 1://Huesped 02
            txt_apellido.setText(ObjHuesped05.getApellido());
            txt_nombre.setText(ObjHuesped05.getNombre());
            txt_dni.setText(ObjHuesped05.getDni() +"");    
            if(bloquear01==4){
               abrir();
           }else if(bloquear01==5){
               bloquear();
           }
                break;
    case 2:
              txt_apellido.setText(ObjHuesped06.getApellido());
              txt_nombre.setText(ObjHuesped06.getNombre());
              txt_dni.setText(ObjHuesped06.getDni() +"");
               if(bloquear01==4){
               abrir();
           }else if(bloquear01==5){
               abrir();
           }else if(bloquear01==6){
               bloquear();
           }  
              break;
                
        }
     }else if(pos==2){
         //Habitacion03
           switch (valor) {
     case 0:
              txt_apellido.setText(ObjHuesped07.getApellido());
              txt_nombre.setText(ObjHuesped07.getNombre());
              txt_dni.setText(ObjHuesped07.getDni() +"");
              if(bloquear02==7){
                  bloquear();
              }else if (bloquear02<7){
               abrir();
           }   else if(bloquear01 ==8){
           bloquear();
       }
             
                break;
     case 1:
            txt_apellido.setText(ObjHuesped08.getApellido());
            txt_nombre.setText(ObjHuesped08.getNombre());
            txt_dni.setText(ObjHuesped08.getDni() +"");  
             if(bloquear02==7){
                  abrir();
              }else if(bloquear02==8){
                  bloquear();
              }
                break;
    case 2:
              txt_apellido.setText(ObjHuesped09.getApellido());
              txt_nombre.setText(ObjHuesped09.getNombre());
              txt_dni.setText(ObjHuesped09.getDni() +"");
               if(bloquear02==7){
                  abrir();
              }else if(bloquear02==8){
                  abrir();
              }else if(bloquear02==9){
                  bloquear();
              }
                break;
        }
     }
   
    }//GEN-LAST:event_lts_HuespedMouseClicked

    private void cbo_HabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_HabitacionesActionPerformed
    int pos = cbo_Habitaciones.getSelectedIndex();
        switch (pos) {
           case 0://Habitacion01
              txt_estado.setText(objHabitacion01.getEstado());
               objHabitacion00 = objHospedaje.getObjHabitacion01();
           case 1://Habitacion02
                 txt_estado.setText(objHabitacion02.getEstado());
                objHabitacion00 = objHospedaje.getObjHabitacion02();
                break;
           case 2://Habitacion03
                txt_estado.setText(objHabitacion03.getEstado());
                 objHabitacion00 = objHospedaje.getObjHabitacion03();
                break;
      }
        
    }//GEN-LAST:event_cbo_HabitacionesActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
 
   int pos = lts_Huesped.getSelectedIndex();
   int valor = cbo_Habitaciones.getSelectedIndex();
            abrir();
                bloquear--;
                bloquear01--;
                bloquear02--;
               
            switch (valor) {
                case 0://Habitacion01
                    valores--;
               
                    break;
                case 1:
                    valores01--;
                      
                    break;
                case 2:
                    valores--;
                   
                    break;
             
            }
            
       txt_salida_año.setEnabled(true);
      txt_salida_dias.setEnabled(true);
      txt_salida_meses.setEnabled(true);      
     
      
       
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_encapsularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_encapsularActionPerformed

        int sav=JOptionPane.showConfirmDialog(this, "Confirmar huesped?");

        switch (sav) {
            case 0://Yes
                  bloquear_salir();
                   btn_encapsular.setEnabled(false);
       btn_añadir.setEnabled(false);
       txt_apellido.setEnabled(false);
       txt_nombre.setEnabled(false);
       txt_dni.setEnabled(false);
       txt_ingreso_dias.setEnabled(false); 
       txt_ingreso_año.setEnabled(false);
       txt_ingreso_meses.setEnabled(false);
bloquear02++;
bloquear01++;
 bloquear++;
 int valor = lts_Huesped.getSelectedIndex();
 int pos = cbo_Habitaciones.getSelectedIndex();
        switch (pos) {
            case 0: //Habitacion01
                if(valores<=3){
                    valores++;}
                switch (valor) {
                    case 0://Habitacion01_Huesped01
 ObjHuesped01.setApellido(txt_apellido.getText());
 ObjHuesped01.setNombre(txt_nombre.getText());
 ObjHuesped01.setDni(Integer.parseInt(txt_dni.getText()));
 ObjHuesped01.setFecha_ingreso_dias(Integer.parseInt(txt_ingreso_dias.getText()));
                        break;
                  case 1://Habitacion01_Huesped02
 ObjHuesped02.setApellido(txt_apellido.getText());
 ObjHuesped02.setNombre(txt_nombre.getText());
 ObjHuesped02.setDni(Integer.parseInt(txt_dni.getText()));
 ObjHuesped02.setFecha_ingreso_dias(Integer.parseInt(txt_ingreso_dias.getText()));
 
                        break;
            case 2://Habitacion01_Huesped03
 ObjHuesped03.setApellido(txt_apellido.getText());
 ObjHuesped03.setNombre(txt_nombre.getText());
 ObjHuesped03.setDni(Integer.parseInt(txt_dni.getText()));
 ObjHuesped03.setFecha_ingreso_dias(Integer.parseInt(txt_ingreso_dias.getText()));
                        break;
                }
               
                break;
           case 1://Habitacion02
                 if(valores01<=6){
                    valores01++;}
                            switch (valor) {
                    case 0://Habitacion02_Huesped01
 ObjHuesped04.setApellido(txt_apellido.getText());
 ObjHuesped04.setNombre(txt_nombre.getText());
 ObjHuesped04.setDni(Integer.parseInt(txt_dni.getText()));
 ObjHuesped04.setFecha_ingreso_dias(Integer.parseInt(txt_ingreso_dias.getText()));
                        break;
                  case 1://Habitacion02_Huesped02
 ObjHuesped05.setApellido(txt_apellido.getText());
 ObjHuesped05.setNombre(txt_nombre.getText());
 ObjHuesped05.setDni(Integer.parseInt(txt_dni.getText()));
 ObjHuesped05.setFecha_ingreso_dias(Integer.parseInt(txt_ingreso_dias.getText()));
 
                        break;
            case 2://Habitacion02_Huesped03
 ObjHuesped06.setApellido(txt_apellido.getText());
 ObjHuesped06.setNombre(txt_nombre.getText());
 ObjHuesped06.setDni(Integer.parseInt(txt_dni.getText()));
 ObjHuesped06.setFecha_ingreso_dias(Integer.parseInt(txt_ingreso_dias.getText()));
              break;
                }
                break;
           case 2://Habitacion03
                if(valores02<=9){
                    valores02++;}
                           switch (valor) {
                    case 0://Habitacion03_Huesped01
 ObjHuesped07.setApellido(txt_apellido.getText());
 ObjHuesped07.setNombre(txt_nombre.getText());
 ObjHuesped07.setDni(Integer.parseInt(txt_dni.getText()));
 ObjHuesped07.setFecha_ingreso_dias(Integer.parseInt(txt_ingreso_dias.getText()));
                        break;
                  case 1://Habitacion03_Huesped02
 ObjHuesped08.setApellido(txt_apellido.getText());
 ObjHuesped08.setNombre(txt_nombre.getText());
 ObjHuesped08.setDni(Integer.parseInt(txt_dni.getText()));
 ObjHuesped08.setFecha_ingreso_dias(Integer.parseInt(txt_ingreso_dias.getText()));
 
                        break;
            case 2://Habitacion03_Huesped03
 ObjHuesped09.setApellido(txt_apellido.getText());
 ObjHuesped09.setNombre(txt_nombre.getText());
 ObjHuesped09.setDni(Integer.parseInt(txt_dni.getText()));
 ObjHuesped09.setFecha_ingreso_dias(Integer.parseInt(txt_ingreso_dias.getText()));
                        break;
                }
       break;}

           
                break;
            case 1://NO
                JOptionPane.showMessageDialog(this, "Revise los datos");
                break;
        }
     


    }//GEN-LAST:event_btn_encapsularActionPerformed

    private void lts_HuespedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lts_HuespedKeyReleased
  
    }//GEN-LAST:event_lts_HuespedKeyReleased

    private void btn_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estadoActionPerformed
int pos = cbo_Habitaciones.getSelectedIndex();
        switch (pos) {
            case 0:
                  if(valores == 3){
    objHabitacion01.setEstado("No disponible");
        txt_estado.setText(objHabitacion01.getEstado());
                } else {
                      txt_estado.setText("Disponible");
                  }
                break;
            case 1:
                         
            if(valores01 ==6){
                   txt_estado.setText(objHabitacion02.getEstado());
           objHabitacion02.setEstado("No disponible");
            txt_estado.setText(objHabitacion02.getEstado());
       }
                break;
            case 2:
                  if (valores ==9){
            txt_estado.setText(objHabitacion03.getEstado());
                    objHabitacion03.setEstado("No disponible");
                   txt_estado.setText(objHabitacion03.getEstado()); 
         
       }  
                break;
        
        }
    

    }//GEN-LAST:event_btn_estadoActionPerformed

    private void btn_HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HistorialActionPerformed

    txt_historial.setText(
 
       "Apellidos:" +  ObjHuesped01.getApellido() + "\n"+
      "Nombre:" + ObjHuesped01.getNombre()+ "\n"+
      "dni: " + ObjHuesped01.getDni() + "\n" +
      "Fecha de ingreso: " + "0"+ObjHuesped01.getFecha_ingreso_dias() + "/0"+ ObjHuesped01.getFecha_ingreso_meses()+"/20"+ObjHuesped01.getFecha_ingreso_año()+ "\n"+
      "Fecha de salida: " + "0" +ObjHuesped01.getFecha_salida_dias()+"/0"+ ObjHuesped01.getFecha_salida_meses()+ "/20"+ObjHuesped01.getFecha_salida_año()+"\n\n"+
               
     
      "Apellidos:" +  ObjHuesped02.getApellido() + "\n"+
        "Nombre:" + ObjHuesped02.getNombre()+ "\n"+
        "dni: " + ObjHuesped02.getDni() + "\n" +
        "Fecha de ingreso: " + "0"+ObjHuesped02.getFecha_ingreso_dias() + "/0"+ ObjHuesped02.getFecha_ingreso_meses()+"/20"+ObjHuesped02.getFecha_ingreso_año()+ "\n"+
      "Fecha de salida: " + "0" +ObjHuesped02.getFecha_salida_dias()+"/0"+ ObjHuesped02.getFecha_salida_meses()+ "/20"+ObjHuesped02.getFecha_salida_año()+"\n\n"+
         
        "Apellidos:" +  ObjHuesped03.getApellido() + "\n"+
        "Nombre:" + ObjHuesped03.getNombre()+ "\n"+
        "dni: " + ObjHuesped03.getDni() + "\n" +
        "Fecha de ingreso: " + "0"+ObjHuesped03.getFecha_ingreso_dias() + "/0"+ ObjHuesped03.getFecha_ingreso_meses()+"/20"+ObjHuesped03.getFecha_ingreso_año()+ "\n"+
       "Fecha de salida: " + "0" +ObjHuesped03.getFecha_salida_dias()+"/0"+ ObjHuesped03.getFecha_salida_meses()+ "/20"+ObjHuesped03.getFecha_salida_año()+"\n\n"+
        
        
      "Apellidos:" +  ObjHuesped04.getApellido() + "\n"+
        "Nombre:" + ObjHuesped04.getNombre()+ "\n"+
        "dni: " + ObjHuesped04.getDni() + "\n" +
        "Fecha de ingreso: " + "0"+ObjHuesped04.getFecha_ingreso_dias() + "/0"+ ObjHuesped04.getFecha_ingreso_meses()+"/20"+ObjHuesped04.getFecha_ingreso_año()+ "\n"+
       "Fecha de salida: " + "0" +ObjHuesped04.getFecha_salida_dias()+"/0"+ ObjHuesped04.getFecha_salida_meses()+ "/20"+ObjHuesped04.getFecha_salida_año()+"\n\n"+
      
       "Apellidos:" +  ObjHuesped05.getApellido() + "\n"+
        "Nombre:" + ObjHuesped05.getNombre()+ "\n"+
        "dni: " + ObjHuesped05.getDni() + "\n" +
        "Fecha de ingreso: " + "0"+ObjHuesped05.getFecha_ingreso_dias() + "/0"+ ObjHuesped05.getFecha_ingreso_meses()+"/20"+ObjHuesped05.getFecha_ingreso_año()+ "\n"+
       "Fecha de salida: " + "0" +ObjHuesped05.getFecha_salida_dias()+"/0"+ ObjHuesped05.getFecha_salida_meses()+ "/20"+ObjHuesped05.getFecha_salida_año()+"\n\n"+
        
       "Apellidos:" +  ObjHuesped06.getApellido() + "\n"+
        "Nombre:" + ObjHuesped06.getNombre()+ "\n"+
        "dni: " + ObjHuesped06.getDni() + "\n" +
        "Fecha de ingreso: " + "0"+ObjHuesped06.getFecha_ingreso_dias() + "/0"+ ObjHuesped06.getFecha_ingreso_meses()+"/20"+ObjHuesped06.getFecha_ingreso_año()+ "\n"+
       "Fecha de salida: " + "0" +ObjHuesped06.getFecha_salida_dias()+"/0"+ ObjHuesped06.getFecha_salida_meses()+ "/20"+ObjHuesped06.getFecha_salida_año()+"\n\n"+
                
 "Apellidos:" +  ObjHuesped07.getApellido() + "\n"+
        "Nombre:" + ObjHuesped07.getNombre()+ "\n"+
        "dni: " + ObjHuesped07.getDni() + "\n" +
        "Fecha de ingreso: " + "0"+ObjHuesped07.getFecha_ingreso_dias() + "/0"+ ObjHuesped07.getFecha_ingreso_meses()+"/20"+ObjHuesped07.getFecha_ingreso_año()+ "\n"+
       "Fecha de salida: " + "0" +ObjHuesped07.getFecha_salida_dias()+"/0"+ ObjHuesped07.getFecha_salida_meses()+ "/20"+ObjHuesped07.getFecha_salida_año()+"\n\n"+
                
       "Apellidos:" +  ObjHuesped08.getApellido() + "\n"+
        "Nombre:" + ObjHuesped08.getNombre()+ "\n"+
        "dni: " + ObjHuesped08.getDni() + "\n" +
        "Fecha de ingreso: " + "0"+ObjHuesped08.getFecha_ingreso_dias() + "/0"+ ObjHuesped08.getFecha_ingreso_meses()+"/20"+ObjHuesped08.getFecha_ingreso_año()+ "\n"+
       "Fecha de salida: " + "0" +ObjHuesped08.getFecha_salida_dias()+"/0"+ ObjHuesped08.getFecha_salida_meses()+ "/20"+ObjHuesped08.getFecha_salida_año()+"\n\n"+
                
 "Apellidos:" +  ObjHuesped09.getApellido() + "\n"+
        "Nombre:" + ObjHuesped09.getNombre()+ "\n"+
        "dni: " + ObjHuesped09.getDni() + "\n" +
        "Fecha de ingreso: " + "0"+ObjHuesped09.getFecha_ingreso_dias() + "/0"+ ObjHuesped09.getFecha_ingreso_meses()+"/20"+ObjHuesped09.getFecha_ingreso_año()+ "\n"+
       "Fecha de salida: " + "0" +ObjHuesped09.getFecha_salida_dias()+"/0"+ ObjHuesped09.getFecha_salida_meses()+ "/20"+ObjHuesped09.getFecha_salida_año()+"\n\n"
                  
    );

    }//GEN-LAST:event_btn_HistorialActionPerformed

    private void txt_ingreso_diasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ingreso_diasActionPerformed
  
    }//GEN-LAST:event_txt_ingreso_diasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     txt_area_salida.setText(
             "Inquilinos expulsados"+ "\n"+
       "Apellidos:" +  objhistorico01.getApellido() + "\n"+
        "Nombre:" +objhistorico01.getNombre()+ "\n"+
        "dni: " + objhistorico01.getDni() + "\n" +
        "Fecha de ingreso: " + "0"+objhistorico01.getFecha_ingreso_dias() + "/0"+ objhistorico01.getFecha_ingreso_meses()+"/20"+objhistorico01.getFecha_ingreso_año()+ "\n"+
       "Fecha de salida: " + "0" +objhistorico01.getFecha_salida_dias()+"/0"+objhistorico01.getFecha_salida_meses()+ "/20"+objhistorico01.getFecha_salida_año()+"\n\n" +
       
        "Apellidos:" +  objhistorico02.getApellido() + "\n"+
        "Nombre:" +objhistorico02.getNombre()+ "\n"+
        "dni: " + objhistorico02.getDni() + "\n" +
        "Fecha de ingreso: " + "0"+objhistorico02.getFecha_ingreso_dias() + "/0"+ objhistorico02.getFecha_ingreso_meses()+"/20"+objhistorico02.getFecha_ingreso_año()+ "\n"+
       "Fecha de salida: " + "0" +objhistorico02.getFecha_salida_dias()+"/0"+objhistorico02.getFecha_salida_meses()+ "/20"+objhistorico02.getFecha_salida_año()+"\n\n" +
                         "Apellidos:" +  objhistorico02.getApellido() + "\n"+
                                 
       "Nombre:" +objhistorico03.getNombre()+ "\n"+
        "dni: " + objhistorico03.getDni() + "\n" +
        "Fecha de ingreso: " + "0"+objhistorico03.getFecha_ingreso_dias() + "/0"+ objhistorico03.getFecha_ingreso_meses()+"/20"+objhistorico03.getFecha_ingreso_año()+ "\n"+
       "Fecha de salida: " + "0" +objhistorico03.getFecha_salida_dias()+"/0"+objhistorico03.getFecha_salida_meses()+ "/20"+objhistorico03.getFecha_salida_año()+"\n\n" +
                         "Apellidos:" +  objhistorico03.getApellido() + "\n"+
        "Nombre:" +objhistorico04.getNombre()+ "\n"+
        "dni: " + objhistorico04.getDni() + "\n" +
        "Fecha de ingreso: " + "0"+objhistorico04.getFecha_ingreso_dias() + "/0"+ objhistorico04.getFecha_ingreso_meses()+"/20"+objhistorico04.getFecha_ingreso_año()+ "\n"+
       "Fecha de salida: " + "0" +objhistorico04.getFecha_salida_dias()+"/0"+objhistorico04.getFecha_salida_meses()+ "/20"+objhistorico04.getFecha_salida_año()+"\n\n" +
               
         "Apellidos:" +  objhistorico05.getApellido() + "\n"+
        "Nombre:" +objhistorico05.getNombre()+ "\n"+
        "dni: " + objhistorico05.getDni() + "\n" +
        "Fecha de ingreso: " + "0"+objhistorico05.getFecha_ingreso_dias() + "/0"+ objhistorico05.getFecha_ingreso_meses()+"/20"+objhistorico05.getFecha_ingreso_año()+ "\n"+
       "Fecha de salida: " + "0" +objhistorico05.getFecha_salida_dias()+"/0"+objhistorico05.getFecha_salida_meses()+ "/20"+objhistorico05.getFecha_salida_año()+"\n\n" +
               
      "Apellidos:" +  objhistorico06.getApellido() + "\n"+
        "Nombre:" +objhistorico06.getNombre()+ "\n"+
        "dni: " + objhistorico06.getDni() + "\n" +
        "Fecha de ingreso: " + "0"+objhistorico06.getFecha_ingreso_dias() + "/0"+ objhistorico06.getFecha_ingreso_meses()+"/20"+objhistorico06.getFecha_ingreso_año()+ "\n"+
       "Fecha de salida: " + "0" +objhistorico06.getFecha_salida_dias()+"/0"+objhistorico06.getFecha_salida_meses()+ "/20"+objhistorico06.getFecha_salida_año()+"\n\n" +
           
       "Apellidos:" +  objhistorico07.getApellido() + "\n"+
        "Nombre:" +objhistorico07.getNombre()+ "\n"+
        "dni: " + objhistorico07.getDni() + "\n" +
        "Fecha de ingreso: " + "0"+objhistorico07.getFecha_ingreso_dias() + "/0"+ objhistorico07.getFecha_ingreso_meses()+"/20"+objhistorico07.getFecha_ingreso_año()+ "\n"+
       "Fecha de salida: " + "0" +objhistorico07.getFecha_salida_dias()+"/0"+objhistorico07.getFecha_salida_meses()+ "/20"+objhistorico07.getFecha_salida_año()+"\n\n" +
                  
       "Apellidos:" +  objhistorico08.getApellido() + "\n"+
        "Nombre:" +objhistorico08.getNombre()+ "\n"+
        "dni: " + objhistorico08.getDni() + "\n" +
        "Fecha de ingreso: " + "0"+objhistorico08.getFecha_ingreso_dias() + "/0"+ objhistorico08.getFecha_ingreso_meses()+"/20"+objhistorico08.getFecha_ingreso_año()+ "\n"+
       "Fecha de salida: " + "0" +objhistorico08.getFecha_salida_dias()+"/0"+objhistorico08.getFecha_salida_meses()+ "/20"+objhistorico08.getFecha_salida_año()+"\n\n" +
                                
       "Apellidos:" +  objhistorico09.getApellido() + "\n"+
        "Nombre:" +objhistorico09.getNombre()+ "\n"+
        "dni: " + objhistorico09.getDni() + "\n" +
        "Fecha de ingreso: " + "0"+objhistorico09.getFecha_ingreso_dias() + "/0"+ objhistorico09.getFecha_ingreso_meses()+"/20"+objhistorico09.getFecha_ingreso_año()+ "\n"+
       "Fecha de salida: " + "0" +objhistorico09.getFecha_salida_dias()+"/0"+objhistorico09.getFecha_salida_meses()+ "/20"+objhistorico09.getFecha_salida_año()+"\n\n" 

     
     );
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_salir_guardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir_guardaActionPerformed

 objhistorico01 =objHabitacion01.getObjHuesped01();
 objhistorico02 =objHabitacion01.getObjHuesped02();
 objHuesped00 = objHabitacion01.getObjHuesped02();
 objhistorico03 =objHabitacion01.getObjHuesped03();
 objhistorico04 =objHabitacion02.getObjHuesped01();
 objhistorico05 =objHabitacion02.getObjHuesped02();
 objhistorico06 =objHabitacion02.getObjHuesped03();   
 objhistorico07 =objHabitacion03.getObjHuesped01();
 objhistorico08 =objHabitacion03.getObjHuesped02();
 objhistorico09 =objHabitacion03.getObjHuesped03();   
  
  int pos = lts_Huesped.getSelectedIndex();
int valor = cbo_Habitaciones.getSelectedIndex();   

  if(txt_salida_dias.getText().isEmpty() && (txt_salida_meses.getText().isEmpty())  &&   (txt_salida_año.getText().isEmpty())  ){
           JOptionPane.showMessageDialog(this, 
                 "Completar los datos de fecha_salida");
     }else if((!txt_salida_dias.getText().isEmpty()) && (!txt_salida_meses.getText().isEmpty())  &&   (!txt_salida_año.getText().isEmpty())){
      btn_Salir.setEnabled(true);
      txt_salida_año.setEnabled(false);
      txt_salida_dias.setEnabled(false);
      txt_salida_meses.setEnabled(false);
         switch (valor) {
            case 0://Habitacion01
                if(pos ==0){//Habitacion01_Huesped01
       ObjHuesped01.setFecha_salida_dias(Integer.parseInt(txt_salida_dias.getText()));
     ObjHuesped01.setFecha_salida_meses(Integer.parseInt(txt_salida_meses.getText()));
     ObjHuesped01.setFecha_salida_año(Integer.parseInt(txt_salida_año.getText()));
     objHuesped00 = objHabitacion01.getObjHuesped01();
    
  
    
   
      }else if(pos ==1){//Habitacion01_Huesped02
        ObjHuesped02.setFecha_salida_dias(Integer.parseInt(txt_salida_dias.getText()));
       ObjHuesped02.setFecha_salida_meses(Integer.parseInt(txt_salida_meses.getText()));
       ObjHuesped02.setFecha_salida_año(Integer.parseInt(txt_salida_año.getText())); 
      
      }else if(pos==2){//Habitacion01_Huesped03
      ObjHuesped03.setFecha_salida_dias(Integer.parseInt(txt_salida_dias.getText()));
       ObjHuesped03.setFecha_salida_meses(Integer.parseInt(txt_salida_meses.getText()));
       ObjHuesped03.setFecha_salida_año(Integer.parseInt(txt_salida_año.getText()));  
objHuesped00 = objHabitacion01.getObjHuesped03();  
 
   }
                break;
            case 1://Habitacion02
                  if(pos==0){
                        //Habitacion02_huesped01
     ObjHuesped04.setFecha_salida_dias(Integer.parseInt(txt_salida_dias.getText()));
       ObjHuesped04.setFecha_salida_meses(Integer.parseInt(txt_salida_meses.getText()));
       ObjHuesped04.setFecha_salida_año(Integer.parseInt(txt_salida_año.getText()));
       
        
                    }else if(pos==1){
         ObjHuesped05.setFecha_salida_dias(Integer.parseInt(txt_salida_dias.getText()));
       ObjHuesped05.setFecha_salida_meses(Integer.parseInt(txt_salida_meses.getText()));
       ObjHuesped05.setFecha_salida_año(Integer.parseInt(txt_salida_año.getText())); 
       
                    }else if(pos==2){
      ObjHuesped06.setFecha_salida_dias(Integer.parseInt(txt_salida_dias.getText()));
       ObjHuesped06.setFecha_salida_meses(Integer.parseInt(txt_salida_meses.getText()));
       ObjHuesped06.setFecha_salida_año(Integer.parseInt(txt_salida_año.getText()));  
    
                    } 
                break;
            case 2://Habitacion03
                     if(pos==0){
                        //Habitacion03_huesped01
     ObjHuesped07.setFecha_salida_dias(Integer.parseInt(txt_salida_dias.getText()));
       ObjHuesped07.setFecha_salida_meses(Integer.parseInt(txt_salida_meses.getText()));
       ObjHuesped07.setFecha_salida_año(Integer.parseInt(txt_salida_año.getText()));
      
                    }else if(pos==1){
         ObjHuesped08.setFecha_salida_dias(Integer.parseInt(txt_salida_dias.getText()));
       ObjHuesped08.setFecha_salida_meses(Integer.parseInt(txt_salida_meses.getText()));
       ObjHuesped08.setFecha_salida_año(Integer.parseInt(txt_salida_año.getText())); 
       
                    }else if(pos==2){
      ObjHuesped09.setFecha_salida_dias(Integer.parseInt(txt_salida_dias.getText()));
       ObjHuesped09.setFecha_salida_meses(Integer.parseInt(txt_salida_meses.getText()));
       ObjHuesped09.setFecha_salida_año(Integer.parseInt(txt_salida_año.getText()));  
     
                    } 
                
            break;
            
                
            }   
        }
    }//GEN-LAST:event_btn_salir_guardaActionPerformed
public void bloquear(){
     btn_encapsular.setEnabled(false);
       btn_añadir.setEnabled(false);
       txt_apellido.setEnabled(false);
       txt_nombre.setEnabled(false);
       txt_dni.setEnabled(false);
       txt_ingreso_dias.setEnabled(false); 
      txt_ingreso_meses.setEnabled(false); 
       txt_ingreso_año.setEnabled(false); 
}
public void abrir(){
     btn_encapsular.setEnabled(true);
       btn_añadir.setEnabled(true);
       txt_apellido.setEnabled(true);
       txt_nombre.setEnabled(true);
       txt_dni.setEnabled(true);
       txt_ingreso_dias.setEnabled(true); 
          txt_ingreso_meses.setEnabled(true); 
             txt_ingreso_año.setEnabled(true); 
}
public void bloquear_salir(){
      int pos = lts_Huesped.getSelectedIndex();
int valor = cbo_Habitaciones.getSelectedIndex();   
    switch (valor) {
        case 0:
            if(pos==0){//huesped01
              btn_Salir.setEnabled(false);
            }else if(pos==1){
               btn_Salir.setEnabled(false);
            }else if(pos ==3){
                btn_Salir.setEnabled(false);
            }
                
            break;
       
    }
}

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
            java.util.logging.Logger.getLogger(JFHospedaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFHospedaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFHospedaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFHospedaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFHospedaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Crear;
    private javax.swing.JButton btn_Historial;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_añadir;
    private javax.swing.JButton btn_encapsular;
    private javax.swing.JButton btn_estado;
    private javax.swing.JButton btn_salir_guarda;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbo_Habitaciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lts_Huesped;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextArea txt_area_salida;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextArea txt_historial;
    private javax.swing.JTextField txt_ingreso_año;
    private javax.swing.JTextField txt_ingreso_dias;
    private javax.swing.JTextField txt_ingreso_meses;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_salida_año;
    private javax.swing.JTextField txt_salida_dias;
    private javax.swing.JTextField txt_salida_meses;
    // End of variables declaration//GEN-END:variables
}
