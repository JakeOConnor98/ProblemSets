import javax.swing.*;

public class Q5 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "The root of the plus is: " +
                plusRoot(1, 6, -16));
        JOptionPane.showMessageDialog(null, "The root of the minus is: " +
                minusRoot(1, 6, -16));
    }

    public static double plusRoot(int a, int b, int c) {
        return (-b + Math.sqrt((b * b) - (4 * (a * c)))) / (2 * a);
    }

    public static double minusRoot(int a, int b, int c) {
        return (-b - Math.sqrt((b * b) - (4 * (a * c)))) / (2 * a);
    }
}
