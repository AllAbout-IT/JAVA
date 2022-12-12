import java.util.Scanner;

public class III_DoubleIfExample {
  public static void main(String[] args) {
    /*
     이중if문
     */
    Scanner sc = new Scanner(System.in);

    System.out.println("점수를 입력하세요.");
    System.out.print("> ");
    int point = sc.nextInt();

    if(point >= 90) {
      if(point > 100) {
        System.out.println("점수를 잘못 입력했습니다.");
      } else if(point >= 95) {
        System.out.println("당신의 학점은 A+ 입니다.");
      } else {
        System.out.println("당신의 학점은 A입니다.");
      }
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
