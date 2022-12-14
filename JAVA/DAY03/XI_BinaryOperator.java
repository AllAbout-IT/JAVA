public class XI_BinaryOperator {
  public static void main(String[] args) {
  
    /*
   2항 연산자(Binary Operator)
    - 2항 연산자는 피 연산자(Operand)가 두 개인 연산자를 의미합니다.
    - 연산자가 int형(4byte)보다 작은 크기의 데이터 타입인 경우에 boolean형을 제외하고 모두 int형으로 자동 형 변환되어 연산을 수행합니다.
    - 2항 연산자의 종류

    1. 산술 연산자 (+, -, *, /, %)
    - 나머지 연산은 결과가 항상 정수입니다.
   */

  // 산술연산(+, -, *, /, %)
  int i = 7 / 3; // 몫을 구하는 연산
  int j = 7 % 3; // 나머지를 구하는 연산

  System.out.println("7에서 3을 나눈 몫은: " + i);
  System.out.println("7에서 3을 나눈 나머지는: " + j);

  /*
   2. 비교 연산자 ( <, <=, >, >=, ==, !=)
    - 비교 연산자의 결과 값은 크기 값을 비교하여 조건을 만족하면 true 그렇지 않으면 false를 반환합니다.
    - 만약 비교되는 숫자의 데이터 타입이 다를 경우 기본적으로 크기가 큰 데이터 타입에 맞추어 비교 연산을 실행합니다.
   */
  // 비교 연산 ( <, <=, >, >=, ==, !=)
  
  System.out.println(i == j);
  System.out.println(20 >= 20);
  System.out.println(130 < 50);
    }  
}
