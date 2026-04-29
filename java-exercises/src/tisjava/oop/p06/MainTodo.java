package tisjava.oop.p06;

class ShopServiceTodo {
    // TODO 1: private static final 싱글톤 객체 선언
    private static final ShopServiceTodo singleton = new ShopServiceTodo();

    // TODO 2: private 생성자 작성
    private ShopServiceTodo(){}

    // TODO 3: public static getInstance() 작성
    static ShopServiceTodo getInstance() {
        return singleton;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 4: getInstance() 두 번 호출하여 같은 객체인지 비교
        ShopServiceTodo obj1 = ShopServiceTodo.getInstance();
        ShopServiceTodo obj2 = ShopServiceTodo.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 ShopService 객체입니다.");
        } else {
            System.out.println("다른 ShopService 객체입니다.");
        }
    }
}
