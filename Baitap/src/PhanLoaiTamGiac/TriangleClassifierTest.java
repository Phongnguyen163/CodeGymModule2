package PhanLoaiTamGiac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    @Test
    void equiangularTriangle() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(2,2,2);
        String triangleCheck = triangleClassifier.equiangularTriangle();
        String expected="Tam giac deu";
        assertEquals(expected, triangleCheck);
    }

    @Test
    void isoscelesTriangle() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(2,2,3);
        String triangleCheck = triangleClassifier.isoscelesTriangle();
        String expected = "Tam giac can";
        assertEquals(expected, triangleCheck);
    }

    @Test
    void scaleneTriangle() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(3,4,5);
        String triangleCheck = triangleClassifier.scaleneTriangle();
        String expected = "Tam giac thuong";
        assertEquals(expected, triangleCheck);
    }

    @Test
    void scaleneTriangle2() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(8,2,3);
        String triangleCheck = triangleClassifier.scaleneTriangle();
        String expected = "Khong phai tam giac";
        assertEquals(expected, triangleCheck);
    }

    @Test
    void scaleneTriangle3() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(-1,2,1);
        String triangleCheck = triangleClassifier.scaleneTriangle();
        String expected = "Khong phai tam giac";
        assertEquals(expected, triangleCheck);
    }

    @Test
    void scaleneTriangle4() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(0,1,1);
        String triangleCheck = triangleClassifier.scaleneTriangle();
        String expected = "Khong phai tam giac";
        assertEquals(expected, triangleCheck);
    }
}