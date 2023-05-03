package _07_Observerpattern_Wetterstation;

public class Hauptprogramm {
    public static void main(String[] args) {
        Wetterdaten data = new Wetterdaten();
        Observer_Client c1 = new Observer_Client1();
        Observer_Client c2 = new Observer_Client2();
        Observer_Client c3 = new Observer_Client3();

        data.registerClint(c1);
        data.registerClint(c2);
        data.registerClint(c3);
        data.setTemperature(20);
        data.setHumidity(50);
        System.out.println("\n");
        data.deleteClient(c3);

        data.setTemperature(50);
        data.setHumidity(40);
        data.setHumidity(60);
        data.setRainfall(10);
        data.setRainfall(20);

    }
}
