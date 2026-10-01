package Modelo;

public class Estudiante {
    private int CodEstudiante;
    private String Nombres;
    private String Apellidos;
    private String Foto;
    private int CodCurso;
    
    public Estudiante(){
        
    }
    
    public Estudiante(Object[] Registro){
        CodEstudiante = Integer.parseInt(Registro[0].toString());
        Nombres = Registro[1].toString();
        Apellidos = Registro[2].toString();
        Foto = Registro[3].toString();
        CodCurso = Integer.parseInt(Registro[4].toString());
    }
    
    public Object[] getRegistro(){
        return new Object[]{CodEstudiante,Nombres,Apellidos,Foto,CodCurso};        
    }

    public int getCodEstudiante() {
        return CodEstudiante;
    }

    public void setCodEstudiante(int CodEstudiante) {
        this.CodEstudiante = CodEstudiante;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

    public int getCodCurso() {
        return CodCurso;
    }

    public void setCodCurso(int CodCurso) {
        this.CodCurso = CodCurso;
    }
    
    
}
