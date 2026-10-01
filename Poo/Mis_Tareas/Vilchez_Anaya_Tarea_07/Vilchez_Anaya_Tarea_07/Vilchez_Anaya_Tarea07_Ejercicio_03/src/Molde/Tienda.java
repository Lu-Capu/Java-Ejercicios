package Molde;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class Tienda {
    String [][] tienda = new String [30][4];

int i=0;
int k=0;
//K para contador de comprobantes
    public Tienda() {
    }
    
  public void Agregar(String comprobante, String nombre, String fecha, String monto_venta ){
if(i<tienda.length){
tienda[i][0] = comprobante;
tienda[i][1] = nombre;
tienda[i][2] = fecha;
tienda[i][3] = monto_venta; 
i++;
k++;
}else{
    JOptionPane.showMessageDialog(null, "NO HAY MÁS TIENDAS");
}

  }  
   
 public void Listar(DefaultTableModel mod_tabla){
   mod_tabla.setRowCount(0);
     for (int pos = 0; pos < i; pos++) {
         mod_tabla.addRow(tienda[pos]);
     }

         
 } 
    
 public void Numero_Consultar(){
     JOptionPane.showMessageDialog(null, "Número de combrobantes: " + k);
 }
 public void Consultar(){
     if(k==0){
        JOptionPane.showMessageDialog(null, "No hay comprobantes");
     }else{
          for (int i = 0; i < k; i++) {
        //La "K" nos indica hasta cuanto se ha registrado
       JOptionPane.showMessageDialog(null, "Número de combrobantes: " + tienda[i][0]);
     }
          
     }
         
  
 }
 
public void Suma(){
    int suma=0;
    for (int i = 0; i < k; i++) {
     int p = Integer.parseInt(tienda[i][3]);
        suma += p;
     
    }
       JOptionPane.showMessageDialog(null, "El monto total es: " + suma);
}
  

public void Eliminar (){
 String num =JOptionPane.showInputDialog("Se requiere el número del comprobante");

for (int m = 0; m < k; m++) {
      if( tienda[m][0].contains(num)){
//Si encuentra similitud se ejecuta...
//x=m. Por que si se ejecuta esto, tiene que haber una posicion "m"
   for (int x = m; x < i-1; x++){
        tienda[x] = tienda[x+1];}
       k--;
       i--;
      }
    }
 
}

public void Archivo_txt(DefaultTableModel tabla){
    try {
  BufferedWriter escritor = new BufferedWriter(
 new FileWriter("C:\\Users\\Usuario\\OneDrive\\Desktop\\Vilchez_Anaya_Tarea_07_Ejercicio_03.txt",true));  
        for (int n = 0; n < i; n++) {
            for (int p = 0; p < 4; p++) {
                escritor.write(tienda[n][p] + "\t");
            }
          escritor.newLine();
        }
    JOptionPane.showMessageDialog(null, "Guardado correctamente");
        escritor.close();
    
    
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }

}

}
