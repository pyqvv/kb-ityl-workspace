package tisjava.control;

import java.util.Scanner;

public class Q06_BankApplicationTodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 0;
        boolean run = true;

        while(run) {
            System.out.println("----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("----------------------------------");

            System.out.print("선택>");
            int choice = Integer.parseInt(sc.nextLine());

            switch(choice) {
                case 1 -> {
                    System.out.print("예금액>");
                    int amount = Integer.parseInt(sc.nextLine());
                    balance += amount;
                }
                case 2 -> {
                    System.out.print("출금액>");
                    int amount = Integer.parseInt(sc.nextLine());
                    if (amount <= balance) {
                        balance -= amount;
                    }
                }
                case 3 -> System.out.println("잔고>" + balance);
                case 4 -> run = false;
            }
        }
    }
}
