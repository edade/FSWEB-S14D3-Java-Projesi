package company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Override in Holden class");
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("Override in Holden class");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("Override in Holden class");
    }
}