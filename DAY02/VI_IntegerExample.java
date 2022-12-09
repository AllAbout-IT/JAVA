public class VI_IntegerExample {
  public static void main(String[] args) {
    byte a = 127;
    short b = 32767;
    int c = 2147483647;
    long d = 2147483648L;
    System.out.println(d);

    int bin = 1010;
    System.out.println("2진수 1010: " + bin); 

    int bin1 = 0b1010;
    // 2진수 저장시에 정수 앞에 접두어로 0b를 붙임.
    System.out.println("2진수 1010: " + bin1);

    // 8진수 저장시에 정수 앞에 접두어로 0을 붙임
    int octa = 064;
    System.out.println("8진수 64: " + octa);

    // 16진수 저장시에 정수 앞에 접두어로 0x를 붙임
    int hexa = 0x3a4c;
    System.out.println("16진수 3a4c: " + hexa);
  }
}
