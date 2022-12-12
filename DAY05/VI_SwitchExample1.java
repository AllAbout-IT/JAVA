import java.util.Scanner; 

public class VI_SwitchExample1 {
  public static void main(String[] args) {
    /*
     조건문 switch ~ case
      - 복합 if문은 구현하기 복잡하고 프로그램의 효율성이 감소되는 단점이 있기 때문에, 다중 분기 문제를 해결할 때는 switch문을 사용합니다.
      - switch문은 다중 분기 구조이므로 복합 if문의 논리적인 구조를 간결하게 표현할 수 있습니다. 
      - if문과는 달리 조건식이 사용되지 않고, 값을 가지는 변수 또는 표현식이 판단조건으로 사용되며, 연산 결과의 데이터 타입은 int, String, Enum(열거형)이 사용됩니다.
      - case문 뒤에 사용되는 값은 변수를 사용할 수 없고, 반드시 상수를 사용해야 합니다. 
      - swith ~ case문에서 default는 if~else에서 else와 
      비슷한 효과를 가집니다. 
     */
    /*
     Switch ~ case ~ default
     Switch(변수(char, int, String, enun)) {
      case 변수값(상수):
        해당 case의 실행코드;
      case 변수값(상수):
        해당 case의 실행코드;
      default:
     }
     */

     Scanner scan = new Scanner(System.in);

     System.out.print("점수: ");
     int point = scan.nextInt();

     /*
      switch키워드 뒤에 나오는 변수나 연산식은 결과값이 반드시 문자나 정수타입이어야 합니다.
      */

      // 100만점 기준의 임의의 점수를 10으로 나누고 int형으로 표기하여 소수점을 버리고 십의 자리수가 한자리수로 나오게 한다.
      switch(point / 10) {
        //case뒤에는 반드시 상수를 적어야 합니다.
        case 9:
          if(point > 10 ) {
            System.out.println("점수를 잘못 입력했습니다.");
          } else {
            System.out.println("당신의 학점은 A입니다.");
            break; // switch블록을 나가라.
          }
        case 8:
          System.out.println("당신의 학점은 B입니다.");
          break; // switch블록을 나가라.
        case 7:
          System.out.println("당신의 학점은 C입니다.");
          break; // switch블록을 나가라.
        case 6:
          System.out.println("당신의 학점은 D입니다.");
          break; // switch블록을 나가라.
        default:
          System.out.println("당신의 학점은 F입니다.");
          break; // switch블록을 나가라.
      }
      scan.close();
  }
}