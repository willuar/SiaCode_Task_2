package ru.vsu.cs.SiaCode2024.gr13.orlov_danila;

public class PepperoniPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Dough(Тесто), smoked sausage";
    }

    @Override
    public double getCost() {
        return 9.5;
    }
}
