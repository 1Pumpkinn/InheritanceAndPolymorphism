package Vehicles;

public class Truck extends Vehicle{

    public Truck(String Model, boolean Automatic, int Mph) {
        super(Model, Automatic, Mph);
    }

    @Override
    public void honked() {
        System.out.println("The Truck Just Honked");
    }
}
