package Molde;

public class Habitacion {
    private int numero;
    private String estado; //estado sera igual a disponible o a No disponible
    private Huesped  ObjHuesped01;
    private Huesped  ObjHuesped02;
    private Huesped  ObjHuesped03;

    public Habitacion(int numero, String estado) {
        this.numero = numero;
        this.estado = estado;
    }

    public Habitacion(int numero, String estado, Huesped ObjHuesped01, Huesped ObjHuesped02, Huesped ObjHuesped03) {
        this.numero = numero;
        this.estado = estado;
        this.ObjHuesped01 = ObjHuesped01;
        this.ObjHuesped02 = ObjHuesped02;
        this.ObjHuesped03 = ObjHuesped03;
    }

    
    
    
    
    
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Huesped getObjHuesped01() {
        return ObjHuesped01;
    }

    public void setObjHuesped01(Huesped ObjHuesped01) {
        this.ObjHuesped01 = ObjHuesped01;
    }

    public Huesped getObjHuesped02() {
        return ObjHuesped02;
    }

    public void setObjHuesped02(Huesped ObjHuesped02) {
        this.ObjHuesped02 = ObjHuesped02;
    }

    public Huesped getObjHuesped03() {
        return ObjHuesped03;
    }

    public void setObjHuesped03(Huesped ObjHuesped03) {
        this.ObjHuesped03 = ObjHuesped03;
    }
    
    
    
}
