public abstract class Shape {
    private String color;

    // constructor: have to pass in color
    public Shape(String color) {
        this.color = color;
    }

    // Abstract methods to calculate area and perimeter
    public abstract double calculateArea();
    public abstract double calculateCircumference();

    // Normal method to return color
    public String getColor() {
        return color;
    }

    // Static method to return class name
    public String getClassName() {
        return "Shape";
    }
}
