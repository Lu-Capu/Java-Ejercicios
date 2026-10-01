package Control;

import AccesoDB.ConectaDB;
import Modelo.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EstudianteDAO {
    public static void Insertar(Estudiante Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("insert into estudiante(nombres,apellidos,foto,codcurso) value(?,?,?,?)");
            ps.setString(1, Elemento.getNombres());
            ps.setString(2, Elemento.getApellidos());
            ps.setString(3, Elemento.getFoto());
            ps.setInt(4, Elemento.getCodCurso());
            int rpta = ps.executeUpdate();
            if(rpta > 0){
                JOptionPane.showMessageDialog(null,"Registro Exitoso");
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo registrar");
            }
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void Actualizar(Estudiante Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update estudiante set nombres = ?,apellidos = ?,foto = ?,codcurso = ? where codestudiante = ?");
            ps.setString(1, Elemento.getNombres());
            ps.setString(2, Elemento.getApellidos());
            ps.setString(3, Elemento.getFoto());
            ps.setInt(4, Elemento.getCodCurso());
            ps.setInt(5, Elemento.getCodEstudiante());
            int rpta = ps.executeUpdate();
            if(rpta > 0){
                JOptionPane.showMessageDialog(null,"Actualización Exitosa");
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo registrar");
            }
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void Eliminar(Estudiante Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("delete from estudiante where codestudiante = ?");
            ps.setInt(1, Elemento.getCodEstudiante());
            int rpta = ps.executeUpdate();
            if(rpta > 0){
                JOptionPane.showMessageDialog(null,"Eliminación Exitosa");
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo eliminar");
            }
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
        }
    }
    
    public static void ConsultarTodos(JTable control, Arreglo_Estudiante arreglo){
        String[] cabecera = {"Código","Nombres","Apellidos","Foto","Curso"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);  
        arreglo.Inicializar();
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement(
                    "select e.codestudiante, e.nombres, e.apellidos, e.foto, c.nombre, c.codcurso "
                            + "from estudiante e, curso c "
                            + "where e.codcurso = c.codcurso order by e.apellidos asc");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Object[] registro1 = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                modTabla.addRow(registro1);
                Object[] registro2 = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(6)};
                arreglo.Agregar(new Estudiante(registro2));
            }
            rs.close();
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
}
