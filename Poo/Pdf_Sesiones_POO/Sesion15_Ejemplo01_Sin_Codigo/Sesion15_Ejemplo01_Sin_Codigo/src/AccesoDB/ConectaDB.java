package AccesoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConectaDB {
    public static Connection ObtenerConexion(){
        Connection cn = null;
        try {            
            String url = "jdbc:mysql://localhost:3306/academia?user=root&password=123";
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return cn;
    }
    
    public static void CerrarConexion(Connection cn){
        try {
            if(cn.isClosed() == false){
                cn.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
