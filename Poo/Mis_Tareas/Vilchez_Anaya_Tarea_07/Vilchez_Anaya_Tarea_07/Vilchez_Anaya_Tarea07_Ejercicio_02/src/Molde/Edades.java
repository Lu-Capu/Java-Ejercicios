package Molde;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.System.out;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Edades {
 int [][]edades = new int[3][10]; 
 int m=0;
 int j=0;
 int p=0;
 int i =0;

    public Edades() {
    }
    
 public void Listar(JList lista){
   DefaultListModel molde_lista = new DefaultListModel();
      lista.setModel(molde_lista);
  
     for (int n = 0; n < 3; n++) {
   //molde_lista.addElement(edades[n]);
    molde_lista.addElement("Lista numero: " + n);
          for (int k = 0; k < edades[n].length; k++) {
          molde_lista.addElement(edades[n][k]);
      }
      }
  
 }

 public void Agregar(int edad){
     
if(edad<12 && (m<10)){
 edades[0][m] = edad; 
   m++;
        if(m>=10){
            JOptionPane.showMessageDialog(null, "LLego a la capacidad máxima");
        } 
     }else if(edad>=12  && (edad<25) && (j<10)){
    edades[1][j] = edad; 
    j++;
    if(j>=10){
            JOptionPane.showMessageDialog(null, "LLego a la capacidad máxima");
        } 
     }else if(edad>=25 && (p<10)){
    edades[2][p] = edad; 
   p++;
    if(p>=10){
            JOptionPane.showMessageDialog(null, "LLego a la capacidad máxima");
        } 
     }

     
 }
  
 public void Guardar_txt(JList lista){
     try {
     BufferedWriter escrito = new BufferedWriter(
     new FileWriter("C:\\Users\\Usuario\\OneDrive\\Desktop\\Vilchez_Anaya_Tarea_07_Ejercicio_02.txt",false)
     ); 
         for (int n = 0; n < 10; n++) {
           escrito.write(edades[0][n] + "\t" + edades[1][n]+ "\t" + edades[2][n] );  
           escrito.newLine();
   }
     escrito.close();
     JOptionPane.showMessageDialog(null, "Fue guardado correctamente");
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
     }
  
 }
 
 
   
}
