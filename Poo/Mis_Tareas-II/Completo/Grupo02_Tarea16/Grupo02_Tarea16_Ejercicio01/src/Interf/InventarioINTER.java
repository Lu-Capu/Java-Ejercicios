package Interf;

import Molde.Inventario;
import java.util.List;
import javax.swing.JTable;

public interface InventarioINTER {

    public void registrar(Inventario elemento) throws Exception;
    public void editar(Inventario elemento) throws Exception;
    public void eliminar(int idInventario) throws Exception;
    public void listar(JTable control) throws Exception;
    public Inventario buscar(String id);
    public List<Inventario> listar() throws Exception;

}