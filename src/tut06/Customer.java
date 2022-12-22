package tut06;

public class Customer {
    //private 타입 필드명;
    private String customerName;
    private String auth;  //enum
    private int age;

    //오버로딩 : 매개변수 개수가 다르거나 개수는 같아도 타입이 다를 때
    //생성자 : 메모리 초기화 - 싹 비우기 or 비운 후 초기값을 설정
    public Customer(){}  // Customer c = new Customer();


    public Customer(String customerName,String auth, int age){
        // Customer c = new Customer('값','값','값');
        this.customerName = customerName; // this.필드명 = 매개변수명
        this.auth = auth;
        this.age = age;

    }

}
