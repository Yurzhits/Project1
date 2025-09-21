package Lesson12;

//Вывести в консоль из строки которую пользователь вводит с клавиатуры все аббревиатуры.
//Аббревиатурой будем считать слово от 2 до 6 символов, состоящее только из прописных букв, без чисел.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку с аббревиатурами:");
        String str = scanner.nextLine();
        Pattern abbreviation = Pattern.compile("[А-Я]{2,6}|[A-Z]{2,6}");
        Matcher m = abbreviation.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
