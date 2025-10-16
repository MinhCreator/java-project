class Account {

    private long id;
    private double balance;

    public Account(double balVal, long idVal) {
        balance = balVal;
        id = idVal;
    }

    public void withdraw(double withdraw) {
        balance -= withdraw;
        System.out.print("current balance: " + balance);
    }

    
    public void deposite(double deposite) {
        balance += deposite;
        System.out.print("current balance: " + balance);
    }
    
    public void getCurrentBalance() {
        System.out.print("current balance: " + balance);
    }

    public void getId() {
        System.out.print("Client id: " + id);
    }

    public void getClientDetails() {
        System.out.print("Client Id: " + id);
        System.out.print("Client balance: " + balance);

    }
}

public class bankAcc {

}