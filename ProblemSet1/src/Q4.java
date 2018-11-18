import javax.swing.*;
import java.awt.*;

public class Q4 {
    public static void main(String[] args) {
        personInfo();
    }

    public static void personInfo(){
        String fullName = JOptionPane.showInputDialog("Please enter full name");
        //String middleName = JOptionPane.showInputDialog("Please enter middle name");

        int numCharacters = fullName.length();
        char initial = fullName.charAt(0);
        String nameInCaps = fullName.toUpperCase();
        String surname = fullName.substring(fullName.lastIndexOf(" "));

        String output = "Number of characters in name: " + numCharacters + "\nInitial of first name: " + initial +
                "\nName in in caps: " + nameInCaps + "\nSurname: " + surname;

        JOptionPane.showMessageDialog(null, output, "Name Information",
                JOptionPane.INFORMATION_MESSAGE);
    }
}