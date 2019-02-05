package homework.lesson8.task4;

import homework.lesson8.task1.My_Sputnik;

import java.util.LinkedList;
import java.util.List;

public class ID_Sputnik extends My_Sputnik {
    public static void main(String[] args) {
        List<String> ids = new LinkedList<>();
        ids.add(cosmos_864.getId());
        ids.add(cosmos_970_deb.getId());
        ids.add(cosmos_1249_coolant.getId());
        ids.add(cosmos_1900_deb.getId());
        ids.add(cosmos_2298_deb.getId());
        ids.add(meteor_2_8_deb.getId());
        ids.add(delta_1_deb.getId());
        ids.add(fengyun_1c_deb.getId());
        ids.add(sl_8_deb.getId());
        ids.add(ops_4684_deb.getId());

        System.out.println(ids);// для наглядности
        System.out.println(((LinkedList<String>) ids).getFirst());
        System.out.println(((LinkedList<String>) ids).getLast());
        ((LinkedList<String>) ids).removeLast();
        System.out.println(ids);

    }
}
