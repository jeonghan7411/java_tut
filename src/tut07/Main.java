package tut07;

public class Main {
    public static void main(String[] args){
        MethodOverload methodOverload = new MethodOverload(); //생성자
        methodOverload.doMethod(); // 메소드
        methodOverload.doMethod("Busan it");
        methodOverload.doMethod("Busan it","2.0");
    }
}
