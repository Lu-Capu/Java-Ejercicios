package Molde;

public abstract class Constructor implements NewInterface{
 private String codigo;
 private String apellido;
 private String nombre;
 private String condicion_contrato;
 private String especialidad;

    public Constructor(String codigo, String apellido, String nombre, String condicion_contrato, String especialidad) {
        this.codigo = codigo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.condicion_contrato = condicion_contrato;
        this.especialidad = especialidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCondicion_contrato() {
        return condicion_contrato;
    }

    public void setCondicion_contrato(String condicion_contrato) {
        this.condicion_contrato = condicion_contrato;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
 
 //Metodos abstractos
    public abstract double Sueldo_Base();
    public abstract double Descuentos();
    public abstract double Bonificacion();
    
  //Metodos No abstractos
    public double sueldo_bruto(){
     return Sueldo_Base() + Bonificacion(); 
    };
    
     public double sueldo_neto(){
    
     return sueldo_bruto() - Descuentos();
    
    };
    
   //Visializacion
     //txt_Area
 public String Visualizar(){
     return
  "Codigo: " + getCodigo() + "\n"+
  "Nombre: " + getNombre()+ "\n" + 
  "Apellidos: " + getApellido()+ "\n" + 
  "Sueldo Base: " + Sueldo_Base()+ "\n" +           
  "Bonificaciones :" + Bonificacion()+ "\n" + 
  "Descuento :" + Descuentos()+ "\n" +     
  "Sueldo Bruto: " + sueldo_bruto() + "\n" + 
  "Sueldo Neto: " + sueldo_neto()
             
             
    ;}


public Object[] getRegistrar(){
      return new Object[]{
     getApellido(),
     getNombre(),
     getCodigo(),
     getCondicion_contrato(),
     getEspecialidad(),
   
      };
  } 

   public Object[] getCadena(){
      return new Object[]{
     getApellido() +"\t"+ 
     getNombre()+"\t"+ 
     getCodigo()+"\t"+ 
     getCondicion_contrato()+"\t"+ 
     getEspecialidad()
   
      };
  } 
      
    
   
   
    @Override
    public double AFP() {
     return sueldo_neto() * 0.05;
    }

    @Override
    public double Essalud() {
     return sueldo_neto() * 0.17; 
    }
    
    
    
    
    
    
}
