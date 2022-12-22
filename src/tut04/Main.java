package tut04;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //treeSet : 자동정렬
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("B");


        System.out.println(treeSet);
    }
}
