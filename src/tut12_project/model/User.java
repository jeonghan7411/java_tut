package tut12_project.model;


//회원번호(Long),이름,이메일,비밀번호,나이(int),주소,급여(double) -> 임시 저장
//private 필드 > 생성자(), 생성자(파라미터) -> getter,setter -> toString();
public class User {
    private Long userID;
    private String username;
    private String email;
    private String passwd;
    private int age;
    private String addr;
    private double salary;    //stack 메모리


    boolean search = false; //검색한 자료가 있으면 true , 없으면 false

    public User() {} //초기화 -> 객체이므로 heap 메모리에 저장 = 배열

    public User(String email,String passwd){
        //this(); //빈 생성자를 사용 한다 하지만 이것은 생략가능
        this.email = email;    //매개변수로 받은것을 private인 것에 저장한다는 뜻
        this.passwd = passwd;
    }
    public User(Long userID, String username, String email, String passwd, int age, String addr, double salary) {
        this(email,passwd);  //만들어진 생성자를 사용 해서 중복코드 제거 제일 먼저 써줘야 함
        this.userID = userID;
        this.username = username;
        this.age = age;
        this.addr = addr;
        this.salary = salary;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", passwd='" + passwd + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                ", salary=" + salary +
                '}';
    }
}
