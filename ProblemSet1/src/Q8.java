import javax.swing.*;

public class Q8 {
    public static void main(String[] args) {
        String arraySize = JOptionPane.showInputDialog("Please enter size of array");
        int size = Integer.parseInt(arraySize);

        int[] numbers = new int[size];

        for(int i = 0; i <= numbers.length; i++){
            String numAsString = JOptionPane.showInputDialog("Please enter an Integer" + i + ": ");
            int num = Integer.parseInt(numAsString);
        }

        JOptionPane.showMessageDialog(null, "First value is: " + numbers[0] +
                "\nFifth value is: " + numbers[4]);
    }
}
