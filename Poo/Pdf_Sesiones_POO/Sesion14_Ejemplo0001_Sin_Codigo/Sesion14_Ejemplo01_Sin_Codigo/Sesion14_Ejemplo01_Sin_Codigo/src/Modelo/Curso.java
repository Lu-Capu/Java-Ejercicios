package Modelo;

public class Curso {
    private int CodCurso;
    private String Nombre;
    
    public Curso(){
        
    }
    
    public Curso(Object[] Registro){
        CodCurso = Integer.parseInt(Registro[0].toString());
        Nombre = Registro[1].toString();
    }
    
    public Object[] getRegistro(){
        return new Object[]{CodCurso,Nombre};
    }

    public int getCodCurso() {
        return CodCurso;
    }

    public void setCodCurso(int CodCurso) {
        this.CodCurso = CodCurso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
}
