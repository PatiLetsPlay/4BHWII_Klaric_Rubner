package _06_FactoryPattern_Pizza;

public class PizzaFactory {
    public static Pizza getPizza(PizzaType pizzaType, Pizzerien city){

        if (pizzaType == pizzaType.Salami) {
            return new PizzaSalami(pizzaType.Salami, city);

        } else if (pizzaType == pizzaType.Calzone) {
            return new PizzaCalzone(pizzaType.Calzone, city);

        }else if (pizzaType == pizzaType.Hawaii) {
            return new PizzaHawaii(pizzaType.Hawaii, city);
        }
        return null;
    }
}
