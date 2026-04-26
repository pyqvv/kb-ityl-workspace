package polymorphism.coffeeshop;

public class CoffeeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop영업개시****");
		Beverage[] beverage = new Beverage[5];
		beverage[0] = new Coffee("Cappuccino");
		beverage[1] = new Coffee("CafeLatte");
		beverage[2] = new Tea("ginsengTea");
		beverage[3] = new Coffee("CafeLatte");
		beverage[4] = new Tea("redginsengTea");
		getSalesInfo(beverage);

		System.out.println("총 판매 금액==>"+getTotalPrice(beverage));
		System.out.println("Coffe의 판매 개수=>"+Coffee.getAmount()+"잔");
		System.out.println("Tea의 판매 개수=>"+Tea.getAmount()+"잔");
	}

	public static void getSalesInfo(Beverage[] beverage) {
		for (int i = 0; i < 5; i++) {
			System.out.println((i+1) + "번째 판매 음료는 " + beverage[i].getName() + "이며, 가격은 " + beverage[i].getPrice());
		}
	}

	public static int getTotalPrice(Beverage[] beverage) {
		int sum = 0;
		for(Beverage b : beverage) {
			sum += b.getPrice();
		}
		return sum;
	}
}
