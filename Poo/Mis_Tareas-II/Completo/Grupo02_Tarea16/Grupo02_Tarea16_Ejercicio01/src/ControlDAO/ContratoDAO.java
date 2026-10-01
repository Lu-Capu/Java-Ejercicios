package ControlDAO;

import AccsesoBD.DataBase;
import Interf.ContraroINTER;
import Molde.Contrato;
import Molde.Predio;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ContratoDAO extends DataBase implements ContraroINTER {

    @Override
    public void registrar(Contrato elemento) throws Exception {
          try {
            this.Conectar();
              CallableStatement cs = this.conexion.prepareCall("CALL insertarContratos(?,?,?)");
            cs.setInt(1, elemento.getIdContrato());
            cs.setString(2, elemento.getContrato());
           cs.setInt(3, elemento.getCodigoPredio());
            cs.executeUpdate();
            this.cerrar();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void editar(Contrato elemento) throws Exception {
        try {
            this.Conectar();
           CallableStatement cs = this.conexion.prepareCall("CALL setContratos(?,?,?)");
            cs.setInt(1, elemento.getIdContrato());
            cs.setString(2, elemento.getContrato());
           cs.setInt(3, elemento.getCodigoPredio());

            cs.executeUpdate();
            cs.close();
            this.cerrar();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }

    @Override
    public void eliminar(int idContrato) throws Exception {
        try {
            this.Conectar();
             CallableStatement cs = this.conexion.prepareCall("CALL eliminarContratos(?)");
            cs.setInt(1, idContrato);
            cs.executeUpdate();
            cs.close();
            this.cerrar();
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "No se puede realizar esta accion");
       
        }
    }

    @Override
    public void listar(JTable control) throws Exception {
        String[] cabecera = {"Id Contrato", "Contrato", "Codigo Predio"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        try {
            this.Conectar();
             CallableStatement cs = this.conexion.prepareCall("CALL verContratos()");
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getString(2), rs.getInt(3)};
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
    public Contrato buscar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Contrato> listar() throws Exception {
        try {
            this.Conectar();
            CallableStatement cs = this.conexion.prepareCall("CALL verContratos()");
            ResultSet rs = cs.executeQuery();
            List<Contrato> lista = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt(1);
                String contrato = rs.getString(2);
                int codInventaeio = rs.getInt(3);
                Contrato c = new Contrato(id, contrato, codInventaeio);
                lista.add(c);
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
             CallableStatement cs = this.conexion.prepareCall("CALL verPredio()");
            ResultSet rs = cs.executeQuery();
     

            control.removeAllItems();
            while (rs.next()) {

                control.addItem(rs.getInt(1) + "");
            }

            rs.close();
            cs.close();
            this.cerrar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
