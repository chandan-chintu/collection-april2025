package mapexample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // declaring map
        Map<Integer, String> map1 = new LinkedHashMap<>();

        // add data
        map1.put(102, "Mango");
        map1.put(104,"Guava");
        map1.put(103,"Orange");
        map1.put(105,"Apple");
        map1.put(null,"Grapes");
        map1.put(null,null);// last one gets overrided
        map1.put(108,"Grapes");
        map1.put(106,"Guava");
        map1.put(103,"Pineapple");// last one get overrided
        map1.put(107,"Orange");

        System.out.println("map1 is : "+map1);

        map1.remove(108);
        System.out.println("map1 after removing 108 key is : "+map1);

        // traversing
        System.out.println("map traversing");
        for(Map.Entry m1 : map1.entrySet()){
            System.out.println(m1.getKey()+"--------"+m1.getValue());
        }
    }
}
