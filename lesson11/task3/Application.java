package homework.lesson11.task3;

import homework.lesson11.task3.Color;
import homework.lesson11.task3.Dog;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        Dog dog_1 = new Dog("Rom", "M", "1 kg", Color.BLACK);
        Dog dog_2 = new Dog("Rim", "M", "1,2 kg", Color.BROWN);
        Dog dog_3 = new Dog("Sharik", "M", "0.950 kg", Color.GRAY );
        Dog dog_4 = new Dog("Belka", "W", "0,860", Color.ORANGE);
        Dog dog_5 = new Dog("Trezor", "M", "1.100 kg",Color.WHITE );
        Dog dog_6 = new Dog("Rose", "W", "0.989 kg", Color.BEIGE);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog_1);
        dogs.add(dog_2);
        dogs.add(dog_3);
        dogs.add(dog_4);
        dogs.add(dog_5);
        dogs.add(dog_6);
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
        System.out.println("TreeSet-->");
        sortedByColor(dogs);
    }

    public static Collection<Dog> sortedByColor(List<Dog> dogs) {
        Set<Dog> dogSet = new TreeSet<>();
        dogSet.addAll(dogs);

        for (Dog dog : dogSet) {
            System.out.println(dog);
        }
        return dogSet;
    }

}
