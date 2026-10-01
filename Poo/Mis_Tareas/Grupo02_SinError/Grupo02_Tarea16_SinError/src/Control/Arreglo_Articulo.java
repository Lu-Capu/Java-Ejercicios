package Control;

import ControlDAO.ArticuloDAO;
import Modelo.Articulo;
import java.util.ArrayList;

public class Arreglo_Articulo {

    private ArrayList<Articulo> arreglo_articulo = new ArrayList<>();
    
    
    
    public Arreglo_Articulo() {
    arreglo_articulo = ArticuloDAO.listarTodo();
}

    public void Agregar(Articulo dato) {
        arreglo_articulo.add(dato);

    }

    
    
    public void Inicializar() {
        arreglo_articulo = new ArrayList<Articulo>();
    }

    public Articulo getDato(int pos) {
        return arreglo_articulo.get(pos);

    }

    public void Eliminar(int pos) {
        arreglo_articulo.remove(pos);

    }

    public void Reiniciar() {
        arreglo_articulo = new ArrayList<>();
    }

    public Articulo BuscarCodigo(int idarticulo) {
        for (int pos = 0; pos < arreglo_articulo.size(); pos++) {
            if (idarticulo == arreglo_articulo.get(pos).getIdarticulo()) {
                return arreglo_articulo.get(pos);
            }
        }
        return null;
    }

}
