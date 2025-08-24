package Lesson2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задачу:");
        int i = scanner.nextInt();
        switch (i) {
            case 1: {
                System.out.println("Введите число:");

                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    System.out.println("Ваше число четное");
                } else {
                    System.out.println("Ваше число нечетное");
                }
                break;
            }
            case 2: {
                System.out.println("Введите температутру на улице:");
                int t = scanner.nextInt();
                if (t > -5) {
                    System.out.println("Warm");
                } else if (t <= -5 && t > -20) {
                    System.out.println("Normal");
                } else {
                    System.out.println("Cold");
                }
                break;
            }
            case 3: {
                for (int j =10; j <= 20; j++) {
                    System.out.println(j * j);
                }
                break;
            }
            case 4: {
                int seven = 7;
                while (seven <= 98) {
                    System.out.println(seven);
                    seven += 7;
                }
                break;
            }
            case 5: {
                System.out.println("Введите целое положительное число:");
                while (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    if (number >0) {
                        int sum = 0;
                        for (int j = 1; j <= number; j++) {
                            sum += j;
                        }
                        System.out.println("Сумма чисел от одного до " + number + " равна " + sum);
                    } else {
                        System.out.println("Введенно не корректное число");
                    }
                }
                break;
            }
            default: {
                System.out.println("Такой задачи нет");
            }
        }
        scanner.close();
    }
}
