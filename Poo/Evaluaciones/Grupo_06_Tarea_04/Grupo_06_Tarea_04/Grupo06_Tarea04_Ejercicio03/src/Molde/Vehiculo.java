package Molde;

public class Vehiculo {
 
 private String placa;
 private String tipo_Vehiculo;
 private int hora;
 private boolean estado=true;

    public Vehiculo(String placa, String tipo_Vehiculo, int hora) {
        this.placa = placa;
        this.tipo_Vehiculo = tipo_Vehiculo;
        this.hora = hora;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

   

 public Object[] getRegistro(){
     return new Object[]{placa, tipo_Vehiculo, hora};
 }   
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo_Vehiculo() {
        return tipo_Vehiculo;
    }

    public void setTipo_Vehiculo(String tipo_Vehiculo) {
        this.tipo_Vehiculo = tipo_Vehiculo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

 
 
    
}
