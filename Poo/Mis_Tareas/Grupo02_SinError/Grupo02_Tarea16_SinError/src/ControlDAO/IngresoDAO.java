package ControlDAO;

import AccesoBD.ConectaBD;
import Control.Arreglo_Ingresos;
import Modelo.Ingreso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class IngresoDAO {

    public static void Insertar(Ingreso Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("insert into ingreso(idproveedor,tipo_comprobante,"
                    + "serie_comprobante,num_comprobante,fecha_hora,impuesto,estado) value(?,?,?,?,?,?,?)");
            ps.setInt(1, Elemento.getIdproveedor());
            ps.setString(2, Elemento.getTipo_comprobante());
            ps.setString(3, Elemento.getSerie_comprobante());
            ps.setString(4, Elemento.getNum_comprobante());
            ps.setString(5, Elemento.getFecha_hora());
            ps.setDouble(6, Elemento.getImpuesto());
            ps.setString(7, Elemento.getEstado());
            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar");
            }
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void Actualizar(Ingreso Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update ingreso set idproveedor = ?,tipo_comprobante = ?,serie_comprobante = ?,"
                    + "num_comprobante = ?, fecha_hora = ?, impuesto = ?, estado =? where idingreso = ?");
            ps.setInt(1, Elemento.getIdproveedor());
            ps.setString(2, Elemento.getTipo_comprobante());
            ps.setString(3, Elemento.getSerie_comprobante());
            ps.setString(4, Elemento.getNum_comprobante());
            ps.setString(5, Elemento.getFecha_hora());
            ps.setDouble(6, Elemento.getImpuesto());
            ps.setString(7, Elemento.getEstado());
            ps.setInt(8, Elemento.getIdingreso());

            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Actualización Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar");
            }
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void Eliminar(Ingreso Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("delete from ingreso where idingreso = ?");
            ps.setInt(1, Elemento.getIdingreso());
            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Eliminación Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar");
            }
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
        }
    }

    public static void ConsultarTodos(JTable control, Arreglo_Ingresos arreglo) {
        String[] cabecera = {"Código", "Proveedor", "Tipo Comprobante", "Serie Comprobante", "N° Comprobante", "Fecha-Hora", "Impuesto", "Estado"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        arreglo.Inicializar();
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement(
                    "select i.idingreso, p.nombre, p.idpersona, i.tipo_comprobante, i.serie_comprobante, i.num_comprobante, i.fecha_hora, i.impuesto, i.estado\n"
                    + "from ingreso i, persona p\n"
                    + "where i.idproveedor = p.idpersona");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object[] registro1 = {rs.getInt(1), rs.getInt(3), rs.getString(4), rs.getString(5),
                    rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)};
                modTabla.addRow(registro1);
                Object[] registro2 = {rs.getInt(1),rs.getInt(3), rs.getString(4), rs.getString(5),
                    rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)};
                arreglo.Agregar(new Ingreso(registro2));
            }
            rs.close();
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
   public static void ConsultarTodos(JComboBox<String> control, Arreglo_Ingresos arreglo) {
    DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
    control.setModel(modelo);
 
    arreglo.Inicializar();

    try {
        Connection cn = ConectaBD.ObtenerConexion();
        PreparedStatement ps = cn.prepareStatement("SELECT * FROM ingreso");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Ingreso i = new Ingreso();
            i.setIdingreso(rs.getInt("idingreso"));
            i.setIdproveedor(rs.getInt("idproveedor"));
            i.setTipo_comprobante(rs.getString("tipo_comprobante"));
            i.setSerie_comprobante(rs.getString("serie_comprobante"));
            i.setNum_comprobante(rs.getString("num_comprobante"));
            i.setFecha_hora(rs.getString("fecha_hora")); 
            i.setImpuesto(rs.getDouble("impuesto"));
            i.setEstado(rs.getString("estado"));

       
            
           modelo.addElement(i.getIdingreso() + "");
           arreglo.Agregar(i);
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
            PreparedStatement ps = cn.prepareStatement("select count(*) from ingreso");
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

}
