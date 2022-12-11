public class III_RandomExample {
  public static void main(String[] args) {
    //난수(랜덤값)을 발생시키는 메서드 random()
    //0.0이상 1.0미만의 랜덤 실수값을 가져옴.

    Math.random();
    /*
     Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0. Returned values are chosen pseudorandomly with (approximately) uniform distribution from that range.

    When this method is first called, it creates a single new pseudorandom-number generator, exactly as if by the expression

    new java.util.Random()

    This new pseudorandom-number generator is used thereafter for all calls to this method and is used nowhere else.

    This method is properly synchronized to allow correct use by more than one thread. However, if many threads need to generate pseudorandom numbers at a great rate, it may reduce contention for each thread to have its own pseudorandom-number generator.

    Returns:

    a pseudorandom double greater than or equal to 0.0 and less than 1.0.
    See Also:

    nextDown(double)

    Random.nextDouble()

    API Note:

    As the largest double value less than 1.0 is Math.nextDown(1.0), a value x in the closed range [x1,x2] where x1<=x2 may be defined by the statements

    double f = Math.random()/Math.nextDown(1.0);
    double x = x1*(1.0 - f) + x2*f;
     */

    double r = Math.random();
    System.out.println("랜덤값: " + r);

    // 정수 난수 생성하기
    // int rn = (int)r * 10;
    // 0.0 ~ 1.0까지의 난수가 발생하는 r이 int로 강제형변환을 하게 되면 1을 제외한 나머지 소수들이 소수점 이하의 수를 삭제 당하며 결과값은 계속 0으로 나오게 된다. * 10을 한다고 해도 계속 0으로 나올것이다. 따라서 난수가 1 ~ 10까지의 수를 발생시키게 하려면 r * 10을 괄호로 묶어 먼저 계산 되어 질수 있도록 한다.
    int rn = (int)(r * 10);
    System.out.println("정수 난수값: " + rn);
    System.out.println("------------------------------------- ");

    System.out.println("***신년 여행지 선정!");
    if(r > 0.66) {
      System.out.println("모로코로 갑시다!!!");
    }else if(r > 0.33) {
      System.out.println("상하이로 갑시다!!!");
    }else {
      System.out.println("집에서 놉시다!!!");
    }

  }
}
