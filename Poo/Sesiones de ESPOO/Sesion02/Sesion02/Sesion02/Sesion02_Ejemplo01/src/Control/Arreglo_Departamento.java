package Control;

import Modelo.Departamento;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Departamento {

 Departamento[] arreglo;
 private int i=0;
 
 
 
 public Departamento getDato(int pos){
     return arreglo[pos];
 }
 
 
 
 public Arreglo_Departamento(int cantidad){
     arreglo = new Departamento[cantidad];
 }
 
 public void registrar(Departamento dato){
     try {
  //Buscar_Codigo(dato.getId()) == -1, indica que Si el codigo insertado no exite, se agregara
       if( Buscar_Codigo(dato.getId()) == -1 ){
     arreglo[i]= dato;
     i++; 
          }else{
           JOptionPane.showMessageDialog(null, "Código existente");
       }
          
     } catch (ArrayIndexOutOfBoundsException e) {
         JOptionPane.showMessageDialog(null, "Lista llena");
     }
 
 }
 
 public void eliminar(int pos){
   
     for (int j = pos; j < i-1; j++) {
       arreglo[pos]= arreglo[pos+1];  
     }
 
     i--;
     
 }
 
 
 public void editar(Departamento dato, int pos){
    arreglo[pos]= dato;
 }
 
 
 public void listar(JTable control){
     
 String[] cabecera={"Código","Nombre","Ubicación"};    
 DefaultTableModel mod_tabla = new DefaultTableModel(cabecera, 0);
 control.setModel(mod_tabla);
     for (int pos = 0; pos <i; pos++) {
         mod_tabla.addRow(arreglo[pos].getRegistro());
     }
 
 }

 public void filtrar(JTable control, String filtro){
     
 String[] cabecera={"Código","Nombre","Ubicación"};    
 DefaultTableModel mod_tabla = new DefaultTableModel(cabecera, 0);
 control.setModel(mod_tabla);
     for (int pos = 0; pos <i; pos++) {
         if(arreglo[pos].getCadena().toLowerCase().contains(filtro.toLowerCase())){
             mod_tabla.addRow(arreglo[pos].getRegistro());    
         }
         
     }
 
 }

public int Buscar_Codigo(int dato){
    for (int pos = 0; pos < i; pos++) {
        if(arreglo[pos].getId() == dato){
            return pos;
        }
    }
  return -1;
}

public int Buscar_Nombre(String dato){
    for (int pos = 0; pos < i; pos++) {
        if(arreglo[pos].getNombre().equals(dato)){
            return pos;
        }
    }
  return -1;
}
 
 public void listar(JComboBox control){
 DefaultComboBoxModel combo = new DefaultComboBoxModel();
 control.setModel(combo);
     for (int pos = 0; pos <i; pos++) {
         //combo.addElement(arreglo[pos].getId());
         combo.addElement(arreglo[pos].getNombre());
     }
 
 }



    
}
