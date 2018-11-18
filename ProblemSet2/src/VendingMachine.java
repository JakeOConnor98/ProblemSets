import javax.swing.*;

public class VendingMachine {
    private int numCans;
    private int numTokens;

    public int getNumCans() {
        return numCans;
    }

    public int getNumTokens() {
        return numTokens;
    }

    public void setNumCans(int numCans) {
        this.numCans = numCans;
    }

    public void setNumTokens(int numTokens) {
        this.numTokens = numTokens;
    }

    public VendingMachine(int numCans, int numTokens){
        setNumCans(numCans);
        setNumTokens(numTokens);
    }

    public VendingMachine(){
        this(0,0);
    }

    public int getCanCount(){
        return numCans;
    }

    public int getTokenCount(){
        return numTokens;
    }

    public void fillUp(int cans){
        numCans+= cans;
    }

    public void giveCan(){
        if(numCans > 0){
            JOptionPane.showMessageDialog(null, "Can given");
            numCans--;
            numTokens++;
        }
    }

    public String toString(){
        return "Number of cans: " + getCanCount() + "\nNumber of tokens: " + getTokenCount();
    }

}
