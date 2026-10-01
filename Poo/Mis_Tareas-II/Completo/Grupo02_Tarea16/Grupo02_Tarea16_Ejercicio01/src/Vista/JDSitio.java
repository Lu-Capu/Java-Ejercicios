package Vista;

import AccsesoBD.Gestor;
import ControlDAO.SitioDAO;
import Interf.SitioINTER;
import Molde.Nodo;
import Molde.Sitio;
import javax.swing.JOptionPane;

public class JDSitio extends javax.swing.JDialog {

    private int Tipo_Ope = 0;
    private Nodo nodo;
    private final String prefijo = "SIT-";
    private SitioINTER objSIT = new SitioDAO();

    public JDSitio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try {
            initComponents();
            setLocationRelativeTo(parent);
            Estado_Controles(false);
            objSIT.listar(table);
            cargarCombo();
        } catch (Exception e) {

        }

    }

    public void limpiar() {
        spnID.setValue(0);
        spnSitios.setValue(0);
        cboID.setSelectedIndex(-1);
    }

    public void cargarCombo() {
        try {
            objSIT.listar(cboID);
        } catch (Exception ex) {

        }
    }

    private void cargarElementos(Nodo<Object> actual) {
        if (actual != null) {
            Sitio obj = (Sitio) nodo.getDato();
            spnID.setValue(obj.getIdSitio());
            spnSitios.setValue(obj.getSitios());
            cboID.setSelectedItem(obj.getSitios() + "");
            nodo = actual;
        }
    }

    private void Estado_Controles(boolean estado) {
        cboID.setEnabled(estado);
        spnSitios.setEnabled(estado);
        spnID.setEnabled(estado);
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
        btn_Nuevo = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Registrar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        spnID = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        cboID = new javax.swing.JComboBox<>();
        spnSitios = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnBuscarHijos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btn_Nuevo.setText("Nuevo");
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });

        btn_Editar.setBackground(new java.awt.Color(255, 255, 204));
        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        btn_Registrar.setBackground(new java.awt.Color(0, 204, 255));
        btn_Registrar.setText("Registrar");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        btn_Eliminar.setBackground(new java.awt.Color(255, 102, 153));
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_Cerrar.setText("Cerrar");
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Datos de Sitio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sitios:");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id de Sitio:");

        spnID.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id de Orden:");

        spnSitios.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnID)
                            .addComponent(spnSitios)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cboID, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jLabel7)
                    .addComponent(spnSitios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        btnBuscarHijos.setText("Buscar Enlazamiento");
        btnBuscarHijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarHijosActionPerformed(evt);
            }
        });

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
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_Cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscarHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btn_Nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Registrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Eliminar)
                        .addGap(12, 12, 12)
                        .addComponent(btn_Cerrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarHijos)
                    .addComponent(jButton1)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        Estado_Controles(true);
        Tipo_Ope = 1;
    }//GEN-LAST:event_btn_NuevoActionPerformed

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

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        Estado_Controles(false);
        int id = (int) spnID.getValue();
        int sitios = (int) spnSitios.getValue();
        if (cboID.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Debe de selecionar un codigo Asociado");
            return;
        }
        int codigoOrden = Integer.parseInt(cboID.getSelectedItem().toString());

        Sitio s = new Sitio(id, sitios, codigoOrden);
        switch (Tipo_Ope) {
            case 1:
                if (Gestor.sistemita.repetir(prefijo + id)) {
                    Gestor.sistemita.agregarSitio("ORD-" + codigoOrden, s);
                } else {
                    JOptionPane.showMessageDialog(null, "El Código se esta repitiendo\n" + "No se puede ejecutar la Operacion");
                }
                break;
            case 2:
                spnID.setEnabled(true);
                Gestor.sistemita.editarSitio(s);
                break;
        }
        try {
            objSIT.listar(table);
        } catch (Exception ex) {

        }
        Tipo_Ope = 0;
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        Estado_Controles(false);
        Tipo_Ope = 0;
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int fila = table.getSelectedRow();
        if (fila != -1) {
            int rpta = JOptionPane.showConfirmDialog(rootPane, "Desea Eliminar?");
            if (rpta == JOptionPane.YES_OPTION) {
                int idSitio = Integer.parseInt(table.getValueAt(fila, 0).toString());
                nodo = Gestor.sistemita.buscarNodo(prefijo + idSitio);
                if (nodo == null) {
                    JOptionPane.showMessageDialog(null, "No se puede Eliminar");
                    return;
                }
                Sitio sit = (Sitio) nodo.getDato();
                Gestor.sistemita.eliminarSitio(sit);
                try {
                    objSIT.listar(table);
                } catch (Exception ex) {

                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un registro");
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void btnBuscarHijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarHijosActionPerformed
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresar dato"));
            Nodo<Object> nodo = Gestor.sistemita.buscarNodo(prefijo + id);
            if (nodo == null) {
                txtArea.setText("");
                return;
            }
            txtArea.setText("");
            Gestor.sistemita.imprimirNodo(nodo, 4, txtArea);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnBuscarHijosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            String id = JOptionPane.showInputDialog("Ingresar dato");
            Nodo s = Gestor.sistemita.buscarNodo(prefijo + id);
            if (s == null) {
                txtArea.setText("");
                JOptionPane.showMessageDialog(null, "No se encontro al Sitio con ID: " + id);
                return;
            }
            Sitio sit = (Sitio) s.getDato();
            txtArea.setText("=======SITIO======\n"
                    + "Clave: " + sit.getIdSitio() + "\n"
                    + "Sitio: " + sit.getSitios() + "\n"
                    + "Codigo Orden: " + sit.getCodigoOrden() + "\n"
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
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
            java.util.logging.Logger.getLogger(JDSitio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDSitio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDSitio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDSitio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                JDSitio dialog = new JDSitio(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscarHijos;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JComboBox<String> cboID;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spnID;
    private javax.swing.JSpinner spnSitios;
    private javax.swing.JTable table;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
