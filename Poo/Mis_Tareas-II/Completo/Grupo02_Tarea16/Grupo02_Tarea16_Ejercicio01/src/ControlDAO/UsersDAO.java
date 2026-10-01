package ControlDAO;

import AccsesoBD.DataBase;
import Interf.UsersINTER;
import Molde.Users;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UsersDAO extends DataBase implements UsersINTER {

    Map<String, Users> hashMap = new HashMap();

    @Override
    public void registrar(Users elemento) throws Exception {
        try {
            this.Conectar();
            CallableStatement cs = this.conexion.prepareCall("CALL insertarUsers(?,?,?,?,?)");
            cs.setString(1, elemento.getId());
            cs.setString(2, elemento.getNombre());
            cs.setString(3, elemento.getApellidoP());
            cs.setString(4, elemento.getApellidoM());
            cs.setString(5, elemento.getTipo());
            cs.executeUpdate();
            cs.close();
            this.cerrar();
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public void editar(Users elemento) throws Exception {
        try {
            this.Conectar();
            CallableStatement cs = this.conexion.prepareCall("CALL setUsers(?,?,?,?,?)");
            cs.setString(1, elemento.getNombre());
            cs.setString(2, elemento.getApellidoP());
            cs.setString(3, elemento.getApellidoM());
            cs.setString(4, elemento.getTipo());
            cs.setString(5, elemento.getId());
            cs.executeUpdate();
            cs.close();
            this.cerrar();
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public void eliminar(Users elemento) throws Exception {
        try {
            this.Conectar();
            CallableStatement cs = this.conexion.prepareCall("CALL eliminarUsers(?)");
            cs.setString(1, elemento.getId());
            cs.executeUpdate();
            cs.close();
            hashMap.remove(elemento.getId());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede realizar esta accion");
        }

    }

    @Override
    public void listar(JTable control) throws Exception {
        String[] cabecera = {"Código", "Nombre", "Apellido Paterno", "Apellido Materno", "Tipo"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        try {
            this.Conectar();
            CallableStatement cs = this.conexion.prepareCall("CALL verUsers()");
            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                Object[] registro = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                modTabla.addRow(registro);
                Users u = new Users(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                hashMap.put(u.getId(), u);
            }
            rs.close();
            cs.close();
            this.cerrar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public Users buscar(String id) {
        Users u = hashMap.get(id);
        if (u == null) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado al usuario de ID: " + u.getId());
        }
        return u;
    }

}
