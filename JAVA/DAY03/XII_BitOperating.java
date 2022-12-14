public class XII_BitOperating {
  public static void main(String[] args) {
    /*
   3. 비트 연산자 (&, |, ^)
    - 비트 연산자는 두 수를 각각 2진수로 변환하여 두 수의 각 비트연산을 수행합니다.

      a.  &(비트곱): 두 비트가 1일 때 1, 나머지는 0.
      b.  |(비트합): 두 비트 중 하나 이상이 1이면 1, 두비트 모두 0이면 0.
      c.  ^(xor 배타적 논리합): 두 비트가 다르면 1, 같으면 0.
   */

  byte a = 5; // 0000 0101
  byte b = 3; // 0000 0011

  //비트곱(and)
  System.out.println(a & b); // 0000 0001
  /*
  &(비트곱): 두 비트가 1일 때 1, 나머지는 0.

   0000 0101
   0000 0011
   ---------
   0000 0001

   따라서, 결과 값은 1
   */

  //비트합(or)
  System.out.println(a | b); // 0000 0111
  /*
  |(비트합): 두 비트 중 하나 이상이 1이면 1, 두비트 모두 0이면 0.

   0000 0101
   0000 0011
   ---------
   0000 0111
   
   따라서, 결과 값은 7
   */

   // 배타적 논리합(xor)
   System.out.println(a ^ b); // 0000 0110
   /*
    ^(xor 배타적 논리합): 두 비트가 다르면 1, 같으면 0
    0000 0101
    0000 0011
    ---------
    0000 0110

    따라서 결과 값은 6
    */
    
    /*
     4. 비트 이동 연산자 (<<, >>)
      - 왼쪽 항의 값을 2진수로 변환하여 오른쪽 항의 값만큼 비트를 왼쪽(<<), 오른쪽(>>)으로 이동시키는 연산을 수행한다.

      ex> int a = 192;
      00000000 00000000 00000000 11000000

      a << 3
      00000000 00000000 00000110 00000000 //1536
     */

     // 비트 이동 연산자 (<<, >>)
     int i = 192;
     System.out.println(i << 3);
     System.out.println(i >> 2);
     /*
      int i = 192;
      00000000 00000000 00000000 11000000

      i >> 2
      00000000 00000000 00000000 00110000
      48 
      */
   
  }
}
