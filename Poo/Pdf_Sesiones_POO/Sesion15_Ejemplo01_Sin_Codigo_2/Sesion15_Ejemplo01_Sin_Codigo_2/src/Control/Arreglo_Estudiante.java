package Control;

import Modelo.Estudiante;
import java.util.ArrayList;

public class Arreglo_Estudiante {
    private ArrayList<Estudiante> arreglo = new ArrayList<Estudiante>();
    
    public void Agregar(Estudiante dato){
        arreglo.add(dato);
    }
    
    public void Inicializar(){
        arreglo = new ArrayList<Estudiante>();
    }
    
    public Estudiante getDato(int pos){
        return arreglo.get(pos);
    }
    
    public void Eliminar(int pos){
        arreglo.remove(pos);
    }
    
    public void Reiniciar(){
        arreglo = new ArrayList<Estudiante>();
    }
    
    public Estudiante BuscarCodigo(int CodEstudiante){
        for (int pos = 0; pos < arreglo.size(); pos++) {
            if(CodEstudiante == arreglo.get(pos).getCodEstudiante()){
                return arreglo.get(pos);
            }
        }
        return null;
    }
}
