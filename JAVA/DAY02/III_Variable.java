public class III_Variable {
  public static void main(String[] args) {
  /*
  변수(variable)
  # 변수선언: int score;
  # 변수의 초기화: score = 50;
  # 변수의 선언과 초기화를 동시에: int score = 50;

  ex> [자료형] [변수 식별자 이름];
  - 변수는 동일한 이름으로 중복 선언할 수 없습니다. 
  - int는 정수를 저장하는 대표적인 자료형입니다.
  - String은 문자열을 저장하는 대표적인 자료형입니다. 
  */

  int score;

  // 변수의 초기화(Initialization)
  score = 50;
  System.out.println(score);

  // 변수의 선언과 초기화를 동시에 할 수 있습니다. 
  int life = 3;

  // 변수에는 다른 변수의 값을 저장할 수도 있습니다. 
  int result = score + life;
  System.out.println(result);

  // 변수에 저장된 값은 언제든지 변경이 가능합니다. 
  life = 7;
  System.out.println(life);

  // 변수는 자료형이 다르더라도 동일이름으로 중복선언할 수 없습니다.
  // String score; (X)
  // 앞서 변수 'score'는 숫자형으로 선언 됐기 때문에 같은 이름으로 자료형을 바꿀 수 없다.
  score = "abc";
  }
}
