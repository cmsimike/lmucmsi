public class BetterCollection<E> {
    private E object1;
    private E object2;

    public BetterCollection() {

    }

    public BetterCollection(E o1) {
        this.setFirst(o1);
    }

    public BetterCollection(E o1, E o2) {
        this(o1);
        this.setSecond(o2);
    }

    public void setFirst(E o) {
        this.object1 = o;
    }

    public void setSecond(E o) {
        if(this.object1 == null) {
            throw new IllegalStateException("Can't specify the second without the first.");
        }
        this.object2 = o;
    }

    public E getFirst() {
        return this.object1;
    }

    public E getSecond() {
        return this.object2;
    }

    // haha only can put in strings!
    private static void doDumbStuff(BetterCollection<String> c) {
        Integer i = 400;
//        c.setFirst(i); can't do this now!
    }

    public static void main(String[] args) {
        String name = "Mike Megally";
        String address = "123 Fake St";

        BetterCollection<String> stringsOnly = new BetterCollection<String>();
        stringsOnly.setFirst(name);
        stringsOnly.setSecond(address);

        //doDumbStuff(stringsOnly);

        String safe = stringsOnly.getFirst();
        System.out.println(safe.length());
    }
}