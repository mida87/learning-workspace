package com.ericsson.learning.designpatterns.iterator;

import java.util.Iterator;

/**
 * ITERATOR: Aggregate
 * */
public interface Menu {
    public Iterator createIterator();
}
