package account;

public class CreditAccount extends Account {

    public CreditAccount(int balance) {
        super(balance);
    }

    @Override
    public int pay(int amount) {
        balance -= amount;
        System.out.println("Вы успешно оплатили покупку в размере " + amount + " рублей. Ваша задолженность по кредитному счету составляет " + balance + " рублей.");
        return amount;
    }

    @Override
    public void transfer(Account account, int amount) {
        balance -= amount;
        account.balance += amount;
        System.out.println("Вы успешно перевели сумму, размером " + amount + " рублей. Ваша задолженность по кредитному счету составляет " + balance + " рублей.");
    }
    @Override
    public boolean addMoney(int amount){
        if (balance + amount > 0) {
            System.out.println("Неверная операция. Сумма на Вашем кредитном счете не может быть положительным значением. Баланс Вашего кредитного счета составляет " + balance + " рублей.");
            return false;
        } else {
            balance += amount;
            System.out.println("Вы успешно пополнили кредитный счет на " + amount + " рублей. Ваша задолженность по кредитному счету составляет " + balance + " рублей.");
            return true;
        }
    }

    public String toString(){
        return "На Вашем кредитном счете " + balance + " рублей.";
    }

}
