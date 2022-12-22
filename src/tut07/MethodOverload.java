package tut07;

public class MethodOverload {
    //메서드 오버로딩
    //void //Methode 안에 System.out.println 같은 화면 표시
    //동작
    void doMethod(){
        System.out.println("Customer Management System");
    }

    void doMethod(String title){
        System.out.println(title + "Customer Management System");
    }

    void doMethod(String title, String ver){
        System.out.println(title + "Customer Management System ver." + ver);
    }
}
