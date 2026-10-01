package Control;

import AccesoBD.ConectaDB;
import Molde.Tipo_Comida;
import Molde.Usuario;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Tipo_ComidaDAO {
    
    public static void Eliminar(Tipo_Comida Elemento){
        
         try {
           Connection cn = ConectaDB.ObtenerConexion();
   Statement st = cn.createStatement();
//Statement st = cn.prepareStatement("delete from tipo_comida where id_tipo_comida =" + Elemento.getId_comida());
          
//instrucion
       
  // int estado = st.executeUpdate("delete from tipo_comida where id_tipo_comida =" + Elemento.getId_comida());
  int estado = st.executeUpdate("delete from tipo_comida where id_tipo_comida =  '"+Elemento.getId_comida()+"'");
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
    
 
  public static void InsertarTD(Tipo_Comida Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            Statement st = cn.createStatement();
            int estado = st.executeUpdate(
     
    "insert into tipo_comida(id_tipo_comida,nombre) value('" +Elemento.getId_comida() +"', '"+Elemento.getNombre()+"' ) "        
            );
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
    

  public static void ConsultarTodos(JTable control){
        try {
            String[] cabecera = { "ID","Nombre"};
            DefaultTableModel modTabla = new DefaultTableModel(cabecera , 0);
            control.setModel(modTabla);
            
           Connection cn = ConectaDB.ObtenerConexion();
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery("select * from tipo_comida");
            while (rs.next()) {
               //Si este registro existe (traemelo)
              
               //Ponemos el id por que al traer o consultar todos, tambien se trae el id
               //Por eso nos daba un error por que casi al final en clave se ejecuatba como un tipo int
               //La cosa es que al conmsultar nuestra base de datos va a traer todos los elemntos que le hayamos dado
           String id = rs.getString(1);
             String nombre = rs.getString(2);
               
               Object[] registro = {id,nombre};
                modTabla.addRow(registro);
            }
           rs.close();
           st.close();
           ConectaDB.CerrarConexion(cn);
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        
        
        
        
        
    }        
    
    
   public static void Actualizar(Tipo_Comida Elemento){
        try {
           Connection cn = ConectaDB.ObtenerConexion();
           Statement st = cn.createStatement();
           //instrucion
           int estado = st.executeUpdate(
 "update tipo_comida set nombre='"+Elemento.getNombre()+"' where id_tipo_comida =  '"+Elemento.getId_comida()+"'   ");
        
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
    
    
}
