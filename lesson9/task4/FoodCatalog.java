package homework.lesson9.task4;

        import homework.lesson8.task5.Employee;

        import java.util.LinkedList;
        import java.util.ListIterator;

public class FoodCatalog extends Food{

    public FoodCatalog(String name) {
        super(name);
    }

    public static void main(String[] args) {
        LinkedList<Food> foods = new LinkedList<>();
        foods.add(new Food("Борщ в тубе"));
        foods.add(new Food("Рассольник в тубе"));
        foods.add(new Food("Свинина с овощами в тубе"));
        foods.add(new Food("Мясное пюре в тубе"));
        foods.add(new Food("Творог с облепиховым пюре в тубе"));
        foods.add(new Food("Творог с черносмиродиновым пюре в тубе"));
        foods.add(new Food("Суп харчо в тубе"));
        foods.add(new Food("Щи зеленые в тубе"));
        foods.add(new Food("Творог с яблочным пюре в тубе"));
        foods.add(new Food("Творог в тубе"));

        System.out.println(foods);

        ListIterator<Food> listIterator = foods.listIterator();

        int i = 0;
        while (listIterator.hasNext()){
            listIterator.next();
            if(i == 5){
                listIterator.add(new Food("Сырный суп в тубе"));
                listIterator.previous();
                listIterator.previous();
                listIterator.remove();
                break;
            }

            i++;
        }
        System.out.println(foods);

    }
}
