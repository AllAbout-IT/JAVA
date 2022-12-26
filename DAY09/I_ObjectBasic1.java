public class I_ObjectBasic1 {
  /*
   * 클래스 : 객체를 생성하기 위한 틀(설계도)
   * 객체   : 클래스를 통해 만들어진 실제 데이터 뭉치
   *      - 속성  : 변수, 필드
   *      - 기능  : 메서드
   * 
   * Class(클래스)
   * ┌───────────────┐
   * │  ┌─(속성)────┐ │
   * │  │   name   │ │
   * │  │    pw    │ │ 
   * │  │   addr   │ │
   * │  │    age   │ │
   * │  └──────────┘ │
   * │  (기능)        │
   * │  changpw()    │
   * │  modify()     │
   * └───────────────┘
   */  
  // 계산기 만들기??
  
  //  변수만들기
  static int result1 = 0;
  static int result2 = 0; // 새로운 연산을 위한 새 변수

  public static int add1(int n) {
    result1 += n;
    //add1에서 int n값을 받으면 result1의 값과 더하여 result1에 저장한다. 그리고 그 값을 result1에 전달(return)한다.
    return result1;  
  }

  public static int add2(int n) {
    result2 += n;
    return result2;  
  } // 새로운 연산을 위한 새 기능
  public static void main(String[] args) {
    System.out.println("* 1번 계산기 계산결과! ");
    System.out.println("-------------------");
    System.out.println(add1(6));
    System.out.println(add1(8));
    System.out.println(add1(16));

    // 이때 새로운 연산이 가능한 계산기를 만든다면 모든 변수를 새로 만들어야 한다.

    System.out.println("* 2번 계산기 계산결과! ");
    System.out.println("-------------------");
    System.out.println(add2(6));
    System.out.println(add2(8));
    System.out.println(add2(2));

    System.out.println("1번 계산기 계산 결과값: " + result1);
    System.out.println("2번 계산기 계산 결과값: " + result2);

    // 이와 같이 새로운 연산을 위해서는 내용이 중복되는 새로운 변수를 계속 만들어야 한다.
    // 불필요한 작업이 많아지고 코드가 복잡해 진다.
    

  }
}