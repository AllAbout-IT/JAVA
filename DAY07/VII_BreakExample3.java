public class VII_BreakExample3 {
  public static void main(String[] args) {

    for(int i=0; i<3; i++) {
      for(int j=0; j<2; j++) {
        System.out.println(i + " " + j);
      }// end inner for
    }// end outter for

    System.out.println("========================");

    for(int i=0; i<3; i++) {
      for(int j=0; j<2; j++) {
        if(i==j) break;
        // i=0 j=0일 break 되므로 i=0 j=1인 경우의 수는 출력되지 않는다.
        // i=1 j=0일 때 출력 되지 않는다.
        // 2중 for문에서 inner for문에 break가 걸릴 경우 outter for문까지 break가 걸리진 않는다.
        System.out.println(i + " " + j);
      }// end inner for
      
    }// end outter for
    
  }
}