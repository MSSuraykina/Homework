package homework.lesson8.task3;

import homework.lesson8.task1.My_Sputnik;
import homework.lesson8.task1.Sputnik;

import java.util.ArrayList;
import java.util.List;

public class NameSputnik extends My_Sputnik {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add(cosmos_864.getName());
        names.add(cosmos_970_deb.getName());
        names.add(cosmos_1249_coolant.getName());
        names.add(cosmos_1900_deb.getName());
        names.add(cosmos_2298_deb.getName());
        names.add(meteor_2_8_deb.getName());
        names.add(delta_1_deb.getName());
        names.add(fengyun_1c_deb.getName());
        names.add(sl_8_deb.getName());
        names.add(ops_4684_deb.getName());

        List<Double> velocities = new ArrayList<>();
        velocities.add(cosmos_864.getVelocity());
        velocities.add(cosmos_970_deb.getVelocity());
        velocities.add(cosmos_1249_coolant.getVelocity());
        velocities.add(cosmos_1900_deb.getVelocity());
        velocities.add(cosmos_2298_deb.getVelocity());
        velocities.add(meteor_2_8_deb.getVelocity());
        velocities.add(delta_1_deb.getVelocity());
        velocities.add(fengyun_1c_deb.getVelocity());
        velocities.add(sl_8_deb.getVelocity());
        velocities.add(ops_4684_deb.getVelocity());

        Sputnik sl_14_deb = new Sputnik();
        sl_14_deb.setName("SL 14 DEB");
        sl_14_deb.setVelocity(7.11);

        System.out.println(names);
        System.out.println(velocities);
        System.out.println(names.contains(sl_14_deb.getName()));
    }


}
