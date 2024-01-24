package company;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println(getName() + " in Mitsubishi class");
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println(getName() +  " in Mitsubishi class");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println( getName() +"Override in Mitsubishi class");
    }
}