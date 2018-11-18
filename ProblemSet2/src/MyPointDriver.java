public class MyPointDriver {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint( 10, 8);
        System.out.println(point1.toString());
        System.out.println(point2.toString());
        point2.moveHorizontally(-4);
        System.out.println(point2.toString());
        point2.moveVertically(2);
        System.out.println(point2.toString());


    }
}
