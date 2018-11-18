import javax.swing.*;
import java.awt.*;

public class Q6 {
    public static void main(String[] args) {
        String initialValueAsString = JOptionPane.showInputDialog("Please enter initial value to be cubed:");
        int initialValue = Integer.parseInt(initialValueAsString);
        String amountToBeCubedAsString = JOptionPane.showInputDialog("Please enter the amount of numbers after the " +
                "initial one that you would like to cubed");
        int amountToBeCubed = Integer.parseInt(amountToBeCubedAsString);

        cube(initialValue, amountToBeCubed);
    }
    public static void cube(int initial, int amount){
        JTextArea output = new JTextArea(8, 40);
        Font textAreaFont = new Font("monospaced", Font.PLAIN, 12);
        output.setFont(textAreaFont);
        output.setText("Numbers being cubed\n");
        output.append("Number    Cube\n");

        for(int i = initial; i <= amount; i++){
            output.append(i + "          " + (i * i * i) + "\n");
        }
        JOptionPane.showMessageDialog(null, output, "Numbers Cubed" ,
                JOptionPane.INFORMATION_MESSAGE);
    }
}