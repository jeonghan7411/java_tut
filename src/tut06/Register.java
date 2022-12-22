package tut06;


//생성자를 이해하기 위한 예제
public class Register { // userid,passwd,username,addr
    private String userid;
    private String passwd;
    private String username;
    private String addr;

    public Register(){} //초기화 용도 (사용x)

    //로그인
    public Register(String userid,String passwd){
        this.userid = userid;
        this.passwd = passwd;
    }

    //회원가입
    public Register(String userid,String passwd,String username,String addr){
        this(userid,passwd); //위에 작성한 생성자를 이용
        this.username = username;
        this.addr = addr;
    }

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Register{" +
                "userid='" + userid + '\'' +
                ", passwd='" + passwd + '\'' +
                ", username='" + username + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }

}
