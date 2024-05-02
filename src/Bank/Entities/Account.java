package Bank.Entities;

public class Account {
    int id;
    int balance;

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public String toString() {
        return "Id: " + this.id + " Balance: " + this.balance;
    }
}
