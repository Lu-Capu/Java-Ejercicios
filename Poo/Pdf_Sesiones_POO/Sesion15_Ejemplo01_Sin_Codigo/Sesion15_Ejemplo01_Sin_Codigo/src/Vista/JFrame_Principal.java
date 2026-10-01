package Vista;

public class JFrame_Principal extends javax.swing.JFrame {

    public JFrame_Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnu_item_salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnu_item_curso = new javax.swing.JMenuItem();
        mnu_item_asignatura = new javax.swing.JMenuItem();
        mnu_item_estudiante = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnu_item_notas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Archivo");

        mnu_item_salir.setText("Salir");
        jMenu1.add(mnu_item_salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mantenimiento");

        mnu_item_curso.setText("Curso");
        mnu_item_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_item_cursoActionPerformed(evt);
            }
        });
        jMenu2.add(mnu_item_curso);

        mnu_item_asignatura.setText("Asignatura");
        jMenu2.add(mnu_item_asignatura);

        mnu_item_estudiante.setText("Estudiante");
        mnu_item_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_item_estudianteActionPerformed(evt);
            }
        });
        jMenu2.add(mnu_item_estudiante);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Operaciones");

        mnu_item_notas.setText("Notas");
        jMenu3.add(mnu_item_notas);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnu_item_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_item_cursoActionPerformed
        //new JDialog_Curso(this, true).setVisible(true);
        JDialog_Curso objVentana = new JDialog_Curso(this, true);
        objVentana.setVisible(true);
    }//GEN-LAST:event_mnu_item_cursoActionPerformed

    private void mnu_item_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_item_estudianteActionPerformed
        new JDialog_Estudiante(this, true).setVisible(true);
    }//GEN-LAST:event_mnu_item_estudianteActionPerformed

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnu_item_asignatura;
    private javax.swing.JMenuItem mnu_item_curso;
    private javax.swing.JMenuItem mnu_item_estudiante;
    private javax.swing.JMenuItem mnu_item_notas;
    private javax.swing.JMenuItem mnu_item_salir;
    // End of variables declaration//GEN-END:variables
}
