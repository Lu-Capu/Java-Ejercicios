package Control;

import AccesoDB.ConectaDB;
import Modelo.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EstudianteDAO {
    public static void Insertar(Estudiante Elemento){
        try {
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void Actualizar(Estudiante Elemento){
        try {
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void Eliminar(Estudiante Elemento){
        try {
            
        } catch (Exception e) {
        }
    }
    
    public static void ConsultarTodos(JTable control){
        //
        String[] cabecera = {"Código","Nombres","Apellidos","Foto","Curso"};
        DefaultTableModel modTabla = new 
            DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        try {
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
}
