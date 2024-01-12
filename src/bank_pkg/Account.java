package bank_pkg;

public class Account {
    private String name;
    private double balance;
    private String number;
    private String email;
    private String phoneNumber;

    public Account(String name, double balance, String number, String email, String phoneNumber){
        this.name = name;
        this.balance = balance;
        this.number = number;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositMoney(double depositedMoney){
        this.balance += depositedMoney;
        System.out.println("Money deposited, Total balance is " + this.balance);
    }

    public void withdrawMoney(double amount){
        if(this.balance - amount < 0){
            System.out.println("Not enough balance, remaining amount is " + this.balance);
        }
        else{
            this.balance -= amount;
            System.out.println("Amount withrawal successful, remaining amount is " + this.balance);
        }
    }
}
