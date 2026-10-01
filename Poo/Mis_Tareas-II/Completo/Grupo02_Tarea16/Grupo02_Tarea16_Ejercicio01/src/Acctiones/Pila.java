
package Acctiones;

import Molde.Nodo;
import java.util.Stack;


public class Pila {
    
    Stack<Runnable> pilaUndo = new Stack<>();

// Al agregar un nodo
public void agregarNodo(Nodo<Object> padre, Nodo<Object> hijo) {
    padre.agregarHijo(hijo);

    // Guardar acción inversa en la pila
    pilaUndo.push(() -> padre.getHijos().remove(hijo));
}

// Al eliminar un nodo
public void eliminarNodo(Nodo<Object> padre, Nodo<Object> hijo) {
    padre.getHijos().remove(hijo);

    // Guardar acción inversa en la pila
    pilaUndo.push(() -> padre.agregarHijo(hijo));
}

// Método para deshacer
public void undo() {
    if (!pilaUndo.isEmpty()) {
        Runnable accion = pilaUndo.pop();
        accion.run(); // ejecuta la acción inversa
    }
}
    
    
    
    
}
