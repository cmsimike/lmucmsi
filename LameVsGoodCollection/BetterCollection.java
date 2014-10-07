public class BetterCollection<E> {
    private E object1;
    private E object2;

    public BetterCollection() {

    }

    public BetterCollection(E o1) {
        this.object1 = o1;
    }

    public BetterCollection(E o1, E o2) {
        this.object1 = o1;
        this.object2 = o2;
    }

    public void setFirst(E o1) {
        this.object1 = o1;
    }

    public void setSecond(E o2) {
        this.object2 = o2;
    }

    public E getFirst() {
        return this.object1;
    }

    public E getSecond() {
        return this.object2;
    }

    public static void main(String[] args) {
        String name = "Mike Megally";
        String address = "123 Fake St";

        BetterCollection<String> collection = new BetterCollection<String>(name, address);

        String o1 = collection.getFirst();
        System.out.println(o1.length()); // This is fine now because there is no way to get anything out other than a string

    }
}