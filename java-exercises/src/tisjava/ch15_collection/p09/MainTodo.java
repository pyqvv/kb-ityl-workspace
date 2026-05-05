package tisjava.ch15_collection.p09;

import java.util.ArrayList;
import java.util.List;

class StudentTodo {
    String name;
    int score;

    // TODO 1: 생성자 작성
    StudentTodo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: StudentTodo 리스트 생성
        List<StudentTodo> studentTodoList = new ArrayList<>();
        // TODO 3: 객체 3개 추가
        studentTodoList.add(new StudentTodo("홍길동", 90));
        studentTodoList.add(new StudentTodo("김자바", 95));
        studentTodoList.add(new StudentTodo("박자바", 80));
        // TODO 4: 평균 점수 출력
        double avg = studentTodoList.stream()
            .mapToInt(StudentTodo::getScore)
            .average()
            .orElse(0.0);
        System.out.println("평균 점수: " + avg);
    }
}
