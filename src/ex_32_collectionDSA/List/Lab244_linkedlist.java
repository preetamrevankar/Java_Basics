package ex_32_collectionDSA.List;

import java.util.LinkedList;
import java.util.List;

public class Lab244_linkedlist {
    public static void main(String[] args) {
        List list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add(123);

        System.out.println(list);
    }
}
