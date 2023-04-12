package _06_FactoryPattern_Pizza;

public class PizzaCalzone extends Pizza {
    PizzaType pizzaType;
    Pizzeria pizzerien;

    public PizzaCalzone(PizzaType pizzaType, Pizzerien city) {
        this.pizzaType = PizzaType.Calzone;
        this.pizzerien = PizzeriaFactory.getPizzeria(city);
    }

    public String createPizza() {
        return "Pizza: " + this.pizzaType + " City: " + this.pizzerien;
    }
}
