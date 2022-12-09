public class IV_VarScopeExample {
  public static void main(String[] args) {
    /*
    - 변수에 초기값을 주는 행위를 '초기화'라고 부릅니다.

    * 변수의 사용 범위
    - 번수는 중괄호 "{}" 안에서 선언되고 사용됩니다.
    - 변수는 선언된 블록 내에서만 사용이 가능합니다.
    - 변수는 블록이 끝나면 메모리상에서 제거 됩니다.

    * 정수형 데이터 타입
    - 정수형에는 4가지 유형이 있습니다. 
    - byte, short, int, long 키워드(예약어)를 사용.  
    */

    // 같은 타입의 변수를 선언할 때는 콤마(,)로 나열 가능.
    int num1 = 10, num2 = 20; 
    
    if(num1 > 15) {
    int num3 = num1 + num2;
    }
    // int num4 = num1 + num3; (X)
    // num3 if함수 안에서 선언 되었기 때문에 if함수를 벗어나면 효력이 없다.
    // int num1; (X)
    // num1은 앞서 main함수에서 선언되었기 때문에 다시 선언 되어 질수 없다.
    int num3 = 30;
    System.out.println(num3);
  }
}
