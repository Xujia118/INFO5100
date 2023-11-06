public class Square extends Shape implements java.io.Serializable {
    double a;

    public Square(String color, double a) {
        super(color);
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

    @Override
    public double calculateCircumference() {
        return 4 * a;
    }

    public String getClassName() {
        return "Square";
    }
}
