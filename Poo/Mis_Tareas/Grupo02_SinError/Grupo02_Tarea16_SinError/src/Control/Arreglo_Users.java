package Control;

import Modelo.Users;

public class Arreglo_Users {
    
    private Users[] arreglo;
    private int i = 0;

    public Arreglo_Users(int size) {
        arreglo = new Users[size];
    }

    public void Inicializar() {
        i = 0;
    }

    public void Agregar(Users dato) {
        arreglo[i] = dato;
        i++;
    }

    public Users getDato(int pos) {
        return arreglo[pos];
    }

    public Users BuscarCodigo(int id) {
        for (int pos = 0; pos < i; pos++) {
            if (id == arreglo[pos].getId()) {
                return arreglo[pos];
            }
        }
        return null;
    }

    public Users Buscar_Codigo(String nombre) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getName().equals(nombre)) {
                return arreglo[pos];
            }
        }
        return null;
    }

}
