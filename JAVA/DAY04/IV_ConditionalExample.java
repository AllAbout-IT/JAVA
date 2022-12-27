public class IV_ConditionalExample {
  public static void main(String[] args) {
    /*
     4.4 3항 연산자

     조건식 ? 연산식1 : 연산식2
     조건식이 참이면 연산식1, 거짓이면 연산식의2의 결과
     */

     // -4 ~ 5까지의 정수 난수값을 발생.
     int r = 5 - (int)(Math.random() * 10);
     // Math.random() * 10은 double(8byte)이므로 int(4byte)로 표현되기 위해 강제형변환을 한다. => (int)(Math.random() * 10
     // 위의 식으로 인해 결과 값이 0 ~ 9 이다.
     // -4 ~ 5지로 범위를 바꾸고 싶다면 결과값을 음수로 바꾸로 5를 더하자.


     // 3항 조건 연산자(조건식 ? 연산식 : 연산식2)
     int abs = (r >= 0) ? r : -r;
     System.out.println(r + "의 절대값은: " + abs);

    // int r = 5 - (int)(Math.random() * 10);
    // 5순위   4순위  3순위    1순위        2순위
    

  }
}
