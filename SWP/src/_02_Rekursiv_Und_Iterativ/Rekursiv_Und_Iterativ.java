package _02_Rekursiv_Und_Iterativ;

import java.util.Scanner;

public class Rekursiv_Und_Iterativ {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int rekursiv, iterativ;

        System.out.println("Zahl für Rekursiv: ");
        rekursiv = reader.nextInt();

        System.out.println("Zahl für Iterativ: ");
        iterativ = reader.nextInt();

        System.out.printf("Summe Rekursiv: %d \n", sumRekursiv(rekursiv));
        System.out.printf("Summe Iterativ: %d \n", sumIterativ(iterativ));
    }

    public static int sumRekursiv(int number)
    {
        if(number == 0){
            return 0;
        }else if(number <= 0){
            System.out.println("Fehler keine Minus Zahlen");
            return -1;
        }
        else{
            return number + sumRekursiv(number - 1);
        }
    }

    public static int sumIterativ(int number)
    {
        int sum = 0;
        while(number >= 1){
            sum = sum + number;
            number--;
        }
        //Auch möglich mit for-Schleife
        return sum;
    }
}
