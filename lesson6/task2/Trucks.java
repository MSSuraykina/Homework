package homework.lesson6.task2;

//Грузовые автомобили

public class Trucks extends GroundTransportation{

    public Trucks(String goStr){
       super(goStr);
    }

    private double capacity; // грузоподьемность

    public void loadCargo(Object cargo){

    }
    public void shipping (double capacity, Object cargo){

    }
    public void unloadCargo (Object cargo){

    }

    @Override
    public String toString() {
        return "Грузопая машина -  'Камаз'";
    }
}
