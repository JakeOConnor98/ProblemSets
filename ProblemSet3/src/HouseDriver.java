import javax.swing.*;

public class HouseDriver {
    public static void main(String[] args) {

        House h1 = new House();
        House h2 = new House("Kerry", "Apartment", -275.00, new Person("Ted"));

        JTextArea output = new JTextArea();
        output.setText("House Details\n");
        output.append("-----------------\n");
        output.append(h1.toString() + "\n\n");
        output.append(h2.toString() + "\n\n");

        JOptionPane.showMessageDialog(null, output);

    }
}
