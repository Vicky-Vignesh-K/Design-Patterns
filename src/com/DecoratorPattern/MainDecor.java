package com.DecoratorPattern;

public class MainDecor {

    public static void main(String[] args) {

        IBeverage beverage = new Caramel(new Espresso());
        System.out.println(beverage.description() + " , cost : $ " + beverage.cost());

        IBeverage beverage2 = new Chocolate(new Caramel(new Espresso()));
        System.out.println(beverage2.description() + " , cost : $ " + beverage2.cost());
    }
}
