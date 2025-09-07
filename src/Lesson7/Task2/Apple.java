package Lesson7.Task2;

public class Apple {
    private String color = "зеленое";

    public Apple() {
    }

    public Apple(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    String changeColor() {
        color = "желтое";
        return color;
    }
}
