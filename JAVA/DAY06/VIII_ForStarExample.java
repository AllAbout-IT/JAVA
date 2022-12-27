import java.util.Scanner;

public class VIII_ForStarExample {
  public static void main(String[] args) {
    /*
     
    *
    **
    ***
    ****
    *****
    
    반복문을 사용하여 위의 모양을 만들어라.
     */
    Scanner sc = new Scanner(System.in);
    System.out.println("임의의 정수를 입력하새요");
    System.out.print("> ");
    int floor = sc.nextInt();

    for(int i = 0; i < floor; i++) {
      for (int j = 0; j < i+1; j++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }

    System.out.println("-------------------------");
    /*
    *****
    ****
    ***
    **
    *
    
    반복문을 사용하여 위의 모양을 만들어라.
    */
    for(int i = floor; i > 0; i--) {
      for (int j = 1; j <= i; j++ ) {
        System.out.print("*");
      }
      System.out.println(" ");
    }

    System.out.println("-------------------------");

    /*
        *
       **
      ***
     ****
    *****
    
    반복문을 사용하여 위의 모양을 만들어라.
    */

    // f(floor)   f1  f1
    //    0       4   1
    //    1       3   2
    //    2       2   3
    //    3       1   4
    //    4       0   5
    //    0       9   1
    //          (4-i) (i+1)        
    for(int i = 1; i <= floor; i++) {
      for(int j = 1; j <= floor-i; j++) {
        System.out.print(" ");
      } // end f1
      for(int j = 1; j <= i; j++ ) {
        System.out.print("*");
      } // end f2
      System.out.println();
    }
    System.out.println("-------------------------");


    /*
    *****
     ****
      ***
       **
        *  
       
    반복문을 사용하여 위의 모양을 만들어라.
    */

    //  i   f1  f2
    //  0   0   5
    //  1   1   4
    //  2   2   3
    //  3   3   2
    //  4   4   1
    //  i   i   (floor-i)

    for(int i = 0; i < floor; i++) {
      for(int j = 0; j < i ; j++) {
        System.out.print(" ");
      } // end f1
      for(int j = 0 ; j < floor-i; j++ ) {
        System.out.print("*");
      } // end f2
      System.out.println();
    }

    System.out.println("-------------------------");
    
    /*
         *
        ***
       *****
      *******
     *********
     */
    //  i       f1         f2
    //  0       4          1
    //  1       3          3
    //  2       2          5
    //  3       1          7
    //  4       0          9
    //     floor-i-1        i*2+1
    for(int i = 0; i < floor; i++) {
      for(int j = 0; j < floor-i-1; j++) {
        System.out.print(" ");
      } // end f1
      for(int j = 0 ; j < i*2+1; j++ ) {
        System.out.print("*");
      } // end f2
      System.out.println();
    }
    /*
     *********
      *******
       *****
        ***
         *
      i     f1      f2
      0     0       9
      1     1       7
      2     2       5
      3     3       3
      4     4       1
                  2*(floor-i)-1
     */
    for(int i = 0; i < floor; i++) {
      for(int j = 0; j < i; j++) {
        System.out.print(" ");
      } // end f1
      for(int j = 0 ; j <2*(floor-i)-1; j++ ) {
        System.out.print("*");
      } // end f2
      System.out.println();
    }
  }
}