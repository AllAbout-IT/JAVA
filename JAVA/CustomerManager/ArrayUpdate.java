import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUpdate {
  public static void main(String[] args) {
    String[] names = {"kim", "lee", "park"};
    System.out.println(Arrays.toString(names));
    // names라는 배열의 주소에 저장되어 있는 값이 각각 "kim", "lee", "park"이 있으며 Arrays.toString()함수를 통해서 출력된다.

    names[1] = "song";
    System.out.println(Arrays.toString(names)); 
    // names[1] 배열의 주소에 "song" 저장 되며 Arrays.toString()함수를 통해 출력된다.

    names[2] = "lim";
    System.out.println(Arrays.toString(names)); 
    // names[2] 배열의 주소에 "song" 저장 되며 Arrays.toString()함수를 통해 출력된다.


    
  }
}
