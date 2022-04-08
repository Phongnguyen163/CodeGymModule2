package PointAndMoveablePoint;

public class MoveablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] speed = {getxSpeed(),getySpeed()};
        return speed;
    }

    @Override
    public String toString() {
        return String.format("x=%.2f, y=%.2f, speed=(%.2f,%.2f)",getX(),getY(),getxSpeed(),getySpeed());
    }
    public MoveablePoint move(){
        float x = super.getX();
        float y = super.getY();
        x +=xSpeed;
        y +=ySpeed;
        setX(x);
        setY(y);
        return this;
    }
}
