
package Control;

import Molde.Registro_Estacionamiento;
import Molde.Vehiculo;
import Molde.Zona_Estacionamiento;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Arreglo_Principal {
    

    
private Zona_Estacionamiento[] objZona = new Zona_Estacionamiento[12];
private int contadorZona=0;
private Vehiculo[] Vehiculo = new Vehiculo[20];
private int contadorVehiculo=0;
private Registro_Estacionamiento[] objRegistro = new Registro_Estacionamiento[30];
private int contadorRegistro =0;
  


 //------------Zona-------------


   public void registrar_Zona(Zona_Estacionamiento dato){
     try {
   if(Buscar_CodigoZona(dato.getNivel()) == -1){
       objZona[contadorZona]= dato;
contadorZona++;
   }else{
       JOptionPane.showMessageDialog(null, "El nivel ya  existe");
   }

     } catch (ArrayIndexOutOfBoundsException e) {
         JOptionPane.showMessageDialog(null, "Lista llena");
     }
 
 }
 
 public void eliminarZona(int pos){
   
     for (int j = pos; j < contadorZona-1; j++) {
       objZona[j]= objZona[j+1];  
     }
     contadorZona--;  
 }
 
public Object traerCodigoZona(int nivel){
    for (int x = 0; x < contadorZona; x++) {
        if(objZona[x].getNivel() == nivel){
            return objZona[x];
        }
    }
    return null;
}
 
public int Buscar_CodigoZona(int dato){
    for (int pos = 0; pos < contadorZona; pos++) {
        if(objZona[pos].getNivel() == dato){
            return pos;
        }
    }
  return -1;
}

 
 public void editarZona(Zona_Estacionamiento dato, int pos){
    objZona[pos]= dato;
 }
 
 
 public void listarZona(JTable control){
     
 String[] cabecera={"Codigo de Zona","Nivel","Capacidad Máxima","Espacio"};    
 DefaultTableModel mod_tabla = new DefaultTableModel(cabecera, 0);
 control.setModel(mod_tabla);
     for (int pos = 0; pos <contadorZona; pos++) {
         mod_tabla.addRow(objZona[pos].getRegistro());
     }
 
 }

public void reducirEspacioPorNivelZona(int nivelBuscado) {
    for (int x = 0; x < contadorZona; x++) {
        if (objZona[x] != null && objZona[x].getNivel() == nivelBuscado) {
            objZona[x].liberarEspacio(); 
    
            return;
        }
    }

}
public void AumnetarEspacioPorNivelZona(int nivelBuscado) {
    for (int x = 0; x < contadorZona; x++) {
        if (objZona[x] != null && objZona[x].getNivel() == nivelBuscado) {
            objZona[x].AumentarEspacio(); 
    
            return;
        }
    }

}
 public void listarZona(JComboBox control){
 DefaultComboBoxModel combo = new DefaultComboBoxModel();
 control.setModel(combo);
     for (int pos = 0; pos <contadorZona; pos++) {
         //combo.addElement(arreglo[pos].getId());
         combo.addElement(objZona[pos].getNivel());
     }
 
 }
   
public int getEspaciosPorNivelZona(int nivelBuscado) {
    for (int x = 0; x < contadorZona; x++) {
        if (objZona[x] != null && objZona[x].getNivel() == nivelBuscado) {
            return objZona[x].getEspacio_ocupado();
        }
    }
    return -1; 
}

 public void filtroZona(JTable control, String filtro){
     
 String[] cabecera={"Codigo de Zona","Nivel","Capacidad Máxima","Espacio"}; 
 DefaultTableModel mod_tabla = new DefaultTableModel(cabecera, 0);
 control.setModel(mod_tabla);
     for (int pos = 0; pos <contadorZona; pos++) {
         if(objZona[pos].getCodigo_Zona().toLowerCase().contains(filtro.toLowerCase())){
            mod_tabla.addRow(objZona[pos].getRegistro());  
         }
        
     }
 
 }

//Metoso para llamarlo sin parametros
public void mergeSortZona() {
    if (contadorZona > 1) { 
 //Se ejecuta si hay más de un elemento       
        mergeSortZona(objZona, 0, contadorZona - 1);
 //contadorZona - 1 ---> por que los arreglos sus indices empiezan por 0
 //Ejemplo: {0,8,9,7,4}, hay 5 elementos pero su indice final es 4
 
    }
}

private void mergeSortZona(Zona_Estacionamiento[] arreglo, int inicio, int fin) {
    if (inicio < fin) {
        int medio = (inicio + fin) / 2; //Divide el arreglo
        mergeSortZona(arreglo, inicio, medio); //Divide el arreglo a la izquierda
        mergeSortZona(arreglo, medio + 1, fin);   //Divide al la derecha
        mergeZona(arreglo, inicio, medio, fin);   // Fusiona
    }
}

private void mergeZona(Zona_Estacionamiento[] arreglo, int inicio, int medio, int fin) {
    int n1 = medio - inicio + 1;    //CANTIDAD DE ELEMENTOS EN LA PARTE IZQUIERDA
    int n2 = fin - medio;          //CANTIDAD DE ELEMENTOS EN LA PARTE DERECHA
//------Crear arreglos temporales con su respectivo tamaño
//Temporal por que cuando termine el metodo sea va a destruir
    Zona_Estacionamiento izquierda[] = new Zona_Estacionamiento[n1];
    Zona_Estacionamiento derecha[]   = new Zona_Estacionamiento[n2];

   //-----Copiar los elemntos en los arreglos temporales 
    for (int x = 0; x < n1; x++) {
        izquierda[x] = arreglo[inicio + x]; //Guarda los elemntos en el arreglo izq.
    }
    for (int y = 0; y < n2; y++) {
        derecha[y] = arreglo[medio + 1 + y];//Guarda los elemntos en el arreglo para derecha.
    }

    int iIzq = 0, iDer = 0, k = inicio;
    //Contadores para recorrer los arreglos

    while (iIzq < n1 && iDer < n2) { //Si el contador ITIZ no supera la cantidad de elemntos que hay(n1); se ejecuta
        //Lo mismo para ider
        if (izquierda[iIzq].getEspacio_ocupado() <= derecha[iDer].getEspacio_ocupado()) {
     //Va a comparar los elemntos de la izquierda con la derecha   
     //Sí izquierda es menor, entonces se guarda y se le amenta el indice
     
            arreglo[k] = izquierda[iIzq];
    //Se alamacena en el arreglo "original"       
            iIzq++;
        } else {
    //Si resulta contrario, se guarda el elemento derecha y umenta su contador        
            arreglo[k] = derecha[iDer];
            iDer++;
        }
        //Como si o si se debio de guardar un elemnto en esa posicion 
        //Se aumenta k, para poder guardar otro elemento
        k++;
    }

    while (iIzq < n1) {
 //Este while funciona por si aun queda elemntos en izquierda
 //Entonces, ya no hay elementos en la der. con los cuales compararse
 //Por lo tanto se guarda todo los elemntos de la izquierda
        arreglo[k] = izquierda[iIzq];
        iIzq++;
        k++;
    }
   
    while (iDer < n2) {
 //Sucede lo mismo que con la izq.
 //Si izquierda ya no hay valores entonces se guarda
        arreglo[k] = derecha[iDer];
        iDer++;
        k++;
    }
}

 

//---------Vehiculo------
  public void registrarVehiculo(Vehiculo dato){
     try {
   
     Vehiculo[contadorVehiculo]= dato;
contadorVehiculo++;
     } catch (ArrayIndexOutOfBoundsException e) {
         JOptionPane.showMessageDialog(null, "Lista llena");
     }
 
 }
 
 public void eliminarVehiculo(int pos){
   
     for (int j = pos; j < contadorVehiculo-1; j++) {
       Vehiculo[j]= Vehiculo[j+1];  
     }
     contadorVehiculo--;  
 }
 
 
 public void editarVehiculo(Vehiculo dato, int pos){
    Vehiculo[pos]= dato;
 }
 
 
 public void listarVehiculo(JTable control){
     
 String[] cabecera={"Placa","Tipo de Vehiculo","Hora"};    
 DefaultTableModel mod_tabla = new DefaultTableModel(cabecera, 0);
 control.setModel(mod_tabla);
     for (int pos = 0; pos <contadorVehiculo; pos++) {
         mod_tabla.addRow(Vehiculo[pos].getRegistro());
     }
 
 }

public int Buscar_HoraVehiculo(String placa) {
    for (int x = 0; x < contadorVehiculo; x++) {
        if (Vehiculo[x].getPlaca().equals(placa)) {
            return Vehiculo[x].getHora(); 
        }
    }
    return -1; 
}

 
 public String getDatoVehiculo(int pos){
     return Vehiculo[pos].getPlaca();
 }


 public void listarVehiculo(JComboBox control){
 DefaultComboBoxModel combo = new DefaultComboBoxModel();
 control.setModel(combo);
     for (int pos = 0; pos <contadorVehiculo; pos++) {
if(Vehiculo[pos].isEstado()){
    combo.addElement(Vehiculo[pos].getPlaca());
}
         
     }
 
 }






 
    
 //------Registro---------   

   public int getNIVELRegistro(String placa){
       for (int x = 0; x < contadorRegistro; x++) {
           if(objRegistro[x].getObjZona() !=null && objRegistro[x].getObjvehi()!=null){
               if(objRegistro[x].getObjvehi().getPlaca().trim().equalsIgnoreCase(placa)){
               return objRegistro[x].getObjZona().getNivel();
           } 
           }else{
               JOptionPane.showMessageDialog(null, "asdsada");
           }
          
       }
       return -1;
   }
 
    public void registrarRegistro(Registro_Estacionamiento dato){
     try {
   
objRegistro[contadorRegistro]= dato;
contadorRegistro++;

     } catch (ArrayIndexOutOfBoundsException e) {
         JOptionPane.showMessageDialog(null, "Lista llena");
     }
 
 }
 
 public void eliminarRegistro(int pos){
   
     for (int j = pos; j < contadorRegistro-1; j++) {
       objRegistro[j]= objRegistro[j+1];  
     }
     contadorRegistro--;  
 }
 
 
 public void editarRegistro(Registro_Estacionamiento dato, int pos){
    objRegistro[pos]= dato;
 }
 
 
 public void listarRegistro(JTable control){
     
 String[] cabecera={"Placa del Vehiculo","Codigo de Zona","Tipo de Vahiculo","Hora de Entrada"};    
 DefaultTableModel mod_tabla = new DefaultTableModel(cabecera, 0);
 control.setModel(mod_tabla);
     for (int pos = 0; pos <contadorRegistro; pos++) {
         mod_tabla.addRow(objRegistro[pos].getRegistro());
     }
 
 }

 public void filtroRegistro(JTable control, String filtro){
     
 String[] cabecera={"Placa del Vehiculo","Codigo de Zona","Tipo de Vahiculo","Hora de Entrada"};    
 DefaultTableModel mod_tabla = new DefaultTableModel(cabecera, 0);
 control.setModel(mod_tabla);
     for (int pos = 0; pos <contadorRegistro; pos++) {
         if(objRegistro[pos].getObjvehi().getTipo_Vehiculo().toLowerCase().contains(filtro.toLowerCase())){
            mod_tabla.addRow(objRegistro[pos].getRegistro());  
         }
        
     }
 
 }

 public void listarRegistro(JComboBox control){
 DefaultComboBoxModel combo = new DefaultComboBoxModel();
 control.setModel(combo);
     for (int pos = 0; pos <contadorRegistro; pos++) {
         //combo.addElement(arreglo[pos].getId());
         combo.addElement(objRegistro[pos].getHora());
     }
 
 }
 
 
 
 //RECURSIVIDAD: Capacidad de un metodo de llamarse asi mismo.
 //Quick sort y Merge Sort son funciones recurisvas
 public void QuicksortRegistro() {
    if (contadorRegistro > 1) { // Solo ordenar si hay más de un elemento
        QuicksortRegistro(0, contadorRegistro - 1);
        //Hacemos esto para que se ejecute el metodo sin recibir parametros
        //contadorRegistro - 1 ----> Se le resta menor -1 por que es el contador
    }
}

private void QuicksortRegistro(int Primero, int Ultimo) {
    int pivote;
    if (Primero < Ultimo) {//Verifica si hay mas de 1 elemento
        
      //Se implementa la Recursividad  
        pivote = ColocarRegistro(Primero, Ultimo);
        QuicksortRegistro(Primero, pivote - 1);// Ordena la parte izquierda del pivote
        QuicksortRegistro(pivote + 1, Ultimo); // Ordena la parte derecha del pivote
    }
}

private int ColocarRegistro(int Primero, int Ultimo) {
    int pivote = Primero;//pivote estara en la posicion original
    int valor_pivote = objRegistro[pivote].getHora();//Se guarda un valor
    //valor_pivote nos servira para comparar
    Registro_Estacionamiento temp;

    for (int j = Primero + 1; j <= Ultimo; j++) {
        //int j = Primero + 1 --> para que tome otro valor apate del pivote
        if (objRegistro[j].getHora() < valor_pivote) {
    //en el if sera como se ordenara        
            pivote++;
     //Aqui hacemos como el metodo burbuja
            temp = objRegistro[j];
            objRegistro[j] = objRegistro[pivote];
            objRegistro[pivote] = temp;
           
     }
        
    } //Termina el for. Asegura que todo los elemntos menores esten a la izq.
//Recolocar el pivote
    temp = objRegistro[Primero];
    objRegistro[Primero] = objRegistro[pivote];
    objRegistro[pivote] = temp;
//El elemento que esta en el pivote ha encontrado su lugar natural
//Devuelve el pivote para comenzar la recursividad
    return pivote;
}   
 
    
}
