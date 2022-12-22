package tut03;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //linkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        System.out.println(linkedList);

        linkedList.addFirst("A");

    }

}