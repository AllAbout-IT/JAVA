public class VI_CastingExample2 {
  public static void main(String[] args) {
    int i = 72;
    // char c = i; 
    // System.out.println(c);
    // Type mismatch: cannot convert from int to char
    // int(4byte)를 char(2byte)로 변환 할수 없음.

    char d = (char)i; // int -> char 강제 형 변환
    // 강제로 변환하고 싶을 때는 변수앞에 '(변환하고자 하는 형태)'를 입력한다.
    System.out.println("72의 유니코드 문자: " + d);

    /*
     크기가 큰 데이터를 작은 데이터 타입으로변환하려면 반드시 캐드스 연산자(type)을 사용하여 명시적으로 형 변환을 해야 합니다.(Downcasting)
     */

     double f = 4.83123;
     int j = (int)f; // double(8byte)에서 int(4byte)로 변환 될때 소수점 이하의 숫자는 삭제 된다.
     System.out.println(j);

     /*
      강제 형변환의 경우 데이터 손실이 일어날 가능성이 있기 때문에 명시적으로 타입을 변환합니다.
      */

    int k = 1000;
    byte b = (byte)k;
    // int(4)의 1000을 byte(1)로 변환하면 11 1110 1000(2진수)이고 숫자1개당 1bit 총 12bits로 표현된다. byte는 8btis이기 때문에 변화되는 과정에서 값이 손실된다. 
    System.out.println(b);

    /*
     강제 형 변환시 주의점은 해당 데이터 타입이 받아들일 수 있는 범위가 아닌 데이터가 들어오면 오버플로, 언더플로가 일어납니다. 
     */
  }
  
}
