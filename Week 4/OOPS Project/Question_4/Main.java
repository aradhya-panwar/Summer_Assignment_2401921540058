public class Main {

    public static void main(String[] args) {

        Box obj1 = new Box(5, 4);

        System.out.println("Area = " + obj1.area());

        Box3D obj2 = new Box3D(5, 4, 3);

        System.out.println("Area = " + obj2.area());
        System.out.println("Volume = " + obj2.volume());
    }
}