
package Molde;


public class Ing_Civil extends Constructor implements NewInterface{
private String Actividad;
private int numeros_obras;

    public Ing_Civil(String Actividad, int numeros_obras, String codigo, String apellido, String nombre, String condicion_contrato, String especialidad) {
        super(codigo, apellido, nombre, condicion_contrato, especialidad);
        this.Actividad = Actividad;
        this.numeros_obras = numeros_obras;
    }

    public String getActividad() {
        return Actividad;
    }

    public void setActividad(String Actividad) {
        this.Actividad = Actividad;
    }

    public int getNumeros_obras() {
        return numeros_obras;
    }

    public void setNumeros_obras(int numeros_obras) {
        this.numeros_obras = numeros_obras;
    }

    
    
    @Override
    public double Sueldo_Base() {
        int sueldo = 0;
       if(getCondicion_contrato().equals("Estable") && getActividad().equals("Supervisión de Obras")){
           sueldo=4000;
       }else if(getCondicion_contrato().equals("Estable") && getActividad().equals("Supervisión de Vías")){
           sueldo=6000;
       }else if(getCondicion_contrato().equals("Contratado") && getActividad().equals("Supervisión de Obras")){
          sueldo=2000;  
       }else if(getCondicion_contrato().equals("Contratado") && getActividad().equals("Supervisión de Vías")){
            sueldo=4500; 
       }
           return sueldo;
    }

    @Override
    public double Descuentos() {
     double des = 0;
      if(getNumeros_obras() < 17){
           des = 300 * 0.17;
       }else if(getNumeros_obras() <= 17){
            des= 600 * 0.05;
       }
      return des;
    }

    @Override
    public double Bonificacion() {
        double boni = 0;
       if(getEspecialidad().equals("Estructuras")){
           boni=Sueldo_Base() * 0.16;
       }else if(getEspecialidad().equals("Recursos Hídricos")){
            boni=Sueldo_Base() * 0.18; 
       }else if(getEspecialidad().equals("ngeniería Vial")){
            boni=Sueldo_Base() * 0.22; 
       }
       return boni;
    }

    
@Override
 public Object[] getRegistrar(){
     return new Object[]{
     getApellido(),
         getNombre(),
         getCodigo(),
         getCondicion_contrato(),
         getEspecialidad(),
         getActividad(),
         getNumeros_obras()
     };
 }   


  
 
 
@Override
    public Object[] getCadena(){
      return new Object[]{
     getApellido()+"\t"+ 
     getNombre()+"\t"+ 
     getCodigo()+"\t"+ 
     getCondicion_contrato()+"\t"+ 
     getEspecialidad()+"\t"+ 
     getActividad()+"\t"+ 
     getNumeros_obras()
   
      };
  } 
 
 
    

}
