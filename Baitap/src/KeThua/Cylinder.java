package KeThua;

public class Cylinder extends Circle {
    private double h;

    public Cylinder () {

    }

    public Cylinder (double radius, String color, double h ) {
        super(radius, color);
        this.h = h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getH() {
        return this.h;
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String toString() {
        return "Cylinder{" + "h= " + h + ", Radius: "+ getRadius()+ ", Color: "+getColor()+ '}';
    }

    public double getV() {
        return super.getArea() * this.h;
    }
}
