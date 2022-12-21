import java.util.Arrays;
import java.util.Scanner;
/*
 * 요구사항 정의
고객관리 프로그램

고객의 정보는 이름, 성별, 이메일, 출생년도가 있습니다. 고객의 정보를 입력 받아 배열에 저장해야 합니다. 이름은 문자열로 저장하며, 성별은 남자는 M, 여자는 F로 저장합니다. 이메일은 문자열로 저장하며 태어난 출생년도는 정수로 저장합니다. 고객 관리 프로그램은 고객의 정보를 저장, 조회, 수정, 삭제 할 수있는 기능이 있어야 합니다. 고객 정보를 파일에 저장하는 기능을 구현하지 않아도 됩니다.

I를 눌러 고객의 정보를 입력 받도록 하며, 저장된 고객의 정보는 P또는 N을 눌러 이전 고객 정보 또는 다음 고객정보를 조회할 수 있어야 합니다. 조회한 곡개 정보는 U를 눌러 새로운 정보로 수정할 수 있어야 합니다. D를 누루면 조회한 고객 정보를 배열에서 삭제해야 합니다. 프로그램의 종료는 Q를 누릅니다.    
 */
public class CustomerManager {
  // 프로그램 전체에서 사용할 변수들은 클래스 블록 바로 아래에 선언합니다.
  // static이 붙은 블록에서는 static변수와 static메서드만 사용할 수 있음. 

  // 고객의 이름을 문자열로 저장
  static String[] nameList = new String[100];
                      // 100명분의 이름이 저장 가능
  // 성별을 저장
  static char[] genderList = new char[100];
  // 이메일 리스트
  static String[] emailList = new String[100];
  // 출생년도 리스트
  static int[] birthList = new int[100]; 
  
  //현재 고객 데이터가 몇 명 저장되었는지 알기 위한 변수 count 선언
  static int count = 0;

