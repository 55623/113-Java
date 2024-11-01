package edu.shu.A111222021;

public class CashCard {
    private String number;
    private int balance;
    private int bonus;

    public CashCard(String number, int balance, int bonus) { //建構子
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    public String getNumber() {
        return this.number;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getBonus() {
        return this.bonus;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void store(int money){
        if(money > 0){
            this.balance += money; //確保是類別裡產生的balance //balance += money; 也行
            if(money >= 1000){
                this.balance += money/1000; //money為int，所以/1000後只會留整數
            }
        }
        else{
            System.out.println("儲值金額為負");
        }
    }

    void charge(int money){
        if(money > 0){
            if(this.balance >= money){
                this.balance -= money;
            }
            else{
                System.out.println("餘額不足!");
            }
        }
        else{
            System.out.println("扣除金額為負");
        }
    }

    int exchange(int bonus){
        if(bonus > 0){
            this.bonus -= bonus;
        }
        return this.bonus;
    }
}
