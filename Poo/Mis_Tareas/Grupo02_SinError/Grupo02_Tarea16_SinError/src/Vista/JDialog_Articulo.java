package Vista;

import java.awt.Image;
import Control.Arreglo_Categoria;
import Control.Arreglo_Articulo;
import ControlDAO.ArticuloDAO;
import ControlDAO.CategoriaDAO;
import Modelo.Articulo;
import java.awt.image.ImagingOpException;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class JDialog_Articulo extends javax.swing.JDialog {

     private int Tipo_Ope = 0;
    private Articulo Elemento;
    private Arreglo_Articulo objarreglo_Articulo;
    private Arreglo_Categoria objarreglo_categoria;
    private DefaultComboBoxModel modCombo;
    public File archivoseleccionado;
    
    
    public JDialog_Articulo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setLocationRelativeTo(parent);
        objarreglo_categoria = new Arreglo_Categoria(CategoriaDAO.ContarRegistros());
        Actualizar_Combo();
        objarreglo_Articulo = new Arreglo_Articulo();
        Actualizar_Tabla();
        Estado_Controles(false); 
        
    }

 public void Actualizar_Tabla() {
        ArticuloDAO.ConsultarTodos(tbl_DatosArticulo, objarreglo_Articulo);
    }

    public void Actualizar_Combo() {
        CategoriaDAO.ConsultarTodos(cbo_categoria, objarreglo_categoria);
        modCombo = (DefaultComboBoxModel) cbo_categoria.getModel();
    }

    private void Estado_Controles(boolean estado) {
      txt_id.setEnabled(estado);
        txt_Codigo.setEnabled(estado);
        txt_Nombre.setEnabled(estado);
        txt_Stock.setEnabled(estado);
        txt_Descripcion.setEnabled(estado);
        txt_Imagen.setEnabled(estado);
        cmb_Estado.setEnabled(estado);
        btn_Nuevo.setEnabled(!estado);
        cbo_categoria.setEnabled(estado);
        btn_Editar.setEnabled(!estado);
        btn_Registrar.setEnabled(estado);
        btn_Cancelar.setEnabled(estado);
        btn_Eliminar.setEnabled(!estado);
        btn_Cerrar.setEnabled(!estado);
        tbl_DatosArticulo.setEnabled(!estado);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Codigo = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        txt_Stock = new javax.swing.JTextField();
        txt_Descripcion = new javax.swing.JTextField();
        txt_Imagen = new javax.swing.JTextField();
        cmb_Estado = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbo_categoria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btn_Eliminar = new javax.swing.JButton();
        btn_Nuevo = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Registrar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();
        btn_imagen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DatosArticulo = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_info_imagen = new javax.swing.JTextArea();
        lbl_imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Artículo"));

        jLabel1.setText("Código:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Stock:");

        jLabel4.setText("Descripción:");

        jLabel5.setText("Imagen:");

        jLabel6.setText("Estado:");

        cmb_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registrado", "Anulado" }));

        jLabel7.setText("Categoria:");

        jLabel8.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_id))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbo_categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Imagen)
                            .addComponent(cmb_Estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Descripcion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Stock))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Nombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbo_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Stock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Descripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12))
        );

        btn_Eliminar.setBackground(new java.awt.Color(255, 51, 51));
        btn_Eliminar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
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

        btn_Registrar.setBackground(new java.awt.Color(102, 255, 255));
        btn_Registrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Registrar.setText("Registrar");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
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

        btn_Cerrar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Cerrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Cerrar.setText("Cerrar");
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });

        btn_imagen.setText("Imagen");
        btn_imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imagenActionPerformed(evt);
            }
        });

        tbl_DatosArticulo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_DatosArticulo);

        txt_info_imagen.setColumns(20);
        txt_info_imagen.setRows(5);
        jScrollPane2.setViewportView(txt_info_imagen);

        lbl_imagen.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Registrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Cerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btn_Nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Cerrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_imagen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int fila = tbl_DatosArticulo.getSelectedRow();
        if (fila != -1) {
            int rpta = JOptionPane.showConfirmDialog(rootPane, "¿Desea Eliminar?");
            if (rpta == JOptionPane.YES_OPTION) {
                int idarticulo = Integer.parseInt(tbl_DatosArticulo.getValueAt(fila, 0) + "");
                Elemento = new Articulo();
                Elemento.setIdarticulo(idarticulo);
                ArticuloDAO.Eliminar(Elemento);
                Actualizar_Tabla();
                Actualizar_Combo();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un Registro");
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        Estado_Controles(true);
        txt_id.setText("");
        lbl_imagen.setIcon(null);
        cbo_categoria.setSelectedIndex(-1);
        txt_Codigo.setText(null);
        txt_Descripcion.setText(null);
        txt_Imagen.setText(null);
        txt_Stock.setText(null);

        cmb_Estado.setSelectedIndex(-1);

        Tipo_Ope = 1;

    }//GEN-LAST:event_btn_NuevoActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        Estado_Controles(true);
        int fila = tbl_DatosArticulo.getSelectedRow();
        if (fila != -1) {
            int idarticulo = Integer.parseInt(tbl_DatosArticulo.getValueAt(fila, 0).toString());
            int idcategoria = objarreglo_Articulo.BuscarCodigo(idarticulo).getIdcategoria();
            String codigo = tbl_DatosArticulo.getValueAt(fila, 2).toString();
            String nombre = tbl_DatosArticulo.getValueAt(fila, 3).toString();
            int stock = Integer.parseInt(tbl_DatosArticulo.getValueAt(fila, 4).toString());
            String descripcion = tbl_DatosArticulo.getValueAt(fila, 5).toString();
            Image imagen = (Image) tbl_DatosArticulo.getValueAt(fila, 6);
            ImageIcon original_icon = new ImageIcon(imagen);
            int anchura = lbl_imagen.getWidth();
            int altura = lbl_imagen.getHeight();
            Image escala = original_icon.getImage().getScaledInstance(anchura, altura, Image.SCALE_SMOOTH);
            lbl_imagen.setIcon(new ImageIcon(escala));
            String estado = tbl_DatosArticulo.getValueAt(fila, 7).toString();
            Elemento = new Articulo();
            Elemento.setIdarticulo(idarticulo);
            Elemento.setIdcategoria(idcategoria);
            Elemento.setCodigo(codigo);
            Elemento.setNombre(nombre);
            Elemento.setStock(stock);
            Elemento.setDescripcion(descripcion);
            Elemento.setImagen(archivoseleccionado);
            Elemento.setEstado(estado);
            cbo_categoria.setSelectedItem(idcategoria);
            cmb_Estado.setSelectedItem(estado);
            txt_id.setText(idarticulo + "");
            txt_Codigo.setText(codigo);
            txt_Nombre.setText(nombre);
            txt_Stock.setText(stock + "");
            txt_Descripcion.setText(descripcion);
            cmb_Estado.setSelectedItem(estado);
            lbl_imagen.setIcon(new ImageIcon(escala));
            String nombre_categoria = objarreglo_categoria.BuscarCodigo(idcategoria).getNombre();
            int indice = modCombo.getIndexOf(nombre_categoria);
            if (indice == -1) {
                modCombo.addElement(nombre_categoria);
            }
            cbo_categoria.setSelectedItem(nombre_categoria);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un Registro");
        }
        Tipo_Ope = 2;
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        Estado_Controles(false);

        int idarticulo = Integer.parseInt(txt_id.getText());
        int idcategoria = objarreglo_categoria.Buscar_Codigo(cbo_categoria.getSelectedItem().toString()).getIdcategoria();
        String codigo = txt_Codigo.getText();
        String nombre = txt_Nombre.getText();
        int stock = Integer.parseInt(txt_Stock.getText());
        String descripcion = txt_Descripcion.getText();
        //String imagen = txt_Imagen.getText();
        String estado = cmb_Estado.getSelectedItem() + "";
        switch (Tipo_Ope) {
            case 1:
            Elemento = new Articulo();
            Elemento.setIdarticulo(idarticulo);
            Elemento.setIdcategoria(idcategoria);
            Elemento.setCodigo(codigo);
            Elemento.setNombre(nombre);
            Elemento.setStock(stock);
            Elemento.setDescripcion(descripcion);
            Elemento.setImagen(archivoseleccionado);
            Elemento.setEstado(estado);
            ArticuloDAO.Insertar(Elemento);

            break;
            case 2:
            //Elemento = new Articulo();
            Elemento.setIdarticulo(idarticulo);
            Elemento.setIdcategoria(idcategoria);
            Elemento.setCodigo(codigo);
            Elemento.setNombre(nombre);
            Elemento.setStock(stock);
            Elemento.setDescripcion(descripcion);
            Elemento.setImagen(archivoseleccionado);
            Elemento.setEstado(estado);
            ArticuloDAO.Actualizar(Elemento);

            break;
        }
        Actualizar_Combo();
        Actualizar_Tabla();
        cbo_categoria.setSelectedIndex(-1);
        cmb_Estado.setSelectedIndex(-1);
        Tipo_Ope = 0;
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        Estado_Controles(false);
        Tipo_Ope = 0;
        txt_id.setText("");
        txt_Nombre.setText("");
        txt_Codigo.setText("");
        txt_Stock.setText("");
        txt_Descripcion.setText("");
        txt_Imagen.setText("");
        cbo_categoria.setSelectedIndex(-1);
        cmb_Estado.setSelectedIndex(-1);
        lbl_imagen.setIcon(null);
        Actualizar_Combo();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void btn_imagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imagenActionPerformed
        JFileChooser filechooser = new JFileChooser();
        int result = filechooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            archivoseleccionado = filechooser.getSelectedFile();
            txt_Imagen.setText(archivoseleccionado.getName());
            try {
                Image img = ImageIO.read(archivoseleccionado);
                ImageIcon original_icon = new ImageIcon(img);
                int anchura = lbl_imagen.getWidth();
                int altura = lbl_imagen.getHeight();
                Image escala = original_icon.getImage().getScaledInstance(anchura, altura, Image.SCALE_SMOOTH);
                lbl_imagen.setIcon(new ImageIcon(escala));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al cargar imagen: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_imagenActionPerformed

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
            java.util.logging.Logger.getLogger(JDialog_Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_Articulo dialog = new JDialog_Articulo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_imagen;
    private javax.swing.JComboBox<String> cbo_categoria;
    private javax.swing.JComboBox<String> cmb_Estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JTable tbl_DatosArticulo;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_Descripcion;
    private javax.swing.JTextField txt_Imagen;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Stock;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextArea txt_info_imagen;
    // End of variables declaration//GEN-END:variables
}
