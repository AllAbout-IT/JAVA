import java.util.Scanner;

public class AccountManager {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   // 자료를 입력 받기 위한 함수

   System.out.println("계좌를 등록합니다.");

   System.out.print("이름: ");
   String name = scan.next(); // 입력받은 문자열은 변수 name에 저장
   System.out.print("비밀번호: ");
   int passwd = scan.nextInt(); // 입력받은 정수는 변수 passwd에 저장
   int balance = scan.nextInt();

   Account acc = new Account(name, passwd, balance);

   while(true) {
    System.out.println("\n메뉴를 입력하세요.");
    System.out.println("1. 예금 | 2. 출금 | 3. 잔액조회 | 4. 종료");
    System.out.print("> ");
    int menu = scan.nextInt();
    // 메뉴의 선택범위 내에서 정수를 입력받으며 입력된 수는 변수 menu에 입력됨.

    if(menu==1) { // 예금기능을 위한 if문 수행. 입력받은 변수 'menu'값이 정수 1일때 실행.
      System.out.println("계좌 비밀번호를 입력하세요.");
      System.out.print("> ");
      // 입금을 위한 계좌번호를 입력 받기 위해 안내 메세지 출력.
      int pw = scan.nextInt();
      // 입력받은 정수는 변수 'pw'에 저장된다.

      if(pw == acc.password) { // 이중if문, 입력받은 pw 값이 'acc.password'(계정의 비밀번호)와 일치하면 실행.
      System.out.println("입금액을 입력하세요.");
      System.out.println("> ");
      int money = scan.nextInt();
      // 입력 받은 값은 변수 money에 저장

      acc.deposit(money); // 입력 받은 변수 money의 값을 이용하여 사용자가 생성한 통장(acc)의 입금 기능 메서드 'deposit'호출
      System.out.println(money + "원 입금이 완료되었습니다.");
      }else { // 그밖에, 입력 받은 변수 pw의 값과 acc.password(계정의 비밀번호 값)이 다른 경우.
        System.out.println("비밀번호가 틀렸습니다.");
        // 안내 메세지 출력
      }
    }else if(menu==2) { // 출금기능을 위한 else if문 수행. 입력 받은 변수 'menu'의 값이 정수 2일 때.
      System.out.println("계좌 비밀번호를 입력하세요.");
      System.out.print("> ");
      int pw = scan.nextInt();
      if(pw == acc.password) { // if이중구문
        System.out.println("출금액을 입력하세요.");
        System.out.print("> ");
        // 입력 받을 출금액 값을 위한 안내문
        int money = scan.nextInt();
        // 입력 받은 출금액(정수)는 변수 money에 저장.
        if(money > acc.balance) {
          // 입력 받은 출금요청액(변수 'money')이 사용자계정(acc)에 저장되어 있는 잔액(balance)보다 크다면
          // 현재 계정에 있는 잔액을 알려주는 acc.getBalance 메서드 값을 호출해도 된다.
          System.out.println("잔액이 부족합니다.");
          // 출금을 실행하지 못하는 안내문구 출력.
        }else { // 그밖에, 요청받은 요청출금액(변수 money)이 잔액보다 이하(같거나, 미만)일때
          acc.withDrawMoney(money); // 출금 메서드 호출
          System.out.println(money + "원 출금 완료!");
          // 출금 완료를 위한 메세지 출력.
        }
      }else {
        System.out.println("비밀번호가 틀렸습니다.");
      }
    }else if(menu==3) { // 잔액조희를 위한 else if문 수행. 입력 받은 변수 'menu'의 값이 정수 3일때.
      System.out.println("계좌 비밀번호를 입력하세요.");
      System.out.print("> ");
      // 잔액조회에 필요한 계좌번호 입력을 받기 위한 안내 메세지
      int pw = scan.nextInt();
      if(pw == acc.password) {
        int bal = acc.getBalance();
        // 잔액조회 메서드가 실행

        System.out.println(acc.name + "님의 계좌 잔액은" + bal + "원 입니다.");
      }
    }else { // 입력 받은 변수 'menu'의 값이 정수 1, 2, 3이 아닌 다른 수 일때 '0'일 때도 포함.
      break; // 종료
    }
   }// while()
  }// main
}// end class