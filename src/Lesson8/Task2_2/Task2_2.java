package Lesson8.Task2_2;

//Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
//Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя абстрактный класс/методы).
//Создать массив из 5 разных фигур.
//Вывести на экран сумму периметра всех фигур в массиве.

import java.util.Random;
import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Figure arr[] = new Figure[5];
        int allPerimeter = 0;
        double allSquare = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Фигура номер " + (i + 1));
            int choice = random.nextInt(1, 4);
            switch (choice) {
                case 1: {
                    System.out.println("Для круга:");
                    System.out.println("Введите радиус круга:");
                    double radius = scanner.nextDouble();
                    System.out.println("Назовите фигуру:");
                    String name = scanner.next();
                    Circle circle = new Circle(name, radius);
                    int perimeter = circle.findPerimeter();
                    System.out.println("Периметр данного круга: " + perimeter);
                    allPerimeter += perimeter;
                    double square = circle.findSquare();
                    System.out.println("Площадь данного круга: " + square);
                    allSquare += square;
                    break;
                }
                case 2: {
                    System.out.println("Для прямоугольника:");
                    System.out.println("Введите длину:");
                    int length = scanner.nextInt();
                    System.out.println("Введите ширину:");
                    int width = scanner.nextInt();
                    System.out.println("Назовите фигуру:");
                    String name = scanner.next();
                    Rectangle rectangle = new Rectangle(name, width, length);
                    int perimeter = rectangle.findPerimeter();
                    System.out.println("Периметр данного прямоугольника: " + perimeter);
                    double square = rectangle.findSquare();
                    System.out.println("Площадь данного прямоугольника: " + square);
                    allPerimeter += perimeter;
                    allSquare += square;
                    break;
                }
                case 3: {
                    System.out.println("Для треугольника:");
                    System.out.println("Введите 1 сторону:");
                    int firstSide = scanner.nextInt();
                    System.out.println("Введите 2 сторону:");
                    int secondSide = scanner.nextInt();
                    System.out.println("Введите 3 сторону:");
                    int thirdSide = scanner.nextInt();//можно еще добавить проверку(сумма двух сторон больше третьей)
                    System.out.println("Назовите фигуру:");
                    String name = scanner.next();
                    Triangle triangle = new Triangle(name, firstSide, secondSide, thirdSide);
                    int perimeter = triangle.findPerimeter();
                    System.out.println("Периметр данного треугольника: " + perimeter);
                    double square = triangle.findSquare();
                    System.out.println("Площадь данного треугольника: " + square);
                    allPerimeter += perimeter;
                    allSquare += square;
                    break;
                }
            }
        }
        System.out.println("ИТОГ:");
        System.out.println("ОБЩИЙ ПЕРИМЕТР:" + allPerimeter);
        System.out.println("ОБЩАЯ ПЛОЩАДЬ:" + allSquare);
        scanner.close();
    }
}
