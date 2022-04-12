package HeCacDoiTuongHinhHoc;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        CircleComparator[] circles = new CircleComparator[3];
        circles[0] = new CircleComparator(3.6);
        circles[1] = new CircleComparator();
        circles[2] = new CircleComparator(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (CircleComparator circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (CircleComparator circle : circles) {
            System.out.println(circle);
        }
    }
}
