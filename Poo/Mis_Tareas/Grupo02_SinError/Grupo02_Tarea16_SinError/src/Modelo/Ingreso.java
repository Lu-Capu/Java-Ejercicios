package Modelo;

public class Ingreso {
    
    private int idingreso;
    private int idproveedor;
    private String tipo_comprobante;
    private String serie_comprobante;
    private String num_comprobante;
    private String fecha_hora;
    private double impuesto = 0.18;
    private String estado;

    public Ingreso() {
    }
    
    public static String generarSerieComprobante(int numero) {
        return String.format("%07d", numero); 
    }
    
    public static String generarNumComprobante(int numero) {
        return String.format("%010d", numero); 
    }

    public Ingreso(Object[] registro){
        idingreso = Integer.parseInt(registro[0]+"");
        idproveedor = Integer.parseInt(registro[1]+"");
        tipo_comprobante = registro[2]+"";
        serie_comprobante = registro[3]+"";
        num_comprobante = registro[4] + "";
        fecha_hora = registro[5]+"";
        impuesto = Double.parseDouble(registro[6]+"");
        estado = registro[7]+"";  
    }
    
    public Object[] getRegistro(){
        return new Object[]{idingreso, idproveedor, tipo_comprobante, serie_comprobante, num_comprobante,fecha_hora, impuesto,estado};
    }    

    public int getIdingreso() {
        return idingreso;
    }

    public void setIdingreso(int idingreso) {
        this.idingreso = idingreso;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }  
}
