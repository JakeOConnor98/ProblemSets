import javax.swing.*;

public class WeaponDriver {
    public static void main(String[] args) {
        Weapon gun1 = new Weapon();
        Weapon gun2 = new Weapon("Boom", 125, 850, 985);

        JOptionPane.showMessageDialog(null, gun1.toString());
        JOptionPane.showMessageDialog(null, gun2.toString());
    }
}
