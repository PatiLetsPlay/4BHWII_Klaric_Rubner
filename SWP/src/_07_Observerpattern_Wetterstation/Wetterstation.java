package _07_Observerpattern_Wetterstation;
import java.util.ArrayList;
import java.util.List;

public abstract class Wetterstation {
    private List<Observer_Client> clientList = new ArrayList<Observer_Client>();

    public void registerClint(Observer_Client clientToAdd){ clientList.add(clientToAdd); }
    public void deleteClient(Observer_Client clientToDelete){ clientList.remove(clientToDelete); }
    protected void notifyClient(int humidity, int temperature, int niederschlag){
        for (Observer_Client client : clientList) {
            client.update(humidity, temperature, niederschlag);
        }
    }
}
