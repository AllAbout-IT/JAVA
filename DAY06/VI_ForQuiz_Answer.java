import java.util.Scanner;

public class VI_ForQuiz_Answer {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("단수: ");
    int dan = sc.nextInt();

    System.out.println("구구단" + dan + "단");
    System.out.println("-----------------------");
    for(int hang = 1; hang < 10; hang++) {
      System.out.println(dan + " x " + hang + " = " + (dan*hang));
    }
  }
}