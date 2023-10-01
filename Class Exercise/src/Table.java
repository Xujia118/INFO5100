public class Table {
    private static int counter = 0;
    private int id;
    private int weight;
    private String material;
    private int price;
    private int num_legs;
    private int size;
    private String color;
    private int num_years_used;
    private String brand;

    public Table() {
        id = ++counter;
        System.out.println("Table" + id + " is made.");
    }

    public void stand() {}
    public void break_down() {}
    public void support() {}
}
