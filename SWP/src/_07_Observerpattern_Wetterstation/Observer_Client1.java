package _07_Observerpattern_Wetterstation;

public class Observer_Client1 implements Observer_Client{

    @Override
    public void update(int humidity, int temperature, int rainfall) {
        if(humidity > 75) {
            System.out.print("Client1:" + ANSI_RED + " humidity: " + humidity + "%" + ANSI_RESET);
        }else{
            System.out.print("Client1: humidity: " + humidity + "%");
        }

        if (temperature > 35){
            System.out.print(ANSI_RED + " temperature: " + temperature + "°C" + ANSI_RESET);
        }else{
            System.out.print(" temperature: " + temperature + "°C");
        }

        if(rainfall > 10) {
            System.out.print(ANSI_RED + " rainfall: " + rainfall + "% \n" + ANSI_RESET);
        }else{
            System.out.print(" rainfall: " + rainfall + "% \n");
        }
    }

}
