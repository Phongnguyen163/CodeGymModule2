package LopFan;

public class Main {
    public static void main(String[] args) {
        final int slow = 1;
        final int medium = 2;
        final int fast = 3;
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(fast);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.turnOn();

        fan2.setSpeed(medium);
        fan2.setColor("blue");
        fan2.setRadius(5);
        fan2.turnOff();

        String f1 = fan1.toString();
        String f2 = fan2.toString();

        System.out.println("fan1: "+ f1);
        System.out.println("fan2: "+ f2);
    }
}
