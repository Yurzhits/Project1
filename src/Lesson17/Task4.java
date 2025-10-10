package Lesson17;

//Используя Consumer реализовать лямбду, которая будет принимать в себя
//строку в формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение),
//а выводить сумму, переведенную сразу в доллары.

import java.util.Scanner;
import java.util.function.Consumer;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите: ... BYN");
        String input = scanner.nextLine();

            Consumer <String> convector = x -> {
            String[] inputInf = input.split(" ");
            Double belMoney = Double.valueOf(inputInf[0]);
            Double dollars = belMoney / 3;
            System.out.println("В долларах это " + dollars);
        };

        convector.accept(input);
        scanner.close();
    }
}
