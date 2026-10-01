package ControlDAO;

import AccesoBD.ConectaBD;
import Control.Arreglo_Venta;
import Modelo.Users;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

// DAO para la tabla venta
public class VentaDAO {
public static void Insertar(Venta Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement(
                "INSERT INTO venta (idcliente,idusuario,tipo_comprobante,serie_comprobante,num_comprobante,fecha_hora,impuesto,total_venta,estado) VALUES (?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, Elemento.getIdcliente());
            ps.setInt(2, Elemento.getIdusuario());
            ps.setString(3, Elemento.getTipo_comprobante());
            ps.setString(4, Elemento.getSerie_comprobante());
            ps.setString(5, Elemento.getNum_comprobante());
            ps.setString(6, Elemento.getFecha_hora());
            ps.setDouble(7, Elemento.getImpuesto());
            ps.setDouble(8, Elemento.getTotal_venta());
            ps.setString(9, Elemento.getEstado());
            int rpta = ps.executeUpdate();
            if (rpta>0)
                JOptionPane.showMessageDialog(null, "Venta registrada correctamente");
            else
                JOptionPane.showMessageDialog(null, "Error al registrar venta");
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
 public static void ActualizarTotalVenta(int idventa, double nuevoTotal) {
    try {
        Connection cn = ConectaBD.ObtenerConexion();
        PreparedStatement ps = cn.prepareStatement(
            "UPDATE venta SET total_venta = ? WHERE idventa = ?"
        );

        ps.setDouble(1, nuevoTotal);
        ps.setInt(2, idventa);

        int rpta = ps.executeUpdate();

        if (rpta > 0) {
          //  JOptionPane.showMessageDialog(null, "Total de venta actualizado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró la venta con ese ID");
        }

        ps.close();
        ConectaBD.CerrarConexion(cn);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}
    
 public static void Actualizar(Venta Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement(
                "UPDATE venta SET idcliente=?,idusuario=?,tipo_comprobante=?,serie_comprobante=?,num_comprobante=?,fecha_hora=?,impuesto=?,total_venta=?,estado=? WHERE idventa=?");
            ps.setInt(1, Elemento.getIdcliente());
            ps.setInt(2, Elemento.getIdusuario());
            ps.setString(3, Elemento.getTipo_comprobante());
            ps.setString(4, Elemento.getSerie_comprobante());
            ps.setString(5, Elemento.getNum_comprobante());
            ps.setString(6, Elemento.getFecha_hora());
            ps.setDouble(7, Elemento.getImpuesto());
            ps.setDouble(8, Elemento.getTotal_venta());
            ps.setString(9, Elemento.getEstado());
            ps.setInt(10, Elemento.getIdventa());
            int rpta = ps.executeUpdate();
            if (rpta>0)
                JOptionPane.showMessageDialog(null, "Venta actualizada correctamente");
            else
                JOptionPane.showMessageDialog(null, "Error al actualizar venta");
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

 public static void Eliminar(Venta Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement(
                "DELETE FROM venta WHERE idventa=?");
            ps.setInt(1, Elemento.getIdventa());
            int rpta = ps.executeUpdate();
            if (rpta>0)
                JOptionPane.showMessageDialog(null, "Venta eliminada correctamente");
            else
                JOptionPane.showMessageDialog(null, "Error al eliminar venta");
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

 public static void ConsultarTodos(JTable control, Arreglo_Venta arreglo) {
        String[] cabecera = {"ID","Cliente","Usuario","Comprobante","Serie","Número","Fecha","Impuesto","Estado"};
        DefaultTableModel model = new DefaultTableModel(cabecera, 0);
        control.setModel(model);
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM venta");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object[] fila = {
                    rs.getInt("idventa"),
                    rs.getInt("idcliente"),
                    rs.getInt("idusuario"),
                    rs.getString("tipo_comprobante"),
                    rs.getString("serie_comprobante"),
                    rs.getString("num_comprobante"),
                    rs.getString("fecha_hora"),
                    rs.getDouble("impuesto"),
                  //  rs.getDouble("total_venta"),
                    rs.getString("estado")
                };
                model.addRow(fila);
            }
            rs.close(); ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
 public static void ConsultarTodos(JComboBox control, Arreglo_Venta arreglo) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        arreglo.Inicializar();
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM venta");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), 
                    rs.getString(5),rs.getString(6), rs.getString(7), rs.getDouble(8),
                    rs.getDouble(9),rs.getString(10)};
                if (rs.getInt(10) == 0) {
                   modCombo.addElement(rs.getString(1)); 
                }
                arreglo.Agregar(new Venta(registro)); 
            }
            rs.close(); ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }


 public static void ConsultarTodosCombo(JComboBox<String> control, Arreglo_Venta arreglo) {
    DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
    control.setModel(modelo);
 
    arreglo.Inicializar();

    try {
        Connection cn = ConectaBD.ObtenerConexion();
        PreparedStatement ps = cn.prepareStatement("SELECT * FROM venta");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Venta i = new Venta();
            i.setIdventa(rs.getInt(1));
            i.setIdcliente(rs.getInt(2));
            i.setIdusuario(rs.getInt(3));
            i.setTipo_comprobante(rs.getString(4));
            i.setSerie_comprobante(rs.getString(5));
            i.setNum_comprobante(rs.getString(6));
            i.setFecha_hora(rs.getString(7)); 
            i.setImpuesto(rs.getDouble(8));
            i.setTotal_venta(rs.getDouble(9));
            i.setEstado(rs.getString(10));

       
            
           modelo.addElement(i.getIdventa() + "");
           arreglo.Agregar(i);
        }
        rs.close();
        ps.close();
        ConectaBD.CerrarConexion(cn);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
}







}