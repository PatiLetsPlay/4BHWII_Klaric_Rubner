package _04_Singleton;

public class Singleton_Test {
    public static void main(String[] args) {
        Singleton_Drucker drucker = Singleton_Drucker.getInstance();
        System.out.println(drucker.print());
        Singleton_Drucker drucker2 = Singleton_Drucker.getInstance();
        System.out.println(drucker2.print());
    }
}
