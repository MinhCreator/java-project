class Account {

    private String id;
    private int balance;
    private String Name;

    public Account(String name, int balVal, String idVal) {
        balance = balVal;
        Name = name;
        id = idVal;
    }

    public int credit(int amount) {
        balance += amount;
        System.out.print("Add currency to current balance: ");
        return balance;
    }

    
    public int debit(int amount) {
        if (amount <= balance) {

            balance -= amount;
            System.out.print("current balance: " + balance);
        } else
            System.out.print("Amount exceeded balance: ");

        return balance;
    }
    
    public int Transfer(Account other, int amount) {
        if (amount <= balance) {
            other.credit(amount);
            balance -= amount;
        }else
            System.out.print("Amount exceeded balance: ");

        return balance; 
    }
    
    public int getBalance() {
        System.out.print("current balance: ");
        return balance;
    }

    public String getId() {
        System.out.print("Client id: ");
        return id;

    }

    public String getName() {
        System.out.print("Client name: " + Name);
        return Name;
    }

    @Override public String toString() {
        return "Account[" + "id= " + id + ", " + "name= " + Name + ", " + "balance= " + balance + "]";
    }
}

public class Bank {
    public static void main(String[] args) {
        Account acc = new Account("minh", 3000, "fbshjbf");
        System.out.println(acc);
    }
}