package _07_Observerpattern_Wetterstation;

public class Wetterdaten extends Wetterstation{
    private int humidity;
    private int temperature;
    private int rainfall;

    public int getHumidity(){ return this.humidity; }
    public void setHumidity(int humidity){
        this.humidity = humidity;
        notifyClient(humidity, temperature, rainfall);
    }

    public int getTemperature(){ return this.temperature; }
    public void setTemperature(int temperature){
        this.temperature = temperature;
        notifyClient(humidity, temperature, rainfall);
    }

    public int getRainfall(){ return this.rainfall; }
    public void setRainfall(int rainfall){
        this.rainfall = rainfall;
        notifyClient(humidity, temperature, rainfall);
    }
}
