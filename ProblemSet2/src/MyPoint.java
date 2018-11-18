public class MyPoint {

    private int xVal;
    private int yVal;

    public int getxVal() {
        return xVal;
    }

    public int getyVal() {
        return yVal;
    }

    public void setxVal(int xVal) {
        this.xVal = xVal;
    }

    public void setyVal(int yVal) {
        this.yVal = yVal;
    }

    public MyPoint(){
        xVal = 0;
        yVal = 0;
    }

    public MyPoint(int x, int y){
        xVal = x;
        yVal = y;
    }

    public void moveHorizontally(int units){
        xVal = xVal + units;

    }

    public void moveVertically(int units){
        yVal = yVal + units;
    }

    public void translate(int hUnits, int vUnits){
        moveHorizontally(hUnits);
        moveVertically(vUnits);

        //xVal = xVal + hUnits;


    }

    public double distanceFromOrigin(){
           double hypotenuse;

           hypotenuse = Math.sqrt(xVal*xVal + yVal*yVal);

           return hypotenuse;
    }

    public String toString(){

        return "X Value" + getxVal() + "\nV Value" + getyVal();
    }


}
