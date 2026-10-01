package Molde;

import java.util.ArrayList;
import java.util.List;

public class Nodo<T> {
    private T dato;                  // El objeto que guarda (Inventario, Predio, etc.)
    private Nodo<T> padre;           // Referencia al padre
    private List<Nodo<T>> hijos;     // Lista de hijos

    public Nodo(T dato) {
        this.dato = dato;
        this.hijos = new ArrayList<>();
    }

    public T getDato() { return dato; }
    public void setDato(T dato) { this.dato = dato; }

    public Nodo<T> getPadre() { return padre; }
    public void setPadre(Nodo<T> padre) { this.padre = padre; }

    public List<Nodo<T>> getHijos() { return hijos; }

    // Método para agregar hijo
    public void agregarHijo(Nodo<T> hijo) {
        hijo.setPadre(this);
        hijos.add(hijo);
    }

    @Override
    public String toString() {
        return dato.toString();
    }
  /*  - Nivel 0 → raíz del árbol (ej. Inventario).
- Nivel 1 → hijos directos del inventario (ej. Predio).
- Nivel 2 → nietos (ej. Contrato).
- Nivel 3 → bisnietos (ej. Orden).*/

}