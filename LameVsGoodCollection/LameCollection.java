public class LameCollection {
    private Object object1;
    private Object object2;

    public LameCollection() {

    }

    public LameCollection(Object o1) {
        this.object1 = o1;
    }

    public LameCollection(Object o1, Object o2) {
        this.object1 = o1;
        this.object2 = o2;
    }

    public void setFirst(Object o1) {
        this.object1 = o1;
    }

    public void setSecond(Object o2) {
        this.object2 = o2;
    }

    public Object getFirst() {
        return this.object1;
    }

    public Object getSecond() {
        return this.object2;
    }

    public static void main(String[] args) {
        String name = "Mike Megally";
        String address = "123 Fake St";

        LameCollection collection = new LameCollection(name, address);

        Object o1 = collection.getFirst();
        o1.length(); // Won't compile: at this point Java think it's an Object, not a String. You'd have to cast.
        String o2 = (String)collection.getSecond(); // This sucks because there is no guarantee the object you're getting is of type String


    }
}