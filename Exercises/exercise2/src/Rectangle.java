public class Rectangle extends Shape {
    double a;
    double b;

    public Rectangle(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculateCircumference() {
        return a * (a + b);
    }

    public String getClassName() {
        return "Rectangle";
    }
}
