package be.abis.demo;

public class TestCar {

    public static void main(String[] args) {
        Wheel wheel1 = new Wheel("one");
        Wheel wheel2 = new Wheel("two");
        Wheel wheel3 = new Wheel("three");
        Wheel wheel4 = new Wheel("four");
        DrivingStrategy ds = new RearWheelDrive(wheel3,wheel4);
        Car c = new Car(wheel1,wheel2,wheel3,wheel4,ds);

        c.accelerate(120);
    }
}
