package Control;

import Modelo.Empleado;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Arreglo_Empleado {

    Empleado[] arreglo;
    private int i=0;
    
    public Arreglo_Empleado(int cantidad){
        arreglo = new Empleado[cantidad];
    }
    
   public void registrar(Empleado dato){
       try {
         arreglo[i]=dato;
         i++;  
       } catch (ArrayIndexOutOfBoundsException e) {
           JOptionPane.showMessageDialog(null, "Lista llena");
       }
     
   } 
 
public void listar(JTable control){
    String[] cabecera = {"Código","Nombre","Puesto","Salario", "Departamento_Asignado"};
    DefaultTableModel mod_tabla = new DefaultTableModel(cabecera,0);
    control.setModel(mod_tabla);
    for (int pos = 0; pos < i; pos++) {
        mod_tabla.addRow(arreglo[pos].getRegistro());
        
    }
}   
    
}
