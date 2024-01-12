package bank_pkg;

public class Main {
    public static void main(String[] args){
        Account user = new Account("Rohan", 1000, "9897", "vavishalarya@gmail.com", "9893740387");
        user.depositMoney(70);
        user.withdrawMoney(500);
    }
}
