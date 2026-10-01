package Control;

import AccesoDB.ConectaDB;
import Modelo.Curso;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CursoDAO {
    
    public static void Insertar(Curso Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            Statement st = cn.createStatement();
            int estado = st.executeUpdate("insert into curso(Nombre) value('" + Elemento.getNombre()+"')");
            if(estado > 0){
        JOptionPane.showMessageDialog(null, "Registro exitoso");
            }else{
        JOptionPane.showMessageDialog(null, "No se pudo registrar");          
            }
            
            ConectaDB.CerrarConexion(cn);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
  
        
    }
    
    public static void Actualizar(Curso Elemento){
        try {
           Connection cn = ConectaDB.ObtenerConexion();
           Statement st = cn.createStatement();
           //instrucion
           int estado = st.executeUpdate("update curso set nombre= '" +Elemento.getNombre() + "' where codCurso =" + Elemento.getCodCurso());
        
           if(estado > 0){
        JOptionPane.showMessageDialog(null, "Actualizacion exitosa");
            }else{
        JOptionPane.showMessageDialog(null, "No se pudo actualizar");          
            }
           
           
             ConectaDB.CerrarConexion(cn);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+e.getMessage());
        }
        
        
        
    }
    
    public static void Eliminar(Curso Elemento){
        
         try {
           Connection cn = ConectaDB.ObtenerConexion();
           Statement st = cn.createStatement();
           //instrucion
           int estado = st.executeUpdate("delete from curso where codCurso =" + Elemento.getCodCurso());
        
           if(estado > 0){
        JOptionPane.showMessageDialog(null, "Eliminacion exitosa");
            }else{
        JOptionPane.showMessageDialog(null, "No se pudo eliminar");          
            }
           
           
             ConectaDB.CerrarConexion(cn);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+e.getMessage());
        }
        
        
        
    }
    
    public static void ConsultarTodos(JTable control){
        try {
            String[] cabecera = {"Codigo", "Nombre"};
            DefaultTableModel modTabla = new DefaultTableModel(cabecera , 0);
            control.setModel(modTabla);
            
           Connection cn = ConectaDB.ObtenerConexion();
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery("select * from curso");
            while (rs.next()) {
               //Si este registro existe (traemelo)
               int codigo = rs.getInt(1);
               String nombre = rs.getString(2);
               Object[] registro = {codigo , nombre};
                modTabla.addRow(registro);
            }
           rs.close();
           st.close();
           ConectaDB.CerrarConexion(cn);
            
            
        } catch (Exception e) {
            
        }
        
        
        
        
        
    }
}
