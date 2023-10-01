public class Phone {
    private static int counter = 0;
    private int id;
    private String brand;
    private String model;
    private String operatingSystem;
    private int storageCapacity;
    private boolean isLocked;
    private String phoneNumber;
    private double batteryLevel;

    public Phone() {
        id = ++counter;
        System.out.println("Phone" + id + " is calling.");
    }

    public void text_message() {}
    public void call() {}
    public void watch_videos() {}
}
