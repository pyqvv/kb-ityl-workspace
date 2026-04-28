package collection.p09;

import java.util.ArrayList;
import java.util.List;

class StudentTodo {
    String name;
    int score;

    // TODO 1: 생성자 작성
    public StudentTodo(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: StudentTodo 리스트 생성
        List<StudentTodo> list = new ArrayList<>();

        // TODO 3: 객체 3개 추가
        list.add(new StudentTodo("신짱구", 90));
        list.add(new StudentTodo("김철수", 85));
        list.add(new StudentTodo("이훈이", 70));

        // TODO 4: 평균 점수 출력
        int totalScore = 0;
        for (StudentTodo studentTodo : list) {
            totalScore += studentTodo.score;
        }
        System.out.println("평균 점수: " + (double)totalScore/list.size());
    }
}
