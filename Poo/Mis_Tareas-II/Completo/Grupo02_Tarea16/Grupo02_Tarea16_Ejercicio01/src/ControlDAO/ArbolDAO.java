package ControlDAO;

import AccsesoBD.DataBase;
import Interf.ArbolINTER;
import Molde.Arbol;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArbolDAO extends DataBase implements ArbolINTER {

    @Override
    public void registrar(Arbol elemento) throws Exception {
        try {
            this.Conectar();
           CallableStatement cs = this.conexion.prepareCall("CALL insertarArbol(?,?,?,?,?,?,?,?,?)");
            cs.setInt(1, elemento.getId());
            cs.setString(2, elemento.getFuente());    
            cs.setString(3, elemento.getEspecie());     
            cs.setDouble(4, elemento.getEdad());      
            cs.setInt(5, elemento.getNumArbol());      
            cs.setDouble(6, elemento.getDiametro());     
            cs.setDouble(7, elemento.getAltura());     
            cs.setInt(8, elemento.getCodigoSitio());      
            cs.setInt(9, elemento.getFecha());         

            cs.executeUpdate();
            cs.close();
            this.cerrar();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }

    @Override
    public void editar(Arbol elemento) throws Exception {
        try {
            this.Conectar();
                  CallableStatement cs = this.conexion.prepareCall("CALL setArbol(?,?,?,?,?,?,?,?,?)");
            cs.setInt(1, elemento.getId());
            cs.setString(2, elemento.getFuente());   
            cs.setString(3, elemento.getEspecie());      
            cs.setDouble(4, elemento.getEdad());        
            cs.setInt(5, elemento.getNumArbol());       
            cs.setDouble(6, elemento.getDiametro());  
            cs.setDouble(7, elemento.getAltura());       
            cs.setInt(8, elemento.getCodigoSitio());    
            cs.setInt(9, elemento.getFecha());           
            cs.executeUpdate();
            cs.close();
            this.cerrar();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }

    @Override
    public void eliminar(int idArbol) throws Exception {
        try {
            this.Conectar();
             CallableStatement cs = this.conexion.prepareCall("CALL eliminarArbol(?)");
            cs.setInt(1, idArbol);
            cs.executeUpdate();
            cs.close();
            this.cerrar();
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "No se puede realizar esta accion");
   
        }
    }

    @Override
    public void listar(JTable control) throws Exception {
     String[] cabecera = {"Id Árbol","Fuente","Especie","Edad","Número Árbol","Diámetro", "Altura","Código Sitio","Fecha"};

        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        try {
            this.Conectar();
             CallableStatement cs = this.conexion.prepareCall("CALL verArbol()");
            ResultSet rs = cs.executeQuery();
       while (rs.next()) {
    Object[] registro = {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5),rs.getDouble(6),rs.getDouble(7), rs.getInt(8),rs.getInt(9)  };
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
    public Arbol buscar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Arbol> listar() throws Exception {
        try {
            this.Conectar();
            CallableStatement cs = this.conexion.prepareCall("CALL verArbol()");
            ResultSet rs = cs.executeQuery();
            List<Arbol> lista = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt(1);
                String fuente = rs.getString(2);
                String especie = rs.getString(3);
                double edad = rs.getDouble(4);
                int numArbol = rs.getInt(5);
                double diametro = rs.getDouble(6);
                double altura = rs.getDouble(7);
                int codSitio = rs.getInt(8);
                int fecha = rs.getInt(9);
                Arbol a = new Arbol(id, fuente, especie, edad, numArbol, diametro, altura, codSitio, fecha);
                lista.add(a);
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
       CallableStatement cs = this.conexion.prepareCall("CALL verSitio()");
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
