package src.com.progrank.CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> lst = new LinkedList<>();

        // Adding elements to the LinkedList
        lst.add("odo");
        lst.add("dkfm");
        lst.add("mjd");
        lst.add("mdmk");
        lst.add("mdmk");

        lst.addFirst("odo");
        lst.addLast("dk");
        System.out.println(lst);

        // Printing the original list
        System.out.println("Original List:");
        for (String string : lst) {
            System.out.println(string);
        }

    }
}
