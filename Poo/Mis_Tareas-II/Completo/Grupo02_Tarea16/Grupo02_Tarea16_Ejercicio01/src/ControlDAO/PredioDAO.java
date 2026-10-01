package ControlDAO;

import AccsesoBD.DataBase;
import Interf.PredioINTER;
import Molde.Predio;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PredioDAO extends DataBase implements PredioINTER {

    @Override
    public void registrar(Predio elemento) throws Exception {
        try {
            this.Conectar();
           CallableStatement cs = this.conexion.prepareCall("CALL insertarPredio(?,?,?,?)");
             cs.setInt(1,elemento.getIdPredio());
            cs.setString(2, elemento.getPredio());
            cs.setString(3, elemento.getZona());
            cs.setInt(4, elemento.getCodigoInventario());
          
            cs.executeUpdate();
        } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Error al realizar esta accion");
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void editar(Predio elemento) throws Exception {
        try {
            this.Conectar();
            CallableStatement cs = this.conexion.prepareCall("CALL setPredio(?,?,?,?)");
            cs.setInt(1,elemento.getIdPredio());
            cs.setString(2, elemento.getPredio());
            cs.setString(3, elemento.getZona());
            cs.setInt(4, elemento.getCodigoInventario());
            cs.executeUpdate();
            cs.close();
            this.cerrar();
           
        } catch (Exception e) {
 JOptionPane.showMessageDialog(null, "Error al realizar esta accion");
        }

    }
@Override
public void listar(JComboBox<String> control) throws Exception {
    try {
        this.Conectar();
          CallableStatement cs = this.conexion.prepareCall("CALL verInventario()");
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

    @Override
    public void eliminar(int idPredio) throws Exception {
        try {
            this.Conectar();
             CallableStatement cs = this.conexion.prepareCall("CALL eliminarPredio(?)");
            cs.setInt(1, idPredio);
            cs.executeUpdate();
            cs.close();
            this.cerrar();
        } catch (Exception e) {
JOptionPane.showMessageDialog(null, "No se puede realizar esta accion");
        }
    }

    @Override
    public void listar(JTable control) throws Exception {
      String[] cabecera = {"Id Predio", "Predio", "Zona", "Codigo Inventario"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        try {
            this.Conectar();
              CallableStatement cs = this.conexion.prepareCall("CALL verPredio()");
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)};
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
    public Predio buscar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Predio> listar() throws Exception {
        try {
            this.Conectar();
             CallableStatement cs = this.conexion.prepareCall("CALL verPredio()");
            ResultSet rs = cs.executeQuery();
            List<Predio> lista = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt(1);
                String predio = rs.getString(2);
                String zona = rs.getString(3);
                int codInventaeio = rs.getInt(4);
                Predio p = new Predio(id, predio, zona, codInventaeio);
                lista.add(p);
            }

            rs.close();
            cs.close();
            this.cerrar();
            return lista;
        } catch (Exception e) {

        }
        return null;
    }

}
