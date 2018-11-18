import javax.swing.*;
import java.lang.String;

public class Q1 {


    public static void main(String [] args) {

        int snackPrice = 2;

        String name = JOptionPane.showInputDialog("Enter name here");
        String classname = JOptionPane.showInputDialog("Enter class name here");
        String snacksAsNum = JOptionPane.showInputDialog("Enter number of snacks you wish to purchase");
        int snacks = Integer.parseInt(snacksAsNum);




        JOptionPane.showMessageDialog(null, "Your name is " + name +
                "\nYour Class Name is " + classname +
                "\nYour have bought " + snacks +
                "\nTotal Cost " + snacks * snackPrice +
                JOptionPane.INFORMATION_MESSAGE);




    }

}
