package tut09;

//상속 : extends 부모 클래스 이름
//부모(프로그래밍) - > 자식(java),자식(c++)
//실행은 Main()


//Programming.java(부모)
//JavaProgramming.java(자식)
//Main.java(실행)
//부모 코드가 자식 페이지 안에 전부 추가 된다고 생각
public class Main {
    //객체지향언어는 기존에 만들어진 내용에서 필요한 것만 가져다 쓰는 것
    public static void main(String[] args){
//        Programming programming = new Programming();
//        programming.computerProgramming();
        JavaProgramming javaProgramming = new JavaProgramming();
        javaProgramming.computerProgramming();
        javaProgramming.JavaProgramming();

    }
}
