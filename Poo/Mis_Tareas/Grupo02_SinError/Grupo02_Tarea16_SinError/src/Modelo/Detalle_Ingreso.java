package Modelo;

public class Detalle_Ingreso {
    
    private int iddetalle_ingreso;
    private int idingreso;
    private int idarticulo;
    private int cantidad;
    private double precio_compra;
    private double precio_venta;

    public Detalle_Ingreso() {
    }
    
    public Detalle_Ingreso(Object[] registro){
        iddetalle_ingreso = Integer.parseInt(registro[0]+"");
        idingreso = Integer.parseInt(registro[1]+"");
        idarticulo = Integer.parseInt(registro[2] + "");
        cantidad = Integer.parseInt(registro[3] + "");
        precio_compra = Double.parseDouble(registro[4] + "");
        precio_venta = Double.parseDouble(registro[5] + "");   
    }
    
    public Object[] getRegistro(){
        return new Object[]{iddetalle_ingreso, idingreso, idarticulo, cantidad, precio_compra, precio_venta};
    } 

    public int getIddetalle_ingreso() {
        return iddetalle_ingreso;
    }

    public void setIddetalle_ingreso(int iddetalle_ingreso) {
        this.iddetalle_ingreso = iddetalle_ingreso;
    }

    public int getIdingreso() {
        return idingreso;
    }

    public void setIdingreso(int idingreso) {
        this.idingreso = idingreso;
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

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }
  
    
    
    
    
    
    
    
    
    
}
