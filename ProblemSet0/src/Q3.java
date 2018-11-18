import javax.swing.*;

public class Q3 {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter name here");
        String taxableIncomeAsString = JOptionPane.showInputDialog("Enter taxable income here");
        double taxableIncome = Double.parseDouble(taxableIncomeAsString);

        double netIncome = taxableIncome - calculateTax(taxableIncome);

        JOptionPane.showMessageDialog(null, "Name: " +  name + "\nGross Income: €" +
                taxableIncome + "\nNet Income: €" + String.format("%.2f", netIncome));
    }

    public static double calculateTax(double tax){
        double taxDue = 0;
        if(tax <= 20000){
            taxDue = tax * 0;
        }else if(tax > 20000 && tax <= 36000){
            taxDue = tax * 0.2;
        }else if(tax > 36000){
            taxDue = tax * 0.41;
        }
        return taxDue;
    }
}
