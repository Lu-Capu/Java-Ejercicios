package Molde;

public class Huesped {
    private int dni;
    private String apellido;
    private String nombre;
    private int numero;
    private int fecha_ingreso_dias;
    private int fecha_ingreso_meses;
    private int fecha_ingreso_año;
    private int fecha_salida_dias;
private int fecha_salida_meses;
private int fecha_salida_año;
    public Huesped(int dni, String apellido, String nombre, int numero) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.numero = numero;
    }

    public Huesped() {
    }
    

    public Huesped(int fecha_ingreso_dias, int fecha_ingreso_meses, int fecha_ingreso_año) {
        this.fecha_ingreso_dias = fecha_ingreso_dias;
        this.fecha_ingreso_meses = fecha_ingreso_meses;
        this.fecha_ingreso_año = fecha_ingreso_año;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFecha_ingreso_dias() {
        return fecha_ingreso_dias;
    }

    public void setFecha_ingreso_dias(int fecha_ingreso_dias) {
        this.fecha_ingreso_dias = fecha_ingreso_dias;
    }

    public int getFecha_ingreso_meses() {
        return fecha_ingreso_meses;
    }

    public void setFecha_ingreso_meses(int fecha_ingreso_meses) {
        this.fecha_ingreso_meses = fecha_ingreso_meses;
    }

    public int getFecha_ingreso_año() {
        return fecha_ingreso_año;
    }

    public void setFecha_ingreso_año(int fecha_ingreso_año) {
        this.fecha_ingreso_año = fecha_ingreso_año;
    }

    public int getFecha_salida_dias() {
        return fecha_salida_dias;
    }

    public void setFecha_salida_dias(int fecha_salida_dias) {
        this.fecha_salida_dias = fecha_salida_dias;
    }

    public int getFecha_salida_meses() {
        return fecha_salida_meses;
    }

    public void setFecha_salida_meses(int fecha_salida_meses) {
        this.fecha_salida_meses = fecha_salida_meses;
    }

    public int getFecha_salida_año() {
        return fecha_salida_año;
    }

    public void setFecha_salida_año(int fecha_salida_año) {
        this.fecha_salida_año = fecha_salida_año;
    }

  
 
 
  
   
    
}
