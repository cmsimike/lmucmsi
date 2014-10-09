import java.util.Iterator;

public class IterableCollection<E> implements Iterable<E> {
    private E object1;
    private E object2;

    public IterableCollection() {

    }

    public IterableCollection(E o1) {
        this.object1 = o1;
    }

    public IterableCollection(E o1, E o2) {
        this.object1 = o1;
        this.object2 = o2;
    }

    public void setFirst(E o1) {
        this.object1 = o1;
    }

    public void setSecond(E o2) {
        this.object2 = o2;
    }

    public Iterator<E> iterator() {
        return new IterableCollectionIterator<E>(this.object1, this.object2);
    }

    public static void main(String[] args) {
        String name = "Mike Megally";
        String address = "123 Fake St";

        IterableCollection<String> collection = new IterableCollection<String>(name, address);
        for(String s: collection) {
            System.out.println(s);
        }
    }
}