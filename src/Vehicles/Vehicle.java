package Vehicles;

public class Vehicle {

    public String Model;
    public boolean Automatic;
    public int Mph;

    public Vehicle(String Model, boolean Automatic, int Mph) {
        this.Model = Model;
        this.Automatic = Automatic;
        this.Mph = Mph;
    }

    public void honked() {
        System.out.println("Vehicle Honked");
    }

    public void vehicleInfo() {
        System.out.println("Model " + Model);
        System.out.println("Automatic " + Automatic);
        System.out.println("MPH " + Mph);

    }

}
