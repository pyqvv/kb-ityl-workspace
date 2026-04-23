package inheritance.drink.refactored;

public class Drink {
    String name;
    int price;
    int count;

    Drink(String name, int price, int count) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("상품명이 존재하지 않습니다.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("가격은 음수일 수 없습니다.");
        }
        if (count < 0) {
            throw new IllegalArgumentException("수량은 음수일 수 없습니다.");
        }

        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getTotalPrice() {
        return price * count;
    }

    public void printTitle() {
        System.out.println("상품명\t단가\t\t수량\t\t금액");
    }

    public void printData() {
        System.out.println(name + "\t\t" + price + "\t" + count + "\t\t" + getTotalPrice());
    }
}
