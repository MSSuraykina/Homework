package homework.lesson7.task3;

import homework.lesson6.task2.LaunchVehicles;
import homework.lesson7.task2.PhysicalConstants;

import java.sql.Array;
import java.util.Arrays;

public class PhysicalUtils {
    public static int[][] transportMatrix(int[][] a) {
        int[][] b = new int[a.length][a.length];
            for (int i = 0; i < a.length; ++i)
                for (int j = 0; j < a.length; ++j) {
                    b[i][j] = a[j][i];
                }
            return b;
    }
    public static char[][] transportMatrix(char [][] a) {
        char [][] b = new char[a.length][a.length];
        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < a.length; ++j) {
                b[i][j] = a[j][i];
            }
        return b;
    }

    public static byte[][] transportMatrix(byte[][] a) {
        byte[][] b = new byte[a.length][a.length];
        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < a.length; ++j) {
                b[i][j] = a[j][i];
            }
        return b;
    }

    public static boolean[][] transportMatrix(boolean[][] a) {
        boolean [][] b = new boolean[a.length][a.length];
        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < a.length; ++j) {
                b[i][j] = a[j][i];
            }
        return b;
    }

    public static long[][] transportMatrix(long[][] a) {
        long[][] b = new long[a.length][a.length];
        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < a.length; ++j) {
                b[i][j] = a[j][i];
            }
        return b;
    }
    public static short [][] transportMatrix(short[][] a) {
        short[][] b = new short[a.length][a.length];
        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < a.length; ++j) {
                b[i][j] = a[j][i];
            }
        return b;
    }
    public static String[][] transportMatrix(String[][] a) {
        String[][] b = new String[a.length][a.length];
        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < a.length; ++j) {
                b[i][j] = a[j][i];
            }
        return b;
    }

    public static double getEnergy(double m){
        double energy;
        energy = m* PhysicalConstants.L_S_I_V;
        return energy;
    }


    /**
     Для проверки работы методов
     */
    public static void main(String[] args) {
        int [] [] matrix = {
                {1,1},
                {2,2}
        };
        int matrixB[][];
        matrixB = transportMatrix(matrix);

        String [][] matrixStr= {
                {"Да","Да"},
                {"Нет","Нет"}

        };
        String [][] matrixStrB;
        matrixStrB = transportMatrix(matrixStr);

        System.out.println("До " +Arrays.deepToString(matrix));
        System.out.println("После " +Arrays.deepToString(matrixB));
        System.out.println("До " +Arrays.deepToString(matrixStr));
        System.out.println("После " +Arrays.deepToString(matrixStrB));
        System.out.println("E = "+getEnergy(54.3));

    }

}