import javax.swing.*;

public class AnimalDriver {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Dog", new String[] {"Europe", "America", "Africa"}, 2.10, 10);
        JOptionPane.showMessageDialog(null, animal1.toString());
        JOptionPane.showMessageDialog(null, animal2.toString());

        Animal animal3 = new Animal();
        //animal3.setContinents();
        JOptionPane.showMessageDialog(null,animal3.getContinents());


        int sizeContinents = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of continents"));
        String[] continents = new String[sizeContinents];
        for(int i = 0; i < continents.length; i++){
            continents[i] = JOptionPane.showInputDialog("Please enter the continent name");
        }
        Animal animal4 = new Animal("Lion", continents, 5.21, 20);
        JOptionPane.showMessageDialog(null, animal4.toString());


    }

}
