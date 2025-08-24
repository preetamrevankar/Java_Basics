package ex_32_collectionDSA.List;

import java.util.LinkedList;

public class Lab245_LL {
    public static void main(String[] args){
        LinkedList<String> animals = new LinkedList<>();
        animals.add("elephant");
        animals.add("kaalemakkod");
        animals.add("snake");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        System.out.println("linkedlist:" + animals);

        // Accessing elements
        System.out.println("First elements: " + animals.getFirst());
        System.out.println("Last element: " + animals.getLast());


        // Removing elements
        animals.removeFirst();
        animals.removeLast();
        System.out.println("LinkedList after removal : " +animals);

        System.out.println("Size of LinkedLista: " + animals.size());

    }
}
