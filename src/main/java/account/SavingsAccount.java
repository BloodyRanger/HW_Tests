package account;

public class SavingsAccount extends Account {

    public SavingsAccount(int balance) {
        super(balance);
    }

    @Override
    public int pay(int amount) {
        System.out.println("Неверная операция. Со сберегательного счета невозможно производить оплату!");
        return amount;
    }

    @Override
    public void transfer(Account account, int amount) {
        if (balance - amount < 0) {
            System.out.println("Операция отклонена. Недостаточно средств. Вы хотели перевести сумму в размере " + amount + " рублей. Вашем сберегательном счете " + balance + " рублей.");
        } else {
            if(account.addMoney(amount)) {
                balance -= amount;
                System.out.println("Вы успешно перевели сумму, размером " + amount + " рублей. Баланс сберегательного счета составляет " + balance + " рублей.");
            }
        }
    }

    @Override
    public  boolean addMoney (int amount) {
        balance += amount;
        System.out.println("Вы успешно пополнили сберегательный счет на " + amount + " рублей. Баланс сберегательного счета составляет " + balance + " рублей.");
        return true;
    }

    public String toString(){
        return "На Вашем сберегательном счете " + balance + " рублей.";
    }

}
