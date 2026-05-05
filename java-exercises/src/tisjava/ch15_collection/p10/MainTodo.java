package tisjava.ch15_collection.p10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: List<Map<String, Object>> 구조를 사용해 학생 2명 정보 저장
        // 이름, 점수 키 사용
        List<Map<String, Object>> students = new ArrayList<>();

        Map<String, Object> student1 = new HashMap<>();
        student1.put("이름", "홍길동");
        student1.put("점수", 90);

        Map<String, Object> student2 = new HashMap<>();
        student2.put("이름", "김철수");
        student2.put("점수", 85);

        students.add(student1);
        students.add(student2);

        // TODO 2: 모든 학생 정보 출력
        students.forEach(System.out::println);
    }
}
