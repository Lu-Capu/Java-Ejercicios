package ControlDAO;

import AccsesoBD.DataBase;
import Interf.OrdenINTER;
import Molde.Orden;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class OrdenDAO extends DataBase implements OrdenINTER {

    @Override
    public void registrar(Orden elemento) throws Exception {
    try {
        this.Conectar();
        CallableStatement cs = this.conexion.prepareCall("CALL insertarOrden(?,?,?,?,?)");
        cs.setInt(1, elemento.getIdOrden()); 
        cs.setInt(2, elemento.getAnoPlanta());         
        cs.setDouble(3, elemento.getSuperficie());     
        cs.setInt(4, elemento.getBloque());             
        cs.setInt(5, elemento.getCodigoContrato());     
        cs.executeUpdate();
        cs.close();
        this.cerrar();
    } catch (Exception e) {
 JOptionPane.showMessageDialog(null, "Error al realizar esta accion");
    }

    }

    @Override
    public void editar(Orden elemento) throws Exception {
        try {
        this.Conectar();
         CallableStatement cs = this.conexion.prepareCall("CALL setOrden(?,?,?,?,?)");
       cs.setInt(1, elemento.getIdOrden()); 
        cs.setInt(2, elemento.getAnoPlanta());         
        cs.setDouble(3, elemento.getSuperficie());     
        cs.setInt(4, elemento.getBloque());             
        cs.setInt(5, elemento.getCodigoContrato());     
        cs.executeUpdate();
        cs.close();
        this.cerrar();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Error al realizar esta accion");
    }
    }

    @Override
    public void eliminar(int idOrden) throws Exception {
                 try {
            this.Conectar();
           CallableStatement cs = this.conexion.prepareCall("CALL eliminarOrden(?)");
            cs.setInt(1, idOrden);
            cs.executeUpdate();
            cs.close();
            this.cerrar();
        } catch (Exception e) {
JOptionPane.showMessageDialog(null, "No se puede realizar esta accion");
        }
    }

    @Override
    public void listar(JTable control) throws Exception {
      String[] cabecera = {"Id Codigo", "Año Planta", "Superficie", "Bloque","Codigo Contrato"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        try {
            this.Conectar();
            CallableStatement cs = this.conexion.prepareCall("CALL verOrden()");
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getInt(2), rs.getDouble(3), rs.getInt(4), rs.getInt(5)};
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
    public Orden buscar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Orden> listar() throws Exception {
    try {
            this.Conectar();
             CallableStatement cs = this.conexion.prepareCall("CALL verOrden()");
            ResultSet rs = cs.executeQuery();
            List<Orden> lista = new ArrayList<>();
            while (rs.next()) {
                int id=rs.getInt(1);
                int anoPlanta=rs.getInt(2);
                double superficie = rs.getDouble(3);
                int bloque=rs.getInt(4);
                int codContrato=rs.getInt(5);
                Orden o = new Orden(id, anoPlanta, superficie, bloque, codContrato);
                lista.add(o);
            }

            rs.close();
            cs.close();
            this.cerrar();
            return lista;
        } catch (Exception e) {
JOptionPane.showMessageDialog(null, "Error:" +e.getMessage());
        }
        return null;
    }

    @Override
    public void listar(JComboBox<String> control) throws Exception {
        try {
        this.Conectar();
        CallableStatement cs = this.conexion.prepareCall("CALL verContratos()");
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
