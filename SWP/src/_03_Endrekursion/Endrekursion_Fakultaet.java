package _03_Endrekursion;

import java.util.Scanner;

public class Endrekursion_Fakultaet {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int fak_int;
        int sum_int = 1;

        long fak_long;
        long sum_long = 1;

        System.out.print("Von welcher Zahl wollen sie die Fakultät [int] berechnen [0 - 16]: ");
        fak_int = reader.nextInt();

        System.out.print("\nVon welcher Zahl wollen sie die Fakultät [long] berechnen [0 - 20]: ");
        fak_long = reader.nextLong();

        System.out.printf("\nDie Fakultät[int] ist: %d", endrekursionFakultaet(sum_int, fak_int));
        System.out.printf("\nDie Fakultät[long] ist: %d", endrekursionFakultaet_Long(sum_long, fak_long));
    }

    public static int endrekursionFakultaet(int sum, int fak){
        if(fak == 0 || fak == 1) {
            return sum;
        }
        else{
            return endrekursionFakultaet(sum * fak, fak - 1);
        }
    }
    public static long endrekursionFakultaet_Long(long sum, long fak){
        if(fak == 0 || fak == 1) {
            return sum;
        }
        else{
            return endrekursionFakultaet_Long(sum * fak, fak - 1);
        }
    }
}
