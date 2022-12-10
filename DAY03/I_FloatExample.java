public class I_FloatExample {
  public static void main(String[] args) {
    /*
     실수형 데이터 타입
      - 실수형에는 2가지 유형이 있습니다.
      - 실수형 변수를 선언할 때 float, double 키워드를 사용합니다.
      - 실수형은 디폴드형이 double이므로 float형을 지정하려면 숫자 뒤에 "F"를 붙여줍니다.
      - 실수형 표현은 소수점 표현방식인 10진수형 표현방식과, 지수 형식으로 나타내는 과학기술용  표기법이 사용됩니다.
     */
    float f1 = 7.12345F;
    double d1 = 7.12345;
    System.out.println(f1);
    System.out.println(d1);

    float f2 = 1.23456789234F;
    //float는 4byte이므로 7번째 자리까지만 표기 된다.
    double d2 = 1.234567891234;
    System.out.println("--------------------");
    System.out.println(f2);
    System.out.println(d2);

    // 2132121344123 | 732123213121
    // 2.1321 x e^14| 7.3212 x e^13 (지수형표기법: 쉽게 자리수를 확인할 수 있다.)
    // 
    float f3 = 3.1215e6F; // 3.1415 x 10^6
    // e6은 10^6(10의6승)이라는 뜻이므로 결과 값은 소수점이 오른쪽으로 6번 이동하게 된다.
    double d3 = 2.123e-3; //2.213 x 10^-3
    // e-3은 10^3(10의-3승)이라는 뜻이므로 결과 값은 소수점이 왼쪽으로 3번 이동하게 된다.
    System.out.println("------------------");
    System.out.println(f3);
    System.out.println(d3);
    
  }
}
