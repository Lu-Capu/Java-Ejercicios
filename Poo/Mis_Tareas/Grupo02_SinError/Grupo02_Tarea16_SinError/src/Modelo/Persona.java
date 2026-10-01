package Modelo;

public class Persona {
    
    private int idpersona;
    private String tipo_persona;
    private String nombre;
    private String tipo_documento;
    private String num_documento;
    private String direccion;
    private String telefono;
    private String email;

    public Persona() {
    }
    
    public Persona(Object[] registro){
        idpersona = Integer.parseInt(registro[0]+"");
        tipo_persona = registro[1]+"";
        nombre = registro[2]+"";
        tipo_documento = registro[3]+"";
        num_documento = registro[4]+"";
        direccion = registro[5]+"";
        telefono = registro[6]+"";
        email = registro[7]+"";
    }
    
    public Object[] getRegistro(){
        return new Object[]{idpersona,tipo_persona,nombre,tipo_documento,num_documento,direccion,telefono,email};
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(String num_documento) {
        this.num_documento = num_documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }   
}
