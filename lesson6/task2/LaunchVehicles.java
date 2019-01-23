package homework.lesson6.task2;
// Ракетоносители

public class LaunchVehicles extends SpaceTransport{
    private  String type; // пилотируемые или грузовые

    public LaunchVehicles(String goStr) {
        super(goStr);
    }

    public void stageSeparation(){

    }// Отделение ступеней
    public void spacecraftUndocking(){

    }// Отстыковка КА

    @Override
    public String toString() {
        return "PH - ' Протон - М'\n"
                +"РН - ' Союз - 2.1a'";
    }
}
