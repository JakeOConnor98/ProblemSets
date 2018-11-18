import javax.swing.*;

public class Q4 {
    public static void main(String[] args) {
        int total = 0, numberOfNumbers = 0;

        String numAsString = JOptionPane.showInputDialog("Please enter a number or q to quit");

        while(!numAsString.equals("q")){
            int num = Integer.parseInt(numAsString);
            total+= num;
            numberOfNumbers++;
            numAsString = JOptionPane.showInputDialog("Please enter a number or q to quit");
        }
        JOptionPane.showMessageDialog(null, "Grand Total: " + total +
                "\n Number of numbers: " + numberOfNumbers);
    }
    }

