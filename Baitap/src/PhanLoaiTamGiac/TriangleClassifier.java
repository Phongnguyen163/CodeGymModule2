package PhanLoaiTamGiac;

public class TriangleClassifier implements Triangle{

    private int side1;
    private int side2;
    private int side3;

    static private String result = "";

    public TriangleClassifier(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String equiangularTriangle() {
        if (side1 == side2 && side1 == side3) {
            result = "Tam giac deu";
        }
        return result;
    }

    @Override
    public String isoscelesTriangle() {
        if (side1 == side2 || side1 == side3) {
            result = "Tam giac can";
        }
        return result;
    }

    @Override
    public String scaleneTriangle() {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            result = "Tam giac thuong";
        } else {
            result = "Khong phai tam giac";
        }
        return result;
    }
}
