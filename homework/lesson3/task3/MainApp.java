package homework.lesson3.task3;

public class MainApp {
    public static void main(String[] args) {
        String[] posit = {"командир", "второй пилот", "инженер", "дубль1", "дубль2", "дубль3"};
        double[] money = {400, 350, 300, 250, 250, 250};//массив командировочных до вычета 7%
        double ostatok[];//обьявляем новый массив для хранения остатка
        /*
        массив командировачных до вычета мы оставляем неизменным т.к.
        он нам понадобится для вывода на кансоль
        */
        ostatok = calculate(money);
        int i;
        for (i = 0; i < 6; i++) {
            System.out.println(posit[i]+"-командировочные до вычета 7% ="+money[i]+" остаток после вычета ="+ostatok[i]);
        }

    }
    public static double[] calculate(double my_money[]){
        int j;
        double[] money1=new double[6];
        for (j=0;j<6;j++){
            money1[j]=my_money[j]-(my_money[j]*0.07);
        }

      return money1;
    }
}