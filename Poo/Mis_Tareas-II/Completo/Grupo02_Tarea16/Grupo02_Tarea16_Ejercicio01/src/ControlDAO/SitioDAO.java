package ControlDAO;

import AccsesoBD.DataBase;
import Interf.SitioINTER;
import Molde.Sitio;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SitioDAO extends DataBase implements SitioINTER {

    @Override
    public void registrar(Sitio elemento) throws Exception {
    try {
        this.Conectar();
         CallableStatement cs = this.conexion.prepareCall("CALL insertarSitio(?,?,?)");
        cs.setInt(1, elemento.getIdSitio());
        cs.setInt(2, elemento.getSitios());        
        cs.setInt(3, elemento.getCodigoOrden()); 
        cs.executeUpdate();
        cs.close();
        this.cerrar();
    } catch (Exception e) {
     JOptionPane.showMessageDialog(null, "Error al realizar esta accion");
    }

    }

    @Override
    public void editar(Sitio elemento) throws Exception {
        try {
            this.Conectar();
            CallableStatement cs = this.conexion.prepareCall("CALL setSitio(?,?,?)");
              cs.setInt(1, elemento.getIdSitio());
        cs.setInt(2, elemento.getSitios());        
        cs.setInt(3, elemento.getCodigoOrden()); 
            cs.executeUpdate();
            cs.close();
            this.cerrar();
        } catch (Exception e) {
 JOptionPane.showMessageDialog(null, "Error al realizar esta accion");
        }

    }

    @Override
    public void eliminar(int idSitio) throws Exception {
        try {
            this.Conectar();
            CallableStatement cs = this.conexion.prepareCall("CALL eliminarSitio(?)");
            cs.setInt(1, idSitio);
            cs.executeUpdate();
            cs.close();
            this.cerrar();
        } catch (Exception e) {
JOptionPane.showMessageDialog(null, "No se puede realizar esta accion");
        }
    }

    @Override
    public void listar(JTable control) throws Exception {
       String[] cabecera = {"Id Sitio", "Sitios","Codigo Orden"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        try {
            this.Conectar();
            CallableStatement cs = this.conexion.prepareCall("CALL verSitio()");
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getInt(2), rs.getInt(3)};
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
    public Sitio buscar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Sitio> listar() throws Exception {
        try {
            this.Conectar();
            CallableStatement cs = this.conexion.prepareCall("CALL verSitio()");
            ResultSet rs = cs.executeQuery();
            List<Sitio> lista = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt(1);
                int sitio = rs.getInt(2);
                int codOrden = rs.getInt(3);
                Sitio s = new Sitio(id, sitio, codOrden);
                lista.add(s);
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

    @Override
    public void listar(JComboBox<String> control) throws Exception {
      try {
        this.Conectar();
        CallableStatement cs = this.conexion.prepareCall("CALL verOrden()");
            ResultSet rs = cs.executeQuery();
        control.removeAllItems();
        while (rs.next()) {
            control.addItem(rs.getInt(1)+"");
        }

        rs.close();
        cs.close();
        this.cerrar();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
      
    }

}
