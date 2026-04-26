package tisjava.interfaces.p08;

interface PaymentServiceTodo {
    // TODO 1: pay(int amount) 선언
    void pay(int amount);
}

class CardPaymentTodo implements PaymentServiceTodo {
    // TODO 2: pay 구현
    public void pay(int amount) {
        System.out.println("카드로 " + amount + "원 결제합니다.");
    }
}

class KakaoPaymentTodo implements PaymentServiceTodo {
    // TODO 3: pay 구현
    public void pay(int amount) {
        System.out.println("카카오페이로 " + amount + "원 결제합니다.");
    }
}

class OrderProcessorTodo {
    // TODO 4: process(PaymentServiceTodo service, int amount)
    void process(PaymentServiceTodo service, int amount) {
        service.pay(amount);
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 5: 카드/카카오페이 결제 처리
        OrderProcessorTodo processor = new OrderProcessorTodo();

        PaymentServiceTodo card = new CardPaymentTodo();
        PaymentServiceTodo kakao = new KakaoPaymentTodo();

        processor.process(card, 15000);
        processor.process(kakao, 20000);
    }
}
