package homework.lesson15;

        import java.util.LinkedList;
        import java.util.ListIterator;

public class Stack <V> {
    LinkedList<V> stackList;

    public Stack() {

        this.stackList = new LinkedList<>();

    }

    public void add (V obj){
        stackList.add(obj);

    }
    public V delete(){
        return stackList.removeLast();
    }

    public V getElement(){
        return stackList.getLast();
    }

    public void printer (){
        System.out.print(" Stack: ");
        ListIterator<V> listIterator = stackList.listIterator(stackList.size());
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous());
            System.out.print(" ; ");

        }
        System.out.println();
    }
}
