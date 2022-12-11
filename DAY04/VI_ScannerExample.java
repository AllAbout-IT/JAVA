import java.util.Scanner; // Scanner사용시 필요함.

public class VI_ScannerExample {
  public static void main(String[] args) {
    /*
      - Sanner API 사용법
        1.  스캐너 객체 생성
        ex> Scanner scan = new Scanner(System.in)

        2.  입력 받을 데이터 타입에 따른 메서드 호출.

        ex> scan.next(), scan.nextLine(), scan.nextInt(),
        scan.nextDouble() 등

        - next(): 공백을 포함하지 않는 문자열을 입력 받을 때
        - nextLine(): 공백을 포함한 문자열을 입력 받을 때
        - nextInt():  정수를 입력 받을 때
        - nextDouble(): 실수를 입력 받을 때

        3.  스캐너 객체 종료.
     */

     // 1. 스캐너 객체 생성
     Scanner scan = new Scanner(System.in);

     // 2.  스캐너 클래스가 가지고 있는 입력 메서드들을 사용하여 데이터를 입력 받음.
     System.out.println("이름을 입력하세요.");
     System.out.println("> ");
     String name = scan.next();

     System.out.println("나이를 입력하세요");
     System.out.println("> ");
     int age = scan.nextInt();
     System.out.println("------------------------------------");

     System.out.println("당신의 이름은" + name + "이고 나이는 " + age + "세 입니다.");

     scan.close();

      
  }
}
