package homework.lesson4.task2;

import static java.lang.System.*;

public class Main {
    private static boolean test;
    private static Candidate[] candidates;

    public static void main(String[] args) {
        Candidate my_Candidate_1 = new Candidate(32, "российское", "высшее", 2, 80, 180, 45);
        Candidate my_Candidate_2 = new Candidate(35, "российское", "высшее", 6, 75, 170, 42);
        Candidate my_Candidate_3 = new Candidate(33, "российское", "высшее", 4, 91, 183, 44);
        validation(my_Candidate_1);
        validation(my_Candidate_2);
        validation(my_Candidate_3);

    }

    private static void validation(Candidate...candidates) {
        for(Candidate i: candidates) {
            boolean msg;
            if (i.age <= 35) {
                msg = true;
            } else {
                msg = false;
                out.println(msg);
                break;
            }
            if (i.citizenship.equals("российское")) {
                msg = true;
            } else {
                msg = false;
                out.println(msg);
                break;
            }
            if (i.education.equals("высшее")) {
                msg = true;
            } else {
                msg = false;
                out.println(msg);
                break;
            }
            if (i.experience >= 3) {
                msg = true;
            } else {
                msg = false;
                out.println(msg);
                break;
            }
            if (i.growth >= 50 & i.growth <= 90) {
                msg = true;
            } else {
                msg = false;
                out.println(msg);
                break;
            }
            if (i.height >= 150 & i.height <= 190) {
                msg = true;
            } else {
                msg = false;
                out.println(msg);
                break;
            }
            if (i.hootSize <= 46) {
                msg = true;
                out.println(msg);
            } else {
                msg = false;
                out.println(msg);
            }

        }
    }


}

