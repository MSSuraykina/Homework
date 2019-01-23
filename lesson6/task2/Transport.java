package homework.lesson6.task2;

import java.awt.*;
import java.util.Objects;

public class Transport{

    private RailwayTransport railwayTransport;
    private GroundTransportation groundTransportation;
    private AirTransport airTransport;
    private SpaceTransport spaceTransport;
    private String name;
    private String fuel;   //тип топлива
    private double weight; //вес
    private Color color;
    private String number; //серийный номер
    private String goStr;

    public Transport(String goStr) {
        this.goStr = goStr;
    }

    public Transport() {
    }

    public void runEngine(){
        System.out.println(goStr);
    }
    public boolean technicalInspection(){
        return true;   //чтобы программа не выдавала ошибки
    }

    public String getGoStr() {
        return goStr;
    }

    public void setGoStr(String goStr) {
        this.goStr = goStr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.weight, weight) == 0 &&
                Objects.equals(railwayTransport, transport.railwayTransport) &&
                Objects.equals(groundTransportation, transport.groundTransportation) &&
                Objects.equals(airTransport, transport.airTransport) &&
                Objects.equals(spaceTransport, transport.spaceTransport) &&
                Objects.equals(name, transport.name) &&
                Objects.equals(fuel, transport.fuel) &&
                Objects.equals(color, transport.color) &&
                Objects.equals(number, transport.number) &&
                Objects.equals(goStr, transport.goStr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(railwayTransport, groundTransportation, airTransport, spaceTransport, name, fuel, weight, color, number, goStr);
    }



}
