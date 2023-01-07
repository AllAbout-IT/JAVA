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

    if(menu==1) { // 입력받은 수가 1일때 실행.
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

      acc.deposit(money)
      // 입력 받은 변수 money의 값을 이용하여 입금 기능 메서드 'deposit'호출
      System.out.println(money + "원 입금이 완료되었습니다.");
      }else { // 그밖에, 입력 받은 변수 pw의 값과 acc.password(계정의 비밀번호 값)이 다른 경우.
        System.out.println("비밀번호가 틀렸습니다.");
        // 안내 메세지 출력
      }
    }else if(menu==2) { // 입력 받은 변수 'menu'의 값이 2일 때.
        
      }
   }


   
  }
}