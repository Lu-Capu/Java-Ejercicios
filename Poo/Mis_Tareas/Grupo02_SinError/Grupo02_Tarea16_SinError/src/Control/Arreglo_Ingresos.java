package Control;

import Modelo.Ingreso;
import java.util.ArrayList;

public class Arreglo_Ingresos {

    private ArrayList<Ingreso> arreglo = new ArrayList<Ingreso>();

    public void Agregar(Ingreso dato) {
       arreglo.add(dato);
    }

    public void Inicializar() {
        arreglo = new ArrayList<Ingreso>();
    }

    public Ingreso getDato(int pos) {
        return arreglo.get(pos);
    }

    public void Eliminar(int pos) {
        arreglo.remove(pos);
    }

    public void Reiniciar() {
        arreglo = new ArrayList<Ingreso>();
    }

    public Ingreso BuscarCodigo(int idingreso) {
        for (int pos = 0; pos < arreglo.size(); pos++) {
            if (idingreso == arreglo.get(pos).getIdingreso()) {
                return arreglo.get(pos);
            }
        }
        return null;
    }
}
