public class III_Calmain {
  public static void main(String[] args) {
    // 1번 계산기 생성.
    II_Calculator c1 = new II_Calculator();

    // 2번 계산기 생성.
    II_Calculator c2 = new II_Calculator(); 

    // 3번 계산기 생성.
    II_Calculator c3 = new II_Calculator(); 

    c1.add(14);
    c1.sub(7);
    c1.mul(6);
    c2.add(9);
    c2.add(15);
    c2.sub(10);
    c3.sub(15);

    System.out.println("1번 계산기 결과값: " + c1.result);
    System.out.println("2번 계산기 결과값: " + c2.result);
    System.out.println("3번 계산기 결과값: " + c3.result);

    // 계산기에 기능이 되는 메소드 부분을 객체지향방식으로 분리한 결과 계산기의 main 코드에서 불필요한 반복과 복잡한 코드가 사라지게 되었다.
  }
}
