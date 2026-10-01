package Control;

import AccesoDB.ConectaDB;
import Modelo.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CursoDAO {
    
    public static void Insertar(Curso Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("insert into curso(nombre) value(?)");
            ps.setString(1, Elemento.getNombre());
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
    
    public static void Actualizar(Curso Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update curso set nombre = ? where codcurso = ? ");
            ps.setString(1, Elemento.getNombre());
            ps.setInt(2, Elemento.getCodCurso());
            int rpta = ps.executeUpdate();
            if(rpta > 0){
                JOptionPane.showMessageDialog(null,"Actualización Exitosa");
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo actualizar");
            }
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void Eliminar(Curso Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            //PreparedStatement ps = cn.prepareStatement("delete from curso where codcurso = ?");
            PreparedStatement ps = cn.prepareStatement("update curso set eliminado=1 where codcurso = ?");
            ps.setInt(1, Elemento.getCodCurso());
            int rpta = ps.executeUpdate();
            if(rpta > 0){
                JOptionPane.showMessageDialog(null,"Eliminación Exitosa");
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo eliminar");
            }
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void ConsultarTodos(JTable control){
        String[] cabecera = {"Código","Nombre"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from curso where eliminado=0");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Object[] registro = {rs.getInt(1), rs.getString(2)};
                modTabla.addRow(registro);
            }
            rs.close();
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
    
    public static int ContarRegistros(){
        int count = 0;
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select count(*) from curso");
            ResultSet rs = ps.executeQuery();
            rs.next();
            count = rs.getInt(1);
            rs.close();
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return count;
    }
    
    public static void ConsultarTodos(JComboBox control, Arreglo_Curso arreglo){        
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        arreglo.Inicializar();
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from curso order by nombre asc");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Object[] registro = {rs.getInt(1), rs.getString(2)};
                if(rs.getInt(3) == 0){
                    modCombo.addElement(rs.getString(2));
                }                
                arreglo.Agregar(new Curso(registro));
            }
            rs.close();
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
}
