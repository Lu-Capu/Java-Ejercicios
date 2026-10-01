package Molde;

public class Hospedaje {
  private Habitacion ObjHabitacion01;
  private Habitacion ObjHabitacion02;
  private Habitacion ObjHabitacion03;

    public Hospedaje() {
    }

    public Hospedaje(Habitacion ObjHabitacion01, Habitacion ObjHabitacion02, Habitacion ObjHabitacion03) {
        this.ObjHabitacion01 = ObjHabitacion01;
        this.ObjHabitacion02 = ObjHabitacion02;
        this.ObjHabitacion03 = ObjHabitacion03;
    }

    
    
    
    public Habitacion getObjHabitacion01() {
        return ObjHabitacion01;
    }

    public void setObjHabitacion01(Habitacion ObjHabitacion01) {
        this.ObjHabitacion01 = ObjHabitacion01;
    }

    public Habitacion getObjHabitacion02() {
        return ObjHabitacion02;
    }

    public void setObjHabitacion02(Habitacion ObjHabitacion02) {
        this.ObjHabitacion02 = ObjHabitacion02;
    }

    public Habitacion getObjHabitacion03() {
        return ObjHabitacion03;
    }

    public void setObjHabitacion03(Habitacion ObjHabitacion03) {
        this.ObjHabitacion03 = ObjHabitacion03;
    }
  

  
  
  
}
