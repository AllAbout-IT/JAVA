public class Account {
  /*
   * 1. 멤버젼수는 예금주이름(name: String), 비밀번호(password: int), 잔액(balance: int)로 선언하세요.
   * 
   * 2. 생성자는 3가지 멤버변수를 모두 매대값으로 받아 초기화하는 생성자를 선언하세요.
   * 
   * 3. 메서드는 입금기능 메서드(deposit: void), 출금기능 메서드(withDraw: void), 잔액 조회기능 메서드(getBalance: int) 3가지를 선언하세요.
   * 
   */

    // 객체의 속성(멤버변수)
    String name;
    int password;
    int balance;

    //생성자 선언
    Account(String aName, int pw, int bal) {
      name = aName;
      password = pw;
      balance = bal;  
    }

    //입금기능
    void deposit(int money) {
      balance += money;
    }

    //출금기능
    void withDrawMoney(int money) {
      balance -= money; //balance = balance - money; 
    }

    //잔액 조회 기능
    int getBalance() {
      return balance; 
    }

    

}