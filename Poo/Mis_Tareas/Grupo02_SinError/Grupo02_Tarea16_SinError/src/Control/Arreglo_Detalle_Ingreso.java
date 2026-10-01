package Control;

import Modelo.Detalle_Ingreso;


public class Arreglo_Detalle_Ingreso {

     private Detalle_Ingreso[] arreglo;
    private int i = 0;

    public void Agregar(Detalle_Ingreso dato) {
        arreglo[i] = dato;
        i++;
    }
    public Arreglo_Detalle_Ingreso(int size) {
        arreglo = new Detalle_Ingreso[size];
    }

    public void Inicializar() {
        i = 0;
    }


   public Detalle_Ingreso getDato(int pos) {
        return arreglo[pos];
    }


    public Detalle_Ingreso Buscar_Codigo(String nombre) {
        for (int pos = 0; pos < i; pos++) {
           return arreglo[pos];
            
        }
        return null;
    }
   
    
 
    
    
}
