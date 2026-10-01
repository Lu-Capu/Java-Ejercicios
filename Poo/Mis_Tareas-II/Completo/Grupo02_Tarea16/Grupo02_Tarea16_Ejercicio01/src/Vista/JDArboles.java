package Vista;

import AccsesoBD.Gestor;
import ControlDAO.ArbolDAO;
import Interf.ArbolINTER;
import Molde.Arbol;
import Molde.Nodo;
import javax.swing.JOptionPane;

public class JDArboles extends javax.swing.JDialog {

    private int Tipo_Ope = 0;
    private Nodo nodo;
    private final String prefijo = "ARB-";
    private ArbolINTER objARB = new ArbolDAO();

    public JDArboles(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try {
            initComponents();
            setLocationRelativeTo(parent);
            Estado_Controles(false);
            cargarCombo();
            cargarElementos(nodo);
            objARB.listar(table);
        } catch (Exception e) {
        }

    }

    public void cargarCombo() {
        try {
            objARB.listar(cboID);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void cargarElementos(Nodo<Object> actual) {
        if (actual != null) {
            Arbol obj = (Arbol) nodo.getDato();
            spnID.setValue(obj.getId());
            txtFuente.setText(obj.getFuente());
            txtEspecie.setText(obj.getEspecie());
            spnEdad.setValue(obj.getEdad());
            spnNUM.setValue(obj.getNumArbol());
            spnDiametro.setValue(obj.getDiametro());
            spnAltura.setValue(obj.getAltura());
            spnfecha.setValue(obj.getFecha());
            cboID.setSelectedItem(obj.getCodigoSitio() + "");
            nodo = actual;
        }
    }

    public void limipar() {
        spnID.setValue(0);
        txtEspecie.setText("");
        txtFuente.setText("");
        spnAltura.setValue(0.0);
        spnDiametro.setValue(0.0);
        spnEdad.setValue(0.0);
        spnNUM.setValue(0);
        spnfecha.setValue(0);
        cboID.setSelectedIndex(-1);
    }

    private void Estado_Controles(boolean estado) {
        cboID.setEnabled(estado);
        txtEspecie.setEnabled(estado);
        txtFuente.setEnabled(estado);
        spnfecha.setEnabled(estado);
        spnAltura.setEnabled(estado);
        spnDiametro.setEnabled(estado);
        spnEdad.setEnabled(estado);
        spnNUM.setEnabled(estado);
        spnID.setEnabled(estado);
        txtFuente.setEnabled(estado);
        btn_Nuevo.setEnabled(!estado);
        btn_Editar.setEnabled(!estado);
        btn_Registrar.setEnabled(estado);
        btn_Cancelar.setEnabled(estado);
        btn_Eliminar.setEnabled(!estado);
        btn_Cerrar.setEnabled(!estado);
        table.setEnabled(!estado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtFuente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        spnID = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        cboID = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        spnEdad = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        spnNUM = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        spnDiametro = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        spnAltura = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        spnfecha = new javax.swing.JSpinner();
        btn_Cerrar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btn_Registrar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Nuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Datos de Arbol", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fuente:");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id de Arbol:");

        spnID.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id de Sitio::");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Especie:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Edad:");

        spnEdad.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 0.1d));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Numeros de Arbol:");

        spnNUM.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Diametro:");

