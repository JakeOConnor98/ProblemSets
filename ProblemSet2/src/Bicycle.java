public class Bicycle {

    private String ownersName;
    private double value;
    private String make;

    public String getOwnersName() {
        return ownersName;
    }

    public double getValue() {
        return value;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Bicycle(String ownersName, double value, String make){
        this.ownersName = ownersName;
        this.value = value;
        this.make = make;
    }

    public Bicycle(){
        ownersName = "None Entered";
        value = 0.0;
        make = "NA";
    }

    public String toString(){
        return "Name: " + getOwnersName() + "\nValue: " + getValue() + "\nMake: " + getMake();
    }
}
