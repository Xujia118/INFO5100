public class Bicycle {
    // Fields
    private static int counter = 0;
    private int id;
    private int cadence;
    private int gear;
    private int speed;
    private int weight;
    private int price;
    private String brand;
    private String Country;
    private String Type;

    // Constructor
    public Bicycle() {
        id = ++counter;
        System.out.println("Bicycle" + id + " is created.");
    }

    // Methods
    public void Travel() {}
    public void Break() {}
    public void Park() {}
}
