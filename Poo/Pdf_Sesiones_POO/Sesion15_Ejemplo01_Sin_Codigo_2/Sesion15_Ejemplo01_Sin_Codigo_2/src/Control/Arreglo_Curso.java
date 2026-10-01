package Control;

import Modelo.Curso;

public class Arreglo_Curso {
    private Curso[] arreglo;
    private int i = 0;
    
    public Arreglo_Curso(int size){
        arreglo = new Curso[size];
    }
    
    public void Inicializar(){
        i=0;
    }
    
    public void Agregar(Curso dato){
        arreglo[i] = dato;
        i++;
    }
    
    public Curso getDato(int pos){
        return arreglo[pos];
    }
    
    public Curso BuscarCodigo(int CodCurso){
        for (int pos = 0; pos < i; pos++) {
            if(CodCurso == arreglo[pos].getCodCurso()){
                return arreglo[pos];
            }
        }
        return null;
    }
    
    public Curso BuscarCodigo(String nombre){
        for (int pos = 0; pos < i; pos++) {
            if(arreglo[pos].getNombre().equals(nombre)){
                return arreglo[pos];
            }
        }
        return null;
    }
}
