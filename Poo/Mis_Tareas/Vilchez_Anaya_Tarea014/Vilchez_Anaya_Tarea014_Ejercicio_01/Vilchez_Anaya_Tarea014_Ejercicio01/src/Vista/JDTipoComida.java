
package Vista;

import Control.Tipo_ComidaDAO;

import Molde.Tipo_Comida;
import javax.swing.JOptionPane;


public class JDTipoComida extends javax.swing.JDialog {
    Tipo_Comida Elemento;
   
    
    public JDTipoComida(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        Tipo_ComidaDAO.ConsultarTodos(tableTD);
        
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombreTC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTD = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_idComida = new javax.swing.JTextField();
        btn_InsertarTD = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Datos de Tipo de Comida");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipos de Comida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setToolTipText("");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        tableTD.setModel(new javax.swing.table.DefaultTableModel(
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
        tableTD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTDMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableTDMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableTD);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id_Comida:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_idComida))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombreTC, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombreTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_idComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_InsertarTD.setBackground(new java.awt.Color(153, 255, 255));
        btn_InsertarTD.setForeground(new java.awt.Color(0, 0, 0));
        btn_InsertarTD.setText("Insertar");
        btn_InsertarTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertarTDActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(255, 153, 153));
        btn_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_editar.setBackground(new java.awt.Color(255, 255, 204));
        btn_editar.setForeground(new java.awt.Color(0, 0, 0));
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_InsertarTD, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_InsertarTD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_editar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InsertarTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertarTDActionPerformed
      if(txt_nombreTC.getText().trim().isEmpty()){
          JOptionPane.showMessageDialog(null, "Completar la casilla nombre");
          return;
          
      }
      
      if(txt_idComida.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(null, "Completar la casilla id_Comida");
          return;
      }
      
      
      
        String nombre = txt_nombreTC.getText();
        String id_Comida = txt_idComida.getText();
      Elemento = new Tipo_Comida();
      Elemento.setNombre(nombre);
      Elemento.setId_comida(id_Comida);
        Tipo_ComidaDAO.InsertarTD(Elemento);
       Tipo_ComidaDAO.ConsultarTodos(tableTD);
      
    }//GEN-LAST:event_btn_InsertarTDActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
int fila = tableTD.getSelectedRow();
   if(fila !=-1){
       int rpta = JOptionPane.showConfirmDialog(null, "Desea eliminar?");
             if(rpta == JOptionPane.YES_OPTION){
                 String id_comida =tableTD.getValueAt(fila, 0).toString();
           
           Elemento = new Tipo_Comida();
           Elemento.setId_comida(id_comida);
           
           Tipo_ComidaDAO.Eliminar(Elemento);
           Tipo_ComidaDAO.ConsultarTodos(tableTD);
                 
             }
                
       
       
   }   
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
         int fila = tableTD.getSelectedRow();
        if(fila !=-1){
         
            
           if(txt_nombreTC.getText().trim().isEmpty()){
          JOptionPane.showMessageDialog(null, "Completar la casilla nombre");
          return; }
      
    
    String id = tableTD.getValueAt(fila, 0).toString();   
  String nombre = txt_nombreTC.getText();
 Elemento = new Tipo_Comida();
Elemento.setNombre(nombre);
Elemento.setId_comida(id);
        Tipo_ComidaDAO.Actualizar(Elemento);
       Tipo_ComidaDAO.ConsultarTodos(tableTD);
            
      txt_idComida.setEnabled(true);
            
        }
        
       
        
    
        
    }//GEN-LAST:event_btn_editarActionPerformed

    private void tableTDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTDMousePressed
    int fila = tableTD.getSelectedRow();
     if(fila !=-1){
          String id = tableTD.getValueAt(fila, 0).toString(); 
          txt_idComida.setText(id);
            txt_idComida.setEnabled(false);
            
     }   
        
     
    
    }//GEN-LAST:event_tableTDMousePressed

    private void tableTDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTDMouseClicked
     
    }//GEN-LAST:event_tableTDMouseClicked

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
            java.util.logging.Logger.getLogger(JDTipoComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDTipoComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDTipoComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDTipoComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDTipoComida dialog = new JDTipoComida(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_InsertarTD;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableTD;
    private javax.swing.JTextField txt_idComida;
    private javax.swing.JTextField txt_nombreTC;
    // End of variables declaration//GEN-END:variables
}
