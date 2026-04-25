package oop.exam.p10;

public class AccountTodo {
    String ano;
    String owner;
    int balance;

    // TODO 1: ano, owner, balance를 매개값으로 받는 생성자를 작성하세요.
    // TODO 2: this를 사용해 필드를 초기화하세요.
    public AccountTodo(String ano, int balance, String owner) {
        this.ano = ano;
        this.balance = balance;
        this.owner = owner;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
