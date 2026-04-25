package tisjava.variables;

/*
문제 3. 변수 선언과 출력
다음 조건에 맞게 변수를 선언하고 출력하세요.
- name: "김자바"
- age: 20
- height: 168.5
- isStudent: true

출력 예시:
이름: 김자바
나이: 20
키: 168.5
학생 여부: true
*/

public class Q01_DeclareVariables {
    public static void main(String[] args) {
        String name = "김자바";
        int age = 20;
        double height = 168.5;
        boolean isStudent = true;

        System.out.printf("이름: %s\n", name);
        System.out.printf("나이: %d\n", age);
        System.out.printf("키: %.1f\n", height);
        System.out.printf("학생 여부: %b\n", isStudent);
    }
}
