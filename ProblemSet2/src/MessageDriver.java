import javax.swing.*;

public class MessageDriver {
    public static void main(String[] args) {

        Message message1 = new Message("John O'Connor", "James Cooper","hi");
        message1.setText("Hey how are you");

        JTextArea output = new JTextArea();
        output.setText("Message details\n");
        output.append("-----------------\n");
        output.append(message1.toString() + "\n\n");

        JOptionPane.showMessageDialog(null, output);
    }
}

