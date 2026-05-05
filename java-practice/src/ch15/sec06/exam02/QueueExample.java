package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
  public static void main(String[] args) {
    Queue<Message> queue = new LinkedList<>();

    queue.offer(new Message("sendMail", "홍길동"));
    queue.offer(new Message("sendSMS", "신용권"));
    queue.offer(new Message("sendKakaotalk", "김자바"));

    while(!queue.isEmpty()) {
      Message message = queue.poll();
      System.out.print(message.to + "에게 ");
      switch (message.command) {
        case "sendMail" -> System.out.println("메일을 보냅니다.");
        case "sendSMS" -> System.out.println("SMS를 보냅니다.");
        case "sendKakaotalk" -> System.out.println("카카오톡을 보냅니다.");
      }
    }
  }
}
