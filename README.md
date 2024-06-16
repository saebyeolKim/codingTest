# 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비
빌드하는 법
- ./gradlew build  
- java -jar ./build/libs/codingTest-1.0-SNAPSHOT.jar
- 기본 solution format

public String solution(String str) {
  String answer = "";
  return answer;
}

public static void main(String[] args) {
  Solution7 s = new Solution7();
  Scanner in = new Scanner(System.in);
  String input = in.next();
  System.out.println(s.solution(input));
}