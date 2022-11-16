package _03_Endrekursion;

import java.util.Scanner;

public class Endrekursion_Fakultaet {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int fak_int;
        long fak_long;

        System.out.print("Von welcher Zahl wollen sie die Fakultät [int] berechnen [0 - 12]: ");
        fak_int = reader.nextInt();

        System.out.print("\nVon welcher Zahl wollen sie die Fakultät [long] berechnen [0 - 20]: ");
        fak_long = reader.nextLong();

        System.out.printf("\nDie Fakultät[int] ist: %d", Fakutät_Int(fak_int));
        System.out.printf("\nDie Fakultät[long] ist: %d", Fakutät_Long(fak_long));
    }


    public static int Fakutät_Int(int zahl){
        return endrekursionFakultaet(1, zahl);
    }
    public static long Fakutät_Long(long zahl){
        return endrekursionFakultaet_Long(1, zahl);
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
