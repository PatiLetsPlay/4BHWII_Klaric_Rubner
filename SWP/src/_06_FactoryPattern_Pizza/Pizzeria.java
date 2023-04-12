package _06_FactoryPattern_Pizza;

public abstract class Pizzeria {
    public abstract Pizzerien location();

    public String toString(){return " " + this.location(); };
}
