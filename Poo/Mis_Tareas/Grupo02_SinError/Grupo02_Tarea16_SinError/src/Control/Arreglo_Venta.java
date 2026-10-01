package Control;

import Modelo.Venta;
import java.util.ArrayList;

public class Arreglo_Venta {

    private ArrayList<Venta> arreglo = new ArrayList<Venta>();

    public void Agregar(Venta dato) {
        arreglo.add(dato);
    }

    public void Inicializar() {
        arreglo = new ArrayList<Venta>();
    }

    public Venta getDato(int pos) {
        return arreglo.get(pos);
    }

    public void Eliminar(int pos) {
        arreglo.remove(pos);
    }

    public void Reiniciar() {
        arreglo = new ArrayList<Venta>();
    }

    public Venta BuscarCodigo(int venta) {
        for (int pos = 0; pos < arreglo.size(); pos++)
        {
            if (venta == arreglo.get(pos).getIdventa()) {
                return arreglo.get(pos);
            }
        }
        return null;
    }

}
