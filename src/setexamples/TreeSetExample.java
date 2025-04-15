package setexamples;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>();

        set1.add("Vicky");
        set1.add("Manoj");
        set1.add("Ajay");
        set1.add("Nagendra");
        set1.add("Shiva");
        set1.add("Shiva");

        System.out.println("set1 is : "+set1);
    }
}
