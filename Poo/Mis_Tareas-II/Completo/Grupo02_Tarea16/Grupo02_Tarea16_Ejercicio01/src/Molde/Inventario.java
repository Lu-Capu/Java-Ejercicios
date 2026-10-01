package Molde;

public class Inventario {

    private int idInventario;
    private String realizo;

    public Inventario(int idInventario, String realizo) {
        this.idInventario = idInventario;
        this.realizo = realizo;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public String getRealizo() {
        return realizo;
    }

    public void setRealizo(String realizo) {
        this.realizo = realizo;
    }

    public String getClaveIndice() {
        return "INV-" + this.idInventario;
    }

    @Override
    public String toString() {
        return "Inventario [ID->" + idInventario + ", Realizó->" + realizo + "]";
    }

}
