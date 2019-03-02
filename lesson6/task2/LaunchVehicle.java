package homework.lesson6.task2;
// Ракетоносители

public class LaunchVehicle extends SpaceTransport{
    private  String type; // пилотируемые или грузовые

    public LaunchVehicle(String goStr, String name) {
        super();
        setName(name);
    }

    public void stageSeparation(){

    }// Отделение ступеней
    public void spacecraftUndocking(){

    }// Отстыковка КА

    @Override
    public String toString() {
        return "PH - ' "+ getName() +" '";
    }
}
