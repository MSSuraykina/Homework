package homework.lesson14.task1;

public class CalculatorMK51 {

    public int div(int a, int b){
        if (b == 0)
        {
            throw new IllegalArgumentException("Не верное значение второго параметра = 0");
        }
        return a/b;
    }

    public static void main(String[] args) {
        CalculatorMK51 calc = new CalculatorMK51();
        try {
            calc.div(1,0);
        }
        catch (Exception ex ){
            System.out.println(ex.getMessage());
        }
    }

}
