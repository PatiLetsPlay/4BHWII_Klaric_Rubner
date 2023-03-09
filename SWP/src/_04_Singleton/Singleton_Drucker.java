package _04_Singleton;

public class Singleton_Drucker {
    /*
    Erzeuge eine Klasse Drucker.
    Die Klasse hat eine Methode drucken() -> gibt einen string aus "ich drucke, bin die Instanz XYZ"
    Die Klasse soll nur einmal intitialisert werden können.
    Probieren Sie das Verhalten in einer Main aus.
     */
    private static Singleton_Drucker instance;
    private Singleton_Drucker(){}
    public static Singleton_Drucker getInstance() {
        if (instance == null) {
            synchronized (Singleton_Drucker.class) {
                if (instance == null) {
                    instance = new Singleton_Drucker();
                }
            }
        }
        return instance;
    }
    public String print(){
        return "I print, I am the instance " + Singleton_Drucker.getInstance();
    }
}

