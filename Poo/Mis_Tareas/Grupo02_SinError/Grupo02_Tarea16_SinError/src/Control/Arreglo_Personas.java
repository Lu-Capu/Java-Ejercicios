package Control;

import Modelo.Persona;

public class Arreglo_Personas {

    private Persona[] arreglo;
    private int i = 0;

    public Arreglo_Personas(int size) {
        arreglo = new Persona[size];
    }

    public void Inicializar() {
        i = 0;
    }

    public void Agregar(Persona dato) {
        arreglo[i] = dato;
        i++;
    }

    public Persona getDato(int pos) {
        return arreglo[pos];
    }

    public Persona BuscarCodigo(int id) {
        for (int pos = 0; pos < i; pos++) {
            if (id == arreglo[pos].getIdpersona()) {
                return arreglo[pos];
            }
        }
        return null;
    }

    
    
    public Persona Buscar_Codigo(String nombre) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getNombre().equals(nombre)) {
                return arreglo[pos];
            }
        }
        return null;
    }

}
