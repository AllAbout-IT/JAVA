public class I_IfExample1 {
  public static void main(String[] args) {
    /*
     제어문
      - 제어문의 종류는 조건문, 반복문, 탈출문이 있습니다.
      - 조건문은 특정 조건을 만족할 때 실행할 문장을 작성하는데 사용합니다.
      - 반복문은 여러 번 반복 실행할 코드가 있다면 반복문을 작성합니다.
      - 반복문이 실행되는 동안 실행을 중지시키고 싶으면 탈출문을 사용합니다.    

      조건문 if ~ else
      - if문은 프로그램의 흐름을 바꾸는데 사용되는 조건 선택 분기문입니다.
      - if문의 조건식 결과는 반드시 boolean형이어야 되며, 조건식이 참이면 if문 블록안의 실행문이 실행되고, 거짓이면 else문 블록안의 실행문이 실행됩니다.
      - if문장은 else문장 없이 사용할 수 있습니다. 그러나 else문장은 if문장 없이 단독으로 사용할 수 없습니다.
      - 조건식의 결과가 거짓일 때 실행할 문장이 없다면, else문 이하를 생략해도 됩니다.
     */

     // 0~100까지의 정수형 난수를 발생
     int point = (int)(Math.random() * 101);
     System.out.println("점수: " + point);

     if(point >= 60) {
      System.out.println("60점 이상입니다.");
      System.out.println("시험에 합격했습니다.");
     } else { // end if 
      System.out.println("60점 미만입니다.");
      System.out.println("시험에 합격했습니다.");
     }
     System.out.println("수고하셨습니다!");

  } //end main

} // end class
