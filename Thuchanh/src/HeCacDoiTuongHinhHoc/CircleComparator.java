package HeCacDoiTuongHinhHoc;

public class CircleComparator extends Circle
        implements Comparable<CircleComparator> {

    public CircleComparator() {
    }

    public CircleComparator(double radius) {
        super(radius);
    }

    public CircleComparator(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(CircleComparator o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}