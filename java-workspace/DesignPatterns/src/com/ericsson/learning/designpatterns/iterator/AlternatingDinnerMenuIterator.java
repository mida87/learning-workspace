package com.ericsson.learning.designpatterns.iterator;

import java.util.Calendar;
import java.util.Iterator;

/**
 * ITERATOR: Concrete Iterator
 * */
public class AlternatingDinnerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public AlternatingDinnerMenuIterator(MenuItem[] items) {
        this.items = items;
        position = Calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position += 2;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Alternating Dinner Menu Iterator does not support remove()");
    }
}
