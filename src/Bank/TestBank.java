package Bank;

import Bank.Entities.Account;
import Bank.Entities.AccountRate;

import java.util.Arrays;

public class TestBank {
    public static void main(String[] args) {
        Account account1 = new Account(1, 2800);
        // Retourne le type de classe suivi de l'adresse mémoire
        System.out.println(account1);

        AccountRate accountRate1 = new AccountRate(2, 2500, 25);
        System.out.println(accountRate1);

        Account[] arrayAccount = {account1, accountRate1};
        System.out.println("arrayAccount: " + Arrays.toString(arrayAccount));
    }
}
