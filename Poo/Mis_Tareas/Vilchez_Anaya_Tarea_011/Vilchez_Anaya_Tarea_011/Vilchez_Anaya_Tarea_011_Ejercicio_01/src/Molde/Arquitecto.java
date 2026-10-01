package Molde;

public class Arquitecto extends Constructor implements NewInterface{
  
 private int numero_proyecto;
 private String cargo;

    public Arquitecto(int numero_proyecto, String cargo, String codigo, String apellido, String nombre, String condicion_contrato, String especialidad) {
        super(codigo, apellido, nombre, condicion_contrato, especialidad);
        this.numero_proyecto = numero_proyecto;
        this.cargo = cargo;
    }

   @Override
 public Object[] getRegistrar(){
     return new Object[]{
     getApellido(),
         getNombre(),
         getCodigo(),
         getCondicion_contrato(),
         getEspecialidad(),
         getCargo(),
         getNumero_proyecto(),
         
     };
 }    
    
  public Object[] getCadena(){
      return new Object[]{
      getApellido() + "\t"+
      getCodigo()+ "\t"+
      getCondicion_contrato()+ "\t"+
      getEspecialidad()+ "\t"+
      getCargo()+ "\t"+
     getNumero_proyecto()
      
      
      };
      
  } 


 
    
    
    
    public int getNumero_proyecto() {
        return numero_proyecto;
    }

    public void setNumero_proyecto(int numero_proyecto) {
        this.numero_proyecto = numero_proyecto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

  

    @Override
    public double Sueldo_Base() {
       int sueldo = 0;
       if(getCondicion_contrato().equals("Estable") || getEspecialidad().equals("Restauración y Rehabilitación")){
           sueldo=4600;
       }else if(getCondicion_contrato().equals("Estable") || getEspecialidad().equals("Materiales de Construcción")){
           sueldo=7500;
       }else if(getCondicion_contrato().equals("Estable") || getEspecialidad().equals("Paisajismo y jardinería")){
          sueldo=4860;  
       }else if(getCondicion_contrato().equals("Contratado") || getEspecialidad().equals("Restauración y Rehabilitación")){
            sueldo=3980 ; 
       }else if(getCondicion_contrato().equals("Contratado") || getEspecialidad().equals("Materiales de Construcción")){
            sueldo=4600; 
       }else if(getCondicion_contrato().equals("Contratado") || getEspecialidad().equals("Paisajismo y jardinería")){
            sueldo=4600; 
       }
       
   
           return sueldo;
    }

    @Override
    public double Descuentos() {
        double des =0;
       des = Sueldo_Base() * 0.17;
        
        
        return des;
    }

    @Override
    public double Bonificacion() {
       double boni = 0;
       if(getCargo().equals("Director de Obras")){
          boni=Sueldo_Base() * 0.25;
       }else if(getCargo().equals("Edificador Industria")){
          boni=Sueldo_Base() * 0.29; 
       }
       return boni;
    }
 
    
    
    
}
