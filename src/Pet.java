public class Pet {
    private static int counter = 0;
    private int id;
    private int age;
    private int weight;
    private int height;
    private Boolean has_vaccination;
    private String name;
    private String gender;
    private String color;
    private String breed;

    public Pet(String name, int age, Boolean is_vaccinated, String gender) {
        id = ++ counter;
        this.name = name;
        this.age = age;
        this.has_vaccination = is_vaccinated;
        System.out.println("Pet" + id + " is " + name + ". she is " + age + " years old.");
    }

    public void accompany() {}
    public void eat() {}
    public void sleep() {}


}





