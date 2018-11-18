import javax.swing.*;

public class BankingAccountDriver {
    public static void main(String[] args) {
        BankingAccount bank1 = new BankingAccount();
        BankingAccount bank2 = new BankingAccount("3245", 300.00, new Person("Johnny"));

        bank2.withdrawal(50.00);
        bank2.lodgement(100.00);

        JTextArea output = new JTextArea();
        output.setText("Bank Account Details\n");
        output.append("-----------------\n");
        output.append(bank1.toString() + "\n\n");
        output.append(bank2.toString() + "\n\n");

        JOptionPane.showMessageDialog(null, output);
    }

    

}
