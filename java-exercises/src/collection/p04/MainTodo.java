package collection.p04;

import java.util.HashMap;
import java.util.Map;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: Map<String, Integer> 생성
        Map<String, Integer> scores = new HashMap<>();

        // TODO 2: 국어 90, 영어 80, 수학 95 저장
        scores.put("국어", 90);
        scores.put("영어", 80);
        scores.put("수학", 95);

        System.out.println("과목 수: " + scores.size());

        // TODO 3: 영어 점수 출력
        System.out.println("영어 점수: " + scores.get("영어"));

        // TODO 4: 수학, 국어 점수 출력
        Integer mathScore = scores.get("수학");
        Integer korScore = scores.get("국어");
        System.out.println("수학 점수: " + mathScore);
        System.out.println("국어 점수: " + korScore);

        // TODO 5: entrySet()을 이용해 key=value 형태로 출력
        for(Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry);
        }
    }
}
