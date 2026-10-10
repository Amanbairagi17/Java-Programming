package OOPsinJava.HasA;

public class Sim {
    private double balance;
    private long phoneNo;

    public Sim(double balance, long phoneNo) {
        this.balance = balance;
        this.phoneNo = phoneNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    void displaySim(){
        System.out.println("You have "+this.balance+" balance remaining");
        System.out.println("Yout Phone number is : "+this.phoneNo);
    }
}
