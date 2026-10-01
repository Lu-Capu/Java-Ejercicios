package Modelo;

import java.io.File;

public class Articulo {
    //ATRIBUTOS
    private int idarticulo;
    private int idcategoria;
    private String codigo;
    private String nombre;
    private int stock;
    private String descripcion;
    private File imagen;
    private String estado;
    //CONSTRUCTOR VACÍO
    public Articulo() {
    }
    //METODOS
    public Articulo(Object[] registro){
        idarticulo = Integer.parseInt(registro[0]+"");
        idcategoria = Integer.parseInt(registro[1]+"");
        codigo = registro[2]+"";
        nombre = registro[3]+"";
        stock = Integer.parseInt(registro[4]+"");
        descripcion = registro[5]+"";
        //imagen = registro[6]+"";
        estado = registro[7]+"";
    }
    public Object[] getRegistro(){
        return new Object[]{idarticulo, idcategoria, codigo, nombre, stock, descripcion, imagen, estado};
    }
    //GETTER Y SETTERS
    public int getIdarticulo() {return idarticulo;}
    public void setIdarticulo(int idarticulo) {this.idarticulo = idarticulo;}

    public int getIdcategoria() {return idcategoria;}
    public void setIdcategoria(int idcategoria) {this.idcategoria = idcategoria;}

    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getStock() {return stock;}
    public void setStock(int stock) {this.stock = stock;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String description) {this.descripcion = description;}

    public File getImagen() {return imagen;}
    public void setImagen(File imagen) {this.imagen = imagen;}

    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}   
}
