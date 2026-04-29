package tisjava.oop.p01;

class StudentTodo {
    // TODO 1: name 필드 선언 (String)
    String name;
    // TODO 2: studentNo 필드 선언 (String)
    String studentNo;
    // TODO 3: grade 필드 선언 (int)
    int grade;

    // TODO 4: printInfo() 메소드 작성
    // 이름, 학번, 학년을 한 줄씩 출력
    void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("학번: " + studentNo);
        System.out.println("학년: " + grade);
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 5: StudentTodo 객체 2개 생성
        StudentTodo s1 = new StudentTodo();
        StudentTodo s2 = new StudentTodo();

        // TODO 6: 서로 다른 학생 정보 저장
        s1.name = "김자바";
        s1.studentNo = "20220776";
        s1.grade = 4;

        s2.name = "김부각";
        s2.studentNo = "20240123";
        s2.grade = 2;

        // TODO 7: 각 객체의 printInfo() 호출
        s1.printInfo();
        s2.printInfo();
    }
}
