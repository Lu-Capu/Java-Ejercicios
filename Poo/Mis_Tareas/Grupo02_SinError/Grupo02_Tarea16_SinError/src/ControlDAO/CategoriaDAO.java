package ControlDAO;

import AccesoBD.ConectaBD;
import Control.Arreglo_Categoria;
import Modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CategoriaDAO {

    public static void Insertar(Categoria Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("insert into categoria(nombre,descripcion,condicion) value(?,?,?)");
            ps.setString(1, Elemento.getNombre());
            ps.setString(2, Elemento.getDescripcion());
            ps.setString(3, Elemento.getCondicion());
            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Registro de categoría exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar la categoría");
            }
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void Actualizar(Categoria Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update categoria set nombre = ?,descripcion = ?,condicion = ? where idcategoria = ?");
            ps.setString(1, Elemento.getNombre());
            ps.setString(2, Elemento.getDescripcion());
            ps.setString(3, Elemento.getCondicion());
            ps.setInt(4, Elemento.getIdcategoria());
            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Actualización de Categoría Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la categoría");
            }
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void Eliminar(Categoria Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update categoria set eliminado=1 where idcategoria = ?");
            ps.setInt(1, Elemento.getIdcategoria());
            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Eliminación de la categoría exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la categoría");
            }
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void ConsultarTodos(JTable control) {
        String[] cabecera = {"Código", "Nombre", "Descripción", "Condición"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from categoria where eliminado=0");
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
            PreparedStatement ps = cn.prepareStatement("select count(*) from categoria");
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

    public static void ConsultarTodos(JComboBox control, Arreglo_Categoria arreglo) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        arreglo.Inicializar();
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from categoria");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getString(2), rs.getString(3),
                    rs.getString(4)};
                if (rs.getInt(5) == 0) {
                    modCombo.addElement(rs.getString(2));
                }
                arreglo.Agregar(new Categoria(registro));
            }
            rs.close();
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
