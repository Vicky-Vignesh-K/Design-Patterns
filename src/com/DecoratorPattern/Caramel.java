package com.DecoratorPattern;

public class Caramel implements AddOnDecorator{

    IBeverage iBeverage;

    public Caramel(IBeverage beverage){
        this.iBeverage = beverage;
    }

    @Override
    public String description() {
        return this.iBeverage.description() + " , Added Extra Caramel";
    }

    @Override
    public double cost() {
        return this.iBeverage.cost()+2.2;
    }
}
