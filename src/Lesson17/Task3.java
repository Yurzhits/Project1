package Lesson17;

//Используя Function реализовать лямбду, которая будет принимать в себя
//строку в формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение),
//а возвращать сумму, переведенную сразу в доллары.

import java.util.Scanner;
import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите: ... BYN");
        String input = scanner.nextLine();

        Function<String, Double> convector = x -> {
            String[] inputInf = input.split(" ");
            Double belMoney = Double.valueOf(inputInf[0]);
            Double dollars = belMoney / 3;
            return dollars;
        };

        System.out.println("В долларах это " + convector.apply(input));
    scanner.close();
    }
}

