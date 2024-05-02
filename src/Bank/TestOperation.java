package Bank;

import Bank.Entities.Credit;
import Bank.Entities.Debit;
import Bank.Entities.Operation;

import java.util.Arrays;
import java.util.Date;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] arrayOperation = {
                new Credit(new Date(), 200),
                new Credit(new Date(), 850),
                new Debit(new Date(), 500),
                new Debit(new Date(), 325),
        };

        int globalAmount = 0;
        for (int i = 0; i < arrayOperation.length; i++) {
            System.out.println("Opération n°" + (i + 1) + ":\n Date: " + arrayOperation[i].date + "\n Amount:" + arrayOperation[i].amount + "\nType: " + arrayOperation[i].getType());
            if ((arrayOperation[i].getType().equals("CREDIT"))) {
                globalAmount = globalAmount + arrayOperation[i].amount;
            } else {
                globalAmount = globalAmount - arrayOperation[i].amount;
            }
        }
        System.out.println(Arrays.toString(arrayOperation));
        System.out.println("Montant Global des opérations: " + globalAmount);
    }
}
