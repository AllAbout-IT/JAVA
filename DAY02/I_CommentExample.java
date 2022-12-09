/**
 * 이 주석은 API문서 생성용 주석입니다.
 * 개발자가 만든 코드를 api화 시킬때 
 * 코드의 라이센스 정보 및 설명을 첨언하는 용도의 주석입니다.
 * 
 * @author Mr.KIM
 * @version 1.0.0
 * @since 2022.12.09~
 */

public class I_CommentExample {
  /*
  main함수(메서드)는 프로그램을 실행하기 위해 반드시 작성해야 하는 함수(메서드)입니다.

  main함수 블록({})안에 들어있는 코드의 명령들을 실행합니다.

  main함수를 쉽게 작성하시려면 이클립스 코드작성부에 'main'이라고 입력하고 ctrl + space를 누르면 자동 완성 기능으로 작성할 수 있습니다. 
   */

  public static void main(String[] args) {
    // 한줄 주석 '//'의 단축키는 commad + / 이다(macox용 vscode에 한함)
    // 코드 실행 단축키 option + command + J(사용자지정)
    // 'Run Code'가 아니라 'Run Java'로 할것'
    System.out.print("안녕~~!\n");
    System.out.print("잘가~~!\n");

    /*
     * printIn()print()와 달리 출력 이후에 자동으로 줄 개행을 합니다.(\n을 자동포함)
     */

    System.out.print("메롱~~!");
    System.out.print("빠이~~!");

    // 'sysout'후 첫번째 자동완성을 클릭하면 'System.out.printIn()'이 완성(vscode에 한함)
    System.out.println("방가방가~~!!");

    System.out.printf("%d + %d = %d\n", 10, 3, 13);

  }

  /*
   세미콜론(;), 블록(Block), 공백(Whitesoace)
   2.1. 주석문과 식별자

   ;(세미콜론), {}(블록), 그리고 공백들은 코드의 가족성을 높여줌
    • 논리적인 한 문장이 끝날 때 반드시 세미콜론(;)을 붙여 줌
    • 블록은 중괄호(curly brace), 즉 "{"와 "}"로 붂여진 부분을 말하여, 복합문을 구성하는 요소
    • 종속된 문장이 다수 개 일 때 "{"로 시작하고 "}" 닫아줌

    • 공백(Whitespace)은 빈칸, 탭, 빈 줄 등이 있으며, 이러한 공백은 소스 코드를 보기 좋게 하고 알아보기 쉽게 하는데 사용됨.
   */
}
