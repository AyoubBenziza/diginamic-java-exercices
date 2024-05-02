package Bank.Entities;

import java.util.Date;

abstract public class Operation {
    public Date date;
    public int amount;

    protected Operation(Date date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    public String getType() {
        return null;
    }
}
