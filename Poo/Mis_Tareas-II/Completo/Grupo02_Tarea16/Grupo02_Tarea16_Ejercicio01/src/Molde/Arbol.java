package Molde;

public class Arbol {

    private int id;
    private String fuente;
    private String especie;
    private double edad;
    private int numArbol;
    private double diametro;
    private double altura;
    private int codigoSitio;
    private int fecha;

    public Arbol(int id, String fuente, String especie, double edad, int numArbol, double diametro, double altura, int codigoSitio, int fecha) {
        this.id = id;
        this.fuente = fuente;
        this.especie = especie;
        this.edad = edad;
        this.numArbol = numArbol;
        this.diametro = diametro;
        this.altura = altura;
        this.codigoSitio = codigoSitio;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public int getNumArbol() {
        return numArbol;
    }

    public void setNumArbol(int numArbol) {
        this.numArbol = numArbol;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getCodigoSitio() {
        return codigoSitio;
    }

    public void setCodigoSitio(int codigoSitio) {
        this.codigoSitio = codigoSitio;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getClaveIndice() {
        return "ARB-" + this.id;
    }

    @Override
    public String toString() {
        return "Arbol [ID->" + id + ", Fuente->" + fuente + ", Especie->" + especie + ", Edad->" + edad + ", Num Arbol->" + numArbol +", Diametro->"+diametro+ ", Altura->"+altura+", Codigo Sitio->"+codigoSitio+", Fecha->"+fecha+"]";
    }

}
