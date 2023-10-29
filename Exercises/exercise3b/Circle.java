public class Circle extends Shape implements java.io.Serializable {
    double r;
    static double pi = 3.14; //static field

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return r * r * pi;
    }

    @Override
    public double calculateCircumference() {
        return 2 * pi * r;
    }

    public String getClassName() {
        return "Circle";
    }
}
