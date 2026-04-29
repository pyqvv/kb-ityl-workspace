package tisjava.oop.p08;

class StudentTodo {
    private String name;
    private int score;

    // TODO 1: 생성자 작성
    public StudentTodo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: StudentTodo 배열 생성
        StudentTodo[] students = new StudentTodo[3];

        // TODO 3: 객체 3개 저장
        students[0] = new StudentTodo("신짱구", 80);
        students[1] = new StudentTodo("김철수", 90);
        students[2] = new StudentTodo("이훈이", 75);

        // TODO 4: 합계와 평균 출력
        int totalScore = 0;
        for (StudentTodo student : students) {
            totalScore += student.getScore();
        }
        System.out.println("합계: " + totalScore);
        System.out.println("평균: " + (double)totalScore/students.length);
    }
}
