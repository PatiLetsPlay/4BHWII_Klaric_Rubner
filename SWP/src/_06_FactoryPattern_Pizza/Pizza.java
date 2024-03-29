package _06_FactoryPattern_Pizza;

public abstract class Pizza {
    public Pizzeria city;
    public abstract String createPizza();

    @Override
    public String toString(){return " " + this.createPizza(); };
}
