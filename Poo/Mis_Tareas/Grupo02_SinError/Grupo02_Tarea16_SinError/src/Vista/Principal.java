
package Vista;

import AccesoBD.ConectaBD;
import java.awt.Image;
import java.net.URL;
import java.sql.Connection;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    
 Login objLogin = new Login();
   
    public Principal() {
        initComponents();
         this.setLocationRelativeTo(null);
        objLogin.dispose();
        objLogin.setVisible(false);

        Connection cn = ConectaBD.ObtenerConexion();
        if (cn != null) {
            JOptionPane.showMessageDialog(null, "Conexión Exitosa");
        }
        
      //Imagenes  
   setImagen(label_usuario, "/Recuadros/Usuario.jpg");
    setImagen(label_categoria,"/Recuadros/Categoria.png");
    setImagen(label_articulo, "/Recuadros/Articulo.png");
    setImagen(label_compra, "/Recuadros/Compra.png");
    setImagen(label_venta, "/Recuadros/Venta.png");
    setImagen(label_proveedores, "/Recuadros/Proveedores.png");
    setImagen(label_clientes, "/Recuadros/Clientes.jpg");   
        
        
        
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
        System.out.println("Imagen no encontrada: " + ruta);
    }
}
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        label_usuario = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        label_categoria = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label_articulo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        label_clientes = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        label_proveedores = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        label_venta = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        label_compra = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        M_salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        M_usuarios = new javax.swing.JMenuItem();
        M_categoria = new javax.swing.JMenuItem();
        M_articulos = new javax.swing.JMenuItem();
        M_clientes = new javax.swing.JMenuItem();
        M_proveedores = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        M_compras = new javax.swing.JMenuItem();
        M_ventas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        M_consultaCompra = new javax.swing.JMenuItem();
        M_consultaVenta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuarios");

        label_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_usuarioMouseClicked(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Categoria");

        label_categoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_categoriaMouseClicked(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Articulo");

        label_articulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_articulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_articuloMouseClicked(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Clientes");

        label_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_clientesMouseClicked(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Proveedores");

        label_proveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_proveedoresMouseClicked(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Venta");

        label_venta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_ventaMouseClicked(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Compra");

        label_compra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_compra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_compraMouseClicked(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("Archivo");

        M_salir.setText("Salir");
        M_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_salirActionPerformed(evt);
            }
        });
        jMenu1.add(M_salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mantenimiento");

        M_usuarios.setText("Usuarios");
        M_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_usuariosActionPerformed(evt);
            }
        });
        jMenu2.add(M_usuarios);

        M_categoria.setText("Categoría");
        M_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_categoriaActionPerformed(evt);
            }
        });
        jMenu2.add(M_categoria);

        M_articulos.setText("Articulos");
        M_articulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_articulosActionPerformed(evt);
            }
        });
        jMenu2.add(M_articulos);

        M_clientes.setText("Clientes");
        M_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_clientesActionPerformed(evt);
            }
        });
        jMenu2.add(M_clientes);

        M_proveedores.setText("Proveedores");
        M_proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_proveedoresActionPerformed(evt);
            }
        });
        jMenu2.add(M_proveedores);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Operaciones");

        M_compras.setText("Compras");
        M_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_comprasActionPerformed(evt);
            }
        });
        jMenu3.add(M_compras);

        M_ventas.setText("Ventas");
        M_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_ventasActionPerformed(evt);
            }
        });
        jMenu3.add(M_ventas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Reportes");

        M_consultaCompra.setText("Consulta de Compras");
        M_consultaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_consultaCompraActionPerformed(evt);
            }
        });
        jMenu4.add(M_consultaCompra);

        M_consultaVenta.setText("Consulta de Ventas");
        M_consultaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_consultaVentaActionPerformed(evt);
            }
        });
        jMenu4.add(M_consultaVenta);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(22, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_articulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addComponent(label_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void M_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_M_salirActionPerformed

    private void M_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_usuariosActionPerformed
        JDialog_Users objVentanaU = new JDialog_Users(this, true);
        objVentanaU.setVisible(true);
    }//GEN-LAST:event_M_usuariosActionPerformed

    private void M_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_categoriaActionPerformed
        JDialog_Categoria objVentanaC = new JDialog_Categoria(this, true);
        objVentanaC.setVisible(true);
    }//GEN-LAST:event_M_categoriaActionPerformed

    private void M_articulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_articulosActionPerformed
        JDialog_Articulo objVentanaA = new JDialog_Articulo(this, true);
        objVentanaA.setVisible(true);
    }//GEN-LAST:event_M_articulosActionPerformed

    private void M_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_clientesActionPerformed
        JDialog_Cliente objVentanaCliente = new JDialog_Cliente(this, true);
        objVentanaCliente.setVisible(true);
    }//GEN-LAST:event_M_clientesActionPerformed

    private void M_proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_proveedoresActionPerformed
        JDialog_Proveedor objVentanaP = new JDialog_Proveedor(this, true);
        objVentanaP.setVisible(true);
    }//GEN-LAST:event_M_proveedoresActionPerformed

    private void M_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_comprasActionPerformed
        JDialog_Ingreso objVentanaI = new JDialog_Ingreso(this, true);
        objVentanaI.setVisible(true);
    }//GEN-LAST:event_M_comprasActionPerformed

    private void M_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_ventasActionPerformed
        JDialog_Venta objVentanaV = new JDialog_Venta(this, true);
        objVentanaV.setVisible(true);
    }//GEN-LAST:event_M_ventasActionPerformed

    private void M_consultaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_consultaCompraActionPerformed
        JDialog_Consulta_Compra objVentanaI = new JDialog_Consulta_Compra(this, true);
        objVentanaI.setVisible(true);
    }//GEN-LAST:event_M_consultaCompraActionPerformed

    private void M_consultaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_consultaVentaActionPerformed
        JDialog_Consulta_Venta objVentanaI = new JDialog_Consulta_Venta(this, true);
        objVentanaI.setVisible(true);
    }//GEN-LAST:event_M_consultaVentaActionPerformed

    private void label_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_usuarioMouseClicked
        JDialog_Users objVentanaU = new JDialog_Users(this, true);
        objVentanaU.setVisible(true);

    }//GEN-LAST:event_label_usuarioMouseClicked

    private void label_categoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_categoriaMouseClicked
        JDialog_Categoria objVentanaC = new JDialog_Categoria(this, true);
        objVentanaC.setVisible(true);

    }//GEN-LAST:event_label_categoriaMouseClicked

    private void label_articuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_articuloMouseClicked
        JDialog_Articulo objVentanaA = new JDialog_Articulo(this, true);
        objVentanaA.setVisible(true);

    }//GEN-LAST:event_label_articuloMouseClicked

    private void label_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_clientesMouseClicked
        JDialog_Cliente objVentanaCliente = new JDialog_Cliente(this, true);
        objVentanaCliente.setVisible(true);

    }//GEN-LAST:event_label_clientesMouseClicked

    private void label_proveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_proveedoresMouseClicked
        JDialog_Proveedor objVentanaP = new JDialog_Proveedor(this, true);
        objVentanaP.setVisible(true);

    }//GEN-LAST:event_label_proveedoresMouseClicked

    private void label_ventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ventaMouseClicked
        JDialog_Venta objVentanaV = new JDialog_Venta(this, true);
        objVentanaV.setVisible(true);

    }//GEN-LAST:event_label_ventaMouseClicked

    private void label_compraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_compraMouseClicked
        JDialog_Ingreso objVentanaI = new JDialog_Ingreso(this, true);
        objVentanaI.setVisible(true);

    }//GEN-LAST:event_label_compraMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem M_articulos;
    private javax.swing.JMenuItem M_categoria;
    private javax.swing.JMenuItem M_clientes;
    private javax.swing.JMenuItem M_compras;
    private javax.swing.JMenuItem M_consultaCompra;
    private javax.swing.JMenuItem M_consultaVenta;
    private javax.swing.JMenuItem M_proveedores;
    private javax.swing.JMenuItem M_salir;
    private javax.swing.JMenuItem M_usuarios;
    private javax.swing.JMenuItem M_ventas;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel label_articulo;
    private javax.swing.JLabel label_categoria;
    private javax.swing.JLabel label_clientes;
    private javax.swing.JLabel label_compra;
    private javax.swing.JLabel label_proveedores;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JLabel label_venta;
    // End of variables declaration//GEN-END:variables
}
