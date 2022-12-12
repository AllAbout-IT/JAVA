import java.util.Scanner;

public class II_IfExample2 {
  public static void main(String[] args) {
    /*
      다중 분기 조건문 if ~ else if ~ else
      - 여러 조건들을 설정할 때 사용하는 조건문입니다.
      - 다중 분기 조건문은 위에서부터 차례로 조건을 검색합니다.
     */
    Scanner sc = new Scanner(System.in);

    System.out.println("점수를 입력하세요.");
    System.out.print("> ");
    int point = sc.nextInt();

    if(point >= 90) {
      System.out.println("당신의 학점은 A입니다.");
    } else if(point >= 80) {
      System.out.println("당신의 학점은 B입니다.");
    } else if(point >= 70) {
      System.out.println("당신의 학점은 C입니다.");
    } else if(point >= 60) {
      System.out.println("당신의 학점은 D입니다.");
    } else if(point >= 50) {
      System.out.println("당신의 학점은 F입니다.");
      System.out.println("당신은 재수강대상입니다.");
    }
  }
}
