package homework.lesson3.task4;

public class MainApp {
    public static void main(String[] args) {
        String[] horseNames = {"Фаворит", "Смелый", "Феррари", "Ландыш"};
        String[] gamers = {"Джон Дуглас", "Сем Снорк", "Боб Митчел", "Оливер Твист"};
        String[] selectHorses = {"Фаворит", "Феррари", "Ландыш", "Смелый"};
        double[] sums = {2000, 1000, 3000, 500};
        String[] res;
        int j;
        for (j = 0; j < 4; ++j) {
            res = payout(horseNames, gamers, selectHorses, sums);
            System.out.println(res[j]);
        }


    }

    public static String[] payout(String my_horseNames[], String my_gamers[], String my_selectHorses[], double my_sums[]) {

        String[] my_res = new String[4];
        int[] number = new int[4];
        int i, k,b;
        for (b=0;b<4;++b){
        for (k = 0; k < 4; k++) {
            if (my_selectHorses[k]==(my_horseNames[b])) {
                number[k] =b+1;
            }
            }
        }
            for (i = 0; i < 4; ++i) {
                my_res[i] = my_gamers[i] + " " + my_sums[i]*(number[i]*0.66+1);
            }

        return my_res;
        }
    }


