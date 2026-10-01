package Modelo;

public class Tipo_Prestamo {
    private int codigo_Prestamo;
    private String nombre_Tipo;
    private int tasa_Interes_Anual;
    private int plazo_Maximo_Meses;

    public Tipo_Prestamo(int codigo_Prestamo, String nombre_Tipo, int tasa_Interes_Anual, int plazo_Maximo_Meses) {
        this.codigo_Prestamo = codigo_Prestamo;
        this.nombre_Tipo = nombre_Tipo;
        this.tasa_Interes_Anual = tasa_Interes_Anual;
        this.plazo_Maximo_Meses = plazo_Maximo_Meses;
    }
    
    public Object[] ObtenerRegistro(){
        return new Object[]{codigo_Prestamo, nombre_Tipo, tasa_Interes_Anual, plazo_Maximo_Meses};
    }

    public int getCodigo_Prestamo() {
        return codigo_Prestamo;}

    public void setCodigo_Prestamo(int codigo_Prestamo) {
        this.codigo_Prestamo = codigo_Prestamo;}

    public String getNombre_Tipo() {
        return nombre_Tipo;}

    public void setNombre_Tipo(String nombre_Tipo) {
        this.nombre_Tipo = nombre_Tipo;}

    public int getTasa_Interes_Anual() {
        return tasa_Interes_Anual;}

    public void setTasa_Interes_Anual(int tasa_Interes_Anual) {
        this.tasa_Interes_Anual = tasa_Interes_Anual;}

    public int getPlazo_Maximo_Meses() {
        return plazo_Maximo_Meses;}

    public void setPlazo_Maximo_Meses(int plazo_Maximo_Meses) {
        this.plazo_Maximo_Meses = plazo_Maximo_Meses;}   
}
