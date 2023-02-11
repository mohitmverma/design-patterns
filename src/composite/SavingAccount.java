package composite;

public class SavingAccount extends Account{

    protected String accountNo;
    protected float accountBalance;

    public SavingAccount(String accountNo, float accountBalance) {
        super();
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    @Override
    public float getBalance() {
        return this.accountBalance;
    }
}
