package Molde;


public class Usuario {
    private int id;
   private String nombre;// 0
   private String apellido;// 1
   private String usuario; // 2 
   private String clave; // 3 
   private int permiso; //4

public Usuario(Object[] Registro){
    nombre=Registro[0].toString();
    apellido=Registro[1].toString();
    usuario=Registro[2].toString();
    clave=Registro[3].toString();
    permiso=Integer.parseInt(Registro[4].toString());
    
}

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
 
   
   
   
   public Object[] getRegistro(){
       return new Object[]{
        nombre,
        apellido,
        usuario,
        clave,
        permiso
        
       };
   }
   
   
   
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getPermiso() {
        return permiso;
    }

    public void setPermiso(int permiso) {
        this.permiso = permiso;
    }
   
   
   
   
   
   
    
}
