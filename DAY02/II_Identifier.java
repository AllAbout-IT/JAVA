public class II_Identifier {
  public static void main(String[] args) {
    /*
     식별자(identifier)
      - 자바 언어에서 식별자는 클래스명, 변수명, 메서드명 등 사용자가 만들어서 이용하는 고유한 이름을 식별자라고 합니다.
      - 식별자 생성 규칙(꼭 지켜야할 규칙)
        1. 대, 소문자를 구분하고 길이 제한은 없습니다.
        2. 문자와 숫자, 밑줄(_), 달러기호($)를 포함할 수 있습니다.
        3. 문자, 밑줄, 달러기호로 시작할 수 있습니다.
        4. 숫자로는 시작할 수 없습니다.
        5. 공백을 포함할 수 없습니다.
        6. 키워드(예약어)는 식별자로 사용할 수 없습니다.
    * 식별자 이름 규칙(개발자들의 약속)
    1. 클래스/인터페이스 이름 규칙
      - 명사나 형용사를 서술적으로 연결하여 사용합니다.
      - 첫 글자는 대문자로 표기합니다.
      - 연결된 단어의 첫 글자도 대문자로 표기합니다.
      ex)HelloWorld, MyCalculator
    2. 변수 이름 규칙
      - 명사적 의미를 갖게 만듭니다.
      - 첫글자는 소문자, 연결 단어의 첫글자는 대문자로 표기합니다.
        ex> customerAge, phoneNumber
    3. 메서드 이름 규칙
      - 동사적 의미를 갖게 합니다.
      - 첫글자는 소문자, 연결단어의 첫글자는 대문자로 표기합니다.
      - 메서드 이름 뒤에는 반드시 한 쌍의 괄호"()"가 뒤따릅니다.
      - 일반적으로 메서드 이름에는 "_"를 사용하지 않습니다.
        ex> writeView(), join()
    4. 상수 이름 규칙
      - 모든 문자는 대문자로 표기합니다.
      - 단어와 단어 사이는 "-"로 연결합니다.
        ex> NUMBER_ONE, LOGIN_OK
     */

     // 자바의 식별자 이름은 대/소문자를 구분함.
    int age = 20;
    int aGe = 21;
    int aGE = 22;

    System.out.println(age);
    System.out.println(aGe);
    System.out.println(aGE);

    // 식별자 이름을 숫자로 시작하게 만들지 마세요.
    int numver4 = 4;
    int num4ber = 4;
    // int 4number = 4; (X)

    // 식별자 이름에 공백을 포함하지 마세요.
    // int birth day = 020111; (X)
    int birthDay = 020111;

    // 키워드는 식별자 이름으로 지정 불가.
    /* 
    키워드 차트

    abstract  | continue  | for | new | switch  
    assert  | default | goto  | package | synchronized
    boolean | do  | if  | private | this  |
    break | double  | implements  | protected | throw |
    byte  | else  | import  | public  | throws  |
    case  | enum  | instanceof  | return  | transient 
    catch | extends | int | short | try |
    char  | final | interface | static  | void
    class | finally | long  | strictfp  | volatile
    const | float | native  | super | while

    */

    // int class =12; (X)
    // int if = 33; (X)
    int cLASS = 33;
    
  }
}
