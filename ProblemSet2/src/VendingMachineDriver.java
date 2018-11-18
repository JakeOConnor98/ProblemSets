import javax.swing.*;

public class VendingMachineDriver {
    public static void main(String[] args) {
        VendingMachine vend1 = new VendingMachine();
        VendingMachine vend2 = new VendingMachine(50, 0);

        vend1.fillUp(500);
        vend1.giveCan();

        JTextArea output = new JTextArea();
        output.setText("vending Machine Details\n");
        output.append("----------------------------------\n");
        output.append(vend1.toString() + "\n\n");
        output.append(vend2.toString() + "\n\n");

        JOptionPane.showMessageDialog(null, output);
    }


    }
