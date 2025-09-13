package Lesson8.Task2_2;

public class Triangle extends Figure {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangle(String name, int firstSide, int secondSide, int thirdSide) {
        super(name);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    int findPerimeter() {
        int perimeter = firstSide + secondSide + thirdSide;
        return perimeter;
    }

    @Override
    double findSquare() {;
        double halfPerimeter = findPerimeter() / 2.0;
        double square = Math.sqrt((halfPerimeter * (halfPerimeter - firstSide) * (halfPerimeter - secondSide)
                * (halfPerimeter - thirdSide)));
        return square;
    }
}