        spnDiametro.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 0.1d));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Altura:");

        spnAltura.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 0.1d));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha:");

        spnfecha.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel7)
                            .addGap(27, 27, 27)
                            .addComponent(txtFuente))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(spnID, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel10)
                            .addGap(21, 21, 21)
                            .addComponent(spnNUM))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel9)))
                            .addGap(21, 21, 21)
                            .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(spnfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spnAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spnDiametro, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spnID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(spnNUM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(spnDiametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(spnAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(spnfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_Cerrar.setText("Cerrar");
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });

        btn_Eliminar.setBackground(new java.awt.Color(255, 102, 153));
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        btn_Registrar.setBackground(new java.awt.Color(0, 204, 255));
        btn_Registrar.setText("Registrar");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        btn_Editar.setBackground(new java.awt.Color(255, 255, 204));
        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        btn_Nuevo.setText("Nuevo");
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        txtArea.setEditable(false);
        txtArea.setBackground(new java.awt.Color(102, 102, 102));
        txtArea.setColumns(20);
        txtArea.setForeground(new java.awt.Color(255, 255, 255));
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        jButton1.setBackground(new java.awt.Color(255, 204, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Editar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Registrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(btn_Cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Cerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Nuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Registrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Cancelar)
                        .addGap(11, 11, 11)
                        .addComponent(btn_Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Cerrar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int fila = table.getSelectedRow();
        if (fila != -1) {
            int rpta = JOptionPane.showConfirmDialog(rootPane, "Desea Eliminar?");
            if (rpta == JOptionPane.YES_OPTION) {
                int idArbol = Integer.parseInt(table.getValueAt(fila, 0).toString());
                nodo = Gestor.sistemita.buscarNodo(prefijo + idArbol);
                if (nodo == null) {
                    JOptionPane.showMessageDialog(null, "No se puede Eliminar");
                    return;
                }
                Arbol a = (Arbol) nodo.getDato();
                Gestor.sistemita.eliminarArbol(a);
                try {
                    objARB.listar(table);
                } catch (Exception ex) {

                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un registro");
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        Estado_Controles(false);
        Tipo_Ope = 0;
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        Estado_Controles(false);
        int id = (int) spnID.getValue();
        String fuente = txtFuente.getText();
        String especie = txtEspecie.getText();
        double edad = (double) spnEdad.getValue();
        int numArbol = (int) spnNUM.getValue();
        double diametro = (double) spnDiametro.getValue();
        double altura = (double) spnAltura.getValue();
        int fecha = (int) spnfecha.getValue();
        if (cboID.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Debe de selecionar un codigo Asociado");
            return;
        }
        int codigoSitio = Integer.parseInt(cboID.getSelectedItem().toString());

        if (fuente.trim().isEmpty() || especie.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completar Casilla");
            return;
        }

        Arbol a = new Arbol(id, fuente, especie, edad, numArbol, diametro, altura, codigoSitio, fecha);
        switch (Tipo_Ope) {
            case 1:
                if (Gestor.sistemita.repetir(prefijo + id)) {
                    Gestor.sistemita.agregarArbol("SIT-" + codigoSitio, a);
                } else {
                    JOptionPane.showMessageDialog(null, "El Código se esta repitiendo\n" + "No se puede ejecutar la Operacion");
                }
                break;

            case 2:
                spnID.setEnabled(true);
                Gestor.sistemita.editarArbol(a);
                break;

        }
        try {
            objARB.listar(table);
        } catch (Exception ex) {

        }
        Tipo_Ope = 0;
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed

        int fila = table.getSelectedRow();
        if (fila != -1) {
            Estado_Controles(true);
            int id = Integer.parseInt(table.getValueAt(fila, 0).toString());
            nodo = Gestor.sistemita.buscarNodo(prefijo + id);
            cargarElementos(nodo);
            spnID.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un registro");
        }
        Tipo_Ope = 2;
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        Estado_Controles(true);
        Tipo_Ope = 1;
    }//GEN-LAST:event_btn_NuevoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limipar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            String id = JOptionPane.showInputDialog("Ingresar ID de Árbol");
            Nodo a = Gestor.sistemita.buscarNodo(prefijo + id);
            if (a == null) {
                txtArea.setText("");
                JOptionPane.showMessageDialog(null, "No se encontró el Árbol con ID: " + id);
                return;
            }

            Arbol arb = (Arbol) a.getDato();

            txtArea.setText("=======ÁRBOL======\n"
                    + "ID: " + arb.getId() + "\n"
                    + "Fuente: " + arb.getFuente() + "\n"
                    + "Especie: " + arb.getEspecie() + "\n"
                    + "Edad: " + arb.getEdad() + " años\n"
                    + "Número de Árbol: " + arb.getNumArbol() + "\n"
                    + "Diámetro: " + arb.getDiametro() + "\n"
                    + "Altura: " + arb.getAltura() + "\n"
                    + "Código Sitio: " + arb.getCodigoSitio() + "\n"
                    + "Fecha de Plantación: " + arb.getFecha() + "\n"
            );

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(JDArboles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDArboles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDArboles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDArboles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDArboles dialog = new JDArboles(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JComboBox<String> cboID;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spnAltura;
    private javax.swing.JSpinner spnDiametro;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JSpinner spnID;
    private javax.swing.JSpinner spnNUM;
    private javax.swing.JSpinner spnfecha;
    private javax.swing.JTable table;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtFuente;
    // End of variables declaration//GEN-END:variables
}
