package Control;

import Modelo.Categoria;

public class Arreglo_Categoria {

    private Categoria[] arreglo;
    private int i = 0;

    public Arreglo_Categoria(int size) {
        arreglo = new Categoria[size];
    }

    public void Inicializar() {
        i = 0;
    }

    public void Agregar(Categoria dato) {
        arreglo[i] = dato;
        i++;
    }

    public Categoria getDato(int pos) {
        return arreglo[pos];
    }

    public Categoria BuscarCodigo(int id) {
        for (int pos = 0; pos < i; pos++) {
            if (id == arreglo[pos].getIdcategoria()) {
                return arreglo[pos];
            }
        }
        return null;
    }

    public Categoria Buscar_Codigo(String nombre) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getNombre().equals(nombre)) {
                return arreglo[pos];
            }
        }
        return null;
    }

}
