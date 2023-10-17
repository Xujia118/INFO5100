public class Main {
    public static void main(String[] args) {

        // Calculate area and circumference for circle, rectangle, triangle and square
        Circle circle = new Circle("blue", 3.0);
        System.out.println("Circle area is " + circle.calculateArea());
        System.out.println("Circle circumference is " + circle.calculateCircumference());

        Rectangle rectangle = new Rectangle("red", 4, 5);
        System.out.println("Rectangle area is " + rectangle.calculateArea());
        System.out.println("Rectangle circumference is " + rectangle.calculateCircumference());

        Triangle triangle = new Triangle("yellow", 3, 4, 5);
        System.out.println("Triangle area is " + triangle.calculateArea());
        System.out.println("Triangle circumference is " + triangle.calculateCircumference());

        Square square = new Square("brown", 9);
        System.out.println("Square area is " + square.calculateArea());
        System.out.println("Square circumference is " + square.calculateCircumference());

        // Polymorphism
        // Demon 1: Use parent class Shape to put all instances of different children classes in a same array
        Shape[] shapes = {circle, rectangle, triangle, square};

        // Demo 2: Loop through the array for the getName method
        for (Shape shape : shapes) {
            String result = shape.getClassName();
            System.out.println(result);
        }
    }
}