package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
   static List<Integer> ll = new LinkedList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            ll.add(i);
        }
        ll.remove(3);
        System.out.println(ll);
        
    }
}
