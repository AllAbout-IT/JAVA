import java.util.Scanner;

public class II_DoWhileExample  {
  public static void main(String[] args) {
    // 정수를 입력받아 1부터 입력받은 숫자까지의 누적합을 구하는 로직
    Scanner scan = new Scanner(System.in);

    System.out.print("정수: ");
    int target = scan.nextInt(); // target 임력 받은 임의의 정수
    int sum = 0;
    int n = 1;

    // [while문 만을 사용했을 경우]
    // target이 '0'일때 false가 되어 제대로 수행되지 않는다.
    //
    // while(n <= target) {
    //   sum += n; // sum = sum + n
    //   n++; // 후위연산자로 다음의 n에 1이 증가
    // }

    // [do ~ while을 사용했을 경우]
    // target이 0이어도 do문을 통해 일단 한번은 실행이 되고 다음 while의 조건에 의해서 반복문의 실행여부를 결정한다.
    do {
      sum += n;
      n++;
    }while(n <= target);

    System.out.println("1부터 " + target + "까지의 누적합계" + sum);
    scan.close();
  }

}