package tut05;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
//        HashMap(key,value) = json = ResponseEntity<>
//        HashMap(key_타입,value_타입)

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("00001", "CEO");
        hashMap.put("10001", "Customer");
        hashMap.put("00002", "Employee");
        hashMap.put("Role", "ADMIN");

        System.out.println("사원 수 : " + hashMap.size());
        System.out.println("--------------------------");

        //treeSet + hashMap = treeMap(key,value) 정렬
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("10003", "Customer");
        treeMap.put("10001", "CEO");
        treeMap.put("10003", "Manager");
        treeMap.put("10002", "Team Leader");

        System.out.println(treeMap);
        System.out.println(treeMap.get("10001"));  //key 값으로 value 출력
    }
}
