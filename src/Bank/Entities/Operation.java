package Bank.Entities;

import java.util.Date;

abstract public class Operation {
    protected Date date;
    private double amount;

    protected Operation(Date date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public abstract String getType();

    public double getAmount() {
        return this.amount;
    }

    public Date getDate() {
        return this.date;
    }

    public abstract double calculTotal(double total);
}
