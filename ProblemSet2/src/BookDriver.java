import javax.swing.*;

public class BookDriver {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Lord of the Rings", 19.99, "IEE1234587", 585);
        Book book3 = new Book();

        book3.setTitle(JOptionPane.showInputDialog("Please enter the book title"));
        book3.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Please enter the price")));
        book3.setIsbn(JOptionPane.showInputDialog("Please enter the ISBN"));
        book3.setPages(Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages")));

        JTextArea output = new JTextArea();
        output.append("Book details\n");
        output.append("-----------------\n");
        output.append(book1.toString() + "\n\n");
        output.append(book2.toString() + "\n\n");
        output.append(book3.toString() + "\n\n");

        JOptionPane.showMessageDialog(null, output);
    }
}




