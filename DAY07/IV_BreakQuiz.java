import java.util.Scanner;

public class IV_BreakQuiz {
  public static void main(String[] args) {
    /*
     * 1. 두수의 더하기를 맞추는 문제를 지속적으로 출제하는 프로그램입니다.
     * 2. 2가지의 정수를 1~100사이의 난수를 발생 시켜 지속적으로 문제를 출제한 후 정답을 맞추면 반복문을 탈출시키세요.
     * 3. 27 + 84
     */
    u_case: while (true) {

      // 오답과 정답에 대한 변수의 선언이 없음!

      Scanner sc = new Scanner(System.in);
      System.out.println("----------------------");
      int i = (int) (Math.random() * 100);
      int j = (int) (Math.random() * 100);
      // random은 0부터 1미만의 소수를 생성하기 때문에 위와 같이 한다면 100은 나올수 없다. (+1을 해주어야 한다.)
      

      while(true) {
        System.out.println(i + "+" + j + "=");
        System.out.println("[문제를 그만 풀려면 '0'을 누루세요.]");
        System.out.print("> ");
        int answer = sc.nextInt();

        if (answer == 0) {
          break u_case;
        }
        if (answer != i + j) {
          System.out.println("오답입니다.");
          continue;
          // continue는 블록 하나를 벗어나기 떄문에 2중 while문을 깰수 없다.
        }
        if (answer == i + j) {
          System.out.println("정답입니다.");
        } continue u_case; 
      } 
      
    }
  }
}