package homework.lesson11.task3;

public class Dog implements Comparable<Dog>{
    private String name;
    private String gender;
    private String weight;
    private Color color;

    public Dog(String name, String gender, String weight, Color color) {
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    @Override
    public int compareTo(Dog dog) {

        return (this.color.getCode()) < (dog.color.getCode()) ? -1 : ((this.color.getCode()) == (dog.color.getCode())) ? 0 : 1;
    }
    @Override
    public String toString() {
        return (name +
                " ,  gender=" + gender +
                " , weight= " + weight +
                ", color= " + color );
    }
}

