package arrays_two;
import java.util.Scanner;

public class EinMalEins {


    public static void main(String[] args) {
        System.out.print("Bis zu welcher Zahl soll das 1x1 berechnet werden: ");
        Scanner s = new Scanner(System.in);
        int max = 1;
        try {
            max = s.nextInt();
        }catch (Exception e) {
            System.out.println("Please enter valid int");
        }
        int[][] basics = new int[max][10];

        basics = fillBasics(max);

        for (int i = 0; i < max; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(basics[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] fillBasics(int max){
        int[][] basics = new int[max][10];
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 10; j++) {
                basics[i][j] = (i + 1) * (j + 1);
            }
        }
        return basics;
    }


}

