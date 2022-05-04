package account;

public class CheckingAccount extends Account {

    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public int pay(int amount) {
        if (balance - amount < 0) {
            System.out.println("Операция отклонена. Недостаточно средств. Вы хотели оплатить покупку на сумму " + amount + " рублей. На Вашем расчетном счете " + balance + " рублей.");
        } else {
            balance -= amount;
            System.out.println("Вы успешно оплатили покупку, размером " + amount + " рублей. Ваша баланс составляет " + balance + " рублей.");
        }
        return balance;
    }

    @Override
    public void transfer(Account account, int amount) {
        if (balance - amount < 0) {
            System.out.println("Операция отклонена. Недостаточно средств. Вы хотели перевести " + amount + " рублей. На Вашем расчетном счете " + balance + " рублей.");
        } else {
            if (account.addMoney(amount)) {
                balance -= amount;
                System.out.println("Вы успешно перевели сумму, размером " + amount + " рублей. Баланс расчетного счета составляет составляет " + balance + " рублей.");
            }
        }
    }

    @Override
    public boolean addMoney(int amount) {
        balance += amount;
        System.out.println("Вы успешно пополнили расчетный счет на сумму в размере " + amount + " рублей. Баланс расчетного счета составляет составляет " + balance + " рублей.");
        return true;
    }

    public String toString() {
        return "На Вашем расчетном счете " + balance + " рублей.";
    }

}
