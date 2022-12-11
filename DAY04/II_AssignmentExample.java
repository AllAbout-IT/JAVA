public class II_AssignmentExample {
  public static void main(String[] args) {
    /*
     4.5 대입연산자
      - 대입 연산자의 기본 기호는 '='이고, 보다 발전된 대입 연산자는 x operand=a의 형태를 가지고 있으며 이는 x = x operand a와 같은 역활을 합니다.
      - 대입 연산자에는 =, =+, -=, *=, /=, %=, <<=, >>=, >>>=, &=, ^=, |= 등이 있습니다.
     */

     int a = 5, b = 5;

     a += 3; // a = a + 3
     b =+ 3; // b = +3
     System.out.println("a: " + a);
     System.out.println("b: " + b);

     System.out.println("--------------------------------------");

     a -= 4; // a = a - 4 result a = 4
     System.out.println("a: " + a);

     a *= 6; // a = a * 6 result a = 24 
     System.out.println("a: " + a);

     a /= 5; // a = a / 5 result a = 4   
     System.out.println("a: " + a);

     a %= 3; // a = a % 3 result  a = 1
     System.out.println("a: " + a);
  }
  

}
