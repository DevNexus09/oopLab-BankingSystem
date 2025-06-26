package Bank;

public abstract class Account {

    protected float currentBalance;

    public abstract void setPassword();

    public abstract void deposit();

    public abstract void withdraw();

    public abstract void transferTo(Account another, int amount);

    public abstract float getCurrentBalance();
    public abstract int getAccountNumber();
    public abstract String getAccountHolder();
    public abstract int getPassWord();
    public abstract float getLastDeposit();
    public abstract float getLastWithdrawal();
}