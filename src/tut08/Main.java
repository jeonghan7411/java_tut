package tut08;

public class Main {

    //아이디, 비밀번호를 저장하는 Model  private를 사용했을 때와 안했을때를 비교
    public static void main(String[] args){
        User user = new User();
        //private  : 접근제한자 같은 클래스 내에서만 공유가 가능
        //protected : 같은 패키지, 같은 폴더 안에 파일끼리는 공유 가능

        //user에 private이 없는 경우  직접 접근해서 입력이 가능
//        user.userid = "busanit";
//        user.passwd = "1234";
        
        //private이 있는경우
        //직접 접근이 불가능하여 getter,setter를 이용해야 함 한번 필터링 효과
        user.setUserid("Busan it");
        user.setPasswd("1234");

        user.getUserid();
        user.getPasswd();

        System.out.println(user.getUserid());
        System.out.println(user.getPasswd());
    }
}
