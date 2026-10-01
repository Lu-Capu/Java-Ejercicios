package Vista;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelFondo extends  JPanel{
   
    Color colorfondo = Color.gray;
    int tamañomax;
    int tamaño;
    int cant;
    int res;

    public PanelFondo(int tamañomax, int cant) {
        this.tamañomax = tamañomax;
        this.tamaño = tamañomax/cant;
        this.cant = cant;
        this.res = tamañomax % cant;
    }
    
  @Override
  public void paint(Graphics pintor){
    super.paint(pintor);
    pintor.setColor(colorfondo);
      for (int i = 0; i < cant; i++) {
          for (int j = 0; j < cant; j++) {
              pintor.fillRect( res+10 +i*tamaño, + j*tamaño, tamaño-1, tamaño-1);
          }
          
          
      }
    
    
      
  } 
    

    
}
