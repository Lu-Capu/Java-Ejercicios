package Modelo;

public class Cliente {
    private int ci_Cliente;
    private String nombre_Completo;
    private double ingreso_Mensual;
    private double total_Deuda_Acumulada = 0;

    public Cliente(int ci_Cliente, String nombre_Completo, double ingreso_Mensual) {
        this.ci_Cliente = ci_Cliente;
        this.nombre_Completo = nombre_Completo;
        this.ingreso_Mensual = ingreso_Mensual;
    }

    public Object[] ObtenerRegistro(){
        return new Object[]{ci_Cliente, nombre_Completo, ingreso_Mensual, total_Deuda_Acumulada};
    }

    public int getCI_Cliente() {
        return ci_Cliente;}

    public void setCI_Cliente(int ci_Cliente) {
        this.ci_Cliente = ci_Cliente;}

    public String getNombre_Completo() {
        return nombre_Completo;}

    public void setNombre_Completo(String nombre_Completo) {
        this.nombre_Completo = nombre_Completo;}

    public double getIngreso_Mensual() {
        return ingreso_Mensual;}

    public void setIngreso_Mensual(double ingreso_Mensual) {
        this.ingreso_Mensual = ingreso_Mensual;}

    public double getTotal_Deuda_Acumulada() {
        return total_Deuda_Acumulada;}

    public void setTotal_Deuda_Acumulada(double total_Deuda_Acumulada) {
        this.total_Deuda_Acumulada = total_Deuda_Acumulada;}  
}
