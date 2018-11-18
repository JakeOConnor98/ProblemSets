import javax.swing.*;

public class Q1 {

    public static void main(String[] args) {

        String exRateAsString = JOptionPane.showInputDialog("Please enter the exchange rate.");
        String poundsAsString = JOptionPane.showInputDialog("Please enter amount of GBP.");

        while(!poundsAsString.equals("0")){
            double exRate = Double.parseDouble(exRateAsString);
            double pounds = Double.parseDouble(poundsAsString);
            double euros = pounds * exRate;
            JOptionPane.showMessageDialog(null, "Amount of GBP entered: £" + pounds +
                            "\nAmount of euros: €" + String.format("%.2f", euros), "Exchange Rate " + exRate,
                    JOptionPane.INFORMATION_MESSAGE);
            poundsAsString = JOptionPane.showInputDialog("Please enter amount of GBP.");
        }
    }
}


