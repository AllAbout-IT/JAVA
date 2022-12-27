public class II_BreakExample1 {
  public static void main(String[] args) {
    /*
     * 무한루프
      - 무한루프는 반복문의 반복회수를 정확히 모를 때 주로 사용하며 특정 조건하에서 반복문을 종료시키는 형태로 구성합니다.
      - 자바에서 무한루프는 주로 while을 사용하며 while의 조건식 자리에 true를 쓰면 무한루프가 구성됩니다.
     */
    int i = 0;

    while(true) {
      // 무한실행게 된다. 무한실행시 실행을 멈추고 싶을 때는 ctl + C (MacOS의 vscode에 한함)

      if(i == 15) {
        break; //반복문이 break를 만나면 강제로 종료됨
      }

      System.out.println(i);
      i++;
    }
  }
}