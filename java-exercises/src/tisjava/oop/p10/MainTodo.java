package tisjava.oop.p10;

import java.util.Scanner;

class AccountTodo {
    private String ano;
    private String owner;
    private int balance;

    // TODO 1: 생성자 작성
    public AccountTodo(String ano, int balance, String owner) {
        this.ano = ano;
        this.balance = balance;
        this.owner = owner;
    }

    // getter 및 setter 정의
    public String getAno() {
        return ano;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

public class MainTodo {
    static AccountTodo[] accountArray = new AccountTodo[100];
    static Scanner scanner = new Scanner(System.in);

    // TODO 2: createAccount(String ano, String owner, int balance)
    static void createAccount(String ano, String owner, int balance) {
        AccountTodo newAccount = new AccountTodo(ano, balance, owner);

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    // accountList()
    static void accountList() {
        for (int i = 0; accountArray[i] != null; i++) {
            System.out.print(accountArray[i].getAno() + "\t");
            System.out.print(accountArray[i].getOwner() + "\t");
            System.out.print(accountArray[i].getBalance() + "\t");
            System.out.println();
        }
    }

    // TODO 3: findAccount(String ano)
    static AccountTodo findAccount(String ano) {
        for (AccountTodo accountTodo : accountArray) {
            if (accountTodo != null) {
                if (accountTodo.getAno().equals(ano)) {
                    return accountTodo;
                }
            }
        }
        return null;
    }

    // TODO 4: deposit(String ano, int money)
    static void deposit(String ano, int money) {
        AccountTodo account = findAccount(ano);

        if(account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() + money);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    // TODO 5: withdraw(String ano, int money)
    static void withdraw(String ano, int money) {
        AccountTodo account = findAccount(ano);

        if(account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }

        if(account.getBalance() < money) {
            System.out.println("잔액이 부족합니다.");
        } else {
            account.setBalance(account.getBalance() - money);
            System.out.println("결과: 출금이 성공되었습니다.");
        }
    }

    public static void main(String[] args) {
        // TODO 6: 계좌 생성, 예금, 출금 후 결과 출력
        boolean run = true;
        while (run) {
            System.out.println("------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");
            String selectNo = scanner.nextLine();

            switch (selectNo) {
                case "1" -> {
                    System.out.println("----------");
                    System.out.println("계좌생성");
                    System.out.println("----------");

                    System.out.print("계좌번호: ");
                    String ano = scanner.nextLine();

                    System.out.print("계좌주: ");
                    String owner = scanner.nextLine();

                    System.out.print("초기입금액: ");
                    int balance = Integer.parseInt(scanner.nextLine());

                    createAccount(ano, owner, balance);
                }
                case "2" -> {
                    System.out.println("----------");
                    System.out.println("계좌목록");
                    System.out.println("----------");

                    accountList();
                }
                case "3" -> {
                    System.out.println("----------");
                    System.out.println("예금");
                    System.out.println("----------");

                    System.out.print("계좌번호: ");
                    String ano = scanner.nextLine();
                    System.out.print("예금액: ");
                    int money = Integer.parseInt(scanner.nextLine());

                    deposit(ano, money);
                }
                case "4"-> {
                    System.out.println("----------");
                    System.out.println("출금");
                    System.out.println("----------");

                    System.out.print("계좌번호: ");
                    String ano = scanner.nextLine();
                    System.out.print("출금액: ");
                    int money = Integer.parseInt(scanner.nextLine());

                    withdraw(ano, money);
                }
                case "5" -> run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
