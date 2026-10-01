package Vista;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class PanelSnake extends  JPanel{
   
    Color colorsnake = Color.blue;
    Color colorcomida = Color.red;
    int tamañomax;
    int tamaño;
    int cant;
    int res;

 List<int[]> snake = new ArrayList<>();
 int[] comida= new int[2];
 String direccion = "der";
String direccionprox= "der" ;
 
    Thread hilo;
    Caminante camino;
 
 
    
    public PanelSnake(int tamañomax, int cant) {
        this.tamañomax = tamañomax;
        this.tamaño = tamañomax/cant;
        this.cant = cant;
        this.res = tamañomax % cant;
        int[] a = {cant/2 -1 , cant/2 -1};
        int[] b = {cant/2 , cant/2 -1};
        snake.add(a);
        snake.add(b);
        generarComida();

        
        camino=new Caminante(this);
        hilo= new Thread(camino);
        hilo.start();
        
    }
    
  @Override
  public void paint(Graphics pintor){
    super.paint(pintor);
    pintor.setColor(colorsnake);
    
    //PintaSerpiente
      for (int[] is : snake) {
        pintor.fillRect( res+10+ is[0]*tamaño,  is[1]*tamaño, tamaño-1, tamaño-1);   
      }
   //PintarComida
   pintor.setColor(colorcomida);
      pintor.fillRect( res+10+ comida[0]*tamaño,  comida[1]*tamaño, tamaño-1, tamaño-1); 
  } 
    
 public void avanzar(){
     igualardir();
     int[] ultimo = snake.get(snake.size() -1);
     int agregarX = 0 ;
     int agregarY = 0 ;
     switch (direccion) {
         case "der":agregarX=1;break;
         case "iz":agregarX=-1;break;
         case "ar":agregarY=-1;break;
         case "ab":agregarY=1;break;
    
     }

    int[] nuevo={ Math.floorMod(ultimo[0]+ agregarX, cant) , Math.floorMod(ultimo[1]+ agregarY, cant) }; 
   boolean existe=false;
     for (int i = 0; i < snake.size(); i++) {
         if(nuevo[0]==snake.get(i)[0] && nuevo[1]==snake.get(i)[1]){
            existe=true;
            break;
         }
     }
        if(existe){
            //Musica
            sonido();
          
           JOptionPane.showMessageDialog(null, "Game Over");
           System.exit(0);
           
        }else{
            if(nuevo[0]==comida[0] && nuevo[1]==comida[1] ){
            snake.add(nuevo);
            generarComida();
            }else{
     snake.add(nuevo);
    snake.remove(0); 
            }
            
        }
         
  
 }   
    
 public void generarComida(){
     boolean existe = false;
     int a = (int) (Math.random()*cant);
     int b = (int) (Math.random()*cant);
     for (int[] par : snake) {
          if(par[0]==a && par[1]==b){
              existe=true;
              generarComida();
              break;
        }
     }
    if(!existe){
      this.comida[0]=a;
      this.comida[1]=b;
        }
     
 } 
 
 public void cambiarDireccion(String dir){
 if( ( this.direccion.equals("der") || this.direccion.equals("iz") )  && (dir.equals("ar") || dir.equals("ab")  ) ){
       this.direccionprox = dir;    
     }
   if( ( this.direccion.equals("ar") || this.direccion.equals("ab") ) && (dir.equals("iz") || dir.equals("der") ) ){
       this.direccionprox = dir;    
     }   
   
 }
 
 public void igualardir(){
   this.direccion= this.direccionprox;
           
}
 
 public void sonido(){

  try {
        AudioInputStream audio = AudioSystem.getAudioInputStream(
            getClass().getResource("/Sonido/comida.wav")
        );
        Clip clip = AudioSystem.getClip();
        clip.open(audio);
        clip.start();
    } catch (Exception e) {
        e.printStackTrace();
    }

     
 }
 
 
}

