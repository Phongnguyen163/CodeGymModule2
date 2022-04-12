package colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(8.5, "blue", false);
        shapes[1] = new Rectangle(4.5, 9.3, "yellow", true);
        shapes[2] = new Square(5.6,"white" , true);

        Square square = new Square();

        for (Shape elements : shapes){
            System.out.println(elements.toString());
            if (elements instanceof Square){
                square.howToColor();
            }
        }
    }
}
