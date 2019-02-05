package homework.lesson8.task2;

import homework.lesson8.task1.My_Sputnik;
import homework.lesson8.task1.Sputnik;

import java.util.*;

public class My_Printer extends My_Sputnik {

    public static void main(String[] args) {
        List<Sputnik> sputniks = new ArrayList<>();
        sputniks.add(cosmos_864);
        sputniks.add(cosmos_970_deb);
        sputniks.add(cosmos_1249_coolant);
        sputniks.add(cosmos_1900_deb);
        sputniks.add(cosmos_2298_deb);
        sputniks.add(meteor_2_8_deb);
        sputniks.add(delta_1_deb);
        sputniks.add(fengyun_1c_deb);
        sputniks.add(sl_8_deb);
        sputniks.add(ops_4684_deb);

        Iterator<Sputnik> iter = sputniks.iterator();
        while (iter.hasNext()){
            Sputnik sputnik = iter.next();
           System.out.println(" ID: " + sputnik.getId()
                            + " Apogee: " +sputnik.getApogee()
                            + " Perigee: " + sputnik.getPerigee()
                            + " Velocity: " + sputnik.getVelocity());

        }
    }
}
