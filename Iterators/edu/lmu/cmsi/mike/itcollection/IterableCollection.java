package edu.lmu.cmsi.mike.itcollection;

import java.util.Iterator;

public class IterableCollection<E> implements Iterable<E> {
    private E object1;
    private E object2;

    public IterableCollection() {
        this(null, null);
    }

    public IterableCollection(E o1) {
        this(o1, null);
    }

    public IterableCollection(E o1, E o2) {
        this.object1 = o1;
        this.object2 = o2;
    }

    public Iterator<E> iterator() {
        return new IterableCollectionIterator<E>(this.object1, this.object2);
    }
}