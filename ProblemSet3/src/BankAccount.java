public abstract class BankAccount implements Transactable, Taxable {
    protected String name;
    protected int accnum;

    public void setName(String name){
        this.name = name;
    }

    public void setAccnum(int accNum){
        this.accnum = accNum;
    }

    public String getName(){
        return name;
    }

    public int getAccnum(){
        return accnum;
    }

    public abstract void withdraw(int a);
    public abstract void lodge(int a);
    public abstract double calcTax();

}

