
package AccesoBD;

import Vista.Principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class ConectaBD {
    
      public static Connection ObtenerConexion() {
        Connection cn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/web?user=root&password=1234";
            cn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR DE CONEXIÓN" + e.getMessage());
        }
        return cn;
    }

    public static void CerrarConexion(Connection cn) {
        try {
            if (cn.isClosed() == false) {
                cn.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL CERRAR CONEXIÓN" + e.getMessage());
        }
    }

    public static void ValidarUsuarios(JTextField usuario, JPasswordField contraseña, JFrame Login) {
        try {
            Connection cn = ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from users where email=(?) and password=(?)");
            ps.setString(1, usuario.getText());
            ps.setString(2, String.valueOf(contraseña.getPassword()));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Ingreso Exitoso");
                Principal objPrincipal = new Principal();
                objPrincipal.setVisible(true);
                Login.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Datos no registrados");
             
                      
            }
            ps.close();
            rs.close();
            CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void Intentos() {
        try {
            Connection cn = ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select intentos from users ");
            ResultSet rs = ps.executeQuery();
 
            ps.close();
            rs.close();
            CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
  
    } 
 

    
    
}
