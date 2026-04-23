package oop.basic.account;

public class Account {
    private String accId;
    private long balance;
    private String ownerName;

    Account(){}
    Account(String accid, long balance, String ownerName) {
        this.accId = accid;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    void deposit(long amount) {
        balance += amount;
    }

    void withdraw(long amount) {
        balance -= amount;
    }
}
