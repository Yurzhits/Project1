package Lesson16;

//На вход поступает массив непустых строк,
//создайте и верните Map<String, String> следующим образом:
//для каждой строки добавьте ее первый символ в качестве ключа с последним символом в качестве значения.
//Пример:
//pairs(["code", "bug"]) → {"b": "g", "c": "e"}
//pairs(["man", "moon", "main"]) → {"m": "n"}
//pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова: ");
        String str = sc.nextLine();
        String[] words = str.split("[\\s,]+");

        HashMap<String, String> pairs = new HashMap<>();
        for (String word : words) {
            String key = word.substring(0, 1);
            String value = word.substring(word.length() - 1);
            pairs.put(key, value);
        }

        System.out.println("Итог: " + pairs);
        sc.close();
    }
}
