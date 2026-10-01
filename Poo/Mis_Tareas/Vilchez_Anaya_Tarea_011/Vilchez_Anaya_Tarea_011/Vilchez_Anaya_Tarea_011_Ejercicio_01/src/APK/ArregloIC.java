
package APK;

import Molde.Arquitecto;
import Molde.Constructor;
import Molde.Ing_Civil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ArregloIC {
    
private Constructor[] arreglo = new Constructor[10];
private ArregloIC objAIC = null;
private int i=0;

private Ing_Civil objIc;
 
 
 public String pseudocodigoIC(int p){
    
     String a = "INGC0000";
     return  "INGC0000"+ p;
     
 }
 
  public String pseudocodigoAA(int q){
    
     String a = "ARQC0000" ;
     return  "ARQC0000"+ q;
 }
 
  public Constructor getDato(int pos){
       return arreglo[pos];
   }
 
 public void Registrar(Constructor dato){
     arreglo[i] = dato;
     i++;
 }
 
 public void Listar(JTable control){
     String[] cabecera= new String[]{
     "Apellidos",
     "Nombres",
     "Codigo"
     };
     
     DefaultTableModel mod_tabla = new DefaultTableModel(cabecera,0);
     control.setModel(mod_tabla);
     TableRowSorter sorter = new TableRowSorter(mod_tabla);
     control.setRowSorter(sorter);
     for (int pos = 0; pos < i; pos++) {
         mod_tabla.addRow(arreglo[pos].getRegistrar());
     }
     
 }
 
 
 
 
 public void GuardarTxt(Constructor dato){
     
    try {
      
     BufferedWriter escritor = new BufferedWriter(
    new FileWriter("ProductoIC",false)
   );    
        for (int pos = 0; pos < i; pos++) {
          if(dato instanceof Ing_Civil){
            
                escritor.write(
     Arrays.toString(arreglo[pos].getCadena())
            );   
          
     escritor.newLine(); 
          }
      
        }
     escritor.close();
   
    } catch (IOException e) {
           }
    
}  
 
 public void GuardarTxtAA(Constructor dato){
     
    try {
      
     BufferedWriter escritorA = new BufferedWriter(
    new FileWriter("ProductoAA",false)
   );    
        for (int pos = 0; pos < i; pos++) {
          if(dato instanceof Arquitecto){
            
            escritorA.write(
     Arrays.toString(arreglo[pos].getCadena())
            );   
          
     escritorA.newLine(); 
          }
      
        }
     escritorA.close();
   
    } catch (IOException e) {
        
    }
    
}

  
 
 
 
 
 
}
