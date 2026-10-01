package Molde;

public class Tipo_Comida {
    
 private String id_comida;
private String nombre;


public Tipo_Comida(Object[] Registro){
 id_comida = Registro[0].toString();
  nombre=Registro[1].toString();
    
}

public Object[] getRegistro(){
    return new Object[]{
  id_comida,
    nombre    
    };
}




    public Tipo_Comida() {
    }

    public String getId_comida() {
        return id_comida;
    }

    public void setId_comida(String id_comida) {
        this.id_comida = id_comida;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
  







}
