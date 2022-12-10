public class VII_CastingOperator {
  public static void main(String[] args) {
    char c = 'B';
    int i = 2;

    // char cc = c + i; 
    char cc = (char)(c + i);
    System.out.println(cc);
    int dd = c + i;
    System.out.println(dd);

    /*
     서로 다른 타입의 데이터의 연산을 진행할 경우 두 데이터 중 큰 데이터 타입을 가진 쪽에 맞추어 자동 형 변환된 후 연산을 진행합니다.
     */

     int j = 10;
     double d = j / 4;
     // j / 4가 먼저 연산 되어 질때 j는 int이기 때문에 결과값에서 소수점인 0.5가 삭제 된다. 이후에 double d에 적용된다.
     System.out.println(d);

     double g = j / 4.0;
     // j / 4.0이 연산 되어 질 때 4.0은 double형이므로 j는 자연스럽게 double로 promotion이 되어 결과값에서 손실 없이 2.5로 출력된다.
     System.out.println(g);

     double h = (double)j / 4;
     System.out.println(h);
     // 위는 int형의 j를 double로 강제형변환을 한후 / 4로 연산되기 때문에 결과 값이 손실 없이 2.5출력

     double k = (double)(j / 4);
     System.out.println(k);
     // 위는 괄호안의 j / 4가 double로 강제형변환 되기 전에 int형으로 연산되므로 소수점의 수가 손실되어 2가 된다.

     byte b1 = 100;
     byte b2 = 10;
     //byte b3 = b1 + b2;
     //System.out.println(b3);
     // Type mismatch: cannot convert from int to byte
     // int형 보다 작은 데이터타입의 연산을 진행할 경우 자동으로 int형으로 형변환이 이루어집니다.
    

     // byte(1, 8bit)에서 가장 큰수는 127이다 byte와 byte가 연산되면 127를 초과하기가 쉬워지므로 byte + byte는 자동으로 int형으로 되어진다. 
     // byte + byte = int
     // short + short = int
     // byte + int = int
     // char + char = int

     // byte + byte의 결과값을 byte형으로 출력하고 싶다면 강제형변환을 하자.

     byte d3 =(byte)(b1 + b2);
     System.out.println(d3);
  }
}
