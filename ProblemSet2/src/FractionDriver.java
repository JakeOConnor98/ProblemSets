import javax.swing.*;

public class FractionDriver {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction(5, 10);

        JOptionPane.showMessageDialog(null, fraction1.toString());
        JOptionPane.showMessageDialog(null, fraction2.toString());
    }
}
