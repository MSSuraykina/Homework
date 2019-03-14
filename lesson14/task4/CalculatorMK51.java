package homework.lesson14.task4;

import java.util.Scanner;

public class CalculatorMK51 {

    private int battery;
    private boolean isBattery;

    public CalculatorMK51() {
        this.battery = 10;
        this.isBattery = true;
    }

    public int getBattery() {
        return battery;
    }
    public void batteryConsumption(int battery) throws LowBatteryException {
        setBattery(getBattery()-1);
        if(getBattery() == 1){
            isBattery = false;
            throw new LowBatteryException("Батарея разряженна");
        }
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int div(Object a, Object b) {

        if(a instanceof Number && b instanceof Number) { // в условии наверное опечатка там "instantof"
            return (((Number) a).intValue()/ ((Number) b).intValue()); //без приведения не работает
        }
        else {
            throw new IllegalArgumentException("Не верное значения входных параметров");
        }

    }
        public static void main(String[] args){
            CalculatorMK51 calc = new CalculatorMK51();
            Scanner sc = new Scanner(System.in);
            while (calc.isBattery) {
                System.out.print("value 1 = ");
                Value value1 = new Value(sc.nextInt());
                System.out.print("value 2 = ");
                Value value2 = new Value(sc.nextInt());
                try {
                    calc.div(value1, value2);
                    calc.batteryConsumption(calc.getBattery());
                    System.out.println(calc.getBattery());
                } catch (ArithmeticException | IllegalArgumentException | LowBatteryException ex) {
                    System.out.println("ОШИБКА: " + ex.getMessage());
                }
            }

        }


}
