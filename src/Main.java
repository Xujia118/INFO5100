public class Main {
    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        Bicycle bicycle3 = new Bicycle();

        Table table1 = new Table();
        Table table2 = new Table();
        Table table3 = new Table();

        Chair chair1 = new Chair();
        Chair chair2 = new Chair();
        Chair chair3 = new Chair();

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        Computer computer3 = new Computer();

        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        Mug mug1 = new Mug();
        Mug mug2 = new Mug();
        Mug mug3 = new Mug();

        Pet pet1 = new Pet("Susie", 4, true, "Female");
        Pet pet2 = new Pet("Sniffy", 1, false, "Male");
        Pet pet3 = new Pet("Happy", 2, true, "Female");

        Scale scale1 = new Scale();
        Scale scale2 = new Scale();
        Scale scale3 = new Scale();

        Cooker cooker1 = new Cooker();
        Cooker cooker2 = new Cooker();
        Cooker cooker3 = new Cooker();

        Bicycle.MountainBike mountainBike1 = new Bicycle.MountainBike("Front", "Michelin");
        Bicycle.MountainBike mountainBike2 = new Bicycle.MountainBike("Back", "Continental");
        Bicycle.MountainBike mountainBike3 = new Bicycle.MountainBike("Front", "Michelin");
    }
}