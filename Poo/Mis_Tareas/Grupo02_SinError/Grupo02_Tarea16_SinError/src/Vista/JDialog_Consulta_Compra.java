package Vista;

import Control.Arreglo_Articulo;
import Control.Arreglo_Detalle_Ingreso;
import Control.Arreglo_Ingresos;
import Control.Arreglo_Personas;
import ControlDAO.ArticuloDAO;
import ControlDAO.IngresoDAO;
import ControlDAO.Detalle_IngresoDAO;
import ControlDAO.PersonaDAO;
import Modelo.Detalle_Ingreso;
import Modelo.Ingreso;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JDialog_Consulta_Compra extends javax.swing.JDialog {
  private Arreglo_Detalle_Ingreso DIarreglo;
  private Arreglo_Ingresos arreglo;
  private Arreglo_Personas objArregloPersona;
  private Arreglo_Ingresos objArregloIngreso;
  private Arreglo_Articulo objArregloArticulo;
  private Detalle_Ingreso Elemento;
  private int Tipo_Ope = 0;
    
    
    public JDialog_Consulta_Compra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
      this.setLocationRelativeTo(null);
DIarreglo= new Arreglo_Detalle_Ingreso(Detalle_IngresoDAO.ContarRegistros());
objArregloIngreso = new Arreglo_Ingresos();
objArregloPersona = new Arreglo_Personas(PersonaDAO.ContarRegistros());
objArregloArticulo= new Arreglo_Articulo();
  Actualizar_Combo();
  Actualizar_Tabla();
  Estado_Controles(false);
    
        
        
    }
