package ControlDAO;

import AccesoBD.ConectaBD;
import Control.Arreglo_Articulo;
import Control.Arreglo_Detalle_Venta;
import Modelo.Articulo;
import Modelo.Detalle_Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Detalle_VentaDAO {
 
   
    public static void ConsultarTodosTabla(JTable control, Arreglo_Detalle_Venta arreglo) {
 String[] cabecera = {"ID Detalle_Venta", "ID_Venta" ," ID_Articulo", "Cantidad","Precio Venta","Descuento"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        arreglo.Inicializar();
        try {
            Connection cn = ConectaBD.ObtenerConexion();
          PreparedStatement ps = cn.prepareStatement(
                "SELECT di.iddetalle_venta, di.idventa, di.idarticulo ,di.cantidad,di.precio_venta,di.descuento " +
                "FROM detalle_venta di JOIN articulo a ON di.idarticulo = a.idarticulo ");
         
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            
              Object[] fila = {
                    rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getDouble(5), rs.getDouble(6)
                };
                modTabla.addRow(fila);
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
            PreparedStatement ps = cn.prepareStatement("select count(*) from detalle_venta");
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

 public static int getCantidad(int id_venta) {
        int cantidad = 0;
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select cantidad from detalle_venta where idventa = ?");
            ps.setInt(1, id_venta);
            ResultSet rs = ps.executeQuery();
           if(  rs.next()){
                cantidad = rs.getInt(1);
           }
          
            rs.close();
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return cantidad;
    }  
 
 public static double getPrecio_venta(int id_venta) {
        double precio_venta = 0;
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select precio_venta from detalle_venta where idventa = ?");
            ps.setDouble(1, id_venta);
            ResultSet rs = ps.executeQuery();
           if(  rs.next()){
                precio_venta = rs.getDouble(1);
           }
          
            rs.close();
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return precio_venta;
    } 
 
 
  public static double getDescuento(int id_venta) {
        double descuento = 0;
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select descuento from detalle_venta where idventa = ?");
            ps.setDouble(1, id_venta);
            ResultSet rs = ps.executeQuery();
           if(  rs.next()){
                descuento= rs.getDouble(1);
           }
          
            rs.close();
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return descuento;
    } 
 
public static void Insertar(Detalle_Venta d) {
    try {
        Connection cn = ConectaBD.ObtenerConexion();
        PreparedStatement ps = cn.prepareStatement(
            "INSERT INTO detalle_venta (idventa, idarticulo, cantidad, precio_venta, descuento) VALUES (?, ?, ?, ?, ?)"
        );
        ps.setInt(1, d.getIdventa());
        ps.setInt(2, d.getIdarticulo());
        ps.setInt(3, d.getCantidad());
        ps.setDouble(4, d.getPrecio_venta());
        ps.setDouble(5, d.getDescuento());

        int rpta = ps.executeUpdate();
        if (rpta > 0)
            JOptionPane.showMessageDialog(null, "Detalle de ingreso registrado");
        else
            JOptionPane.showMessageDialog(null, "Error al registrar detalle de ingreso");

        ps.close();
        ConectaBD.CerrarConexion(cn);
    } catch (Exception e) {
       
        JOptionPane.showMessageDialog(null, "Ocurrió un error al insertar el detalle de ingreso:" +"\n" + e.getMessage());
    }
}

 public static void Actualizar(Detalle_Venta Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update detalle_venta set idventa = ?, idarticulo = ?, cantidad = ?,"
                    + "precio_venta = ?, descuento = ?  where iddetalle_venta = ? ");
         
            ps.setInt(1, Elemento.getIdventa());
            ps.setInt(2, Elemento.getIdarticulo());
            ps.setInt(3, Elemento.getCantidad());
            ps.setDouble(4, Elemento.getPrecio_venta());
            ps.setDouble(5, Elemento.getDescuento());
   ps.setInt(6, Elemento.getIddetalle_venta());

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

 
 
  public static void Eliminar(Detalle_Venta Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("delete from detalle_venta where iddetalle_venta = ?");
            ps.setInt(1, Elemento.getIddetalle_venta());
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
      
 
 
 
 
 
 
 
}
