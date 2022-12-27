public class IV_ForExample2 {
  public static void main(String[] args) {
    // 7~100까지의 정수중 7의 배수를 모두 가로로 출력

    for(int i = 7; i <= 100; i += 7){
      // System.out.print(i + " ");\
      System.out.printf("%d ", i);
      }
        
    System.out.println("\n-----------------------");

    // 1~100까지의 정수중 6의 배수를 모두 가로로 출력
    // 위의 i는 같은 블록의 for문이 마치면 사라진다. 따라서 새롭게 i를 선언할수 있다. 하지만 for문 밖에서 i를 선언한다면 밑의 for문에서도 사용할수 없을것이다.

    for(int i = 1; i <= 100; i++){
      if((i % 6) == 0) {
        // System.out.print(i + " ");\
        System.out.printf("%d ", i);
      } 
    }
    System.out.println("\n-----------------------");
    
    // 1~100까지의 정수 중 8의 배수이면서 동시에 16의 배수가 아닌 수를 모두 가로로 출력
    for(int i = 1; i <=100; i++) {
      if ( i % 8 == 0 && i % 16 != 0 ){
        System.out.print(i + " ");
      }
    }
    System.out.println("\n-----------------------");
    //1~850까지의 정수 중 9의 배수의 개수를 출력하세요.  
    int count = 0;
    for(int i = 1; i <= 850; i++){
      if(i % 9 == 0) {
        count++;
      }
    }
    System.out.println("9의 배수의 개수: " + count + "개");
  }

}