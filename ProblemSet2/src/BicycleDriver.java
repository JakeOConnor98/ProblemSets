import javax.swing.*;

public class BicycleDriver {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle("John", 80, "Halfords");
        bike1.setOwnersName(JOptionPane.showInputDialog("Please enter owners name:"));
        bike1.setValue(Double.parseDouble(JOptionPane.showInputDialog("Please enter the value of the bike:")));
        bike1.setMake(JOptionPane.showInputDialog("Please enter the make of the bike:"));
        bike1.setValue(bike1.getValue() + 10);
        JOptionPane.showMessageDialog(null, bike1.toString());
        JOptionPane.showMessageDialog(null, bike2.toString());
    }
}
