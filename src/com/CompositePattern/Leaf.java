package com.CompositePattern;

public class Leaf implements IComponent{

    private double price;
    private String name;

    public Leaf(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public void price(){
        System.out.println(name + " : " + price);
    }

}
