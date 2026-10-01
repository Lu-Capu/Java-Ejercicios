package ControlDAO;

import AccsesoBD.DataBase;
import Interf.InventarioINTER;
import Molde.Inventario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class InventarioDAO extends DataBase implements InventarioINTER {

    @Override
    public void registrar(Inventario elemento) throws Exception {
        try {
            this.Conectar();
            CallableStatement cs = this.conexion.prepareCall("CALL insertarInventario(?,?)");
            cs.setInt(1, elemento.getIdInventario());
            cs.setString(2, elemento.getRealizo());
            cs.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void editar(Inventario elemento) throws Exception {
        try {
            this.Conectar();
            CallableStatement cs = this.conexion.prepareCall("CALL setInventario(?,?)");
            cs.setString(1, elemento.getRealizo());
            cs.setInt(2, elemento.getIdInventario());
            cs.executeUpdate();
            cs.close();
            this.cerrar();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }

    @Override
    public void eliminar(int idInventario) throws Exception {
        try {
            this.Conectar();
                      CallableStatement cs = this.conexion.prepareCall("CALL eliminarInventario(?)");
            cs.setInt(1, idInventario);
            cs.executeUpdate();
            cs.close();
            this.cerrar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede realizar esta accion");

        }

    }

    @Override
    public void listar(JTable control) throws Exception {
        String[] cabecera = {"Id Inventario", "Realizo"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        try {
            this.Conectar();
            CallableStatement cs = this.conexion.prepareCall("CALL verInventario()");
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getString(2),};
                modTabla.addRow(registro);
            }
            rs.close();
            cs.close();
            this.cerrar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public Inventario buscar(String id) {
        return null;
    }

    @Override
    public List<Inventario> listar() throws Exception {
        try {
            this.Conectar();
            
            CallableStatement cs = this.conexion.prepareCall("CALL verInventario()");
            ResultSet rs = cs.executeQuery();
            List<Inventario> lista = new ArrayList<>();
            while (rs.next()) {
                Inventario inv = new Inventario(rs.getInt(1), rs.getString(2));
                lista.add(inv);
            }
            rs.close();
            cs.close();
            this.cerrar();
            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return null;
    }

}
