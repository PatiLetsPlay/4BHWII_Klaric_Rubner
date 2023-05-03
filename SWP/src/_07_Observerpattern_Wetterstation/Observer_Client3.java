package _07_Observerpattern_Wetterstation;

public class Observer_Client3 implements Observer_Client{
    @Override
    public void update(int humidity, int temperature, int rainfall) {
        if(humidity > 60) {
            System.out.print("Client3:" + ANSI_RED + " humidity: " + humidity + "%" + ANSI_RESET);
        }else{
            System.out.print("Client3: humidity: " + humidity + "%");
        }

        if (temperature > 40){
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
