import java.lang.reflect.Array;
import java.util.Arrays;

public class VII_ArrayBasic {
  public static void main(String[] args) {
    /*
    배열(Array)
      - 배열 같은 데이터 유형 변수를 여러 개 선언해야 하는 불편함을 줄이기 위해 사용합니다. 

      - 자바에서는 배열도 일종의 데이터 타입으로 취급할 수 있기 때문에 배열을 정의하는 대괄호'[]'가 배열 변수명 앞에 오는 것이 가능합니다.

      - 배열의 구조
      배열의 선언: <데이터 타입><배열이름[]> or <데이터 타입[]><배열 이름>

      배열 생성: <배열 이름> = new<데이터 타입[배열의 크기]>
      - 자바의 배열은 선언시에는 크기를 명시할 수 없으며, 생성시에 크기를 명시한다. 

      - 배열은 기본데이터 타입이나 객체참조 데이터 타입 또는 다른 배열의 순자척인 집합체라고 할 수 있습니다.

      - 하나의 배열에 여러가지 데이터형을 혼합해서 사용할 수 없습니다. 이런 배열의 특징을 동종모음(Homogeneous cellection)이라고 합니다.

      - 배열은 선언, 생성, 초기화의 과정을 통하여 만들어집니다.

      - 선언 시에는 배열에 들어갈 데이터 타입을 결정하고, 생성 시 만들 배월의 크기를 결정합니다. 그리고 초기화 과정을 통하여 배열에 들어갈 값을 입력해 줍니다.

      - 배열의 길이란 배열에 저장할 수 있는 전체 항목 수를 말하는데 코드에서 배열의 길이를 얻으려면 '배열변수이름.lengh'라는 코드를 사용합니다.
    */    

    //  1.  배열의 선언 stack에 배열변수를 설정.
    // int score[];  (O) <데이터 타입><배열이름[]> | C style
    // int score[5]; (X) Java에서는 선언시 크기 명시 불가.
    int[] score;  //  Java Style
    
    // System.out.println(score);
    // The local variable score may not have been initialized(지역 변수값이 지정되어 있지 않음)

    // 2. 배열의 생성 - Heap에 실제 데이터가 저장될 공간을 생성.
    // 배열은 생성이 크기를 명시함. 한번 설정한 크기는 변경 불가.
    score = new int[5];
    System.out.println(score);

    // 3. 배열의 초기화 - 배열에 값을 저장하는 과정
    score[0] = 87;
    score[2] = 99;
    score[3] = score[0];
    
    // 4. 배열의 값 참조(사용)
    System.out.println("배열의 3번째 데이터값: " + score[2]);
    System.out.println("배열의 4번째 데이터값: " + score[3]);
    System.out.println("배열의 5번째 데이터값: " + score[4]);

    /*
     배열 내부에 저장된 값들을 한분에 문자열 형태로 확인해보려면 출력메서드 println의 매개값으로 Arrays.toString(배열변수명)을 쓰면 됩니다.
     */
    System.out.println(Arrays.toString(score));

    // 배열의 길이를 알아보려면 배열변수명. length 명령을 사용.
    System.out.println("배열의 길이: " + score.length);

    // 배열의 선언과 생성을 동시에 하는 방법
    byte[] bArr = new byte[7];
    System.out.println(Arrays.toString(bArr));

    // 배열의 선언과 생성과 초기화를 동시에 하는 방법
    char[] letters = new char[] {'가', '나', '다', '라'};
    System.out.println(Arrays.toString(letters));

    // 문자열을 배열
    String[] names = new String[] {"홍길동", "신사임당",  "강감찬"};
    System.out.println(Arrays.toString(names));

    String[] names1 = {"홍길동", "신사임당",  "강감찬"};
    // 'new String[]'이 생략되어도 가능하다.
    System.out.println(Arrays.toString(names1));
  }
}
