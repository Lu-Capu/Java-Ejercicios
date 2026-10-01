package Molde;

import java.util.ArrayList;
import java.util.List;

public class Orden {

    private int idOrden;
    private int anoPlanta;
    private double superficie;
    private int bloque;
    private int codigoContrato;

    public Orden(int idOrden, int anoPlanta, double superficie, int bloque, int codigoContrato) {
        this.idOrden = idOrden;
        this.anoPlanta = anoPlanta;
        this.superficie = superficie;
        this.bloque = bloque;
        this.codigoContrato = codigoContrato;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getAnoPlanta() {
        return anoPlanta;
    }

    public void setAnoPlanta(int anoPlanta) {
        this.anoPlanta = anoPlanta;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

    public int getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(int codigoContrato) {
        this.codigoContrato = codigoContrato;
    }
    
    public String getClaveIndice() {
    return "ORD-" + this.idOrden; 
}
      @Override
    public String toString() {
        return "Orden [ID->" + idOrden + ", Año Planta->" + anoPlanta + ", Superficie->" + superficie + ", Bloque->"+bloque+", Codigo Contrato->"+ codigoContrato+"]";
    }  
    
}
