package Interf;

import Molde.Predio;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;

public interface PredioINTER {

    public void registrar(Predio elemento) throws Exception;
    public void editar(Predio elemento) throws Exception;
    public void eliminar(int idPredio) throws Exception;
    public void listar(JTable control) throws Exception;
    public Predio buscar(String id);
    public List<Predio> listar() throws Exception;
    public void listar(JComboBox<String> control) throws Exception;
}
