package PointAndMoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point = new MoveablePoint(3.4f, 5.6f,4,5);
        System.out.println(point);

        Point p2 = ((MoveablePoint) point).move();
        System.out.println(p2);

    }
}