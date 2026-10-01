package Interf;

import Molde.Arbol;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;

public interface ArbolINTER {

    public void registrar(Arbol elemento) throws Exception;

    public void editar(Arbol elemento) throws Exception;

    public void eliminar(int idArbol) throws Exception;

    public void listar(JTable control) throws Exception;

    public Arbol buscar(String id);

    public List<Arbol> listar() throws Exception;
    public void listar(JComboBox<String> control) throws Exception;
}
