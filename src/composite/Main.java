package composite;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Composite Pattern");

        CompositeAccount component = new CompositeAccount();

        component.addAccount(new DepositAccount("DA001", 100));
        component.addAccount(new DepositAccount("DA002", 150));
        component.addAccount(new SavingAccount("SA001", 200));

        float totalBalance = component.getBalance();
        System.out.println("Total Balance : " + totalBalance);
    }
}
