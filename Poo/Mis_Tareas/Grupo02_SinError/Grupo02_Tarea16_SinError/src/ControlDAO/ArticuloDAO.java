package ControlDAO;

import AccesoBD.ConectaBD;
import Modelo.Articulo;
import Control.Arreglo_Articulo;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Control.Arreglo_Articulo;
import java.awt.Image;
import java.io.FileInputStream;
import javax.swing.ImageIcon;

public class ArticuloDAO {

    public static void Insertar(Articulo Elemento) {
        try {
            FileInputStream fis = new FileInputStream(Elemento.getImagen());
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("INSERT INTO articulo(idarticulo, idcategoria, codigo, nombre, stock, descripcion, imagen, estado) VALUE (?,?,?,?,?,?,?,?)");
            ps.setInt(1, Elemento.getIdarticulo());
            ps.setInt(2, Elemento.getIdcategoria());
            ps.setString(3, Elemento.getCodigo());
            ps.setString(4, Elemento.getNombre());
            ps.setInt(5, Elemento.getStock());
            ps.setString(6, Elemento.getDescripcion());
            ps.setBinaryStream(7, fis, (int) Elemento.getImagen().length());
            ps.setString(8, Elemento.getEstado());
            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Registro de Imagen Exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar la imagen");
            }
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void Actualizar(Articulo Elemento) {
        try {
            FileInputStream fis = new FileInputStream(Elemento.getImagen());
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update articulo set idarticulo = ?, idcategoria = ?,codigo = ?,nombre = ?, stock= ?, descripcion=?, imagen=?, estado=? where idarticulo = ?");
            ps.setInt(1, Elemento.getIdarticulo());
            ps.setInt(2, Elemento.getIdcategoria());
            ps.setString(3, Elemento.getCodigo());
            ps.setString(4, Elemento.getNombre());
            ps.setInt(5, Elemento.getStock());
            ps.setString(6, Elemento.getDescripcion());
            ps.setBinaryStream(7, fis, (int) Elemento.getImagen().length());
            ps.setString(8, Elemento.getEstado());
            ps.setInt(9, Elemento.getIdarticulo());
            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Actualización de articulo exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el articulo");
            }
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void Eliminar(Articulo Elemento) {
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("delete from articulo where idarticulo = ?");
            ps.setInt(1, Elemento.getIdarticulo());
            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Eliminación del articulo exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el articulo");
            }
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void ConsultarTodos(JTable control, Arreglo_Articulo arreglo) {

        String[] cabecera = {"ID", "Categoria", "Codigo", "Nombre", "Stock", "Descripción", "Imagen", "Estado"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        arreglo.Inicializar();
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement(
                    "select a.idarticulo, c.nombre, c.idcategoria, a.codigo, a.nombre, a.stock, a.descripcion, a.imagen, a.estado\n"
                    + "from articulo a, categoria c\n"
                    + "where a.idcategoria = c.idcategoria"
            );
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                byte[] imagebyte = rs.getBytes(8);
                Image foto = null;
                if (imagebyte != null) {
                    try {
                        ImageIcon imageicon = new ImageIcon(imagebyte);
                        foto = imageicon.getImage();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
                    }
                }
                Object[] registro1 = {rs.getInt(1), rs.getString(2), rs.getString(4), rs.getString(5),
                    rs.getInt(6), rs.getString(7), foto, rs.getString(9)};
                modTabla.addRow(registro1);
                Object[] registro2 = {rs.getInt(1), rs.getInt(3), rs.getString(4), rs.getString(5),
                    rs.getInt(6), rs.getString(7), foto, rs.getString(9)};
                arreglo.Agregar(new Articulo(registro2));
            }
            rs.close();
            ps.close();
            ConectaBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void ConsultarTodos(JComboBox<String> control, Arreglo_Articulo arreglo) {
    DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
    control.setModel(modelo);
    arreglo.Inicializar();

    try {
        Connection cn = ConectaBD.ObtenerConexion();
        PreparedStatement ps = cn.prepareStatement(
            "SELECT a.idarticulo, a.nombre, a.codigo, a.stock, a.descripcion, a.estado, a.idcategoria " +
            "FROM articulo a WHERE a.estado = 'activo'"
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

            String descripcion = "ID: " + a.getIdarticulo() + " - " + a.getNombre();
            modelo.addElement(descripcion);
        }

        rs.close();
        ps.close();
        ConectaBD.CerrarConexion(cn);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error cargando artículos: " + e.getMessage());
    }
}

    
   public static int ContarRegistros() {
        int count = 0;
        try {
            Connection cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select count(*) from articulo");
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
    
    
    
   
      public static ArrayList<Articulo> listarTodo() {
        ArrayList<Articulo> lista = new ArrayList<>();
        Connection cn = null;
        try {
            cn = ConectaBD.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM articulo");
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
            

                lista.add(a);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al listar artículos: " + e.getMessage());
        } finally {
            ConectaBD.CerrarConexion(cn);
        }
        return lista;
    } 
   
  
}
