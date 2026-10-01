package Interf;

import Molde.Contrato;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;

public interface ContraroINTER {

    public void registrar(Contrato elemento) throws Exception;
    public void editar(Contrato elemento) throws Exception;
    public void eliminar(int idContrato) throws Exception;
    public void listar(JTable control) throws Exception;
    public Contrato buscar(String id);
    public List<Contrato> listar() throws Exception;
    public void listar(JComboBox<String> control) throws Exception;
}
