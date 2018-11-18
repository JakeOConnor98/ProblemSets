public class SavingsAccount extends BankAccount {
    private double balance;

    public SavingsAccount(){
        this("None Specified", 000, 0.0);
    }

    public SavingsAccount(String name, int accNum, double balance){
        setName(name);
        setAccnum(accNum);
        setBalance(balance);
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public void withdraw(int a){
        balance = getBalance() - a;
    }

    public void lodge(int a){
        balance = getBalance() + a;
    }

    public double calcTax(){
        return balance = getBalance() * 0.33;
    }

    public String toString(){
        return "Name: " + getName() + "\nAccount Number: " + getAccnum() + "\nBalance: " + getBalance();
    }

}
