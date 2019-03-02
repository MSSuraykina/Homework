package homework.lesson6.task2;

//Грузовые автомобили

public class Truck extends GroundTransportation{

    public Truck(String goStr, String name){
       super(goStr);
       setName(name);
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
        return "Грузопая машина -  '" + getName() + "'";
    }
}
