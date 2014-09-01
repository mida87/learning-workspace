package com.ericsson.learning.designpatterns.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * COMPOSITE: Component
 * */
public class Menu extends MenuComponent {
    ArrayList<MenuComponent> components = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent component) {
        components.add(component);
    }

    public void remove(MenuComponent component) {
        components.remove(component);
    }

    public MenuComponent getChild(int i) {
        return components.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        Iterator<MenuComponent> iterator = components.iterator();
        while (iterator.hasNext()) {
            MenuComponent component = iterator.next();
            component.print();
        }
    }

    public Iterator createIterator() {
        return new CompositeIterator(components.iterator());
    }
}
