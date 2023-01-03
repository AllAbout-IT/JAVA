package JAVA.DAY10;

//설계용 클래스(라이브러리 클래스)는 메인메서드를 작성하지 않습니다.
public class Pen {

  // 객체의 속성을 나타내느 것을 필드(멤버 변수)라고 부릅니다.
  String color;
  int price;

  //객체의 기능을 나타내는 것을 메서드(멤버 함수)라고 부릅니다.

  void write() {
    // void는 반환 할 값이 없을 때 사용.
    System.out.println(color + "색 글을 씁니다.");
  }

  void info() {
    System.out.println("-------Pen's info-------");
    System.out.println("색상: " + color);
    System.out.println("가격: " + price);
    
  }
}
