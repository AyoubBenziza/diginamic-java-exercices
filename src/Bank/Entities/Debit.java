package Bank.Entities;

import java.util.Date;

public class Debit extends Operation {
    public Debit(Date date, int amount) {
        super(date, amount);
    }

    public String getType() {
        return "DEBIT";
    }
}
