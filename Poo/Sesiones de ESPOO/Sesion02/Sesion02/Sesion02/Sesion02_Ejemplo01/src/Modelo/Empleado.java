package Modelo;


public class Empleado {
    
 private int id;
 private String nombre; 
 private String puesto; 
 private double salario; 
 private int departamento_asignado; 

    public Empleado(int id, String nombre, String puesto, double salario, int departamento_asignado) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.departamento_asignado = departamento_asignado;
    }
    
    public Object[] getRegistro(){
        return new Object[]{
          id,
         nombre,
         puesto,
         salario,
         departamento_asignado
        };
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getDepartamento_asignado() {
        return departamento_asignado;
    }

    public void setDepartamento_asignado(int departamento_asignado) {
        this.departamento_asignado = departamento_asignado;
    }
    
    
 
 
 
}
