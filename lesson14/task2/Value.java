package homework.lesson14.task2;

public class Value extends Number {
    /**
     * не получилось оставить неизменным, попросил
     * имплементировать методы класса Number
     */

    private int value;

    Value(int v){
        this.value = v;
    }

    public int intValue(){
        return this.value;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

}
