public class X_BitNotExample {
  public static void main(String[] args) {
    //비트반전 연산자 (~)
    //정수의 2진수값의 각 자리수를 반전시킵니다.
    //0 -> 1, 1 -> 0
    byte b = 8; // 0000 1000
    System.out.println(~b); //1111 0111

    //논리반전 연산자(!)
    //true -> false, false -> true

    boolean bool = false;
    System.out.println(!bool);
  }
}
