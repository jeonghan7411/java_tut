package tut02;

import java.util.HashSet;
import java.util.Set;

public class Main {
    //list, hashSet
    public static void main(String[] args){
        //Set = hashSet 검색 알고리즘
        Set<String> set = new HashSet<>();
        set.add("RED");
        set.add("GREEN");
        set.add("YELLOW");

        //메모리 안에 입력된 자료 검색
        System.out.println("검색어가 존재하나요 ? "+ set.contains("GREEN"));
        for(String str : set){
            System.out.println(str);
        }
    }
}
