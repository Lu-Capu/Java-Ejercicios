package Control;

import Modelo.Detalle_Venta;
import java.util.ArrayList;

public class Arreglo_Detalle_Venta {

     private Detalle_Venta[] arreglo;
    private int i = 0;

     public void Agregar(Detalle_Venta dato) {
        arreglo[i] = dato;
        i++;
    }

    public Arreglo_Detalle_Venta(int size) {
        arreglo = new Detalle_Venta[size];
    }

    public void Inicializar() {
        i = 0;
    }


   public Detalle_Venta getDato(int pos) {
        return arreglo[pos];
    }


    public Detalle_Venta Buscar_Codigo(String nombre) {
        for (int pos = 0; pos < i; pos++) {
           return arreglo[pos];
            
        }
        return null;
    }
    
    public Detalle_Venta BuscarCodigo(int id) {
        for (int pos = 0; pos < i; pos++) {
            if (id == arreglo[pos].getIddetalle_venta()) {
                return arreglo[pos];
            }
        }
        return null;
    }
    
}
