package Control;

import AccesoDB.ConectaDB;
import Modelo.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CursoDAO {
    
    public static void Insertar(Curso Elemento){
        try {
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void Actualizar(Curso Elemento){
        try {
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void ConsultarTodos(JTable control){
        try {
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
    
    public static int ContarRegistros(){
        int count = 0;
        try {
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return count;
    }
    
    public static void ConsultarTodos(JComboBox control, Arreglo_Curso arreglo){        
        try {
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
}
