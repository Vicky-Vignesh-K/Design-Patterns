package com.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent {
    private String name;

    List<IComponent> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(IComponent component) {
        components.add(component);
    }

    @Override
    public void price() {
        System.out.println(name);
        components.forEach(component -> component.price());
    }
}
