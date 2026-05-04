package stream.test;

import stream.test.common.Order;
import java.util.List;

public class Ex10_BasicAggregateTodo {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1,"홍길동","DONE",30000),
                new Order(2,"김수영","READY",12000),
                new Order(3,"오해영","DONE",45000),
                new Order(4,"강감찬","DONE",22000));

        // TODO: DONE 주문 기준 count, sum, average, max, min을 구하세요.
        long count = orders.stream()
                .filter(n -> n.getStatus().equals("DONE"))
                .count();
        System.out.println("DONE 주문의 count: " + count);

        int sum = orders.stream()
                .filter(n -> n.getStatus().equals("DONE"))
                .mapToInt(Order::getAmount)
                .sum();
        System.out.println("DONE 주문의 sum: " + sum);

        double avg = orders.stream()
                .filter(n -> n.getStatus().equals("DONE"))
                .mapToInt(Order::getAmount)
                .average()
                .orElse(0.0);
        System.out.println("DONE 주문의 avg: " + avg);

        int max = orders.stream()
                .filter(n -> n.getStatus().equals("DONE"))
                .mapToInt(Order::getAmount)
                .max()
                .orElse(0);
        System.out.println("DONE 주문의 max: " + max);

        int min = orders.stream()
                .filter(n -> n.getStatus().equals("DONE"))
                .mapToInt(Order::getAmount)
                .min()
                .orElse(0);
        System.out.println("DONE 주문의 min: " + min);

        // TODO: READY 주문 중 첫 번째 주문 금액을 findFirst로 구하세요. 없으면 -1을 출력하세요.
        long findFirst = orders.stream()
                .filter(n -> n.getStatus().equals("READY"))
                .map(Order::getAmount)
                .findFirst()
                .orElse(-1);
        System.out.println("READY 주문 중 첫 번째 주문 금액: " + findFirst);
    }
}
