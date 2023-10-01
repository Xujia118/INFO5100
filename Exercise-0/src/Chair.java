public class Chair {
    private static int counter = 0;
    private int id;
    private String material;
    private String color;
    private boolean hasArmrests;
    private boolean isAdjustable;
    private int legs;
    private boolean isCushioned;
    private boolean hasWheels;

    public Chair() {
        id = ++ counter;
        System.out.println("Chair" + id + " is available.");
    }

    public void sit() {}
    public void rotate() {}
    public void adjust_height() {}

}
