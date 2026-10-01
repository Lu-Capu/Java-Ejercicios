package Modelo;

public class Alumnos {
     private String nombres;
    private String apellidos;

    public Alumnos(String nombres, String apellidos) {
        this.nombres = nombres.trim().toUpperCase();
        this.apellidos = apellidos.trim().toUpperCase();
    }

    public Alumnos() {
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombres=" + nombres + ", apellidos=" + apellidos + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Alumnos) {
            Alumnos otro = (Alumnos) obj;
            return this.nombres.equalsIgnoreCase(otro.nombres)&&
                   this.apellidos.equalsIgnoreCase(otro.apellidos);
                    
        }
        return false; 
    }
    
    public boolean contieneTexto(String texto){
       return (nombres + " " + apellidos).toLowerCase().contains(texto.toLowerCase());
    }
}
