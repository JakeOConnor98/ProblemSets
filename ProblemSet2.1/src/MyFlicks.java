import javax.swing.*;
import java.util.ArrayList;
import java.util.*;

public class MyFlicks {
    public static void main(String[] args) {

        List<Film> catalog = new ArrayList<>();
        int numFilms = Integer.parseInt(JOptionPane.showInputDialog("Please enter number of films"));

        for (int i = 0; i < numFilms; i++) {
            catalog.add(new Film(JOptionPane.showInputDialog("Please enter the film title")
                    , JOptionPane.showInputDialog("Please enter the director")
                    , Integer.parseInt(JOptionPane.showInputDialog("Please enter the duration"))));
        }

        displayFilms(catalog);
    }

    public static void displayFilms(List<Film> catalog) {
        JTextArea output = new JTextArea();
        for (Film film : catalog) {
            output.append(film.toString());
        }

        output.append("\n\nNumber of films: " + Film.getCounter() + "\n\n");
        JOptionPane.showMessageDialog(null, output);
    }
}
