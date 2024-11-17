package ru.vsu.cs.SiaCode2024.gr13.orlov_danila;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza){
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public double getCost() {
        return pizza.getCost() + 2.00;
    }
}
