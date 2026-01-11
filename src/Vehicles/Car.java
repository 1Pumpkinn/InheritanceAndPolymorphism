package Vehicles;

public class Car extends Vehicle {

    public Car(String Model, boolean Automatic, int Mph) {
        super(Model, Automatic, Mph);
    }

    @Override
    public void honked() {
        System.out.println("The Car Just Beeped");
    }
}
