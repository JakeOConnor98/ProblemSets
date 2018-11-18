import javax.swing.*;
import java.awt.*;

public class Q3 {
    public static void main(String[] args) {
        costOfCarpet();
    }

    public static void costOfCarpet(){
        String name = JOptionPane.showInputDialog("Please enter name");
        double length = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the room:"));
        double breadth = Double.parseDouble(JOptionPane.showInputDialog("Please enter the breadth of the room:"));
        double cost = Double.parseDouble(JOptionPane.showInputDialog("Please enter the cost per square metre:"));
        double area = length * breadth;
        double totalCost = area * cost;

        JTextArea textArea = new JTextArea(8,40);
        Font textAreaFont = new Font("monospaced", Font.PLAIN, 12);
        textArea.setFont(textAreaFont);

        textArea.append(String.format("%-40s \n %-40s%.2f m.\n %-40s%.2f m.\n %-40s%.2f m.\n %-40s%.2f euro\n " +
                        "%-40s%.2f euro", "Quotation for " + name, "Length of room: ", length,
                "Breadth of room: ", breadth, "Total area of room: ", area,
                "Cost per square metre of carpet: ", cost, "Total cost of carpet: ", totalCost));

        JOptionPane.showMessageDialog(null, textArea, "Carpet Calculator", JOptionPane.PLAIN_MESSAGE);
    }
}