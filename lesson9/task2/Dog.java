package homework.lesson9.task2;

public class Dog implements Comparable<Dog>{
    private String name;
    private String gender;
    private String weight;
    private String color;

    public Dog(String name, String gender, String weight, String color) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public int getKey(String color){
        int i = 0;
        switch (color){
            case "Black":
                i = 1;
                break;
            case "Gray":
                i = 2;
                break;
            case "Brown":
                i = 3;
                break;
            case "Orange":
                i = 4;
                break;
            case "Beige":
                i = 5;
                break;
            case "White":
                i = 6;
                break;
        }
        return i;
    }

    @Override
    public int compareTo(Dog dog) {

        return (getKey(this.color) < getKey(dog.color) ? -1 : (getKey(this.color) == getKey(dog.color)) ? 0 : 1);
    }
    @Override
    public String toString() {
        return (name +
                " ,  gender=" + gender +
                " , weight= " + weight +
                ", color= " + color );
    }
}

