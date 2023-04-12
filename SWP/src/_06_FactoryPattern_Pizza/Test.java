package _06_FactoryPattern_Pizza;

public class Test {
    public static void main(String[] args) {
        Pizza salamiBerlin = PizzaFactory.getPizza(PizzaType.Salami, Pizzerien.Berlin);
        System.out.println(salamiBerlin);

        Pizza hawaiiBerlin = PizzaFactory.getPizza(PizzaType.Hawaii, Pizzerien.Berlin);
        System.out.println(hawaiiBerlin);

        Pizza calzoneBerlin = PizzaFactory.getPizza(PizzaType.Calzone, Pizzerien.Berlin);
        System.out.println(calzoneBerlin);

        Pizza salamiHamburg = PizzaFactory.getPizza(PizzaType.Salami, Pizzerien.Hamburg);
        System.out.println(salamiHamburg);

        Pizza hawaiiHamburg = PizzaFactory.getPizza(PizzaType.Hawaii, Pizzerien.Hamburg);
        System.out.println(hawaiiHamburg);

        Pizza calzoneHamburg = PizzaFactory.getPizza(PizzaType.Calzone, Pizzerien.Hamburg);
        System.out.println(calzoneHamburg);

        Pizza salamiRostock = PizzaFactory.getPizza(PizzaType.Salami, Pizzerien.Rostock);
        System.out.println(salamiHamburg);

        Pizza hawaiiRostock = PizzaFactory.getPizza(PizzaType.Hawaii, Pizzerien.Rostock);
        System.out.println(hawaiiRostock);

        Pizza calzoneRostock = PizzaFactory.getPizza(PizzaType.Calzone, Pizzerien.Rostock);
        System.out.println(calzoneRostock);
    }
}
