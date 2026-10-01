package Interf;

import Molde.Sitio;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;

public interface SitioINTER {

    public void registrar(Sitio elemento) throws Exception;
    public void editar(Sitio elemento) throws Exception;
    public void eliminar(int idSitio) throws Exception;
    public void listar(JTable control) throws Exception;
    public Sitio buscar(String id);
    public List<Sitio> listar() throws Exception;
    public void listar(JComboBox<String> control) throws Exception;
}
