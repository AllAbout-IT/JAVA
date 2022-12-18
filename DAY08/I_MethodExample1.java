public class I_MethodExample1 {
  public static int calcSum(int x) {
  //             ⑥   식별자      ②

    int sum = 0;
    for (int i = 1; i <= x; i++) {
                      // ③
      sum += i;
    }
    return sum;
  //   ⑤    ④, ⑦         
    //값을 요청한 자에게 값을 반화해 주는 함수
  }

  public static int calsSum2(int begin, int end) {
      
    int sum = 0;
    for (int i = begin;  i <= end; i++) {
    // 변수명은 너무 복잡하기 않게 만들자.
      sum += i;
    }
    return sum;
  }
  public static void main(String[] args) {
    System.out.println("1~10까지의 누적합: " + calcSum(10));
    System.out.println("1~10까지의 누적합: " + calcSum(20));

    int result = calcSum(100); //함수의 호출
    System.out.println(result);
    System.out.println("4~7까지 누적합" + calcSum2(4, 7));

    //  
    // The method calcSum(int) in the type I_MethodExample1 is not applicable for the arguments (int, int)
                        // 메소드는 하나의 값만 반환할 수 있다.

    int result = calcSum(100);                      
    System.out.println(result);

    System.out.println("--------------------------------");
                                                   // ➀, ⑧
    /*
     * 1. 매서드는 정의(선언)하는 과정과 호출하는 과정이 있습니다.
     * 2. 메서드 선성은 메서드 내부에서는 할 수 없습니다. 반드시 메서드 블록 외부에서만 선언이 가능합니다. 클래스 내부라면 어떤 위치든 선언이 가능합니다.
     * 3. 매서드 내부에서는 다른 메서드의 호출만 가능합니다.
     * 4. 호출하는 과정은 메서드를 사용하는 과정이며 해당 메서드가 필요로 하는 데이터(매개값)를 메서드내부로 전달하면서 해당 메서드는 매개값을 통해 처리환 결과값을 호출부로 다시 반환해줍니다.
     */
    

    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    System.out.println("1~10까지의 누적합: " + sum);

    sum = 0;
    for (int i = 1; i <= 20; i++) {
      sum += i;
    }
    System.out.println("1~20까지의 누적합: " + sum);

    sum = 0;
    for (int i = 1; i <= 40; i++) {
      sum += i;
    }
    System.out.println("1~40까지의 누적합: " + sum);
  }//end main method
}
