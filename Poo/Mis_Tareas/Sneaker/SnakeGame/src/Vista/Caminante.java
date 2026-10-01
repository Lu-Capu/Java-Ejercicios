package Vista;

public class Caminante implements Runnable{
    
    PanelSnake panel;
    boolean estado=true;
    
   public Caminante(PanelSnake panel){
      this.panel=panel; 
   } 
    
    
    @Override
    public void run() {

  while(estado){            
       panel.avanzar();
       panel.repaint();
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            System.getLogger(Caminante.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
          
   }
        
       
 }

public void stop(){
    this.estado=false;
}
    
    
    
}
