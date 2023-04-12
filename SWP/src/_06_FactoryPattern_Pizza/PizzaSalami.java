package _06_FactoryPattern_Pizza;

public class PizzaSalami extends Pizza{

    PizzaType pizzaType;
    Pizzeria pizzerien;

    public PizzaSalami(PizzaType pizzaType, Pizzerien city) {
        this.pizzaType = PizzaType.Salami;
        this.pizzerien = PizzeriaFactory.getPizzeria(city);
    }

    public String createPizza() {
        return "Pizza: " + this.pizzaType + " City: " + this.pizzerien;
    }
}
