package Lesson8.Task2_2;

public abstract class Figure {
    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract int findPerimeter();

    abstract double findSquare();
}
