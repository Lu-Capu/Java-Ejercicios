package Molde;


public class Predio {

    private int idPredio;
    private String predio;
    private String zona;
    private int codigoInventario;

    public Predio(int idPredio, String predio, String zona, int codigoInventario) {
        this.idPredio = idPredio;
        this.predio = predio;
        this.zona = zona;
        this.codigoInventario = codigoInventario;
    }

    public int getIdPredio() {
        return idPredio;
    }

    public void setIdPredio(int idPredio) {
        this.idPredio = idPredio;
    }

    public String getPredio() {
        return predio;
    }

    public void setPredio(String predio) {
        this.predio = predio;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getCodigoInventario() {
        return codigoInventario;
    }

    public void setCodigoInventario(int codigoInventario) {
        this.codigoInventario = codigoInventario;
    }

    public String getClaveIndice() {
        return "PRE-" + this.idPredio;
    }
    @Override
    public String toString() {
        return "Predio [ID->" + idPredio + ", Predio->" + predio + ", Zona->"+zona+", Codigo Inventario->"+codigoInventario +"]";
    }

}
