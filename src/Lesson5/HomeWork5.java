package Lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {

        //1
        System.out.println("Задача 1:");
        int[][] arr = new int[4][5];
        //1.1
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(0, 10);
            }
        }
        System.out.println("Исходный массив: " + Arrays.deepToString(arr));

        //1.2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        int num = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] += num;
            }
        }
        System.out.println("Исходный массив: " + Arrays.deepToString(arr));

        //1.3
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Сумма: " + sum);


        //2
        System.out.println("Задача 2:");
        String[][] arr2 = new String[8][8];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    arr2[i][j] = "W";
                } else {
                    arr2[i][j] = "B";
                }
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }


        //***
        System.out.println("Задача *:");
        System.out.print("Введите длину массива:");
        int n = scanner.nextInt();
        System.out.print("Введите ширину массива:");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        int number = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = number++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    array[i][j] = number++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
