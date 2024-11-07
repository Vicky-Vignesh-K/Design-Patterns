package com.DecoratorPattern;

public class Espresso implements IBeverage {
    @Override
    public String description() {
        return "Basic Espresso";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
