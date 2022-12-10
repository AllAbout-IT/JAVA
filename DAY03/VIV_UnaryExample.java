public class VIV_UnaryExample {
  public static void main(String[] args) {
    //증감연산자 ++, --
    int i = 1;
    int j = i++; // 후위 연산자 |  i는 해당 연산 다음에 1이증가 따라서 j 는 1이다.

    // 상위 연산이 마치면 i는 1이 증가하므로 다음 출력 되는 i는 2가 된다.
    System.out.println("i의 값: " + i);
    System.out.println("j의 값: " + j);
    System.out.println("-------------------");

    int x = 1;
    int y = ++x; //전위 연산자 | x는 해당 연산에 앞서 1이 증가 했다. 따라서 y는 2다.

    // 상위 연산 전에 i가 1증가 했으므로 다음에 출력되는 i는 2이다.
    System.out.println("x의 값: " + x);
    System.out.println("y의 값: " + y);
    System.out.println("-------------------");

  }
}