public void Actualizar_Combo() {
    //    PersonaDAO.ConsultarTodos(cmb_Compras, objArregloPersona);
    IngresoDAO.ConsultarTodos(cmb_Compras, objArregloIngreso);
    Detalle_IngresoDAO.ConsultarTodosA(cmb_Articulo, objArregloArticulo);
        }
     private void Estado_Controles(boolean estado) {
        cmb_Articulo.setEnabled(estado);
        cmb_Compras.setEnabled(estado);
        txt_PrecioCompra.setEnabled(estado);
   
        txt_PrecioVenta.setEnabled(estado);
        txt_cantidad.setEnabled(estado);
  
        btn_Nuevo.setEnabled(!estado);
        btn_Editar.setEnabled(!estado);
        btn_Agregar.setEnabled(estado);
        btn_Cancelar.setEnabled(estado);
        btn_Eliminar.setEnabled(!estado);
        btn_Cerrar.setEnabled(!estado);
        tbl_ConsultaCompra.setEnabled(!estado);
    }   
    
     
      public void Actualizar_Tabla() {
        Detalle_IngresoDAO.ConsultarTodosTabla(tbl_ConsultaCompra, DIarreglo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_PrecioVenta = new javax.swing.JTextField();
        txt_PrecioCompra = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        cmb_Articulo = new javax.swing.JComboBox<>();
        cmb_Compras = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_ConsultaCompra = new javax.swing.JTable();
        btn_Cerrar = new javax.swing.JButton();
        btn_Cerrar1 = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Nuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Detalle de las Compras:");

        jLabel2.setText("Id_Ingreso:");

        jLabel3.setText("Id_Articulo:");

        jLabel4.setText("Cantidad:");

        jLabel5.setText("Precio_Compra:");

        jLabel6.setText("Precio_Venta:");

        cmb_Articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ArticuloActionPerformed(evt);
            }
        });

        cmb_Compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ComprasActionPerformed(evt);
            }
        });

        tbl_ConsultaCompra.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_ConsultaCompra);

        btn_Cerrar.setText("Cerrar");
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
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

        btn_Eliminar.setBackground(new java.awt.Color(255, 102, 153));
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

        btn_Agregar.setBackground(new java.awt.Color(204, 255, 255));
        btn_Agregar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Cerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmb_Articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_PrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_PrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmb_Compras, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(btn_Agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Editar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Nuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Cerrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_Compras, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_Articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txt_PrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_PrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Cerrar)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_ArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ArticuloActionPerformed

    }//GEN-LAST:event_cmb_ArticuloActionPerformed

    private void cmb_ComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ComprasActionPerformed

    }//GEN-LAST:event_cmb_ComprasActionPerformed

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void btn_Cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cerrar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btn_Cerrar1ActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int fila = tbl_ConsultaCompra.getSelectedRow();
        if (fila != -1) {
            int rpta = JOptionPane.showConfirmDialog(rootPane, "Desea Eliminar?");
            if (rpta == JOptionPane.YES_OPTION) {
                int idDetalleVenta = Integer.parseInt(tbl_ConsultaCompra.getValueAt(fila, 0).toString());
                Elemento = new Detalle_Ingreso();
                Elemento.setIddetalle_ingreso(idDetalleVenta);
                Detalle_IngresoDAO.Eliminar(Elemento);
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
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        int fila = tbl_ConsultaCompra.getSelectedRow();
        int iddetalle_venta = Integer.parseInt(tbl_ConsultaCompra.getValueAt(fila, 0).toString());
        // int id_ingreso = objArregloPersona.Buscar_Codigo(cmb_Compras.getSelectedItem().toString()).getIdpersona();
        int id_ingreso = objArregloIngreso.BuscarCodigo(Integer.parseInt( cmb_Compras.getSelectedItem().toString())).getIdingreso();

        int id_articulo = objArregloArticulo.BuscarCodigo(Integer.parseInt(cmb_Articulo.getSelectedItem().toString())).getIdarticulo();

        int cantidad = Integer.parseInt(txt_cantidad.getText());

        double precio_compra = Double.parseDouble(txt_PrecioCompra.getText());
        double precio_venta = Double.parseDouble(txt_PrecioVenta.getText());

        switch (Tipo_Ope) {
            case 1:
            Elemento = new Detalle_Ingreso();

            //   Elemento.setIddetalle_ingreso(id_ingreso);
            Elemento.setIdingreso(id_ingreso);
            Elemento.setIdarticulo(id_articulo);
            Elemento.setCantidad(cantidad);
            Elemento.setPrecio_compra(precio_compra);
            Elemento.setPrecio_venta(precio_venta);
            Detalle_IngresoDAO.Insertar(Elemento);
            Actualizar_Tabla();

            break;
            case 2:
            Elemento = new Detalle_Ingreso();
            Elemento.setCantidad(cantidad);
            Elemento.setIdarticulo(id_articulo);
            Elemento.setIddetalle_ingreso(iddetalle_venta);
            Elemento.setIdingreso(id_ingreso);
            Elemento.setPrecio_compra(precio_compra);
            Elemento.setPrecio_venta(precio_venta);
            Detalle_IngresoDAO.Actualizar(Elemento);
            Actualizar_Tabla();

        }

        Tipo_Ope = 0;
        Actualizar_Combo();
        Actualizar_Tabla();
        cmb_Compras.setSelectedIndex(-1);
        cmb_Articulo.setSelectedIndex(-1);

    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        Estado_Controles(true);
        int fila = tbl_ConsultaCompra.getSelectedRow();
        if (fila != -1) {
            int iddetalle_venta = Integer.parseInt(tbl_ConsultaCompra.getValueAt(fila, 0).toString());
            //int idingreso = objArregloIngreso.BuscarCodigo(Integer.parseInt( cmb_Compras.getSelectedItem().toString())).getIdingreso();
            // int idarticulo = objArregloArticulo.BuscarCodigo(Integer.parseInt(cmb_Articulo.getSelectedItem().toString())).getIdarticulo();
            int idingreso = Integer.parseInt(tbl_ConsultaCompra.getValueAt(fila, 1).toString());
            int idarticulo = Integer.parseInt(tbl_ConsultaCompra.getValueAt(fila, 2).toString());

            int cantidad = Integer.parseInt(tbl_ConsultaCompra.getValueAt(fila, 3).toString() );
            //int cantidad = (int)valor_cantidad;
            double precio_compra = Double.parseDouble(tbl_ConsultaCompra.getValueAt(fila, 4).toString());
            double precio_venta = Double.parseDouble(tbl_ConsultaCompra.getValueAt(fila, 5).toString());

            Elemento = new Detalle_Ingreso();
            Elemento.setIddetalle_ingreso(iddetalle_venta);
            Elemento.setIdingreso(idingreso);
            Elemento.setIdarticulo(idarticulo);
            Elemento.setCantidad(cantidad);
            Elemento.setPrecio_compra(precio_compra);
            Elemento.setPrecio_venta(precio_venta);

            cmb_Articulo.setSelectedItem(idarticulo);
            cmb_Compras.setSelectedItem(idingreso);
            txt_cantidad.setText(cantidad + "");

            txt_PrecioCompra.setText(precio_compra+ "");
            txt_PrecioVenta.setText(precio_venta+ "");

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
            java.util.logging.Logger.getLogger(JDialog_Consulta_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_Consulta_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_Consulta_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_Consulta_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_Consulta_Compra dialog = new JDialog_Consulta_Compra(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Cerrar1;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JComboBox<String> cmb_Articulo;
    private javax.swing.JComboBox<String> cmb_Compras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_ConsultaCompra;
    private javax.swing.JTextField txt_PrecioCompra;
    private javax.swing.JTextField txt_PrecioVenta;
    private javax.swing.JTextField txt_cantidad;
    // End of variables declaration//GEN-END:variables
}
