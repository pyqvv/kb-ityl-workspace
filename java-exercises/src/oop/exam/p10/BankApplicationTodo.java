package oop.exam.p10;

import java.util.Scanner;

public class BankApplicationTodo {
    static AccountTodo[] accountArray = new AccountTodo[100];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");
            String selectNo = scanner.nextLine();

            switch (selectNo) {
                case "1":
                    createAccount();
                    break;
                case "2":
                    accountList();
                    break;
                case "3":
                    deposit();
                    break;
                case "4":
                    withdraw();
                    break;
                case "5":
                    run = false;
                    System.out.println("프로그램 종료");
                    break;
            }
        }
    }

    static void createAccount() {
        // TODO 1: "계좌생성" 안내를 출력하세요.
        System.out.println("----------");
        System.out.println("계좌생성");
        System.out.println("----------");

        // TODO 2: 계좌번호, 계좌주, 초기입금액을 nextLine()으로 입력받으세요.
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();

        System.out.print("계좌주: ");
        String owner = scanner.nextLine();

        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(scanner.nextLine());

        // TODO 3: 새 AccountTodo 객체를 생성하세요.
        AccountTodo newAccount = new AccountTodo(ano, balance, owner);

        // TODO 4: accountArray에서 null인 첫 위치를 찾아 저장하세요.
        // TODO 5: "결과: 계좌가 생성되었습니다."를 출력하세요.
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    static void accountList() {
        System.out.println("----------");
        System.out.println("계좌목록");
        System.out.println("----------");

        // TODO 6: 저장된 모든 계좌를 출력하세요.
        // 출력 형식:
        // 111-111    홍길동    10000

        for (int i = 0; accountArray[i] != null; i++) {
            System.out.print(accountArray[i].getAno() + "\t");
            System.out.print(accountArray[i].getOwner() + "\t");
            System.out.print(accountArray[i].getBalance() + "\t");
            System.out.println();
        }
    }

    static void deposit() {
        System.out.println("----------");
        System.out.println("예금");
        System.out.println("----------");

        // TODO 7: 계좌번호와 예금액을 입력받으세요.
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("예금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        // TODO 8: findAccount(계좌번호)로 계좌를 찾으세요.
        AccountTodo account = findAccount(ano);

        // TODO 9: 계좌가 있으면 balance에 예금액을 더하고 성공 메시지를 출력하세요.
        if(account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() + money);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    static void withdraw() {
        System.out.println("----------");
        System.out.println("출금");
        System.out.println("----------");

        // TODO 10: 계좌번호와 출금액을 입력받으세요.
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("출금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        // TODO 11: findAccount(계좌번호)로 계좌를 찾으세요.
        AccountTodo account = findAccount(ano);

        // TODO 12: 계좌가 있으면 balance에서 출금액을 빼고 성공 메시지를 출력하세요.
        if(account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() - money);
        System.out.println("결과: 출금이 성공되었습니다.");
    }

    static AccountTodo findAccount(String ano) {
        // TODO 13: 배열을 순회하면서 ano가 같은 계좌를 찾으세요.
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                if (accountArray[i].getAno().equals(ano)) {
                    // TODO 14: 찾으면 해당 AccountTodo를 반환하세요.
                    return accountArray[i];
                }
            }
        }
        // TODO 15: 끝까지 없으면 null을 반환하세요.
        return null;
    }
}
