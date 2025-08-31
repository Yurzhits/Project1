package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива:");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.print("Выберите способ ввода (1-рандом; 2-самостоятельно):");
        int enter = scanner.nextInt();
        switch (enter) {
            case 1: {
                for (int i = 0; i < size; i++) {
                    arr[i] = (int) (Math.random() * 10);//ввод рандомом
                }
                break;
            }
            case 2: {
                for (int i = 0; i < size; i++) {
                    System.out.println((i+1)+" элемент:");
                    arr[i]=scanner.nextInt();
                }
                break;
            }
        }



        //1
        System.out.println("Задача 1:");
        System.out.println("Прямой порядок:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Обратный порядок:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }



        //2 и 3
        System.out.println("Задача 2 и 3:");
        int max = Integer.MIN_VALUE;
        int max_ind = 0;
        int min = Integer.MAX_VALUE;
        int min_ind = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
                max_ind = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                min_ind = i;
            }
        }
        System.out.println("Максимальный элемент " + max + " с индексом " + max_ind);
        System.out.println("Минимальный элемент " + min + " с индексом " + min_ind);
        scanner.close();



        //4
        System.out.println("Задача 4:");
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("В массиве нет нулевых элементов");
        } else
            System.out.println("В массиве " + count + " нулевой(ых) элемент(а)");



        //5
        int arr5[] = new int[size];
        System.out.println("Задача 5:");
        for (int i = 0; i < size; i++) {
            arr5[i] = arr[size - 1 - i];
        }
        System.out.println("Полиндром данного массива:" + Arrays.toString(arr5));



        //6
        System.out.println("Задача 6:");
        int flag = 0;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                flag++;
            }
        }
        if (flag == size - 1) {
            System.out.println("Массив является возрастающей последовательностью");
        } else
            System.out.println("Массив не является возрастающей последовательностью");



        //****
        System.out.println("Задача *");
        System.out.println("Input:" + Arrays.toString(arr));
        if (arr[0] == 0 && size != 1) {
            System.out.println("Попробуйте еще раз с другим массивом (число не должно начинаться с нуля (ноль допускается))");
        } else {
            if (arr[size - 1] == 9) {
                for (int i = 0; i < size - 1; i++) {
                    arr[i]++;
                    if (arr[i] == 10) {
                        arr[i] = 0;
                    }
                }
                arr[size - 1] = 0;
            } else {
                arr[size - 1] += 1;
            }
            if (arr[0] == 0) {
                int size6 = size + 1;
                int arr6[] = new int[size6];
                for (int j = 1; j < size6 - 1; j++) {
                    arr6[0] = 1;
                    arr6[j] = arr[j - 1];
                }
                System.out.println("Output:" + Arrays.toString(arr6));
            } else {
                System.out.println("Output:" + Arrays.toString(arr));
            }
        }
        scanner.close();
    }
}
