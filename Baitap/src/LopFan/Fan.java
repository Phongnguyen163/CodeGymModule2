package LopFan;

public class Fan {
    private int speed = 1;
    private double radius = 5;
    private String color = "blue";
    boolean on = true;

    public Fan() {
    }

    public int speed(int spd) {
        return spd;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int spd) {
        this.speed = spd;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public int getSpeed() {
        return this.speed;
    }
    public String toString(){
        if (this.on){
            return "speed : "+this.speed+", color : "+this.color+", radius: " +this.radius+", fan is on";
        }else {
            return "color : "+this.color+", radius: " +this.radius+", fan is off!!!";
        }
    }
}
