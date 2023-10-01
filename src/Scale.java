public class Scale {
    private static int counter = 0;
    private int id;
    private String brand;
    private String model;
    private double maxWeight;
    private String unitOfMeasurement;
    private boolean isDigital;
    private boolean isBatteryPowered;
    private double currentWeight;

    public Scale() {
        id = ++counter;
        System.out.println("Scale" + id + " is overload!");
    }

    public void weigh() {}
    public void zeroed() {}
    public void display() {}

}
