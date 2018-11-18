import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *   JMenuFrame: includes one JMenuBar, 3 JMenus and 3 JMenuItem objects.
 *   When a menu item is selected, a string
 *   showing which menu choice is selected will appear in a label on the frame.
 */
public class FriendsJMenuFrame extends JFrame implements ActionListener {
    JMenu mikeMenu;
    JMenu jamesMenu;
    JMenu maryMenu;
    JLabel response; // to hold a result from the menus

    public static void main(String[] args) {
        FriendsJMenuFrame frame = new FriendsJMenuFrame();
        frame.setVisible(true);
    }

    public FriendsJMenuFrame() {
        Container cPane;

        //set the frame properties
        setTitle("Friends");
        setSize(300, 200);
        setResizable(false);
        setLocation(250, 200);
        // shut down the program when the window is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());

        //invoke a user-written method create two menus and their menu items
        // done by separate method to make the constructor shorter
        createMikeMenu();
        createJamesMenu();
        createMaryMenu();

        //and add them to the menubar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        //menuBar.setBackground(Color.red);
        menuBar.add(mikeMenu);
        menuBar.add(jamesMenu);
        menuBar.add(maryMenu);

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
        menuName = event.getActionCommand(); // what's written on the item that was clicked
        // note the String comparison
        if (menuName.equals("Quit")) {
            System.exit(0);
        } // end if
        else {
            response.setText("I really like '" + menuName);
        } // end else
    } // end actionPerformend

    /**
     * Creates File menu and its menu items
     */
    private void createMikeMenu() {
        JMenuItem item; // declare a re-usable JMenuItem object

        // first, create the menu: then you can start on the items
        mikeMenu = new JMenu("Mike");

        mikeMenu.setBackground(Color.red);

        // create the first item
        item = new JMenuItem("Cool");        //New
        // make sure the program is listening for clicks: handle them in 'this' class
        item.addActionListener(this);
        // attach the item to the menu
        mikeMenu.add(item);
    }

    // repeat for all the other menu items in the File menu


    private void createJamesMenu() {
        JMenuItem item;

        jamesMenu = new JMenu("James");

        jamesMenu.setBackground(Color.blue);

        item = new JMenuItem("Nice");      //Cut
        item.addActionListener(this);
        jamesMenu.add(item);

    }


    private void createMaryMenu() {
        JMenuItem item;

        maryMenu = new JMenu("Mary");

        maryMenu.setBackground(Color.green);

        item = new JMenuItem("Cute");      //Cut
        item.addActionListener(this);
        maryMenu.add(item);

    }
}


    // end createEditMenu
 // end class