package algorytmy;

import algorytmy.structures.MyList;
import algorytmy.structures.MyListInterface;

/**
 * Created by RENT on 2017-02-14.
 */
public class Application {
    public static void main(String[] args) {
        MyList myList = initMyList();
        MyListInterface clonedList = myList.clone();
        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();
        clonedList.add(5);
        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();
        clonedList.delete(3);
        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();
        clonedList.add(3, 55);
        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();
        clonedList.put(3, 99);
        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();
        myList.addAll(3, clonedList);
        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();



    }

    private static MyList initMyList() {
        MyList myList = new MyList();
        myList.add(2);
        myList.add(3);
        myList.add(-2);
        myList.add(-1);
        myList.add(-9);
        myList.add(8);
        myList.add(-7);
        myList.add(6);
        myList.add(-5);
        myList.add(4);
        myList.add(-3);
        return myList;
    }

}
