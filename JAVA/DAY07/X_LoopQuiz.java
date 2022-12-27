import java.util.Scanner;

public class X_LoopQuiz {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);    
    int drink = 5;

    while(true) {
      System.out.println("==================");
      System.out.println("돈을 넣어주세요: ");
      int money = scan.nextInt();

      if(money == 500) {
        System.out.println("음료수를 받았습니다.");
        drink -= 1;
        System.out.println("남은 음료수의 개수는" + drink + "개입니다.");
      } else if (money > 500) {
        System.out.println("음료수를 받았습니다.");
        System.out.println("거스름돈을 " + (money - 500) + "원 받았습니다.");
        drink -= 1;
        System.out.println("남은 음료수의 개수는" + drink + "개입니다.");
      } else {
        System.out.println("돈이 부족합니다. 최소 500월을 넣어주세요.");
        System.out.println("남은 음료수의 개수는" + drink + "개입니다.");
      }

      if(drink == 0) {
        System.out.println("음료수 가 다 떨어졌습니다. 판매를 중지 합니다.");
        break;
      }
    }
    scan.close();
  }
}