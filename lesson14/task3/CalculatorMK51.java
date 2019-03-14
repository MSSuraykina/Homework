package homework.lesson14.task3;

public class CalculatorMK51 {
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
            Value value2 = new Value(0);
            try
            {
                calc.div(value1, value2);

            }
            catch (ArithmeticException | IllegalArgumentException ex){
                System.out.println("ОШИБКА: " + ex.getMessage());
            }



            }


}
