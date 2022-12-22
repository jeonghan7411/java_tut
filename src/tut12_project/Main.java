package tut12_project;

import tut12_project.service.UserService;
import tut12_project.view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //무한루프 : Ctrl + C , 인텔리제이에서 중지 버튼 누르기 전까지 계속 실행
        boolean run = true; // 무한루프를 위한 변수 while(true)
        Scanner scanner = new Scanner(System.in);
        //동작메소드 가져오기
        UserService userService = new UserService();

        while(run){ //scanner를 만나기 전까지는 무한 루프
            Menu.menu();
            System.out.print("> Enter Your Choice : ");
            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("");
                    System.out.println("User Add >> ");
                    userService.addUser();
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("User View >> ");
                    userService.viewUser();
                    break;

                case 4:
                    userService.deleteUser();
                    break;

                case 5:
                    System.out.println("");
                    System.out.println("Users List >> ");
                    userService.listUsers();
                    break;

                default:
                    System.out.println("Please enter valid choice");
                    System.out.println("");
                    break;
            }
        }
    }
}
