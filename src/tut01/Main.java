package tut01;

import java.util.ArrayList;
import java.util.List;

//고정배열 : arr[상수] , arr[변수] : 개수 고정
//동적배열 : list , Map, Hash, Tree... <객체> : 컴파일러가 개수를 조정
public class Main {
    public static void main(String[] args){  //실행메소드
        //List > ArrayList : 저장되는 순서대로...
        //클래스이름 이름 = new 클래스이름();
        //부모 이름 = new 자식이름(); 다형성
        //고정, 동적 배열은 + loop
        //웹에서 사용
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<=10;i++){
            list.add(i);
        }
        list.remove(4);
        System.out.println("total : "+list.size());
        for(int i =0; i< list.size(); i++){
            //출력할 때는 : 배열이름.get(index);
            System.out.println("게시물번호 : " + list.get(i));
        }

        System.out.println("----------------------------------");
        //향상된 for
//        for(객체(타입) 별명 : 배열명){
//            출력코드
//        }
        for(int arr : list){
            System.out.println("게시물번호 : "+ arr);
        }
    }
}
