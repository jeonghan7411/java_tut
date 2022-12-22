package tut06;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        /*
        Register r = new Register(); // 생성자는 값은 x 메모리 초기화 생성자
        r.setUserid("busanit");
        System.out.println(r.toString());
        System.out.println("---------------------");
        
        //로그인 프로그램
        Register login = new Register("busnait","1234"); // 초기화 + 저장
        System.out.println(login.toString());
        System.out.println(login.getUserid());
        System.out.println(login.getPasswd());

        System.out.println("---------------------");
        Register register = new Register("1","2","3","4");
        */

        ArrayList<Register> arrayList = new ArrayList<>();
        arrayList.add(new Register("Login","passswd")); //login이라 가정 매개변수 2개
        arrayList.add(new Register("r1","r2","r3","r4")); //회원가입 이라 가정 매개변수 4개

        for(Register r : arrayList){
            System.out.println(r);
        }
    }
}
