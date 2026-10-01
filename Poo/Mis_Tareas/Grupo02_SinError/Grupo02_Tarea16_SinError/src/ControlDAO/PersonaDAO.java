package ControlDAO;

import AccesoBD.ConectaBD;
import Control.Arreglo_Personas;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PersonaDAO {

    public static void Insertar(Persona Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("insert into persona(tipo_persona,nombre,tipo_documento,num_documento, direccion, telefono, email) value(?,?,?,?,?,?,?)");
            ps.setString(1, Elemento.getTipo_persona());
            ps.setString(2, Elemento.getNombre());
            ps.setString(3, Elemento.getTipo_documento());
            ps.setString(4, Elemento.getNum_documento());
            ps.setString(5, Elemento.getDireccion());
            ps.setString(6, Elemento.getTelefono());
            ps.setString(7, Elemento.getEmail());
            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Registro de persona exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar la persona");
            }
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void Actualizar(Persona Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update persona set tipo_persona = ?,nombre = ?,tipo_documento = ?, num_documento= ?, direccion=?, telefono=?, email=? where idpersona = ?");
            ps.setString(1, Elemento.getTipo_persona());
            ps.setString(2, Elemento.getNombre());
            ps.setString(3, Elemento.getTipo_documento());
            ps.setString(4, Elemento.getNum_documento());
            ps.setString(5, Elemento.getDireccion());
            ps.setString(6, Elemento.getTelefono());
            ps.setString(7, Elemento.getEmail());
            ps.setInt(8, Elemento.getIdpersona());
            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Actualización de persona exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la persona");
            }
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void Eliminar(Persona Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update persona set eliminado=1 where idpersona = ?");
            ps.setInt(1, Elemento.getIdpersona());
            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Eliminación de la persona exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la persona");
            }
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void ConsultarTodos(JTable control) {
        String[] cabecera = {"Código", "Tipo de Persona", "Nombre", "Tipo de Documento", "Número de Docuemnto", "Dirección", "Teléfono", "Email"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from persona where eliminado=0");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5),
                    rs.getString(6), rs.getString(7), rs.getString(8)};
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
            PreparedStatement ps = cn.prepareStatement("select count(*) from persona");
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

    public static void ConsultarTodos(JComboBox control, Arreglo_Personas arreglo) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        arreglo.Inicializar();
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from persona");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5),
                    rs.getString(6), rs.getString(7), rs.getString(8)};
                if (rs.getInt(9) == 0) {
                    if (rs.getString(2).equals("Proveedor")) {
                         modCombo.addElement(rs.getInt(1) + ""); 
                    }    
                }
                arreglo.Agregar(new Persona(registro));
            }
            rs.close();
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void ConsultarTodos2(JComboBox control, Arreglo_Personas arreglo) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        arreglo.Inicializar();
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from persona");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5),
                    rs.getString(6), rs.getString(7), rs.getString(8)};
                if (rs.getInt(9) == 0) {
                    if (rs.getString(2).equals("Cliente")) {
                         modCombo.addElement(rs.getString(3)); 
                    }    
                }
                arreglo.Agregar(new Persona(registro));
            }
            rs.close();
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
