package tut11;

public class Main {

    //static이 선언된 데이터나 메소드에 접근하기 위해서는 클래스.이름

    //static
    public static void main(String[] args){
        //static 이유는 공유 또는 값 누적 : 1 + 2 + 3+ 4 + 5+ 6
        StaticEx.num = 22222;

        System.out.println(StaticEx.num);

        StaticEx staticEx = new StaticEx();
        System.out.println(staticEx.doMsg("busanit"));

        System.out.println(StaticEx.staticDoMsg("Academy"));

    }
}

 