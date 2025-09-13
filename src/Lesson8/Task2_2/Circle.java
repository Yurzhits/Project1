package Lesson8.Task2_2;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    int findPerimeter() {
        int perimeter = (int) (2 * Math.PI * radius);
        return perimeter;
    }

    @Override
    double findSquare() {
        double square = Math.PI * Math.pow(radius, 2);
        return square;
    }
}
