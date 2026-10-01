
package Control;

import AccesoBD.ConectaDB;
import Molde.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class UsuarioDAO {
    
     public static void Insertar(Usuario Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            Statement st = cn.createStatement();
            int estado = st.executeUpdate(
    "insert into usuarios(nombre, apellidos, usuario, clave, permiso) value('" + Elemento.getNombre()+"' , '"+Elemento.getApellido()+"', '"+Elemento.getUsuario()+"', '"+Elemento.getClave()+"' , '"+Elemento.getPermiso()+"'   ) " 
   // +  "insert into usuarios(apellidos) value('" + Elemento.getApellido()+"')"        
           
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
            String[] cabecera = { "ID","Nombre", "Apellido", "Usuario", "Clave", "Permiso"};
            DefaultTableModel modTabla = new DefaultTableModel(cabecera , 0);
            control.setModel(modTabla);
            
           Connection cn = ConectaDB.ObtenerConexion();
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery("select * from usuarios");
            while (rs.next()) {
               //Si este registro existe (traemelo)
              
               //Ponemos el id por que al traer o consultar todos, tambien se trae el id
               //Por eso nos daba un error por que casi al final en clave se ejecuatba como un tipo int
               //La cosa es que al conmsultar nuestra base de datos va a traer todos los elemntos que le hayamos dado
            int id = rs.getInt(1);
             String nombre = rs.getString(2);
             String apellido = rs.getString(3);
             String usuario = rs.getString(4);
             String clave = rs.getString(5);
          int permiso = rs.getInt(6);
               
               Object[] registro = {id,nombre , apellido, usuario, clave, permiso};
                modTabla.addRow(registro);
            }
           rs.close();
           st.close();
           ConectaDB.CerrarConexion(cn);
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        
        
        
        
        
    }    
     
     
 public static void Eliminar(Usuario Elemento){
        
         try {
           Connection cn = ConectaDB.ObtenerConexion();
           Statement st = cn.createStatement();
           //instrucion
           int estado = st.executeUpdate("delete from usuarios where id_usuarios =" + Elemento.getId());
        
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
  
  
  public static void Actualizar(Usuario Elemento){
        try {
           Connection cn = ConectaDB.ObtenerConexion();
           Statement st = cn.createStatement();
           //instrucion
           int estado = st.executeUpdate(
   "update usuarios set nombre= '" +Elemento.getNombre() + "', apellidos='"+Elemento.getApellido()+"', usuario= '"+Elemento.getUsuario()+"', clave='"+Elemento.getClave()+"',permiso='"+Elemento.getPermiso()+"'  where id_usuarios =" + Elemento.getId());
        
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
