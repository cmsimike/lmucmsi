import edu.lmu.cmsi.mike.itcollection.IterableCollection;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        String name = "Mike Megally";
        String address = "123 Fake St";
        IterableCollection<String> stringsOnly = new IterableCollection<String>(name);

        System.out.println("Old way");
        Iterator<String> iter = stringsOnly.iterator();
        while(iter.hasNext()) {
            String s = iter.next();
            System.out.println(s);
        }

        System.out.println("New way");
        for(String s: stringsOnly) {
            System.out.println(s);
        }
    }    
}