  //배열의 인덱스를 조작하기 위해 인덱스를 변수화 시킴.
  //배열 인덱스는 0번부터 출발하므로 초기값을 0바로 이전값인 -1로 세팅하여 초기에 next를 실행했을때 인덱스가 0이되어 첫번째 고객을 조회하기 위함.
  static int index = -1;
  
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while(true) {
      System.out.println("\n[INFO] 고객 수: " + count + ", 인덱스: " + index);
      // static이 붙은 블록에서는 static변수와 static메서드만 사용할 수 있음. 
      
      System.out.println("메뉴를 입력하세요.");
      System.out.println("(I)nsert, (P)revious, " + "(N)ext, (C)urrent, (U)pdate," + "(D)elete, (Q)uit");
      System.out.print("메뉴입력 ");
      String menu = scan.next(); // 만약 'INDEX'라는 문구가 들어오면
      menu = menu.toLowerCase(); // 이곳에서 'index'와 같이 소문자로 바뀌고
      char m = menu.charAt(0); // 앞철자만 맞아도 'switch'문에 적용 된다.

      
      switch(m) {
      case 'ㅑ':
      case 'i':
        System.out.println("\n고객 정보 입력을 시작합니다.");
        /*
         * 고객 정보를 받을때 4개의 항목을 받아야 하고 입력을 받기 위해서는 4개의 창을 띄어야 하며 각각의 입력값을 저장해야 한다. case의 한 부분에 이 모든것을 적용시키기에는 길고, 복잡해지므로 이때 메서드 함수를 만든다.
         */
        // inderData를 불러온다.
        insertData();
        index++;
        System.out.println("고객정보가 정상적으로 입력되었습니다.");
        //nameList는 내열 내부의 정보를 보는 함수
        System.out.println(Arrays.toString(nameList));
        break;
      case 'ㅔ':
      case 'p':
        index--;
        // 이전 고객의 정보를 보는 것이기 때문에 index에서 '--'후위연산을 적용한다.

        // printData(index); 
        // System.out.println("\n 이전 고객정보를 조회합니다.");
        // break;

        // 위 상황에서 index[0]일때 'p'을 누구게 된다면 index[-1]이 된다. java에서는 배열의 주소값이 음수가 되면 에러를 발생하고 프로그램에서 튕기게 된다. 따라서 위와 같은 상황을 방지 하기 위함 프로그래밍이 필요하다. 
        
        System.out.println("\n 이전 고객정보를 조회합니다.");
        if(index <= 0) {
          System.out.println("이전 고객정보가 존재하지 않습니다.");
        }else {
          index--;
          printData(index);
        } 
        break;

        // 배열의 주소값이 0이거나 작을 경유에 pritData()를 호출하지 않고 안내문 후에 case문을 탈출한다.

      case 'ㅜ':
      case 'n':
        index++;
        // 다음 고객의 정보를 보는 것이기 대문에 index에서 '++'후위연산을 적용한다.

        // printData(index);
        // System.out.println("\n다음 고객정보를 조회합니다.");
        // break;

        // 위 상황에서 고객에 정보가 없는 주소에서는 모든 정보값이 'null'로 표기 되기 때문에 사용자 입장에서는 프로그램에 문제가 생겼다고 판단할수 있다. 따라서 정보가 없는 주소값에 접근 할수 없도록 프로그래밍이 필요하다.

        System.out.println("\n다음 고객정보를 조회합니다.");
        if(index > count) {
          System.out.println("다음 고객정보가 존재하지 않습니다.");
        } else {
          index++;
          printData(index);
        }
        break;
        // 검색하려는 배열의 주소값(index)이 새로운 정보가 입력된 배열 주소값(count)과 같거나 크면 printData()메서드를 가지 않고 if문을 빠져와서 case문을 안내출력문구와 함께 case문을 탈출한다.

      case 'ㅊ':
      case 'c':
        // System.out.println("\n현재 고객 정보를 조회합니다.");
        // break;

        // 위의 프로그래밍은 프로그램을 처음 구동하여 저장된 정보가 아무것도 없을때 실행이 되면 열람하려는 배열의 주소값이 '-1'이 되면서 에러가 나고 프로그램에서 튕기게 된다. 따라서 이러한 에러 방지를 위한 프로그래밍이 필요하다.

        System.out.println("\n현재 고객정보를 조회합니다.");
        if(index >= 0 && index < count) {
          printData(index);
        } else {
          System.out.println("현재 고객정보가 존재하지 않습니다.");
        }
        break;
        // 검색하려는 배열의 주소가 0과 같거나 크고(배열의 주소가 음수'-1'이 아니어야 한다.) 검색하려는 배열의 주소값(index)이 저장된 배열의 주소값(count)보다 작아야 된다는 조건이 모두 만족(&&, and) 했을 때만 printData()메서드가 실행된다.
      
      case 'ㅕ':
      case 'u':
        // System.out.println("\n현재 고객정보를 수정합니다.");
        // updateData(index);
        // break;
        // 위 case도 'c'case와 같은 오류가 의심이 되므로 같은 조건으로 if문을 구성

        System.out.println("\n현재 고객정보를 수정 합니다.");
        if(index  >= 0 && index < count) {
          printData(index);
        } else {
          System.out.println("현재 고객정보가 존재하지 않습니다.");
        }
        break;

      case 'ㅇ':
      case 'd':
        System.out.println("\n현재 고객정보를 삭제합니다.");
        break;
      case 'ㅂ':
      case 'q':
        System.out.println("\n프로그램을 종료합니다. ");
        scan.close(); 
        System.exit(0); //프로그램을 강제종료하는 구문
        break;
      default:
          System.out.println("메뉴를 잘못 입력했습니다.");
      }// end switch
    }// end while
  }// end main 
   // 메서드는 메서드 안에서 만들수 없으므로 'main'밖 'class'안에 만들도록 한다.

   // 고객정보를 입력 받는 메서드 선언
   public static void insertData() {
    System.out.println("=========고객 정보 입력=========");
    System.out.print("이름: ");
    String name = scan.next();

    System.out.print("성별(M/F): ");
    String s = scan.next();
    char gender = s.charAt(0);

    System.out.print("이메일: ");
    String email = scan.next();

    System.out.print("출생년도: ");
    int birth = scan.nextInt();
    System.out.println("==================================");

    // nameList[0] = name;
    // genderList[0] = gender;
    // emailList[0] = email;
    // birthList[0] = birth;
    // 입력할 배열의 주소를 절대값([0])으로 정하면 다음 기록때도 같은 주소값에 저장될수 없다.

    nameList[count] = name;
    genderList[count] = gender;
    emailList[count] = email;
    birthList[count] = birth;
    // 따라서, 주소값을 변수카운터에 대입해 순서대로 정보가 입력할수 있게 한다.

    count++;

   } // insertData End

   // 고객 정보를 인덱스에 맞게 출력하는 메서드 선언
   public static void printData(int index) {
    System.out.println("\n======고객 정보======");
    System.out.println("이름: " + nameList[index]);
    System.out.println("성별: " + genderList[index]);
    System.out.println("이메일: " + emailList[index]);
    System.out.println("출생연도: " + birthList[index]);
    System.out.println("============================");
    } //printData() end

    // 고객 정보를 수정하는 메서드 선언
    public static void updateData(int index) {
      System.out.println("\n========고객정보수정========");

      //새로운 정보들을 입력받아 각각의 배열의 수정 위치 인덱스에 있는 데이터를 변경시킨다. 수정시에는 수정전의 정보들이 출력되도록 하세요.
      // ex> 이름(홍길동): ______

      System.out.printf("이름(%s) ", nameList[index]);
      // 타겟이 된 배열주소에 저장된 값이 수정되기전에 '%s'에 출력된다
      // 문자열이기 때문에 '%s(string)'로 매치한다.
      // String name = scan.next();
      // // name에 새로운 값을 받는다.
      // nameList[index] = name;
      // // 새로운 값은 타겟이 된 배열주소에 수정되어진다.
  

      // 위의 두문장은 다음으로도 요약될수도 있다.
      nameList[index] = scan.next();

      System.out.printf("성별(%s) ", genderList[index]);
      genderList[index] = scan.next().charAt(0);
      // 성별 수정. 배열로 입력시 첫글자만 입력받음(charAt))
      // 문자열이기 때문에 '%s(string)'로 매치한다.
      
      System.out.printf("이메일(%s) ", emailList[index]);
      emailList[index] = scan.next();
      // 이메일 수정
      // 문자열이기 때문에 '%s(string)'로 매치한다.
      
      System.out.printf("출생년도(%d) ", birthList[index]);
      birthList[index] = scan.nextInt();
      // 출생년도 수정
      // 양수로 받으므로 '%d(decimal)'로 대응하고 nextInt()함수를 사용한다.
    }
   
}// end class
