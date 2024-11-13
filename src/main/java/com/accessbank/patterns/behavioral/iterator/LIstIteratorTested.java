package com.accessbank.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LIstIteratorTested {


    /*A ListIterator is a more advanced iterator specifically designed to work with lists (e.g., ArrayList, LinkedList in Java). It allows for more flexibility than the basic iterator because it supports:
        [as know Bidirectional Iterator the List iterator ]
    Iterating forward and backward.
    Adding, removing, or replacing elements during iteration.
    Retrieving the current index in the list.
    In Java, the ListIterator interface extends the
    Iterator interface and provides methods like:

    hasPrevious(): Checks if there's a previous element.
    previous(): Retrieves the previous element.
    add(E e): Adds an element at the current position.
    set(E e): Replaces the current element with the specified element.

    2.3 Write Iterator
   A Write Iterator allows modifying the underlying collection while iterating.
   It can perform operations like adding, removing, or updating elements
   during iteration.

    In Java, the ListIterator allows both reading and
    modifying the list during iteration, making it a write iterator.

    fail-Safe in ListIterator
     If you use a fail-safe collection
     (like CopyOnWriteArrayList), the ListIterator does not throw
      a ConcurrentModificationException even if the collection
      is modified during iteration. The iterator will continue
      iterating over the original state of the collection,
      even if it is changed.

  When Fail-Safe Is Useful:
     Multithreading:
       Fail-safe iterators are useful in multithreaded scenarios where one thread might modify the collection while another is iterating over it.
     Concurrent Modifications:
       It allows for more flexibility in cases where you expect concurrent modifications but still want to ensure safe iteration without exceptions.

    */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("A", "B", "C", "D"));
        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());  // Forward iteration
        }

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());  // Backward iteration
        }

       // listOrWriteIterator();



    }

    static void   listOrWriteIterator() {
        List<String>  writeList  = new ArrayList<>(List.of("A", "B", "C", "D"));
        ListIterator<String> writeIterator = writeList.listIterator();

        while (writeIterator.hasNext()) {
            String element = writeIterator.next();
            if (element.equals("B")) {
                writeIterator.set("X");  // Replaces "B" with "X"
            }

        }

        while (writeIterator.hasPrevious()) {//look at  changes
            System.out.println(writeIterator.previous());  // backward  iteration
        }
    }
}
