package listexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // declaring the list
        List<Integer> list1 = new LinkedList<Integer>();

        //adding/inserting data
        list1.add(12);
        list1.add(90);
        list1.add(3);
        list1.add(33);
        list1.add(8);
        list1.add(90);
        list1.add(77);
        //list1.add(null);
        list1.add(23);
        //list1.add(null);
        list1.add(-10);
        list1.add(-23);

        System.out.println("list1 is : "+list1);

        list1.remove(4);
        System.out.println("4th index removed : "+list1);

        // get data at specific function
        System.out.println("5th index data : "+list1.get(5));

        //size of the list
        System.out.println("length of list1 is : "+list1.size());

        // sorting the list
        Collections.sort(list1);
        System.out.println("list1 after sorting : "+list1);

        // traversing the list1
        System.out.println("traversing the list1");
        for(Integer l1: list1){
            System.out.println(l1);
        }
    }
}
