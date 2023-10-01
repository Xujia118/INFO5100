public class Cooker {
    private static int counter = 0;
    private int id;
    private String brand;
    private String model;
    private int capacityInLiters;
    private String fuelType;
    private boolean hasOven;
    private boolean isElectric;
    private boolean isOn;

    public Cooker() {
        id = ++counter;
        System.out.println("Cooker" + id + " makes yummy food.");
    }

    public void cook() {}
    public void stew() {}
    public void bake() {}
}
