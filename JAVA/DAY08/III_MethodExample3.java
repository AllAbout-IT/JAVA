import java.util.Scanner;

public class III_MethodExample3 {
  /*
   * 반환 유형(return type)
   * 1. 반환값은 메서드를 호출한 곳으로 메서드의 최종 실행 결과를 전달하는 값입니다.
   * 2. 매개변수는 여러 개 존재할 수 있지만 반환값은 오직 하나여야 합니다.
   * 3. return이라는 키워드를 사용하여 return뒤에 전달할 겂을 지정합니다.
   * 4. 전달할 값의 데이터 타입을 반환유형이라고 하며 메서드를 선언할 때 메서드이름 앞에 반환유형을 명시해야 합니다. 
   * 5. 반환값이 있는 메서드는 호출문이 하나의 값이 되기 떄문에 반환된 값을 다른 변수에 대입할 수도 있고, 다른 메서드의 매개값으로 사용할 수도 있습니다. 
   * 6. 모든 메서드가 반환값이 필요한 것은 아닙니다. 메서드 실행 이후에 반환할 값이 없다면 return을 사용하지 않아도 됩니다.
   * 7. 이 때는 반환유형을 선언시에 비워두면 안되고 반드시 void를 적어줘여 합니다.
   * 8. 모든 메서드는 return 키워드를 만나면 강제로 종료됩니다. 따라서 return문 이하에 코드를 작성할 수 없습니다. 
   */

  public static int add(int n1, int n2) {
    return n1 + n2;
    // 호출문이 하나의 값이 된다. 
    // return n1 - n2;
    // return n1 + n2, n1 -n2;
    // 와 같이 여러값을 반환하는 식은 오류가 난다. 반환값은 오직 하나여야 하기 때문이다.
  }

  // 하나의 호출문에 여러개의 값을 반환하고 싶다면
  public static int[] totalOperate(int n1, int n2) {
    int[] total = {n1+n2, n1-n2, n1*n2, n1/n2};
    //             tot[0],tot[1],tot[2],tot[3]
    // return 값이 int[]일 때는 호출문의 형식에도 동일하게 해준다.
    return total;
  }

  // 반환되는 값이 없을 때는.
  public static void callMyName(String name) {
    // 선언시에 반드시 'void'라고 써주어야 한다.
    System.out.println("내 이름은" + name + "입니다!!"); 
  }

  public static void callMyName2(String name) {
    if(name.length() < 2) {
      System.out.println("이름은 2글자 이상으로 입력하세요");
      return; //함수를 강제 종료시켜라!!!
    }
    System.out.println("내 이름은" + name + "입니다!!"); 
  }

  public static void main(String[] args) {
    int r = add(3, 5);
    // add의 n1, n2이 위의 add호출문의 대입이 되어 'n1 + n2'의 값이 return되어 진다.
    //      add라는 호출문이 변수의 값이 된다.
    System.out.println(r);

    System.out.println("-------------------------");

    int r2 = add(add(4, 6), add(8, 7));
    //           ────────────────  ────────────────   
    //   연산순서         1                   2
    //           ──────────────────────────────────
    //                           3 
    System.out.println(r2);

    System.out.println("-------------------------");

    int[] tot= totalOperate(30, 5);
    // 호출문이 배열로 되어 있을 때는 출력시에 변수명에 주소를 같이 붙여 해당 연산이 진행 할수 있게 한다.
    System.out.println("30 + 5 = " + tot[0]);
    System.out.println("30 - 5 = " + tot[1]);
    System.out.println("30 * 5 = " + tot[2]);
    System.out.println("30 / 5 = " + tot[3]);

    System.out.println("-------------------------");

    // 반환값이 없믐 메서드는 반드시 단독호출해야 합니다.
    // 변수에 저장하거나 다른 매서드의 매개
    callMyName("김철수");
    callMyName("박영희");

    System.out.println("-------------------------");
    Scanner sc = new Scanner(System.in);
    System.out.println("이름을 입력하세요: ");
    String name = sc.nextLine();
    callMyName2(name);

    sc.close();
  }
}