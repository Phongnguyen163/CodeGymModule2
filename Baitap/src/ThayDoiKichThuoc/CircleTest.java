package ThayDoiKichThuoc;

public class CircleTest {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.floor(Math.random()*100));

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        System.out.println("Before: ");
        System.out.println(circle.toString());
        System.out.println("After: ");
        circle.resize(randomNumber);
        System.out.println(circle.toString());
    }
}
