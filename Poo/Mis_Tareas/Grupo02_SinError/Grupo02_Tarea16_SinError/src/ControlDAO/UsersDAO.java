package ControlDAO;

import AccesoBD.ConectaBD;
import Control.Arreglo_Users;
import Modelo.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UsersDAO {

    public static void Insertar(Users Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("insert into users(name,email,password) value(?,?,?)");
            ps.setString(1, Elemento.getName());
            ps.setString(2, Elemento.getEmail());
            ps.setString(3, Elemento.getPassword());
            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Registro de usuario exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar el usuario");
            }
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void Actualizar(Users Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update users set name = ?, email = ?, password = ? where id = ?");
            ps.setString(1, Elemento.getName());
            ps.setString(2, Elemento.getEmail());
            ps.setString(3, Elemento.getPassword());
            ps.setInt(4, Elemento.getId());
            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Actualización de usuario exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el usuario");
            }
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void Eliminar(Users Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update users set eliminado=1 where id = ?");
            ps.setInt(1, Elemento.getId());
            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Eliminación del usuario exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el usuario");
            }
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void ConsultarTodos(JTable control) {
        String[] cabecera = {"Código", "Name", "Email", "Password"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from users where eliminado=0");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                modTabla.addRow(registro);
            }
            rs.close();
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static int ContarRegistros() {
        int count = 0;
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select count(*) from users");
            ResultSet rs = ps.executeQuery();
            rs.next();
            count = rs.getInt(1);
            rs.close();
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return count;
    }
    
    public static void ConsultarTodosU(JComboBox control, Arreglo_Users arreglo) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        arreglo.Inicializar();
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from users");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4)};
                if (rs.getInt(5) == 0) {
                   modCombo.addElement(rs.getString(2)); 
                }
                arreglo.Agregar(new Users(registro));
            }
            rs.close();
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
