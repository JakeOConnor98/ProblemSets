import java.lang.reflect.Array;
import java.util.Arrays;

public class Animal {

    private String type;
    private String[] continents;
    private double weight;
    private int age;

    public void setType(String type) {
        this.type = type;
    }

    public void setContinents(String[] continents) {
        this.continents = continents;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

     public String[] getContinents(){
        return continents;
     }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public Animal(){
        this("Unknown", null, 0.0, 0);
    }
    public Animal(String type, String[] continents, double weight, int age){
        setType(type);
        setContinents(continents);
        setWeight(weight);
        setAge(age);
    }

    public String toString(){
        return "Type: " + getType() + "\nContinents: " + Arrays.toString(getContinents()) + "\nWeight: " + getWeight() +
                "\nAge: " + getAge();
    }

}
