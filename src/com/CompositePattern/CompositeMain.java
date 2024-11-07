package com.CompositePattern;

public class CompositeMain {

    public static void main(String[] args) {
        IComponent hardDrive = new Leaf(5000,"HardDrive");
        IComponent ram = new Leaf(3000,"RAM");
        IComponent mouse = new Leaf(500,"Mouse");
        IComponent monitor = new Leaf(5000,"Monitor");
        IComponent cpu = new Leaf(10000,"CPU");

        Composite peri = new Composite("Peripheral");
        Composite mb = new Composite("MotherBoard");
        Composite cabinet = new Composite("Cabinet");
        Composite computer = new Composite("Computer");

        mb.addComponent(ram);
        mb.addComponent(cpu);

        peri.addComponent(mouse);
        peri.addComponent(monitor);

        cabinet.addComponent(hardDrive);
        cabinet.addComponent(mb);

        computer.addComponent(cabinet);
        computer.addComponent(peri);

        computer.price();

    }

}
