package Vista;

import Control.Arreglo;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class JFrame_Principal extends javax.swing.JFrame {

    Arreglo objArreglo = new Arreglo();

    public JFrame_Principal() {
        initComponents();

        objArreglo.Listar(list_datosPasajeros);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        list_datosPasajeros = new javax.swing.JList<>();
        btn_Agregar = new javax.swing.JButton();
        txt_Nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Destino = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Precio_Pasaje = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta_Datos = new javax.swing.JTextArea();
        btn_Ejecutar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btn_Preguntar = new javax.swing.JButton();
        txt_cantidad_Boletos = new javax.swing.JTextField();
        txt_NumeroAsiento = new javax.swing.JTextField();
        txt_CantidadBoleto = new javax.swing.JTextField();
        spn_Fecha_Venta = new javax.swing.JSpinner();
        spn_Fecha_Viaje = new javax.swing.JSpinner();
        cbo_Fecha_Venta = new javax.swing.JComboBox<>();
        cbo_Fecha_Viaje = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        list_datosPasajeros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(list_datosPasajeros);

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        txt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NombreKeyTyped(evt);
            }
        });

        jLabel1.setText("Nombre :");

        jLabel2.setText("Fecha de venta :");

        jLabel3.setText("Fecha de viaje : ");

        jLabel4.setText("Destino :");

        txt_Destino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DestinoKeyTyped(evt);
            }
        });

        jLabel5.setText("Precio del pasaje :");

        txt_Precio_Pasaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Precio_PasajeKeyTyped(evt);
            }
        });

        jLabel6.setText("Numero de asiento :");

        txta_Datos.setColumns(20);
        txta_Datos.setRows(5);
        jScrollPane2.setViewportView(txta_Datos);

        btn_Ejecutar.setText("Ejecutar");
        btn_Ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EjecutarActionPerformed(evt);
            }
        });

        jLabel7.setText("Cantidad de boletos :");

        btn_Preguntar.setText("Preguntar");
        btn_Preguntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PreguntarActionPerformed(evt);
            }
        });

        txt_cantidad_Boletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidad_BoletosActionPerformed(evt);
            }
        });

        txt_NumeroAsiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NumeroAsientoKeyTyped(evt);
            }
        });

        txt_CantidadBoleto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CantidadBoletoKeyTyped(evt);
            }
        });

        cbo_Fecha_Venta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        cbo_Fecha_Viaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_Nombre))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_Destino))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_Precio_Pasaje)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_NumeroAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_CantidadBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(spn_Fecha_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spn_Fecha_Viaje, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbo_Fecha_Viaje, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbo_Fecha_Venta, 0, 1, Short.MAX_VALUE))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addComponent(btn_Ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(txt_cantidad_Boletos, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Preguntar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Agregar)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(spn_Fecha_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_Fecha_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(spn_Fecha_Viaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_Fecha_Viaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_Precio_Pasaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_NumeroAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_CantidadBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Ejecutar)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cantidad_Boletos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Preguntar))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        String destino = txt_Destino.getText();
        String nombre = txt_Nombre.getText().trim();
        String mesVenta = cbo_Fecha_Venta.getSelectedItem().toString();
        String mesViaje = cbo_Fecha_Viaje.getSelectedItem().toString();
        int fechaventa = (int) spn_Fecha_Venta.getValue();
        int fechaviaje = (int) spn_Fecha_Viaje.getValue();
        int cantidadboleto = Integer.parseInt(txt_CantidadBoleto.getText());
        int numeroAsiento = Integer.parseInt(txt_NumeroAsiento.getText());
        int precioPasaje = Integer.parseInt(txt_Precio_Pasaje.getText());
        if (fechaventa > 1 && fechaventa <= 31 && fechaviaje > 1 && fechaviaje <= 31) {
            String Datos = nombre + "," + fechaventa + "," + fechaviaje + "," + destino + "," + precioPasaje + "," + numeroAsiento + "," + cantidadboleto;
            objArreglo.Agregar(Datos);
            objArreglo.Listar(list_datosPasajeros);
        } else {
            JOptionPane.showMessageDialog(this, "Registrar dias validos");
        }


    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void txt_cantidad_BoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidad_BoletosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidad_BoletosActionPerformed

    private void btn_PreguntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PreguntarActionPerformed
        int cantidad = objArreglo.getTotal();
        txt_cantidad_Boletos.setText(String.valueOf(cantidad));
    }//GEN-LAST:event_btn_PreguntarActionPerformed

    private void btn_EjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EjecutarActionPerformed
        String destino = txt_Destino.getText().trim();
        if (destino.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingresar destino para buscar igualdad");
            return;
        }
        String resultado = objArreglo.SimilarFinal(destino);
        if (resultado.isEmpty()) {
            txta_Datos.setText("No existen datos similares");
        } else {
            txta_Datos.setText("similares : \n" + resultado);
        }
    }//GEN-LAST:event_btn_EjecutarActionPerformed

    private void txt_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NombreKeyTyped
        char efe = evt.getKeyChar();
        if (!Character.isLetter(efe)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_NombreKeyTyped

    private void txt_DestinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DestinoKeyTyped
        char des = evt.getKeyChar();
        if (!Character.isLetter(des)) {
            evt.consume();
    }//GEN-LAST:event_txt_DestinoKeyTyped
    }
    private void txt_Precio_PasajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Precio_PasajeKeyTyped
        char pre = evt.getKeyChar();
        if (!Character.isDigit(pre)) {
            evt.consume();
    }//GEN-LAST:event_txt_Precio_PasajeKeyTyped
    }
    private void txt_NumeroAsientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NumeroAsientoKeyTyped
        char asd = evt.getKeyChar();
        if (!Character.isDigit(asd)) {
            evt.consume();
    }//GEN-LAST:event_txt_NumeroAsientoKeyTyped
    }
    private void txt_CantidadBoletoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CantidadBoletoKeyTyped

        char cant = evt.getKeyChar();
        if (!Character.isDigit(cant)) {
            evt.consume();
    }//GEN-LAST:event_txt_CantidadBoletoKeyTyped
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
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Ejecutar;
    private javax.swing.JButton btn_Preguntar;
    private javax.swing.JComboBox<String> cbo_Fecha_Venta;
    private javax.swing.JComboBox<String> cbo_Fecha_Viaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> list_datosPasajeros;
    private javax.swing.JSpinner spn_Fecha_Venta;
    private javax.swing.JSpinner spn_Fecha_Viaje;
    private javax.swing.JTextField txt_CantidadBoleto;
    private javax.swing.JTextField txt_Destino;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_NumeroAsiento;
    private javax.swing.JTextField txt_Precio_Pasaje;
    private javax.swing.JTextField txt_cantidad_Boletos;
    private javax.swing.JTextArea txta_Datos;
    // End of variables declaration//GEN-END:variables
}
