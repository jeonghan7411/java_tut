package tut08;

//getter, setter 를 사용하는 이유는 캡슐화를 위해
//혹시나 생길지 모르는 상황 또는 객체지향언어에서는 저장,출력 하기 전에 getter,setter메소드를
//통해서 저장이나 출력 - pirvate으로 멤버변수를 선언하고 사용
public class User {
    private String userid;
    private String passwd;

    public User(){}   //main 에서 new 를 사용하면 이것을 가르킴  (생략가능)

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
