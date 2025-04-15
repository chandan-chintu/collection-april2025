package setexamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set1 = new LinkedHashSet<String>();

        set1.add("Mango");
        set1.add("Guava");
        set1.add("Orange");
        set1.add("Banana");
        set1.add(null);
        set1.add("Orange");
        set1.add("Grapes");

        System.out.println("set1 is : "+set1);

        set1.remove(null);
        System.out.println("set1 is after remove: "+set1);

        System.out.println("set1 traverse");
        for(String s1:set1){
            System.out.println(s1);
        }

    }
}
