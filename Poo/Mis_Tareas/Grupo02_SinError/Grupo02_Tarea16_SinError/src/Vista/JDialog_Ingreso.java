package Vista;

import Control.Arreglo_Ingresos;
import Control.Arreglo_Personas;
import ControlDAO.IngresoDAO;
import ControlDAO.PersonaDAO;
import Modelo.Ingreso;
import Modelo.Persona;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JDialog_Ingreso extends javax.swing.JDialog {
  private int Tipo_Ope = 0;
    private Ingreso Elemento;
    private Arreglo_Personas objArregloPersona;
    private Arreglo_Ingresos objArregloIngreso;
    private DefaultComboBoxModel modCombo;
    private int contador_num = 1;
    private int contador_serie = 1;
    
    public JDialog_Ingreso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        
        objArregloPersona = new Arreglo_Personas(PersonaDAO.ContarRegistros());
        Actualizar_Combo();
        objArregloIngreso = new Arreglo_Ingresos();
        setLocationRelativeTo(parent);
        Actualizar_Tabla();
        Estado_Controles(false);
        txt_NumeroComprobante.setText(Ingreso.generarNumComprobante(contador_num));
        txt_SerieComprobante.setText(Ingreso.generarSerieComprobante(contador_serie));
    }

 public void Actualizar_Tabla() {
        IngresoDAO.ConsultarTodos(tbl_DatosIngreso, objArregloIngreso);
        txt_NumeroComprobante.setText(Ingreso.generarNumComprobante(contador_num));
        txt_SerieComprobante.setText(Ingreso.generarSerieComprobante(contador_serie));
    }

    public void Actualizar_Combo() {
        PersonaDAO.ConsultarTodos(cmb_Proveedor, objArregloPersona);
        modCombo = (DefaultComboBoxModel) cmb_Proveedor.getModel();
        
    }

    private void Estado_Controles(boolean estado) {
        cmb_Proveedor.setEnabled(estado);
        cmb_Tipo_Comprobante.setEnabled(estado);
        txt_Fecha_Hora.setEnabled(estado);
        cmb_Estado.setEnabled(estado);
        btn_Nuevo.setEnabled(!estado);
        btn_Editar.setEnabled(!estado);
        btn_Registrar.setEnabled(estado);
        btn_Cancelar.setEnabled(estado);
        btn_Eliminar.setEnabled(!estado);
        btn_Cerrar.setEnabled(!estado);
        tbl_DatosIngreso.setEnabled(!estado);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmb_Tipo_Comprobante = new javax.swing.JComboBox<>();
        txt_Fecha_Hora = new javax.swing.JTextField();
        cmb_Estado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmb_Proveedor = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_SerieComprobante = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_NumeroComprobante = new javax.swing.JTextField();
        btn_Cerrar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btn_Registrar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Nuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DatosIngreso = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Tipo de Comprobante:");

        jLabel2.setText("Fecha y hora:");

        jLabel3.setText("Estado:");

        cmb_Tipo_Comprobante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boleta", "Factura" }));

        txt_Fecha_Hora.setText("2025-07-18 12:00:00");

        cmb_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registrado", "Pagado", "Anulado" }));

        jLabel4.setText("Proveedor:");

        cmb_Proveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Serie de Comprobante:");

        txt_SerieComprobante.setEditable(false);
        txt_SerieComprobante.setBackground(new java.awt.Color(204, 204, 204));
        txt_SerieComprobante.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setText("Número de Comprobante:");

        txt_NumeroComprobante.setEditable(false);
        txt_NumeroComprobante.setBackground(new java.awt.Color(204, 204, 204));
        txt_NumeroComprobante.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Fecha_Hora, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                    .addComponent(cmb_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmb_Proveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_SerieComprobante))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_NumeroComprobante))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_Tipo_Comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmb_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_Tipo_Comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_SerieComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_NumeroComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Fecha_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        btn_Cerrar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Cerrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Cerrar.setText("Cerrar");
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });

        btn_Eliminar.setBackground(new java.awt.Color(255, 51, 102));
        btn_Eliminar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_Cancelar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Cancelar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        btn_Registrar.setBackground(new java.awt.Color(0, 204, 255));
        btn_Registrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Registrar.setText("Registrar");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        btn_Editar.setBackground(new java.awt.Color(255, 255, 204));
        btn_Editar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        btn_Nuevo.setBackground(new java.awt.Color(255, 255, 255));
        btn_Nuevo.setForeground(new java.awt.Color(0, 0, 0));
        btn_Nuevo.setText("Nuevo");
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });

        tbl_DatosIngreso.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_DatosIngreso);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Registrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(btn_Cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Cerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Registrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Cancelar)
                        .addGap(9, 9, 9)
                        .addComponent(btn_Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Cerrar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int fila = tbl_DatosIngreso.getSelectedRow();
        if (fila != -1) {
            int rpta = JOptionPane.showConfirmDialog(rootPane, "Desea Eliminar?");
            if (rpta == JOptionPane.YES_OPTION) {
                int idingreso = Integer.parseInt(tbl_DatosIngreso.getValueAt(fila, 0).toString());
                Elemento = new Ingreso();
                Elemento.setIdingreso(idingreso);
                IngresoDAO.Eliminar(Elemento);
                Actualizar_Tabla();
                Actualizar_Combo();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un registro");
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        Estado_Controles(false);
        Tipo_Ope = 0;
        cmb_Proveedor.setSelectedIndex(-1);
        cmb_Tipo_Comprobante.setSelectedIndex(-1);
        cmb_Estado.setSelectedIndex(-1);
        Actualizar_Combo();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        Estado_Controles(false);

  // int idproveedor = objArregloPersona.Buscar_Codigo(cmb_Proveedor.getSelectedItem().toString()).getIdpersona();

   int idproveedor = objArregloPersona.BuscarCodigo(Integer.parseInt(cmb_Proveedor.getSelectedItem().toString())).getIdpersona();
        
        String tipo_comprobante = cmb_Tipo_Comprobante.getSelectedItem().toString();
        String serie_comprobante = txt_SerieComprobante.getText();
        String num_comprobante = txt_NumeroComprobante.getText();
        String fecha_hora = txt_Fecha_Hora.getText();
        String estado = cmb_Estado.getSelectedItem().toString();

        switch (Tipo_Ope) {
            case 1:
            Elemento = new Ingreso();
            Elemento.setIdproveedor(idproveedor);
            Elemento.setTipo_comprobante(tipo_comprobante);
            Elemento.setSerie_comprobante(serie_comprobante);
            Elemento.setNum_comprobante(Ingreso.generarNumComprobante(contador_num));
            Elemento.setFecha_hora(fecha_hora);
            Elemento.setEstado(estado);
            IngresoDAO.Insertar(Elemento);
            contador_num++;
            contador_serie++;

            break;
            case 2:
            Elemento.setIdproveedor(idproveedor);
            Elemento.setTipo_comprobante(tipo_comprobante);
            Elemento.setSerie_comprobante(serie_comprobante);
            Elemento.setNum_comprobante(num_comprobante);
            Elemento.setFecha_hora(fecha_hora);
            Elemento.setEstado(estado);
            IngresoDAO.Actualizar(Elemento);

        }

        Actualizar_Combo();
        Actualizar_Tabla();
        txt_NumeroComprobante.setText(Ingreso.generarNumComprobante(contador_num));
        txt_SerieComprobante.setText(Ingreso.generarSerieComprobante(contador_serie));
        cmb_Proveedor.setSelectedIndex(-1);
        cmb_Tipo_Comprobante.setSelectedIndex(-1);

        cmb_Estado.setSelectedIndex(-1);
        Tipo_Ope = 0;
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        Estado_Controles(true);
        int fila = tbl_DatosIngreso.getSelectedRow();
        if (fila != -1) {
           int idingreso = Integer.parseInt(tbl_DatosIngreso.getValueAt(fila, 0).toString());
           int idproveedor = objArregloPersona.getDato(cmb_Proveedor.getSelectedIndex()).getIdpersona();
   //  int idproveedor = objArregloIngreso.BuscarCodigo(idingreso).getIdproveedor();

            String tipo_comprobante = tbl_DatosIngreso.getValueAt(fila, 2).toString();
            String serie_comprobante = tbl_DatosIngreso.getValueAt(fila, 3).toString();
            String num_comprobante = tbl_DatosIngreso.getValueAt(fila, 4).toString();
            String fecha_hora = tbl_DatosIngreso.getValueAt(fila, 5).toString();
            //String impuesto = tbl_DatosIngreso.getValueAt(fila, 6).toString();
            String estado = tbl_DatosIngreso.getValueAt(fila, 7).toString();
            Elemento = new Ingreso();
            Elemento.setIdingreso(idingreso);
            Elemento.setIdproveedor(idproveedor);
            Elemento.setTipo_comprobante(tipo_comprobante);
            Elemento.setSerie_comprobante(serie_comprobante);
            Elemento.setNum_comprobante(num_comprobante);
            Elemento.setFecha_hora(fecha_hora);
            Elemento.setEstado(estado);
            cmb_Proveedor.setSelectedItem(idproveedor);
            cmb_Tipo_Comprobante.setSelectedItem(tipo_comprobante);

            cmb_Estado.setSelectedItem(estado);

           String nombre_persona = objArregloPersona.BuscarCodigo(idproveedor).getNombre();

//            int indice = modCombo.getIndexOf(nombre_persona);
//            if (indice == -1) {
//                modCombo.addElement(nombre_persona);
//            }
//            cmb_Proveedor.setSelectedItem(nombre_persona);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un registro");
        }
        Tipo_Ope = 2;
        
        
        
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        Estado_Controles(true);
        Tipo_Ope = 1;
    }//GEN-LAST:event_btn_NuevoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JDialog_Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_Ingreso dialog = new JDialog_Ingreso(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JComboBox<String> cmb_Estado;
    private javax.swing.JComboBox<String> cmb_Proveedor;
    private javax.swing.JComboBox<String> cmb_Tipo_Comprobante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_DatosIngreso;
    private javax.swing.JTextField txt_Fecha_Hora;
    private javax.swing.JTextField txt_NumeroComprobante;
    private javax.swing.JTextField txt_SerieComprobante;
    // End of variables declaration//GEN-END:variables
}
