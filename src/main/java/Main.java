import account.CheckingAccount;
import account.CreditAccount;
import account.SavingsAccount;

public class Main {

    public static void main(String[] args) {
        SavingsAccount savAc = new SavingsAccount(30000);
        CheckingAccount chAc = new CheckingAccount(10000);
        CreditAccount credAc = new CreditAccount(-20000);

        savAc.transfer(credAc, 10000);
        System.out.println(chAc);
        System.out.println(savAc);
        System.out.println(credAc);
    }
}