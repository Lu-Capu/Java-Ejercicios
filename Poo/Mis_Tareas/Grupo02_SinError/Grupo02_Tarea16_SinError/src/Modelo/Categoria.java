package Modelo;

public class Categoria {
    
    private int idcategoria;
    private String nombre;
    private String descripcion;
    private String condicion;

    public Categoria() {
    }
    
    public Categoria(Object[] registro){
        idcategoria = Integer.parseInt(registro[0]+"");
        nombre = registro[1]+"";
        descripcion = registro[2]+"";
        condicion = registro[3]+"";
    }
    
    public Object[] getRegistro(){
        return new Object[]{idcategoria,nombre,descripcion,condicion};
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
    
    

    
}
