package Molde;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.lang.model.SourceVersion;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;


public class Turistas {
    //corhetes se hacen con alt 91 y alt 93
    String[] turistas = new String [20];

   
int i=0;
  //La i nos servira de contador
boolean parar = true;
//creamos un boolean para poder detener un método
//Lo iniciamos en true para que se pueda ejecutar Agregar
//Esto hace que ya haya un elemnto

    public Turistas() {
        
    }
  
 public void Listar(JList lista){
     //Creamos una lista 
     DefaultListModel modLista =  new DefaultListModel();
      lista.setModel(modLista);
      //En este momento la lista esta vacia, no tiene nada
      for (int n = 0; n < i; n++) {
          modLista.addElement(turistas[n]);
      }
 }   
    
    
public void Agregar(String dato){
if(parar==true){
   if(i< turistas.length ){
        //Solo si es true se podrá ejecutar
        turistas[i]= dato;
           i++;  
    
        
   }else if(i>=turistas.length ){
       JOptionPane.showMessageDialog(null, "Llego a la capacidad máxima");
   } 
}

}    
 
public void Cantidad(){
    JOptionPane.showMessageDialog(null, "La cantidad de ingresantes es: " +i);
}

public void Comparar(String nombre){


//i>1 nos indica que al menos ya se debio registrar un elemento
    for (int n = 0; n < i; n++) {
        //i-1 es por que este metodo con un i NO igual a 0 por eso lo tenemos que reducir
     if(turistas[n].contains(nombre)) {
 JOptionPane.showMessageDialog(null, "Dato ya registrado");
 parar=false;
 }else if (!turistas[n].contains(nombre)){
         parar = true;
         //Sigue funcionando el método Agregar
        // JOptionPane.showMessageDialog(null, "Guadardado");
        }    
    }
   

       
}

public void Eliminar(int pos){
        for (int n = pos; n < i-1; n++) {
         turistas[n] = null;
      }
      i--;
}


public void Caracteres(){
  String p= "AS";
    for (int j = 0; j < i; j++) {
        //J va a recorrer todo en busaca de los caracteres
  if(turistas[j].endsWith(p)){
      //endsWith es para ver al final de un caracter
      //startsWith() para cuando inicia 
      JOptionPane.showMessageDialog(null, 
              "Los nombres que terminan con /AS/ son:  " + turistas[j]);
  }
        
    }
}

 public void Archivo_txt(JList lista){
      try {
 BufferedWriter escritor =new BufferedWriter(
new FileWriter("C:\\Users\\Usuario\\OneDrive\\Desktop\\Vilchez_Anaya_Tarea_07_Ejercicio_01.txt",true));
          for (int k = 0; k < i; k++) {
                escritor.write(turistas[k] + "\t");
                escritor.newLine();
          }
       escritor.close();
      JOptionPane.showMessageDialog(null, "Se ha guardado correctamente");
 
      } catch (IOException e) {
          JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
      }
     
    
  }  

}

