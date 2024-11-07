package com.DecoratorPattern;

public class Chocolate implements AddOnDecorator{

    IBeverage iBeverage;

    public Chocolate(IBeverage iBeverage){
        this.iBeverage=iBeverage;
    }

    @Override
    public String description() {
        return this.iBeverage.description()+ " , Added Extra Chocolate";
    }

    @Override
    public double cost() {
        return this.iBeverage.cost()+2.7;
    }
}
