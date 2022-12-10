public class III_TextualExample {
  public static void main(String[] args) {
    /*
     문자형 데이터 타입
      - 단일 문자는 char형으로 표현합니다.
      - char형은 0 ~ 2^16의 범위 내에서 부호가 없는 16비트(2byte) 숫자를 사용하여 유니커드 문자를 표현합니다.
      - char형 값은 홑 따옴표(' ') 안네 넣어야 합니다.
      - 문자열을 표현할 때는 String을 사용합니다.
      - String은 기본 데이터형이 아닙니다. 문자열을 좀더 쉽게 다루기 위해 만들어 놓은 클래스 입니다.
      - String 클래스는 문자열을 표현하는데 사용됩니다.
      - 문자열 값은 겹 따옴표(" ")안에 넣습니다. 
     */

     // 단일문자를 저장하는 데이터타입 char
     char c1 = 'A';
     System.out.println(c1);

     // char에 숫자를 입력하면 아스키코드표를 기준으로 한 문자를 표기하게 된다. 
     char c2 = 66;
     System.out.println(c2);

    char c3 = '\uAC00';
    System.out.printf("%c %c %c\n", c1, c2, c3);
    /*
     한글 '가'에 해당하는 유니코드 AC00을 
     직접 16진수형태로 저장하려면 탈출문자 \\u를 적어주어야 합니다.
     */

     // 문자열을 저장할 수 있는 데이터 타입 String
     String s1 = "my dream";
     String s2 = "is a scientist";
     System.out.println("--------------------");;
     System.out.println(s1);
     System.out.println(s2);

     //java에서는 문자열의 + 연산을 진행할 수 있습니다. 
     //연산결고로 문자열을 이어붙인 결과를 도축합니다. 
     System.out.println(s1 + s2);


     System.out.println("--------------------");;
     //문자와 다른 데이터타입과의 + 연산

     System.out.println(100 + 200);
     System.out.println(100 + "200");
     // 100은 int이고 "200"은 문자열이다 이때 java는 int 100을 문자열로 변환하여 200과 붙여 출력하게 된다.

     System.out.println(10 + 20 + "hello");
     // 연산의 순서의 따라서 10 + 20은 30으로 먼저 연산된 후 "hello"에서 문자열로 바뀌여서 출력된다.

     System.out.println("hello" + 10 + 20);
     // 연산의 순서에 따라서 10은 hello와의 연산에서 문자열로 바뀌고 20도 연산될 수가 없기 때문에 자연적으로 문자열로 바뀌어서 출력 된다.

     // 만약 여기에서 숫자는 연산이되고 결과값이 hello와 같이 출력이 되게 하려면 숫자연산에 괄호(parenthesis)를 넣어준다. 이때 이중괄호는 이중괄호로 닫아야 하는 것을 잊지말자.
     System.out.println(("hello") + (10 + 20));

     // 기본데이터타입의 연산시 바이트가 큰쪽에 맞추어 연산.
     System.out.println('A' + 10);
     // char는 2byte int는 4byte다 이때 작은 바이트수는 큰바이트따라서 'A'는 int형으로 바뀌어서 연산된다.

     

  }
}
