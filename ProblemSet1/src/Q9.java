import javax.swing.*;
import java.awt.*;

public class Q9 {
    public static void main(String[] args) {
        JTextArea output = new JTextArea(8,40);
        Font textAreaFont = new Font("monospaced", Font.PLAIN, 12);
        output.setFont(textAreaFont);

        String numCowsAsString = JOptionPane.showInputDialog("Please enter number of cows");
        int numCows = Integer.parseInt(numCowsAsString);

        double[] weights = new double[numCows];

        for(int i = 0; i < weights.length; i++){
            String weightAsString = JOptionPane.showInputDialog("Please enter the weight of cow: " + i);
            double weight = Double.parseDouble(weightAsString);
            weights[i] = weight;
        }

        String weightList = "";
        for (int i = 0; i < weights.length; i++){
            weightList = weightList + weights[i] + ", ";
        }

        output.append("Weights: " + weightList.substring(0, weightList.length() -2));

        int under250 = 0;
        for(int i = 0; i < weights.length; i++){
            if(weights[i] < 250){
                under250++;
            }
        }
        output.append("\nNumber under 250kg: " + under250);

        int numOver400 = 0;
        for(int i = 0; i < weights.length; i++){
            if(weights[i] > 400){
                numOver400++;
            }
        }
        int percentage = (numOver400 * 100) / weights.length;
        output.append("\nPercentage over 400kg: " + percentage + "%");

        double lightest = 0.0f;
        for(int i = 0; i < weights.length; i++){
            if(i == 0){
                lightest = weights[i];
            }else if(weights[i] < lightest){
                lightest = weights[i];
            }
        }
        output.append("\nLightest animal: " + lightest + "kg");

        double total = 0.0f;
        for(int i = 0; i < weights.length; i++){
            total += weights[i];
        }
        double average = total / weights.length;
        output.append("\nAverage weight: " + average + "kg");

        JOptionPane.showMessageDialog(null, output);
    }
}
