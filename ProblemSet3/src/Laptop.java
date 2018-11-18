import javax.swing.*;

public class Laptop extends Computer {
    private boolean touchScreen;

    public Laptop(){

    }

    public Laptop(String make, String type, int size, boolean touchScreen){
        super(make, type, size);
        setTouchScreen(touchScreen);
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public Laptop makeLaptop(){
        Laptop lap1 = new Laptop(JOptionPane.showInputDialog("Please enter Laptop make"),
                JOptionPane.showInputDialog("Please enter memory type"),
                Integer.parseInt(JOptionPane.showInputDialog("Please enter memory size")),
                Boolean.parseBoolean(JOptionPane.showInputDialog("Touch Screen- true or false")));
        return lap1;
    }

    public String toString(){
        return "ID: " + getId() + "\nMemory Type: " + memory.getType() + "\nMemory Size: " + memory.getSize() +
                "\nHas Touch Screen: " + isTouchScreen();
    }



}
