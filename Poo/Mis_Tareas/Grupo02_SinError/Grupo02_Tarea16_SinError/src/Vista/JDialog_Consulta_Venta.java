package Vista;

import Control.Arreglo_Articulo;
import Control.Arreglo_Detalle_Venta;
import Control.Arreglo_Venta;
import ControlDAO.Detalle_IngresoDAO;
import ControlDAO.ArticuloDAO;
import ControlDAO.VentaDAO;
import ControlDAO.Detalle_VentaDAO;
import Modelo.Detalle_Venta;
import Modelo.Venta;
import java.awt.Image;
import java.net.URL;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class JDialog_Consulta_Venta extends javax.swing.JDialog {
  private Arreglo_Articulo objArregloArticulo;
    private Arreglo_Detalle_Venta objArregloDetaVenta;
     private Arreglo_Venta objArregloVenta;
     private int Tipo_Ope = 0;
     private Detalle_Venta Elemento;
    
  
    
    public JDialog_Consulta_Venta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
          objArregloDetaVenta= new Arreglo_Detalle_Venta(Detalle_VentaDAO.ContarRegistros());
        setLocationRelativeTo(parent);
        objArregloArticulo= new Arreglo_Articulo();
        objArregloVenta= new Arreglo_Venta();
      Actualizar_Combo();
      Actualizar_Tabla();
     txt_Descuento.setText(0+"");
     Estado_Controles(false);
    }

     private void setImagen(JLabel label, String ruta) {
    URL imageUrl = getClass().getResource(ruta);
    if (imageUrl != null) {
        ImageIcon image = new ImageIcon(imageUrl);
        Icon icon = new ImageIcon(
            image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)
        );
        label.setIcon(icon);
        this.repaint();
    } else {
        
    }
}
    
 
public void Actualizar_Combo() {
VentaDAO.ConsultarTodosCombo(cbo_venta, objArregloVenta);
Detalle_IngresoDAO.ConsultarTodosA(cbo_articulo, objArregloArticulo);
     }
    private void Estado_Controles(boolean estado) {
        cbo_articulo.setEnabled(estado);
        cbo_venta.setEnabled(estado);
        txt_Cantidad.setEnabled(estado);
   
        txt_Descuento.setEnabled(estado);
        txt_Precio.setEnabled(estado);
   
  
        btn_Nuevo.setEnabled(!estado);
        btn_Editar.setEnabled(!estado);
        btn_Agregar.setEnabled(estado);
        btn_Cancelar.setEnabled(estado);
        btn_Eliminar.setEnabled(!estado);
        btn_Cerrar1.setEnabled(!estado);
    tbl_ConsultaVenta.setEnabled(!estado);
        
    }   
       public void Actualizar_Tabla() {
        Detalle_VentaDAO.ConsultarTodosTabla(tbl_ConsultaVenta, objArregloDetaVenta);
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_ConsultaVenta = new javax.swing.JTable();
        txt_Descuento = new javax.swing.JTextField();
        txt_Precio = new javax.swing.JTextField();
        txt_Cantidad = new javax.swing.JTextField();
        cbo_articulo = new javax.swing.JComboBox<>();
        cbo_venta = new javax.swing.JComboBox<>();
        btn_Nuevo = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Cerrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Detalle de las Ventas:");

        jLabel2.setText("Seleccione la venta:");

        jLabel4.setText("Seleccione el artículo:");

        jLabel5.setText("Cantidad:");

        jLabel6.setText("Precio:");

        jLabel7.setText("Descuento:");

        tbl_ConsultaVenta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_ConsultaVenta);

        cbo_articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_articuloActionPerformed(evt);
            }
        });

        cbo_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_ventaActionPerformed(evt);
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

        btn_Editar.setBackground(new java.awt.Color(255, 255, 204));
        btn_Editar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        btn_Agregar.setBackground(new java.awt.Color(204, 255, 255));
        btn_Agregar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
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

        btn_Eliminar.setBackground(new java.awt.Color(255, 102, 153));
        btn_Eliminar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_Cerrar1.setBackground(new java.awt.Color(255, 255, 255));
        btn_Cerrar1.setForeground(new java.awt.Color(0, 0, 0));
        btn_Cerrar1.setText("Cerrar");
        btn_Cerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cerrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_Descuento))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_Precio))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Cantidad))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbo_articulo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbo_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_Eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Editar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Nuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Cerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(cbo_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbo_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_Descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_Nuevo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_Editar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_Agregar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_Cancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_Eliminar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_Cerrar1)))
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_articuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_articuloActionPerformed

    }//GEN-LAST:event_cbo_articuloActionPerformed

    private void cbo_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_ventaActionPerformed

    }//GEN-LAST:event_cbo_ventaActionPerformed

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        Estado_Controles(true);
        Tipo_Ope = 1;
    }//GEN-LAST:event_btn_NuevoActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        Estado_Controles(true);
        int fila = tbl_ConsultaVenta.getSelectedRow();
        if (fila != -1) {
            int iddetalle_venta = Integer.parseInt(tbl_ConsultaVenta.getValueAt(fila, 0).toString());

            //int idingreso = objArregloIngreso.BuscarCodigo(Integer.parseInt( cmb_Compras.getSelectedItem().toString())).getIdingreso();
            //int idarticulo = objArregloArticulo.BuscarCodigo(Integer.parseInt(cmb_Articulo.getSelectedItem().toString())).getIdarticulo();
            int idventa = Integer.parseInt(tbl_ConsultaVenta.getValueAt(fila, 1).toString());
            int idarticulo = Integer.parseInt(tbl_ConsultaVenta.getValueAt(fila, 2).toString());

            int cantidad = Integer.parseInt(tbl_ConsultaVenta.getValueAt(fila, 3).toString() );

            double precio_venta = Double.parseDouble(tbl_ConsultaVenta.getValueAt(fila, 4).toString());
            double descuento = Double.parseDouble(tbl_ConsultaVenta.getValueAt(fila, 5).toString());

            Elemento = new Detalle_Venta();
            Elemento.setIddetalle_venta(iddetalle_venta);
            Elemento.setIdventa(idventa);
            Elemento.setIdarticulo(idarticulo);
            Elemento.setCantidad(cantidad);
            Elemento.setPrecio_venta(precio_venta);
            Elemento.setDescuento(descuento);

            /*   cbo_articulo.setSelectedItem(idarticulo);
            cbo_venta.setSelectedItem(idventa);
            txt_Cantidad.setText(cantidad + "");

            txt_Precio.setText(precio_venta+ "");
            txt_Descuento.setText(descuento+ "");*/

        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un registro");
        }
        Tipo_Ope = 2;

    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        int fila = tbl_ConsultaVenta.getSelectedRow();
        int iddetalle_venta =0;
        if(fila!=-1){
            iddetalle_venta = Integer.parseInt(tbl_ConsultaVenta.getValueAt(fila, 0).toString());
        }
        // int id_ingreso = objArregloPersona.Buscar_Codigo(cmb_Compras.getSelectedItem().toString()).getIdpersona();
        int id_venta = objArregloVenta.BuscarCodigo(Integer.parseInt( cbo_venta.getSelectedItem().toString())).getIdventa();

        int id_articulo = objArregloArticulo.BuscarCodigo(Integer.parseInt(cbo_articulo.getSelectedItem().toString())).getIdarticulo();

        int cantidad = Integer.parseInt(txt_Cantidad.getText());

        double precio_venta = Double.parseDouble(txt_Precio.getText());
        double descuento = Double.parseDouble(txt_Descuento.getText());

        switch (Tipo_Ope) {
            case 1:
            Elemento = new Detalle_Venta();

            //   Elemento.setIddetalle_ingreso(id_ingreso);
            Elemento.setIdventa(id_venta);
            Elemento.setIdarticulo(id_articulo);
            Elemento.setCantidad(cantidad);
            Elemento.setDescuento(descuento);
            Elemento.setPrecio_venta(precio_venta);
            Detalle_VentaDAO.Insertar(Elemento);
            Actualizar_Tabla();

            break;
            case 2:
            Elemento = new Detalle_Venta();
            Elemento.setIddetalle_venta(iddetalle_venta);
            Elemento.setIdventa(id_venta);
            Elemento.setIdarticulo(id_articulo);
            Elemento.setCantidad(cantidad);
            Elemento.setDescuento(descuento);
            Elemento.setPrecio_venta(precio_venta);
            Detalle_VentaDAO.Actualizar(Elemento);
            Actualizar_Tabla();

        }

        Tipo_Ope = 0;
        Actualizar_Combo();
        Actualizar_Tabla();

    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        Estado_Controles(false);
        Tipo_Ope = 0;
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int fila = tbl_ConsultaVenta.getSelectedRow();
        if (fila != -1) {
            int rpta = JOptionPane.showConfirmDialog(rootPane, "Desea Eliminar?");
            if (rpta == JOptionPane.YES_OPTION) {
                int idDetalleVenta = Integer.parseInt(tbl_ConsultaVenta.getValueAt(fila, 0).toString());
                Elemento = new Detalle_Venta();
                Elemento.setIddetalle_venta(idDetalleVenta);
                Detalle_VentaDAO.Eliminar(Elemento);
                Actualizar_Tabla();
                Actualizar_Combo();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un registro");
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_Cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cerrar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btn_Cerrar1ActionPerformed

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
            java.util.logging.Logger.getLogger(JDialog_Consulta_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_Consulta_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_Consulta_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_Consulta_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_Consulta_Venta dialog = new JDialog_Consulta_Venta(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Cerrar1;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JComboBox<String> cbo_articulo;
    private javax.swing.JComboBox<String> cbo_venta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_ConsultaVenta;
    private javax.swing.JTextField txt_Cantidad;
    private javax.swing.JTextField txt_Descuento;
    private javax.swing.JTextField txt_Precio;
    // End of variables declaration//GEN-END:variables
}
