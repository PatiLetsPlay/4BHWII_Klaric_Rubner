package _07_Observerpattern_Wetterstation;

public interface Observer_Client {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    void update(int humidity, int temperature, int rainfall);
}
