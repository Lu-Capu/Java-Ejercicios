package Molde;

public class Sitio {

    private int idSitio;
    private int sitios;
    private int codigoOrden;

    public Sitio(int idSitio, int sitios, int codigoOrden) {
        this.idSitio = idSitio;
        this.sitios = sitios;
        this.codigoOrden = codigoOrden;
    }

    public int getIdSitio() {
        return idSitio;
    }

    public void setIdSitio(int idSitio) {
        this.idSitio = idSitio;
    }

    public int getSitios() {
        return sitios;
    }

    public void setSitios(int sitios) {
        this.sitios = sitios;
    }

    public int getCodigoOrden() {
        return codigoOrden;
    }

    public void setCodigoOrden(int codigoOrden) {
        this.codigoOrden = codigoOrden;
    }

    public String getClaveIndice() {
        return "SIT-" + this.idSitio;
    }

    @Override
    public String toString() {
        return "Sitios [ID->" + idSitio + ", Sitios->" + sitios  + ", Codigo Orden->"+codigoOrden + "]";
    }
}
