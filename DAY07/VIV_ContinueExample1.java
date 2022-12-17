public class VIV_ContinueExample1 {
  public static void main(String[] args) {
    /*
    2.continue
        - continue문은 반복문 내의 어떤 곳이든지 위치할 수 있습니다.
        - continue문을 만나면 반복문의 맨 처음으로 제어가 이동하여 다음 반복문을 위한 증/감식을 실행합니다. 
        - continue문을 만날 때마다 이후 실행문은 건너뛰어 실행되지 않습니다. */
    
    for(int i=0; i<10; i++) {
      if(i == 5) {
        continue;
        // 조건을 만족하면 반복문의 맨 처음으로 돌아가 다음 반복문을 실행한다. 따라서 1 == 5일때 출력은 실행 되지 않는다.
      } 
      System.out.print(i + " ") ;
    }
    System.out.println();    
    System.out.println("=======================");

    for(int i=1; i<=10; i++) {
      if(i % 2 == 0) continue;
      // i가 2로 나누어서 나머지가 0이되면(짝수) 반복문의 처음으로 돌아가서 다음 반복문을 실행한다.
      System.out.print(i + " ");
    }
  }
}