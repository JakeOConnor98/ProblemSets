
public class BankingAccount {
    private String accNum;
    private double balance;
    private Person customer = new Person();

    public void setAccNum(String accNum){
        this.accNum = accNum;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public BankingAccount(){
        this("0000",0.0,null);

    }


    public BankingAccount(String accNum, double balance, Person customer){
        setAccNum(accNum);
        setBalance(balance);
        setCustomer(customer);
    }

    public void lodgement(double amount){
        balance+= amount;
    }
    public void withdrawal(double amount){
        if(balance >= amount){
            balance-= amount;
        }
    }

    public String toString(){
        return "Account Number: " + getAccNum() + "\nBalance: €" + getBalance() + "\nAccount Holder: " +
                getCustomer();
    }
}