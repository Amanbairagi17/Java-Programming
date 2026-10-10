package FaisalMemon.ObjectOrientedProgramming.Abstraction;

public class SavingAccount extends BankAccount{
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Money withdraw....");
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Money deposit....");
    }
}
