package Modelo;

public class Detalle_Venta {
  
    private int iddetalle_venta;
    private int idventa;
    private int idarticulo;
    private int cantidad;
    private double precio_venta;
    private double descuento;

    public Detalle_Venta(){  
    }

    public Detalle_Venta(Object[] registro){
        iddetalle_venta = Integer.parseInt(registro[0]+"");
        idventa = Integer.parseInt(registro[1]+"");
        
        idarticulo = Integer.parseInt(registro[2]+"");
        cantidad = Integer.parseInt(registro[3]+"");
        precio_venta = Double.parseDouble(registro[4] + "" );
        descuento = Double.parseDouble(registro[5] + "");   
    }
    
    public Object[] getRegistro(){
        return new Object[]{iddetalle_venta, idventa, idarticulo, cantidad, precio_venta, descuento};
    }   
    
    public int getIddetalle_venta() {
        return iddetalle_venta;
    }

    public void setIddetalle_venta(int iddetalle_venta) {
        this.iddetalle_venta = iddetalle_venta;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(int idarticulo) { 
        this.idarticulo = idarticulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
    




    
    
}
