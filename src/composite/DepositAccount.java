package composite;

public class DepositAccount extends Account{

    protected String accountNo;
    protected float accountBalance;

    public DepositAccount(String accountNo, float accountBalance) {
        super();
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    @Override
    public float getBalance() {
        return this.accountBalance;
    }
}
