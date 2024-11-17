package ru.vsu.cs.SiaCode2024.gr13.orlov_danila;

public abstract class PizzaDecorator implements Pizza{
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
}
