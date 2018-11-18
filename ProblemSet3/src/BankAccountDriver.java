import javax.swing.*;

public class BankAccountDriver {

    public static void main(String[] args) {
        SavingsAccount savings1 = new SavingsAccount();
        SavingsAccount savings2 = new SavingsAccount("Glen", 1234, 20.00);

        JTextArea output = new JTextArea();
        output.setText("Bank Account Details\n");
        output.append("-----------------------------\n");
        output.append(savings1.toString() + "\n\n");
        output.append(savings2.toString() + "\n\n");

        savings2.withdraw(10);


        JOptionPane.showMessageDialog(null, output);
    }


}
