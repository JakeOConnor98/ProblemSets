import javax.swing.*;

public class LaptopDriver {

    public static void main(String[] args) {
        Computer lap1 = new Laptop("Dell", "Inspiron", 16, true);
        Computer lap2 = new Laptop().makeLaptop();
        Laptop[] arr = new Laptop[5];

        JTextArea output = new JTextArea();
        output.setText("House Details\n");
        output.append("-----------------\n");
        output.append(lap1.toString() + "\n\n");
        output.append(lap2.toString() + "\n\n");

        JOptionPane.showMessageDialog(null, output);
    }
}


