package oop.basic.account;

public class CheckingAccount extends Account{
    private String cardNo;

    CheckingAccount(String accid, String ownerName, long balance, String cardNo) {
        super(accid, balance, ownerName);
        this.cardNo = cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    void pay(String cardNo, long amount) {
        if (this.cardNo.equals(cardNo) && (amount < getBalance())) {
            withdraw(amount);
        } else {
            System.out.println("지급이 불가능합니다.");
        }
    }
}
