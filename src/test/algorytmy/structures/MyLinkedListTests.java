package test.algorytmy.structures;

import algorytmy.structures.MyLinkedList;
import algorytmy.structures.MyListInterface;

/**
 * Created by RENT on 2017-02-16.
 */
public class MyLinkedListTests {
    public static void main(String[] args) {
        MyListInterface myLinkedList = new MyLinkedList();
        System.out.println(myLinkedList.get(0));
        myLinkedList.add(5);
        System.out.println(myLinkedList.get(0));
        myLinkedList.add(3);
        myLinkedList.add(-2);
        myLinkedList.add(-1);
        myLinkedList.add(-5);
        System.out.println(myLinkedList);
        myLinkedList.delete(2);
        System.out.println("After removing second element ");
        System.out.println();

    }
}
