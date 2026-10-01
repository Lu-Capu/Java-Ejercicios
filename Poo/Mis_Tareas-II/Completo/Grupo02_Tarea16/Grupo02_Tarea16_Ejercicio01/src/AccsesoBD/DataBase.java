package AccsesoBD;

import Vista.Principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DataBase {

    protected Connection conexion;

    private final String url = "jdbc:mysql://localhost:3306/theforest?user=root&password=1234";
    private final String JDBC = "com.mysql.cj.jdbc.Driver";

    public void Conectar() {
        try {
            Class.forName(JDBC);//Cargar el Driver
            conexion = DriverManager.getConnection(url);
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR DE CONEXIÓN: " + e.getMessage());
        }
    }

    public void cerrar() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar conexión: " + e.getMessage());
        }
    }

    public void ValidarUsuarios(JTextField clave, JComboBox tipo, JFrame Login) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            this.Conectar();

            String sql = "SELECT * FROM usuarios WHERE clave = ? AND tipo = ?";
            ps = conexion.prepareStatement(sql);

            ps.setString(1, clave.getText());
            ps.setString(2, tipo.getSelectedItem().toString());

            rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Ingreso exitoso");
                Principal ventana = new Principal();
                ventana.setVisible(true);
                Login.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos o no registrados");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al validar: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                this.cerrar();
            } catch (Exception ex) {
            }
        }
    }

}
