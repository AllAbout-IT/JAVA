import java.util.Arrays;
/*
 * 배열 다루기 - 데이터 삭제
 * 
 * 3.2 배열
 * 배열에서 데이터를 삭제할 때는 삭제하려는 데이터의 바로 뒤 데이터부터 앞으로 한 칸씩 앞으로 복사해 주고 count 값을 감소시킵니다.
 * 
 * 다음 그림에서 보는 것처럼 index=2의 데이터 5를 삭제해야 한다면 인텍스는 2부터 5까지 intArr[i]에 intArr[i+4]의 데이터를 복사해야 합니다. 그리고 배열의 크기는 10개일지라도 실제 데이터는 7개에서 하나 줄어든 6개 여야 하므로 count값을 1 감소히켜야 합니다.
 */
public class ArrayDelete {
  public static void main(String[] args) {
    int[] iArr = {1, 3, 5, 7, 9, 11, 13};
    System.out.println(Arrays.toString(iArr));
                    // 삭제 전 배열을 출력
    /* 
    for ( int i=?; i <??; i++) {  
      iArr[i] = iArr[i+1];
    }
    */                    

    for ( int i=5; i < iArr.length - 1; i++) {  
      // 우리가 삭제 하고 싶은 것은 iArr[1]의 값 '3'이기 때문에 'int i=?'의 '?'에 1을 대입.(지우고 싶은 번호의 배열 주소값를 대입)

      // 우리는 iArr[0]을 제외한 나머지 배열을 삭제 할 예정이므로 'i < ??'의 '??'에 'iArr.length(배열의 총길이(개수)) - 1'한다

      iArr[i] = iArr[i+1];
      // iArr[i]의 값에 + iArr[i+1]의 값이 저장되고 i++(1씩 증가)되며 iArr[0]을 제외한 배열의 길이 만큼(i < iArr.length - 1)반복되므로 i로 지정된 값이 옆 주소값으로 대체되며 배열된다.
    }

    /* 
    iArr[1] = iArr[2];                
    iArr[2] = iArr[3];
    iArr[3] = iArr[4];
    iArr[4] = iArr[5];
    iArr[5] = iArr[6];
    */
    System.out.println(Arrays.toString(iArr));
                    // 삭제 후 배열을 출력
    String[] nameList = new String[100];
    nameList[0] = "홍길동";
    nameList[1] = "신사임당";
    nameList[2] = "이순신";
    nameList[3] = "강감찬";
    System.out.println(Arrays.toString(nameList));
    int count = 4;
    // 변수 'count'가 저장된 값의 수를 나타낸다고 하자.

    // for(int i=1; i < nameList.length - 1; i++) {
    for(int i=1; i < count - 1; i++) {
    // for구문 반복의 수를 (배열의 전체 주소값 갯수의 - 1)이 아니라 (저장된 값의 수 - 1)로 변경한다면 출력되는 같지만 불필요한 연산을 막을 수 있다. 
      nameList[i] = nameList[i+1];
    }
    System.out.println(Arrays.toString(nameList));
  }
}
