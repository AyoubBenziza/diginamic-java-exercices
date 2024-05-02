package Bank.Entities;

public class AccountRate extends Account {
    int remunerationRate;

    public AccountRate(int id, int balance, int remunerationRate) {
        super(id, balance);
        this.remunerationRate = remunerationRate;
    }

    public String toString() {
        return super.toString() + " Rémunération: " + this.remunerationRate;
    }
}
