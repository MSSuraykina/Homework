package homework.lesson6.task2;
// Космический корабль
public class Spacecraft extends SpaceTransport{
    private  String type; // пилотируемые или грузовые

    public Spacecraft(String goStr, String name) {
        super();
        setName(name);
    }

    public boolean docking(){
        return true;
    }

    public boolean undocking(){
        return true;
    }

    public void orbitAdjustment(){
    }

    @Override
    public String toString() {
        return "КА - 'Союз - МС'" + getName() +" '";
    }
}
