public class Mug {
    private static int counter = 0;
    private int id;
    private String material;
    private int capacityInOunces;
    private String color;
    private boolean isInsulated;
    private boolean isReusable;
    private boolean isFull;

    public Mug() {
        id = ++ counter;
        System.out.println("Mug" + id + " is filled.");
    }

    public void fill() {}
    public void empty() {}
    public void fall() {}
}
