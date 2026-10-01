
package Interf;

import Molde.Users;
import javax.swing.JTable;


public interface UsersINTER {
  
    public void registrar(Users elemento) throws Exception;
    public void editar(Users elemento) throws Exception;
    public void eliminar(Users elemento) throws Exception;
    public void listar(JTable control) throws Exception;
    public Users buscar(String id);
}
