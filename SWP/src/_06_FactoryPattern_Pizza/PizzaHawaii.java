package _06_FactoryPattern_Pizza;

public class PizzaHawaii extends Pizza{
    PizzaType pizzaType;
    Pizzeria pizzerien;

    public PizzaHawaii(PizzaType pizzaType, Pizzerien city) {
        this.pizzaType = PizzaType.Hawaii;
        this.pizzerien = PizzeriaFactory.getPizzeria(city);
    }

    public String createPizza() {
        return "Pizza: " + this.pizzaType + " City: " + this.pizzerien;
    }
}
