import java.util.Arrays;
import java.util.Scanner;

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
        System.out.println("고객정보가 정상적으로 입력되었습니다.");
        //nameList는 내열 내부의 정보를 보는 함수
        System.out.println(Arrays.toString(nameList));
        break;
      case 'ㅔ':
      case 'p':
        index--;
        // 이전 고객의 정보를 보는 것이기 때문에 index에서 '--'후위연산을 적용한다.
        printData(index); 
        System.out.println("\n 이전 고객정보를 조회합니다.");
        break;
      case 'ㅜ':
      case 'n':
        index++;
        // 다음 고객의 정보를 보는 것이기 대문에 index에서 '++'후위연산을 적용한다.
        printfData(index);
        System.out.println("\n다음 고객정보를 조회합니다.");
        break;
      case 'ㅊ':
      case 'c':
        System.out.println("\n현재 고객 정보를 조회합니다.");
        break;
      case 'ㅕ':
      case 'u':
        System.out.println("\n현재 고객정보를 수정합니다.");
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
    System.out.println("이메일: " + emailList[index]);
    System.out.println("출생연도: " + birthList[index]);
    System.out.println("============================");
   }

   
}// end class
