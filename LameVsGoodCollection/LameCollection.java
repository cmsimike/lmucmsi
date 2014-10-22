public class LameCollection {
    private Object object1;
    private Object object2;

    public LameCollection() {

    }

    public LameCollection(Object o1) {
        this.setFirst(o1);
    }

    public LameCollection(Object o1, Object o2) {
        this(o1);
        this.setSecond(o2);
    }

    public void setFirst(Object o) {
        this.object1 = o;
    }

    public void setSecond(Object o) {
        if(this.object1 == null) {
            throw new IllegalStateException("Can't specify the second without the first.");
        }
        this.object2 = o;
    }

    public Object getFirst() {
        return this.object1;
    }

    public Object getSecond() {
        return this.object2;
    }

    // Only add strings to lame collection!!!!
    private static void doDumbStuff(LameCollection c) {
        Integer i = 400;
        c.setFirst(i);
    }

    public static void main(String[] args) {
        String name = "Mike Megally";
        String address = "123 Fake St";

        LameCollection stringsOnly = new LameCollection();
        stringsOnly.setFirst(name);
        stringsOnly.setSecond(address);

        doDumbStuff(stringsOnly);

        Object s = stringsOnly.getFirst();
        String unsafe = (String)s;
        System.out.println(unsafe.length());
    }
}