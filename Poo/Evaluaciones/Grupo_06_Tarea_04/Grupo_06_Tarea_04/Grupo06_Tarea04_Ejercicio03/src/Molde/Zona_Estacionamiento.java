package Molde;

public class Zona_Estacionamiento {

    private String codigo_Zona;
    private int nivel;
    private int capacidad_maxima;
    private int espacio_ocupado;

    public Zona_Estacionamiento(String codigo_Zona, int nivel, int capacidad_maxima, int espacio_ocupado) {
        this.codigo_Zona = codigo_Zona;
        this.nivel = nivel;
        this.capacidad_maxima = capacidad_maxima;
        this.espacio_ocupado = espacio_ocupado;
    }

   public Object[] getRegistro(){
       return new Object[]{codigo_Zona, nivel, capacidad_maxima, espacio_ocupado};
   }
           
   public void liberarEspacio() {
        if (espacio_ocupado > 0) {
            espacio_ocupado--;
        }
    }  
    
     public void AumentarEspacio() {
        if (espacio_ocupado <= capacidad_maxima) {
            espacio_ocupado++;
        }
    }  
    public String getCodigo_Zona() {
        return codigo_Zona;
    }

    public void setCodigo_Zona(String codigo_Zona) {
        this.codigo_Zona = codigo_Zona;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCapacidad_maxima() {
        return capacidad_maxima;
    }

    public void setCapacidad_maxima(int capacidad_maxima) {
        this.capacidad_maxima = capacidad_maxima;
    }

    public int getEspacio_ocupado() {
        return espacio_ocupado;
    }

    public void setEspacio_ocupado(int espacio_ocupado) {
        this.espacio_ocupado = espacio_ocupado;
    }


    
    
    
    
    
}
