package homework.lesson15;

public class Main {

    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.add("one");
        stringStack.add("two");
        stringStack.add("three");
        stringStack.add("four");
        stringStack.add("five");

        System.out.println(stringStack.getElement());
        stringStack.delete();
        stringStack.printer();

        Stack<Integer> integerStack = new Stack<>();
        for(int i = 1; i <= 5; i++ ){
            integerStack.add(i);
        }
        System.out.println(integerStack.getElement());
        integerStack.printer();
        integerStack.delete();
        integerStack.add(77);
        integerStack.printer();
    }
}
