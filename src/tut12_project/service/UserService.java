package tut12_project.service;

import tut12_project.model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService { //동작 메소드 생성


    //static  = 전역변수 = global 공유
    ArrayList<User> arrayList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    private Long userID;
    private String username;
    private String email;
    private String passwd;
    private int age;
    private String addr;
    private double salary;    //stack 메모리

    private boolean search;


    //입력
    public void addUser(){
        System.out.println("Insert your UserID: ");
        userID = scanner.nextLong();
        System.out.println("Insert your Username: ");
        username = scanner.next();
        System.out.println("Insert your email: ");
        email = scanner.next();
        System.out.println("Insert your passwd: ");
        passwd = scanner.next();
        System.out.println("Insert your age: ");
        age = scanner.nextInt();
        System.out.println("Insert your addr: ");
        addr = scanner.next();
        System.out.println("Insert your salary: ");
        salary = scanner.nextDouble();

        User user = new User(userID,username,email,passwd,age,addr,salary);
        arrayList.add(user);
        System.out.println("Added User Completed");
        System.out.println("");

    }

    //목록
    public void listUsers(){
        //객체를 배열로 출력
        if(arrayList.size() == 0){
            System.out.println("User List Empty");
        }else {
            for(User user: arrayList ){
                System.out.println(user);
            }
        }

    }
    //상세보기
    public void viewUser(){

    }

    //삭제
    public void deleteUser(){
        System.out.print("Delete your UserID : ");
        userID = scanner.nextLong();
        User delUser = null;
        for(User user : arrayList){
            if(user.getUserID() == userID){ //저장된 아이디와 입력된 아이디가 같은 자료를 검색
                delUser = user;
                search = true;
            }
        }

        if(!search){
            System.out.println("User Not Found");
        }else{
            arrayList.remove(delUser);
            System.out.println("Delete Completed");
        }


    }
    //수정
    public void updateUser(){

    }
}
