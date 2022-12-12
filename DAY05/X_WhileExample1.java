public class X_WhileExample1 {
  public static void main(String[] args) {
    /*
     반복문 while
      - while문은 조건식을 만족하는 동안 반복문을 실행하는데, 조건식을 검사해서 조건식이 참이면 실행문을 반복하고, 거짓이면 while문을 빠져나옵니다.
      - while문에 들어가는 조건식도 if문과 마찬가지로 반드시 boolean타입으로 결과를 반환해야 합니다.

      반복문(loop) - while, do ~ while, for
     */

    //  1~10까지의 누적합계를 구하는 로직
    int sum = 0; // 합계를 저장할 변수
    int sum1 = 0; 
    int n = 1; //제어변수: 반복문의 횟수를 제어할 변수.
    int b = 1; 

    while(n <= 10) {
      sum += n;
      n++; //제어변수 조작을 통해 반복문이 언젠가 false가 나오게 하자.
    }
    while(b <= 100) {
      sum1 += b;
      b++;
    }
    System.out.println("1부터 10까지의 누적합: " + sum);
    System.out.println("1부터 100까지의 누적합: " + sum1);
  
  }
}