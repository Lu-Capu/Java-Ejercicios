package Molde;

public class Registro_Estacionamiento {

private Vehiculo objvehi;
private Zona_Estacionamiento objZona;
private int hora;
private double tarifa =0;

    public Registro_Estacionamiento(Vehiculo objvehi, Zona_Estacionamiento objZona, int hora) {
        this.objvehi = objvehi;
        this.objZona = objZona;
        this.hora = hora;
    }


   public Object[] getRegistro(){
       return new Object[]{objvehi.getPlaca(), objZona.getCodigo_Zona(),objvehi.getTipo_Vehiculo(), hora} ;
   } 
    
    
    public Vehiculo getObjvehi() {
        return objvehi;
    }

    public void setObjvehi(Vehiculo objvehi) {
        this.objvehi = objvehi;
    }

    public Zona_Estacionamiento getObjZona() {
        return objZona;
    }

    public void setObjZona(Zona_Estacionamiento objZona) {
        this.objZona = objZona;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }



    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }



    
}
