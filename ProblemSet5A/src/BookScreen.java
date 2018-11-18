import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.Book;

/**
 *   JMenuFrame: includes one JMenuBar, 3 JMenus and 3 JMenuItem objects.
 *   When a menu item is selected, a string
 *   showing which menu choice is selected will appear in a label on the frame.
 */

public class BookScreen extends JFrame implements ActionListener {
    JMenu fileMenu;
    JMenu bookMenu;
    JLabel response; // to hold a result from the menus

    public static void main(String[] args) {
        BookScreen frame = new BookScreen();
        frame.setVisible(true);
    }

    public BookScreen() {
        Container cPane;

        //set the frame properties
        setTitle("BookList");
        setSize(300, 200);
        setResizable(false);
        setLocation(250, 200);
        // shut down the program when the window is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());

        //invoke a user-written method create two menus and their menu items
        // done by separate method to make the constructor shorter
        createFileMenu();
        createBookMenu();

        //and add them to the menubar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        //menuBar.setBackground(Color.red);
        menuBar.add(fileMenu);
        menuBar.add(bookMenu);

        //create and position reponse label
        response = new JLabel("Hello, this is your menu tester.");
        response.setSize(250, 50); // optional
        cPane.add(response);
    } // end constructor

    /**
     * when an item is clicked, response starts here
     */
    public void actionPerformed(ActionEvent event) {
        String menuName;
        String myBook;
        menuName = event.getActionCommand();
        myBook = event.getActionCommand();// what's written on the item that was clicked
        // note the String comparison
        if (menuName.equals("Quit")) {
            System.exit(0);
        } // end if
        else if (menuName.equals("Add")){
            JOptionPane.showInputDialog("Please enter name of book");

        }
        else if (menuName.equals("Display")){

            response.setText("Details of Book: " +
                    "\n\nName:" + myBook);
        }
        // end else
    } // end actionPerformend


    private void createFileMenu() {
        JMenuItem item; // declare a re-usable JMenuItem object

        // first, create the menu: then you can start on the items
        fileMenu = new JMenu("File");

        fileMenu.setBackground(Color.red);

        // create the first item
        item = new JMenuItem("Quit");        //New
        // make sure the program is listening for clicks: handle them in 'this' class
        item.addActionListener(this);
        // attach the item to the menu
        fileMenu.add(item);
    }

    // repeat for all the other menu items in the File menu


    private void createBookMenu() {
        JMenuItem item;

        bookMenu = new JMenu("Book");

        bookMenu.setBackground(Color.blue);

        item = new JMenuItem("Add");      //Cut
        item.addActionListener(this);
        bookMenu.add(item);
        //item = JOptionPane.showInputDialog("Please enter name of book");

        item = new JMenuItem("Display");      //Cut
        item.addActionListener(this);
        bookMenu.add(item);

    }
}
