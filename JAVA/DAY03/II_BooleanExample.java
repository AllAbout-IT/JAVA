public class II_BooleanExample {
  public static void main(String[] args) {
    /*
     논리형 데이터 타입(boolean)
      - 논리형 값에은 true와 fales가 있습니다.
      - 논리형은 다른 데이터 타입과 서로 형 변환(type casting)할 수 없습니다.
      - 또한 C언어에서처럼 숫자 값을 논리 값으로 해석하여, 0을 false로 다루고 0이 아닌 값을 true로 해석하는 것을 허용하지 않습니다.
      - 논리형 데이터타입에서는 오직 true와 false만 허용합니다.
     */

     boolean b1 = true;
     boolean b2 = false;

    //  boolean b3 = False;(X)
    // C에서 처럼 flase의 f를 대문자(F)로 표기하면 변수 'False'로 이해하게 됨.

    //  boolean b4 = "false"; (X)
    // false를 큰따옴표(Qoutation Mark)로 묶으면 문자열로 인식하게 되고 서식에 맞지 않는 값이 들어왔다고 판단하여 오류를 일으킨다.

    // boolean b5 = 0; (X)
    // C처럼 0을 false의 대체값으로 입력하게 되면 java의 boolean에서는 int값으로 판단하여 오류를 일으킨다.

    // 따라서 boolean에서는 반드시 false 나 true로 표기하자.

    


  }
}
