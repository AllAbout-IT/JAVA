public class VIII_SwitchQuiz {
  public static void main(String[] args) {
    String[] greads = {"사원", "대리", "과장", "차장", "부장"};

    System.out.println("직급을 입력하세요.");
    System.out.println("[사원, 대리, 과장, 차장, 부장");
    System.out.print(">");
    int idx = (int)(Math.random() * 5);
    
    switch(greads[idx]) {
      case "사원":
        System.out.println(greads[idx] + "의 급여는 200만원입니다.");
        break;
      case "대리":
        System.out.println(greads[idx] + "의 급여는 250만원입니다.");
        break;
      case "과장":
        System.out.println(greads[idx] + "의 급여는 300만원입니다.");
        break;
      case "차장":
        System.out.println(greads[idx] + "의 급여는 350만원입니다.");
        break;
      case "부장":
        System.out.println(greads[idx] + "의 급여는 400만원입니다.");
      default:
        System.out.println(greads[idx] + "는 없는 직급입니다.");

    }
  }
}