package Modelo;

public class Operacion_Prestamo {
    private int cliente_Asignado;
    private String tipo_Asignado;
    private double monto_Inicial;
    private double saldo_Pendiente;

    public Operacion_Prestamo(int cliente_Asignado, String tipo_Asignado, double monto_Inicial, double saldo_Pendiente) {
        this.cliente_Asignado = cliente_Asignado;
        this.tipo_Asignado = tipo_Asignado;
        this.monto_Inicial = monto_Inicial;
        this.saldo_Pendiente = saldo_Pendiente;
    }
 
    public Object[] ObtenerRegistro(){
        return new Object[]{cliente_Asignado, tipo_Asignado, monto_Inicial, saldo_Pendiente};
    }

    public int getCliente_Asignado() {
        return cliente_Asignado;}

    public void setCliente_Asignado(int cliente_Asignado) {
        this.cliente_Asignado = cliente_Asignado;}

    public String getTipo_Asignado() {
        return tipo_Asignado;}

    public void setTipo_Asignado(String tipo_Asignado) {
        this.tipo_Asignado = tipo_Asignado;
    }

    public double getMonto_Inicial() {
        return monto_Inicial;
    }

    public void setMonto_Inicial(double monto_Inicial) {
        this.monto_Inicial = monto_Inicial;
    }

    public double getSaldo_Pendiente() {
        return saldo_Pendiente;
    }

    public void setSaldo_Pendiente(double saldo_Pendiente) {
        this.saldo_Pendiente = saldo_Pendiente;
    }
    
    
}
