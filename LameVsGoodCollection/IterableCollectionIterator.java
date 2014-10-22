import java.util.Iterator;

public class IterableCollectionIterator<T> implements Iterator<T> {
    private T object1;
    private T object2;

    private int currentObject;
    private static final int TOTAL_ELEMENTS = 2;

    public IterableCollectionIterator(T object1, T object2) {
        this.object1 = object1;
        this.object2 = object2;

        this.currentObject = 0;
    }

    private T getCurrentObject() {
        if(this.currentObject == 1) {
            return this.object1;
        }
        else if(this.currentObject == 2) {
            return this.object2;
        }

        throw new IllegalStateException("We're at an object bigger than our max size");
    }

    public boolean hasNext() {
        this.currentObject = this.currentObject + 1;
        if(this.currentObject <= TOTAL_ELEMENTS) {
            return this.getCurrentObject() != null;
        }

        return false;
    }

    public T next() {
        return this.getCurrentObject();
    }

    public void remove() {
        throw new UnsupportedOperationException("Can't do that");
    }
}