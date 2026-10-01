package Vista;

import Control.Arreglo_Curso;
import Control.Arreglo_Estudiante;
import Control.CursoDAO;
import Control.EstudianteDAO;
import Modelo.Curso;
import Modelo.Estudiante;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JDialog_Estudiante extends javax.swing.JDialog {

    private int Tipo_Ope = 0;
    private Estudiante Elemento;
    private Arreglo_Curso objArreglo;
    private Arreglo_Estudiante objArregloEstudiante;
    private DefaultComboBoxModel modCombo;
    
    public JDialog_Estudiante(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        objArreglo = new Arreglo_Curso(CursoDAO.ContarRegistros());
        Actualizar_Combo();
        objArregloEstudiante = new Arreglo_Estudiante();
        setLocationRelativeTo(parent);
        Actualizar_Tabla();
        Estado_Controles(false);
    }
    
    public void Actualizar_Tabla(){
        EstudianteDAO.ConsultarTodos(tbl_datos, objArregloEstudiante);
    }
    public void Actualizar_Combo(){
        CursoDAO.ConsultarTodos(cbo_Curso, objArreglo);
        modCombo = (DefaultComboBoxModel)cbo_Curso.getModel();
    }
    
    private void Estado_Controles(boolean estado){
        txt_Nombres.setEnabled(estado);
        txt_Apellidos.setEnabled(estado);
        txt_Foto.setEnabled(estado);
        cbo_Curso.setEnabled(estado);
        btn_Nuevo.setEnabled(!estado);
        btn_Editar.setEnabled(!estado);
        btn_Guardar.setEnabled(estado);
        btn_Cancelar.setEnabled(estado);
        btn_Eliminar.setEnabled(!estado);
        btn_Cerrar.setEnabled(!estado);
        tbl_datos.setEnabled(!estado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Nombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Apellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Foto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbo_Curso = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btn_Nuevo = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Guardar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Estudiante"));

        jLabel1.setText("Nombres:");

        jLabel2.setText("Apellidos:");

        jLabel3.setText("Foto:");

        jLabel4.setText("Curso:");

        cbo_Curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Foto)
                    .addComponent(txt_Apellidos)
                    .addComponent(txt_Nombres, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(cbo_Curso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbo_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.GridLayout(6, 0, 0, 5));

        btn_Nuevo.setText("Nuevo");
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Nuevo);

        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Editar);

        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Guardar);

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Cancelar);

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Eliminar);

        btn_Cerrar.setText("Cerrar");
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Cerrar);

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_datos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        Estado_Controles(true);
        Tipo_Ope = 1;
    }//GEN-LAST:event_btn_NuevoActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        Estado_Controles(true);
        int fila = tbl_datos.getSelectedRow();
        if(fila != -1){
            int CodEstudiante = Integer.parseInt(tbl_datos.getValueAt(fila, 0).toString());
            String Nombres = tbl_datos.getValueAt(fila, 1).toString();
            String Apellidos = tbl_datos.getValueAt(fila, 2).toString();
            String Foto = tbl_datos.getValueAt(fila, 3).toString();
            int CodCurso = objArregloEstudiante.BuscarCodigo(CodEstudiante).getCodCurso();
            Elemento = new Estudiante();
            Elemento.setCodEstudiante(CodEstudiante);
            Elemento.setNombres(Nombres);
            Elemento.setApellidos(Apellidos);
            Elemento.setFoto(Foto);
            Elemento.setCodCurso(CodCurso);
            txt_Nombres.setText(Nombres);
            txt_Apellidos.setText(Apellidos);
            txt_Foto.setText(Foto);
            String nombre_curso = objArreglo.BuscarCodigo(CodCurso).getNombre();
            int indice = modCombo.getIndexOf(nombre_curso);
            if(indice == -1){
                modCombo.addElement(nombre_curso);
            }
            cbo_Curso.setSelectedItem(nombre_curso);
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione un registro");
        }
        Tipo_Ope = 2;
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        Estado_Controles(false);
        String Nombres = txt_Nombres.getText();
        String Apellidos = txt_Apellidos.getText();
        String Foto = txt_Foto.getText();
    int CodCurso = objArreglo.getDato(cbo_Curso.getSelectedIndex()).getCodCurso();
     //  int CodCurso = objArreglo.BuscarCodigo(cbo_Curso.getSelectedItem().toString()).getCodCurso();
        switch(Tipo_Ope){
            case 1: Elemento = new Estudiante();
                    Elemento.setNombres(Nombres);
                    Elemento.setApellidos(Apellidos);
                    Elemento.setFoto(Foto);
                    Elemento.setCodCurso(CodCurso);
                    EstudianteDAO.Insertar(Elemento);
                break;
            case 2: Elemento.setNombres(Nombres);
                    Elemento.setApellidos(Apellidos);
                    Elemento.setFoto(Foto);
                    Elemento.setCodCurso(CodCurso);
                    EstudianteDAO.Actualizar(Elemento);
        }
        Actualizar_Combo();
        Actualizar_Tabla();
        txt_Nombres.setText("");
        txt_Apellidos.setText("");
        txt_Foto.setText("");
        cbo_Curso.setSelectedIndex(-1);
        Tipo_Ope = 0;
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int fila = tbl_datos.getSelectedRow();
        
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        Estado_Controles(false);
        Tipo_Ope = 0;
        txt_Nombres.setText("");
        txt_Apellidos.setText("");
        txt_Foto.setText("");
        cbo_Curso.setSelectedIndex(-1);
        Actualizar_Combo();
    }//GEN-LAST:event_btn_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(JDialog_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_Estudiante dialog = new JDialog_Estudiante(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JComboBox<String> cbo_Curso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTextField txt_Apellidos;
    private javax.swing.JTextField txt_Foto;
    private javax.swing.JTextField txt_Nombres;
    // End of variables declaration//GEN-END:variables
}
