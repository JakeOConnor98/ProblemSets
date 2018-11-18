import javax.swing.*;

public class Q2 {
    public static void main(String[] args) {


        String firstName = JOptionPane.showInputDialog("Please enter first name here");
        String initial = JOptionPane.showInputDialog("Please enter initials for name here");
        String surname = JOptionPane.showInputDialog("Please enter last name here");
        String distanceAsString = JOptionPane.showInputDialog("How far of a distance have you cycled?");
        double distance = Double.parseDouble(distanceAsString);


        JOptionPane.showMessageDialog(null, "Cyclist Name:" + firstName +
                "\nInitials: " + initial + "\nSurname: " + surname +
                "\nDistance travelled: " + distance + "km" + "\nTotal Cost " +
                  String.format("%s%.2f", "€",calculateAmount(distance)));

    }

        public static double calculateAmount(double distance){

           double total = 0;

           if(distance <= 10)
           {
               total = distance * 0.07;
           }

           if(distance > 10)
           {
                total = ((distance - 10) * 0.10) + (10 * 0.07);
           }

           return total;


          }


    }




