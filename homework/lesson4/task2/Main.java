package homework.lesson4.task2;

import static java.lang.System.*;

public class Main {
    private static boolean test;
    private static Candidate[] candidates;

    public static void main(String[] args) {
        Candidate my_Candidate_1 = new Candidate("российское", "высшее", "да",
                33, 4, 75, 180, 43, 80, 38);
        Candidate my_Candidate_2 = new Candidate("российское", "высшее", "да",
                35, 2, 80, 175, 44, 90,41);
        Candidate my_Candidate_3 = new Candidate("российское", "высшее", "нет",
                30, 3, 78,177, 42, 85,40);
        validation(my_Candidate_1);
        validation(my_Candidate_2);
        validation(my_Candidate_3);

    }

    private static void validation(Candidate...candidates) {
        for(Candidate i: candidates) {
            boolean msg=false;
            if ((i.age <= 35)
                    && "российское".equals(i.citizenship)
                    && "высшее".equals(i.education)
                    && "да".equals(i.knowledgeOfEnglish)
                    && (i.experience >= 3)

            ){
                msg = true;
            }
            if(( msg == true
                    && i.growth >= 50) & (i.growth <= 90)
                    && (i.height >= 150) & (i.height <= 190)
                    && (i.hootSize <= 46)
                    && (i.sitHeight>=80) & (i.sitHeight <=99 )
                    && i.volumBreast<41){
                msg = true;
            }
               out.println(msg);
            }


        }
    }



