package _06_FactoryPattern_Pizza;

public class PizzeriaFactory {
    public static Pizzeria getPizzeria(Pizzerien pizzerien){

        if ((pizzerien == pizzerien.Berlin)) {
            return new PizzeriaBerlin();

        } else if (pizzerien == pizzerien.Hamburg) {
            return new PizzeriaHamburg();

        } else if (pizzerien == pizzerien.Rostock) {
            return new PizzeriaRostock();
        }
        return null;
        }
}
