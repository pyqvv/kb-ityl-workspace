package inheritance.drink.refactored;

public class Alcohol extends Drink {
    double alcper;

    Alcohol(String name, int price, int count, double alcper) {
        super(name, price, count);

        if (alcper < 0) {
            throw new IllegalArgumentException("도수는 음수일 수 없습니다.");
        }

        this.alcper = alcper;
    }

    @Override
    public void printTitle() {
        System.out.println("상품명(도수[%])\t단가\t\t수량\t\t금액");
    }

    @Override
    public void printData() {
        System.out.println(name + "(" + alcper + ")" + "\t\t" + price + "\t" + count + "\t\t" + getTotalPrice());
    }
}
