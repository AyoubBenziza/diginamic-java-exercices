package Bank.Entities;

import java.util.Date;

public class Credit extends Operation {
    public Credit(Date date, int amount) {
        super(date, amount);
    }

    public String getType() {
        return "CREDIT";
    }

    public double calculTotal(double total) {
        return total + getAmount();
    }
}
