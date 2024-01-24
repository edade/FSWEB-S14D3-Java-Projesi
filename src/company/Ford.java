package company;


    public class Ford extends Car {
        public Ford(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public void startEngine() {
            super.startEngine();
            System.out.println("Override in Ford class");
        }

        @Override
        public void accelerate() {
            super.accelerate();
            System.out.println("Override in Ford class");
        }

        @Override
        public void brake() {
            super.brake();
            System.out.println("Override in Ford class");
        }
    }

