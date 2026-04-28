package collection.p07;

import java.util.LinkedList;
import java.util.Queue;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: Queue<String> 생성
        Queue<String> queue = new LinkedList<>();

        // TODO 2: offer로 3개 추가
        queue.offer("task1");
        queue.offer("task2");
        queue.offer("task3");

        // TODO 3: poll 하며 출력
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
