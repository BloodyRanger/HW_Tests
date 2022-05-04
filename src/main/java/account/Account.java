package account;

public abstract class Account {

    protected int balance;
    protected int mount;

    public Account(int balance){
        this.balance = balance;
    }

    abstract int pay(int amount);
    abstract void transfer(Account account, int amount);
    abstract boolean addMoney(int amount);

}
