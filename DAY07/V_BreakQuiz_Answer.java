import java.util.Scanner;

public class V_BreakQuiz_Answer {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int okCount = 0;
    int noCount = 0;

    while(true) {
      int rn1 = (int)(Math.random() * 100) + 1;
      int rn2 = (int)(Math.random() * 100) + 1;
      // random은 0부터 1미만 까지의 소수이므로 100을 곱하고 + 1을 더한다.
      System.out.println("----------------------");
      System.out.println(rn1 + "+" + rn2 + " = ? ");
      System.out.println("문제를 그만 푸시려면 '0'을 입력하세요.");
      System.out.print("> ");

      int correct = rn1 + rn2;
      int answer = scan.nextInt();

      if(answer == 0) {
        System.out.println("프로그램을 종료합니다.");
        break;
      }

      if(answer == correct) {
        System.out.println("정답입니다!!");
        okCount++;
      }else {
        System.out.println("틀렸는네요??");
        noCount++;
      }
    }
    System.out.println("-------------------------");
    System.out.println("정답 횟수: " + okCount + "회");
    System.out.println("오답 횟수: " + noCount + "  회");

    scan.close();

    /*
     * Question
     * 정답일 때는 새로운 문제가 나오고 오답일때는 같은 문제가 나오게 하는 방법은 어떻게 하는 것일까?
     */

    
  }
}