package company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders && name.equals(car.name);
    }

    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " - the car's engine is starting.");
    }

    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " - the car is accelerating.");
    }

    public void brake() {
        System.out.println(getClass().getSimpleName() + " - the car is braking.");
    }
}
