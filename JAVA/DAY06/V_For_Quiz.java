public class V_For_Quiz {
  public static void main(String[] args) {
    // 랜덤 구구단 만들기
    // 실행될 때 마다 임의의 수의 구구단이 생성되게 함.

    int dan = (int)(Math.random() * 10);

    if(dan < 10 && dan > 0) {
      System.out.println("랜덤구구단" + dan + "단");
      System.out.println("---------------------");
      for(int hang = 1; hang < 10; hang++) {
        System.out.println(dan + " x " + hang + " = " + (dan*hang));
      }
    }



  }
}