package arrays_one;

import java.util.Random;

public class UmsatzDemo {
    public static void main(String[] args) {
        //Aufgabe 1
        double[] umsatz = new double[] {6, 12.5, 24.4, 30, 41.4, 45, 47.9, 58, 61.2, 65};
        System.out.printf("Es hat in %d Monaten eine Umsatzsteigerung von mind. 10 Prozent gegeben!\n\n", getUmsatzsteigerungGT10(umsatz));
        //Aufgabe 2
        double[][] umsatz_week = new double[4][5];
        //Random befüllen
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                umsatz_week[i][j] = r.nextDouble(50);
            }
        }

        double[] sum = calculateSumByWeek(umsatz_week);
        for(int i = 0; i < sum.length; i++) {
            System.out.printf("Umsatz %d. Woche = %.2f€\n", i + 1, sum[i]);
        }


    }

    public static int getUmsatzsteigerungGT10(double[] umsaetze){
        int great = 0;
        for (int i = 1; i < umsaetze.length; i++) {
            if((umsaetze[i] - umsaetze[i-1]) > 10){
                great++;
            }
        }
        return great;
    }

    public static double[] calculateSumByWeek(double[][] umsaetze){
        double[] sum = new double[umsaetze.length];
        for (int i = 0; i < umsaetze.length; i++) {
            for (int j = 0; j < umsaetze[i].length; j++) {
                sum[i] += umsaetze[i][j];
            }
        }
        return sum;
    }
}
