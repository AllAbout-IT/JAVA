import java.util.Scanner;

public class IV_If_Quiz {
  public static void main(String[] args) {
    /*
     1. 양의 정수를 입력받아서 그 수가 홀수라면 "x는 홀수입니다.", 짝수라면 "x는 짝수입니다."가 출력되도록 조건문을 활용하여 코드를 만들어보세요.짝수는 2로 나누면 나머지가 0이다.

     2.만약 사용자가 0을 입력하면 "0입니다.", 음수를 입력하면 "음의 정수입니다."를 출력하도록 조건문을 수정해보세요.    
     */

     Scanner sc = new Scanner(System.in);

     System.out.println("임의의 양수를 입력하세요.");
     System.out.println("> ");

     int point = sc.nextInt();

     if(point == 0) {
      System.out.println(point + "는 0입니다.");
      } else if((point%2) == 0) {
        System.out.println(point + "는 짝수입니다.");
      } else if((point%2) == 1) {
        System.out.println(point + "는 홀수입니다.");
      } else if(point < 0) {
        System.out.println(point + "는 음의 정수입니다.");
      }
  }
}