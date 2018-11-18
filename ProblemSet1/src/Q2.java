import javax.swing.*;

public class Q2 {
    public static void main(String[] args) {
        JTextArea output = new JTextArea();
        output.setText("Yards to feet\n");
        output.append("Yards    Inches\n");

        for(int i =1; i <= 10; i++){

            int yards = 36;
            int inches = i * yards * 3 * 12;
            output.append(i + "    " + yards * i + "    " + inches + "\n");
        }

        JOptionPane.showMessageDialog(null, output, "Yards Converter", JOptionPane.INFORMATION_MESSAGE);
    }
}
