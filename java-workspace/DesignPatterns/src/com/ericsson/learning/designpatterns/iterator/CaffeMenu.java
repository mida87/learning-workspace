package com.ericsson.learning.designpatterns.iterator;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * ITERATOR: Concrete Aggregate
 * */
public class CaffeMenu implements Menu {
    Hashtable items = new Hashtable();

    public CaffeMenu() {
        addItem("Veggie Burger and Air Fries",
            "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
            true, 3.99);
        addItem("Soup of the day",
            "A cup of the soup of the day, with a side salad",
            false, 3.69);
        addItem("Burrito",
            "A large burrito, with whole pinto beans, salsa, guacamole",
            true, 4.29);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        items.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator() {
        return items.values().iterator();
    }
}
