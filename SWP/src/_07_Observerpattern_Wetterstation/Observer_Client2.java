package _07_Observerpattern_Wetterstation;

public class Observer_Client2 implements Observer_Client{
    @Override
    public void update(int humidity, int temperature, int rainfall) {
        if(humidity > 50) {
            System.out.print("Client2:" + ANSI_RED + " humidity: " + humidity + "%" + ANSI_RESET);
        }else{
            System.out.print("Client2: humidity: " + humidity + "%");
        }

        if (temperature > 30){
            System.out.print(ANSI_RED + " temperature: " + temperature + "°C" + ANSI_RESET);
        }else{
            System.out.print(" temperature: " + temperature + "°C");
        }

        if(rainfall > 20) {
            System.out.print(ANSI_RED + " rainfall: " + rainfall + "% \n" + ANSI_RESET);
        }else{
            System.out.print(" rainfall: " + rainfall + "% \n");
        }
    }
}
