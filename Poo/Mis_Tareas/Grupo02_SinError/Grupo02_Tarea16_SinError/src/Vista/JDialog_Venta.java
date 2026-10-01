package Vista;

import Control.Arreglo_Personas;
import Control.Arreglo_Users;
import Control.Arreglo_Venta;
import ControlDAO.VentaDAO;

import ControlDAO.PersonaDAO;
import ControlDAO.UsersDAO;

import Modelo.Venta;
import javax.swing.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JDialog_Venta extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JDialog_Venta.class.getName());

  private int Tipo_Ope = 0;
    private Venta Elemento;
    private Arreglo_Personas objArregloPersona;
    private Arreglo_Venta objArregloVenta;
    private Arreglo_Users objArregloUsers;
    private DefaultComboBoxModel modCombo;
    private DefaultComboBoxModel modComboU;
    private int contador_num = 1;
    private int contador_serie = 1;

    public JDialog_Venta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
          setLocationRelativeTo(parent);
        
        objArregloPersona = new Arreglo_Personas(PersonaDAO.ContarRegistros());
        objArregloUsers = new Arreglo_Users(UsersDAO.ContarRegistros());
        Actualizar_Combo();
        objArregloVenta = new Arreglo_Venta();
        setLocationRelativeTo(parent);
        Actualizar_Tabla();
        Estado_Controles(false);

       txt_NumeroComprobante.setText(Venta.generarNumComprobante(contador_num));
       txt_SerieComprobante.setText(Venta.generarSerieComprobante(contador_serie));
        
    }
   private void Actualizar_Tabla() {
        VentaDAO.ConsultarTodos(tbl_DatosVenta, objArregloVenta);
        txt_NumeroComprobante.setText(Venta.generarNumComprobante(contador_num));
        txt_SerieComprobante.setText(Venta.generarSerieComprobante(contador_serie));
    }
    
    public void Actualizar_Combo() {
        PersonaDAO.ConsultarTodos2(cmb_Cliente, objArregloPersona);
        UsersDAO.ConsultarTodosU(cmb_Usuario, objArregloUsers);
        modCombo = (DefaultComboBoxModel) cmb_Cliente.getModel();
        modComboU = (DefaultComboBoxModel) cmb_Usuario.getModel();
    }

    private void Estado_Controles(boolean estado) {
        cmb_TipoComprobante.setEnabled(estado);
        txt_SerieComprobante.setEnabled(estado);
        txt_NumeroComprobante.setEnabled(estado);
        txt_Fecha_Hora.setEnabled(false);
        cmb_Cliente.setEnabled(estado);
  //      btn_AgregarArticulo.setEnabled(estado);

        btn_Nuevo.setEnabled(!estado);
        btn_Registrar.setEnabled(estado);
        btn_Editar.setEnabled(!estado);
        btn_Eliminar.setEnabled(!estado);
        btn_Cerrar.setEnabled(!estado);
        tbl_DatosVenta.setEnabled(!estado);
    }

    private void limpiarControles() {
        cmb_TipoComprobante.setSelectedIndex(-1);
        cmb_Cliente.setSelectedIndex(-1);
        txt_Fecha_Hora.setText(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmb_TipoComprobante = new javax.swing.JComboBox<>();
        txt_Fecha_Hora = new javax.swing.JTextField();
        cmb_Estado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmb_Usuario = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_SerieComprobante = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_NumeroComprobante = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmb_Cliente = new javax.swing.JComboBox<>();
        btn_Nuevo = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Registrar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DatosVenta = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Tipo de Comprobante:");

        jLabel2.setText("Fecha y hora:");

        jLabel3.setText("Estado:");

        cmb_TipoComprobante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boleta", "Factura" }));

        txt_Fecha_Hora.setText("2025-07-18 12:00:00");

        cmb_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registrado", "Pagado", "Anulado" }));

        jLabel4.setText("Ususario:");

        cmb_Usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Serie de Comprobante:");

        txt_SerieComprobante.setEditable(false);
        txt_SerieComprobante.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setText("Número de Comprobante:");

        txt_NumeroComprobante.setEditable(false);
        txt_NumeroComprobante.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setText("Cliente:");

        cmb_Cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Fecha_Hora))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmb_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmb_Usuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_SerieComprobante))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_NumeroComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmb_TipoComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_Cliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmb_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmb_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_TipoComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_SerieComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_NumeroComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Fecha_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35))
        );

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

        btn_Registrar.setBackground(new java.awt.Color(0, 204, 255));
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

        btn_Eliminar.setBackground(new java.awt.Color(255, 51, 102));
        btn_Eliminar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
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

        tbl_DatosVenta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_DatosVenta);

        jButton1.setText("Mostrar Total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Registrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(btn_Cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Cerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                        .addComponent(btn_Cerrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
       Estado_Controles(true);
        limpiarControles();
        Tipo_Ope = 1;
    }//GEN-LAST:event_btn_NuevoActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
         Estado_Controles(true);
        int fila = tbl_DatosVenta.getSelectedRow();
        if (fila != -1) {
            int idventa = Integer.parseInt(tbl_DatosVenta.getValueAt(fila, 0).toString());
         int idcliente = objArregloPersona.Buscar_Codigo(cmb_Cliente.getSelectedItem().toString()).getIdpersona();
          //  int idcliente = objArregloVenta.BuscarCodigo(idventa).getIdcliente();
          //int idusuario = objArregloUsers.BuscarCodigo(idventa).getId();
 int idusuario = objArregloUsers.Buscar_Codigo(cmb_Usuario.getSelectedItem().toString()).getId();
            String tipo_comprobante = tbl_DatosVenta.getValueAt(fila, 2).toString();
            String serie_comprobante = tbl_DatosVenta.getValueAt(fila, 3).toString();
            String num_comprobante = tbl_DatosVenta.getValueAt(fila, 4).toString();
            String fecha_hora = tbl_DatosVenta.getValueAt(fila, 5).toString();
            //String impuesto = tbl_DatosIngreso.getValueAt(fila, 6).toString();
            String estado = tbl_DatosVenta.getValueAt(fila, 7).toString();
            Elemento = new Venta();
            Elemento.setIdventa(idventa);
            Elemento.setIdusuario(idusuario);
            Elemento.setIdcliente(idcliente);
            Elemento.setTipo_comprobante(tipo_comprobante);
            Elemento.setSerie_comprobante(serie_comprobante);
            Elemento.setNum_comprobante(num_comprobante);
            Elemento.setFecha_hora(fecha_hora);
            //Elemento.setImpuesto(impuesto);

            Elemento.setEstado(estado);
            cmb_Cliente.setSelectedItem(idcliente);
            cmb_TipoComprobante.setSelectedItem(tipo_comprobante);

            String nombre_persona = objArregloPersona.BuscarCodigo(idcliente).getNombre();

            int indice = modCombo.getIndexOf(nombre_persona);
            if (indice == -1) {
                modCombo.addElement(nombre_persona);
            }
            cmb_Cliente.setSelectedItem(nombre_persona);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un registro");
        }
        Tipo_Ope = 2;
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        Estado_Controles(false);
    
          
        
        
        int idcliente = objArregloPersona.Buscar_Codigo(cmb_Cliente.getSelectedItem().toString()).getIdpersona();
        int idusuario = objArregloUsers.Buscar_Codigo(cmb_Usuario.getSelectedItem().toString()).getId();

        String tipo_comprobante = cmb_TipoComprobante.getSelectedItem().toString();
        String serie_comprobante = txt_SerieComprobante.getText();
        String num_comprobante = txt_NumeroComprobante.getText();
        String fecha_hora = txt_Fecha_Hora.getText();
        String estado = cmb_Estado.getSelectedItem().toString();


        
        
        
        switch (Tipo_Ope) {
            case 1:
                Elemento = new Venta();
                Elemento.setIdcliente(idcliente);
                Elemento.setIdusuario(idusuario);
                Elemento.setTipo_comprobante(tipo_comprobante);
                Elemento.setSerie_comprobante(serie_comprobante);
                Elemento.setNum_comprobante(Venta.generarNumComprobante(contador_num));
                Elemento.setFecha_hora(fecha_hora);
                Elemento.setEstado(estado);
                VentaDAO.Insertar(Elemento);
                contador_num++;
                contador_serie++;

                break;
            case 2:
                Elemento.setIdcliente(idcliente);
                Elemento.setIdusuario(idusuario);
                Elemento.setTipo_comprobante(tipo_comprobante);
                Elemento.setSerie_comprobante(serie_comprobante);
                Elemento.setNum_comprobante(num_comprobante);
                Elemento.setFecha_hora(fecha_hora);
                Elemento.setEstado(estado);
                VentaDAO.Actualizar(Elemento);

        }

        Actualizar_Combo();
        Actualizar_Tabla();
        txt_NumeroComprobante.setText(Venta.generarNumComprobante(contador_num));
        txt_SerieComprobante.setText(Venta.generarSerieComprobante(contador_serie));
        cmb_Cliente.setSelectedIndex(-1);
        cmb_TipoComprobante.setSelectedIndex(-1);
        cmb_Estado.setSelectedIndex(-1);
        Tipo_Ope = 0;
       
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        Estado_Controles(false);
        Tipo_Ope = 0;
        cmb_Cliente.setSelectedIndex(-1);
        cmb_TipoComprobante.setSelectedIndex(-1);
        cmb_Estado.setSelectedIndex(-1);
        Actualizar_Combo();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
      int fila = tbl_DatosVenta.getSelectedRow();
        if (fila != -1) {
            int rpta = JOptionPane.showConfirmDialog(rootPane, "Desea Eliminar?");
            if (rpta == JOptionPane.YES_OPTION) {
                int idventa = Integer.parseInt(tbl_DatosVenta.getValueAt(fila, 0).toString());
                Elemento = new Venta();
                Elemento.setIdventa(idventa);
                VentaDAO.Eliminar(Elemento);
                Actualizar_Tabla();
                Actualizar_Combo();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un registro");
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
 
        JDialog_SeleccionarArticulo dialog = new JDialog_SeleccionarArticulo(null, true);
        dialog.setVisible(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JDialog_Venta dialog = new JDialog_Venta(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cmb_Cliente;
    private javax.swing.JComboBox<String> cmb_Estado;
    private javax.swing.JComboBox<String> cmb_TipoComprobante;
    private javax.swing.JComboBox<String> cmb_Usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_DatosVenta;
    private javax.swing.JTextField txt_Fecha_Hora;
    private javax.swing.JTextField txt_NumeroComprobante;
    private javax.swing.JTextField txt_SerieComprobante;
    // End of variables declaration//GEN-END:variables
}
