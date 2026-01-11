import Animals.*;
import Vehicles.Car;
import Vehicles.Truck;
import Vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {

        /* INHERITANCE & POLYMORPHISM */

        Dog bengie = new Dog("bengie.png", "Bengie", 11);
        Dog jeremy = new Dog("jeremy.png", "Jeremy", 7);

        Cat whiskers = new Cat("whiskers.png", "Whiskers", 4);

        Car Mclaren = new Car("Mclaren Senna", true, 208);
        Truck Kenworth = new Truck("T680", false, 64);


        // IF SOMETHING REPEATS... WE CAN DO SOMETHING

        bengie.displayInfo();
        bengie.birthday();

        bengie.displayInfo();
        bengie.makeSound();

        whiskers.displayInfo();
        whiskers.displayInfo();
        whiskers.makeSound();

        Animal myCuteAnimal;
        myCuteAnimal = new Dog("charlie.png", "Charlie", 13);
        myCuteAnimal.makeSound();
        ((Dog) myCuteAnimal).bellyRub();

        Mclaren.vehicleInfo();
        Mclaren.honked();

        Kenworth.vehicleInfo();
        Kenworth.honked();

    }
}
