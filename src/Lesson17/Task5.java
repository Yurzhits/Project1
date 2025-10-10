package Lesson17;

//Используя Supplier написать метод, который будет возвращать
//введенную с консоли строку задом наперед

import java.util.Scanner;
import java.util.function.Supplier;

public class Task5 {
    public static void main(String[] args) {
        Supplier<String> reservedStr = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку:");
            String strIn = scanner.nextLine();
            StringBuilder strInToReserved = new StringBuilder(strIn);
            String strReserved = strInToReserved.reverse().toString();
            scanner.close();
            return strReserved;
        };

        System.out.println("Результат: " + reservedStr.get());
    }
}
