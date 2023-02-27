import javax.swing.text.Utilities;
import java.util.LinkedList;
import java.util.List;

import static javax.swing.text.Utilities.*;

public class Main {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();

        //Read a csv file then create new accounts based on that data
        String file = "/Users/jeffjusto/Downloads/NewBankAccounts.csv";
        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolder) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initialDep = Double.parseDouble(accountHolder[3]);
            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, sSN, initialDep));
            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, sSN, initialDep));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for (Account acc : accounts) {
            System.out.println("\n*****************************");
            acc.showInfo();
        }
    }
}
