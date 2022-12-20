public class StringMainpulate {
  public static void main(String[] args) {
    
    String str = "INSERT";
    //문자열을 일괄적으로 소문자로 변화하는 메서드느 toLowerCase()
    str = str.toLowerCase(); //toUpperCas() 소문자를 대문자로 바꿀때 사용하는 함수
    System.out.println(str);
    // toLowerCase를 통해 str의 INSERT는 소문자 insert로 변경되었다.

    // 문자열에서 특정 문자 하나만 가져오는 메서드는
    // charAt(문자열 인덱스번호)입니다.

    
    char c = str.charAt(0);
    System.out.println(c);
    // char의 값을 리턴함.

    /*
     * Returns the char value at the specified index. An index ranges from 0 to length() - 1. The first char value of the sequence is at index 0, the next at index 1, and so on, as for array indexing.

    If the char value specified by the index is a surrogate, the surrogate value is returned.
     */
    
  }
}