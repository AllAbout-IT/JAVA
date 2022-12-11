public class I_LogicalOperating {
  public static void main(String[] args) {
    /*
    논리    &     논리
    True        True  => True
    False       True  => False
    True        False => False
    False       False => False


    논리    |     논리
    True        True  => True
    False       True  => True
    True        False => True
    False       False => False

    &&, ||(Short circuit)는 왼쪽의 논리로 인해 결과가 정해질 경우 오른쪽의 논리를 무시한다.

    False && False => False
    False && False => False
    왼쪽 논리가 False일때 &연산자의 결과 값이 모두 거짓이기 때문에 &&연산시 오른쪽의 논리는 무시된다.

    True && True  => True
    True && False => False
    왼쪽 논리가 True일때 &연산자의 결과값이 True나 False가 될 수 있기 때문에 오른쪽의 논리를 계산한다.

    True        True  => True
    True        False => True
    왼쪽 논리가 True일때 |연산자의 결과값이 모두 True이기 때문에 ||연산시 오른쪽의 논리를 무시한다.

    False       True  => True
    False       False => False
    왼쪽 논리가 False일때 |연산자의 결과값이 True나 False가 될 수 있기 때문에 오른쪽의 논리를 계산한다.
     */

     int x = 10, y = 20;

     // if뒤에 조건식의 결과가 true이면 if블록 내부코드를 실행하고 false면 else블록의 내부코드를 실행.

     if((x != 10) & (++y == 21)) {
      System.out.println("연산결과가 참입니다.");
     }else {
      System.out.println("연산결과가 거짓입니다");
     }
     System.out.println("x: " + x + ", y: " + y);

     if((x == 10) | (++y == 21)) {
      System.out.println("연산결과가 참입니다.");
     }else {
      System.out.println("연산결과가 거짓입니다.");
     }System.out.println("x: " + x + ", y: " + y);

    System.out.println("----------------------------------------");

     int a = 10, b = 20;
     if((a != 10) && (++b == 21)) { //왼쪽 논리로 결과값이 false로 정해 졌기 때문에 오른쪽의 논리는 무시되고 b의 출력값은 전위연산자가 적용되지 않는다.
      System.out.println("연산결과가 참입니다.");
     }else {
      System.out.println("연산결과가 거짓입니다");
     }
     System.out.println("a: " + a + ", b: " + b);

     if((a == 10) || (++b == 21)) { //왼쪽 논리로 결과값이 True로 정해졌기 때문에 오른쪽의 논리는 무시되고 b의 출력값은 전위연산자가 적용되지 않는다.
      System.out.println("연산결과가 참입니다.");
     }else {
      System.out.println("연산결과가 거짓입니다.");
     }System.out.println("a: " + a + ", y: " + b);
  }
}
