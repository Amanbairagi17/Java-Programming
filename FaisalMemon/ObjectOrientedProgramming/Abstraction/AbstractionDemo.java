package FaisalMemon.ObjectOrientedProgramming.Abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
//        BankAccount bankAccount = new SavingAccount("ngas393993",1000);
//        bankAccount.deposit(200);
//        bankAccount.withdraw(200);
//        BankAccount bankAccount1 = new CurrentAccount("dankl93939",900);
//        bankAccount1.withdraw(200);
//        bankAccount1.deposit(200);
//
        SavingAccount savingAccount = new SavingAccount("1123jjfbk",1000);
        savingAccount.deposit(3);
        savingAccount.withdraw(3);
        System.out.println(savingAccount.getAccountNumber());

        CurrentAccount currentAccount = new CurrentAccount("11234kngalk",2000);
        currentAccount.deposit(1);
        currentAccount.withdraw(2);
        System.out.println(currentAccount.getAccountNumber());

    }
}
