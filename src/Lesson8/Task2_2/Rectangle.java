package Lesson8.Task2_2;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(String name, int width, int length) {
        super(name);
        this.width = width;
        this.length = length;
    }

    @Override
    int findPerimeter() {
        int perimeter = (int) (2 * (width + length));
        return perimeter;
    }

    @Override
    double findSquare() {
        double square = width * length;
        return square;
    }
}
