package ru.vsu.cs.SiaCode2024.gr13.orlov_danila;

public class TomatoDecorator extends PizzaDecorator{
    public TomatoDecorator(Pizza pizza){
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", Tomatoes";
    }

    public double getCost() {
        return pizza.getCost() + 1.50;
    }
}
