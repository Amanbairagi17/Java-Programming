package FaisalMemon.ObjectOrientedProgramming.Abstraction;

public class CurrentAccount extends BankAccount{
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdraw Current....");
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposited Current....");
    }
}
