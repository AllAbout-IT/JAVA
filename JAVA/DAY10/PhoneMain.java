package JAVA.DAY10;

public class PhoneMain {
  public static void main(String[] args) {

    // 생성자는 객체를 생성할 때 1회 호출할 수 있습니다. 
    Phone basic = new Phone(); // ()안에 아무 값도 넣지 않으면 Phone()에 넣었던 설정(기본설정)만 나오게 된다.
    basic.info();

    // Phone bluePhone = new Phone();
    // bluePhone.color = "사파이어";
    // bluePhone.info();

    Phone bluePhone = new Phone("사파이어");
    bluePhone.info();

    Phone galaxyS9 = new Phone("코발트 블랙", "갤럭시S9");
    galaxyS9.info();

    Phone shaomi = new Phone("짱깨", "오랑캐",0);
    shaomi.info();


     
  }
}
