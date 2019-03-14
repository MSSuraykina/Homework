package homework.lesson14.task4;

public class CalculatorMK51 {

    private int battery;

    public CalculatorMK51() {
        this.battery = 100;
    }

    public int getBattery() {
        return battery;
    }
    public void batteryConsumption(int battery) throws LowBatteryException {
        CalculatorMK51 calc = new CalculatorMK51();
        calc.setBattery(calc.getBattery()-1);
        System.out.println(calc.getBattery());
        if(calc.getBattery() == 1){
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
            Value value1 = new Value(1);
            Value value2 = new Value(2);
            try
            {
                calc.div(value1, value2);
                calc.batteryConsumption(calc.getBattery());


            }
            catch (ArithmeticException | IllegalArgumentException | LowBatteryException ex){
                System.out.println("ОШИБКА: " + ex.getMessage());
            }


        }


}
