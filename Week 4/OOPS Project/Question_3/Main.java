public class Main {

    public static void main(String[] args) {

        Point p1 = new Point();

        p1.setX(10);
        p1.setY(20);
        p1.display();

        Point p2 = new Point(30, 40);
        p2.display();

        p2.setXY(50, 60);
        p2.display();
    }
}