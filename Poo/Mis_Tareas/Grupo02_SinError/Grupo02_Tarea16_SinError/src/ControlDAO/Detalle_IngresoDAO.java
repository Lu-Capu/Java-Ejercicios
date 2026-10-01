
package ControlDAO;

import AccesoBD.ConectaBD;
import Control.Arreglo_Articulo;
import Control.Arreglo_Detalle_Ingreso;
import Control.Arreglo_Ingresos;
import Control.Arreglo_Personas;
import Modelo.Articulo;
import Modelo.Detalle_Ingreso;
import Modelo.Ingreso;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Detalle_IngresoDAO {
    
public static void Insertar(Detalle_Ingreso d) {
    try {
        Connection cn = ConectaBD.ObtenerConexion();
        PreparedStatement ps = cn.prepareStatement(
            "INSERT INTO detalle_ingreso (idingreso, id_articulo, cantidad, precio_compra, precio_venta) VALUES (?, ?, ?, ?, ?)"
        );
        ps.setInt(1, d.getIdingreso());
        ps.setInt(2, d.getIdarticulo());
        ps.setInt(3, d.getCantidad());
        ps.setDouble(4, d.getPrecio_compra());
        ps.setDouble(5, d.getPrecio_venta());

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


    
public static void ConsultarTodosTabla(JTable control, Arreglo_Detalle_Ingreso arreglo) {
 String[] cabecera = {"ID Detalle", "ID_Ingreso" ," ID_Artículo", "Cantidad","Precio Compra","Precio Venta"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        arreglo.Inicializar();
        try {
            Connection cn = ConectaBD.ObtenerConexion();
          PreparedStatement ps = cn.prepareStatement(
                "SELECT di.iddetalle_ingreso, di.idingreso, di.id_articulo ,di.cantidad,di.precio_compra,di.precio_venta " +
                "FROM detalle_ingreso di JOIN articulo a ON di.id_articulo = a.idarticulo ");
         
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
    
public static void ConsultarTodos(JComboBox control, Arreglo_Detalle_Ingreso arreglo) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        arreglo.Inicializar();
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from detalle_ingreso");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getInt(2), rs.getInt(3),
                    rs.getInt(4), rs.getDouble(5),
                    rs.getDouble(6)};
               
                
           modCombo.addElement(rs.getInt(1)); 
                     
                
                arreglo.Agregar(new Detalle_Ingreso(registro));
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
            PreparedStatement ps = cn.prepareStatement("select count(*) from detalle_ingreso");
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
  
   public static void ConsultarTodosI(JComboBox control, Arreglo_Ingresos arreglo) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        arreglo.Inicializar();
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from ingreso");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5),
                    rs.getString(6), rs.getString(7), rs.getString(8)};
                if (rs.getInt(9) == 0) {
                    if (rs.getString(2).equals("Cliente")) {
                         modCombo.addElement(rs.getInt(1)); 
                    }    
                }
                arreglo.Agregar(new Ingreso(registro));
            }
            rs.close();
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
  
   public static void ConsultarTodosA(JComboBox<String> control, Arreglo_Articulo arreglo) {
    DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
    control.setModel(modelo);
    arreglo.Inicializar();

    try {
        Connection cn = ConectaBD.ObtenerConexion();
        PreparedStatement ps = cn.prepareStatement(
            "SELECT a.idarticulo, a.nombre, a.codigo, a.stock, a.descripcion, a.estado, a.idcategoria " +
            "FROM articulo a"
        );
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Articulo a = new Articulo();
            a.setIdarticulo(rs.getInt("idarticulo"));
            a.setNombre(rs.getString("nombre"));
            a.setCodigo(rs.getString("codigo"));
            a.setStock(rs.getInt("stock"));
            a.setDescripcion(rs.getString("descripcion"));
            a.setEstado(rs.getString("estado"));
            a.setIdcategoria(rs.getInt("idcategoria"));

            arreglo.Agregar(a);

            String descripcion = a.getIdarticulo() + "";
            modelo.addElement(descripcion);
        }

        rs.close();
        ps.close();
        ConectaBD.CerrarConexion(cn);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error cargando artículos: " + e.getMessage());
    }
}
    
  public static void Actualizar(Detalle_Ingreso Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update detalle_ingreso set idingreso = ?, id_articulo = ?, cantidad = ?,"
                    + "precio_compra = ?, precio_venta = ?  where iddetalle_ingreso = ? ");
         
            ps.setInt(1, Elemento.getIdingreso());
            ps.setInt(2, Elemento.getIdarticulo());
            ps.setInt(3, Elemento.getCantidad());
            ps.setDouble(4, Elemento.getPrecio_compra());
            ps.setDouble(5, Elemento.getPrecio_venta());
   ps.setInt(6, Elemento.getIddetalle_ingreso());

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
   

    public static void Eliminar(Detalle_Ingreso Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("delete from detalle_ingreso where iddetalle_ingreso = ?");
            ps.setInt(1, Elemento.getIddetalle_ingreso());
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
