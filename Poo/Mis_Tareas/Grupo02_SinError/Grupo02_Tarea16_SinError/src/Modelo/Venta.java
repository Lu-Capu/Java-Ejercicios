package Modelo;

public class Venta {
    private int idventa;
    private int idcliente;
    private int idusuario;
    private String tipo_comprobante;
    private String serie_comprobante;
    private String num_comprobante;
    private String fecha_hora;
    private double impuesto = 0.18;
    private double total_venta;
    private String estado;

    public Venta() {}
    
    public static String generarSerieComprobante(int numero) {
        return String.format("%07d", numero); 
    }
    
    public static String generarNumComprobante(int numero) {
        return String.format("%010d", numero); 
    }

    public Venta(Object[] registro){
        idventa = Integer.parseInt(registro[0]+"");
        idcliente = Integer.parseInt(registro[1]+"");
        idusuario = Integer.parseInt(registro[2]+"");
        tipo_comprobante = registro[3]+"";
        serie_comprobante = registro[4]+"";
        num_comprobante = registro[5]+"";
        fecha_hora = registro[6]+"";
        impuesto = Double.parseDouble(registro[7].toString());
        total_venta = Double.parseDouble(registro[8].toString());
        estado = registro[9]+"";
        
    }
    
    public Object[] getRegistro(){
        return new Object[]{idventa,idcliente,idusuario,tipo_comprobante,serie_comprobante,num_comprobante,
                            fecha_hora,impuesto,total_venta,estado};
    }
    
    // Getters y Setters
    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getTipo_comprobante() {
        return tipo_comprobante;
    }

    public void setTipo_comprobante(String tipo_comprobante) {
        this.tipo_comprobante = tipo_comprobante;
    }

    public String getSerie_comprobante() {
        return serie_comprobante;
    }

    public void setSerie_comprobante(String serie_comprobante) {
        this.serie_comprobante = serie_comprobante;
    }

    public String getNum_comprobante() {
        return num_comprobante;
    }

    public void setNum_comprobante(String num_comprobante) {
        this.num_comprobante = num_comprobante;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(double total_venta) {
        this.total_venta = total_venta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
