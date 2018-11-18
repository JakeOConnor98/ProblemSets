import javax.swing.*;

public class Q7 {
    public static void main(String[] args) {

        String intAsString = JOptionPane.showInputDialog("Please enter as positive integer value(-1 to quit)");

        while(!intAsString.equals("-1")){
            int number = Integer.parseInt(intAsString);
            if(isEven(number)) {
                JOptionPane.showMessageDialog(null, number + " is even");
            }
            else {
                JOptionPane.showMessageDialog(null, number + " is odd");
            }
            intAsString = JOptionPane.showInputDialog("Please enter as positive integer value(-1 to quit)");
        }
    }

        public static boolean isEven(int num){
          if(num % 2 == 0)
          {
              return true;
          }
          else
          {
             return false;
          }
    }
}
