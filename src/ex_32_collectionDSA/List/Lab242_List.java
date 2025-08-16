package ex_32_collectionDSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab242_List {
    public static void main(String[] args) {
       // ArrayList l1 = new ArrayList();
        List l1 = new ArrayList<>();
        l1.add("pramod");
        l1.add("pramod"); //duplicate is allowed
        l1.add(123); // different data type is allowed
        l1.add("123");
        System.out.println(l1);
        System.out.println(l1.size());

        // dynamic dispath
        l1.add("123");
        l1.add("456");
        System.out.println(l1);
        System.out.println(l1.isEmpty());




    }
}
