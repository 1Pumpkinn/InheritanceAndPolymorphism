package Drinks;

public class Drinks {

    public String Brand;
    public boolean Healthy;
    public boolean Refreshing;

    public Drinks(String Brand, boolean Healthy, boolean Refreshing) {
        this.Brand = Brand;
        this.Healthy = Healthy;
        this.Refreshing = Refreshing;
    }

    public void drinkData() {
        System.out.println("Brand: " + Brand);
        System.out.println("Healthy: " + Healthy);
        System.out.println("Refreshing: " + Refreshing);
    }

    public void playerDrinked() {
        System.out.println("Player Drinked: " + Brand);
    }
}
