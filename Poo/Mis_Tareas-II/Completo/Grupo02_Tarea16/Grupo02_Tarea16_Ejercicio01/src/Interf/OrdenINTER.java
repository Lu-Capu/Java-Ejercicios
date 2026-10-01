package Interf;

import Molde.Orden;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;

public interface OrdenINTER {

    public void registrar(Orden elemento) throws Exception;
    public void editar(Orden elemento) throws Exception;
    public void eliminar(int idOrden) throws Exception;
    public void listar(JTable control) throws Exception;
    public Orden buscar(String id);
    public List<Orden> listar() throws Exception;
    public void listar(JComboBox<String> control) throws Exception;
}
