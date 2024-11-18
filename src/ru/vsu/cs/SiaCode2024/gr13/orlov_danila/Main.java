package ru.vsu.cs.SiaCode2024.gr13.orlov_danila;

public class Main {
    public static void main(String[] args) {
        Pizza pepperoniPizza = new PepperoniPizza();
        pepperoniPizza = new TomatoDecorator(new CheeseDecorator(pepperoniPizza));
        //pepperoniPizza = new NoCheeseDecorator(pepperoniPizza);
        System.out.println(pepperoniPizza.getDescription() + ": $" + pepperoniPizza.getCost());
    }
}