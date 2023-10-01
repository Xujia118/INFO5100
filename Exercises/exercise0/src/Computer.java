public class Computer {
    private static int counter = 0;
    private int id;
    private int weight;
    private String brand;
    private int price;
    private int capacity_RAM;
    private int capacity_SSD;
    private String country_origin;
    private int has_free_office;
    private int size_screen;

    public Computer() {
        id = ++counter;
        System.out.println("Computer" + id + " is turned on.");
    }

    public void let_work() {}
    public void play_videos() {}
    public void surf_internet() {}
}

