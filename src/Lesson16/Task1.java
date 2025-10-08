package Lesson16;

//На вход поступает массив строк, верните Map<String, Boolean>,
//где каждая отдельная строка является ключом,
//и ее значение равно true, если эта строка встречается в массиве 2 или более раз.
//Пример:
//wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
//wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
//wordMultiple(["c", "c", "c", "c"]) → {"c": true}

import java.util.HashMap;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = sc.nextLine();
        String[] words = str.split("[\\s,]+");  //  \\W+ почему с этим не работает?

        HashMap<String, Boolean> wordMultiple = new HashMap<>();
        for (String word : words) {
            String normalizedWord = word.toLowerCase();
            if (wordMultiple.containsKey(normalizedWord)) {
                wordMultiple.put(normalizedWord, true);
            } else {
                wordMultiple.put(normalizedWord, false);
            }
        }

        System.out.println("Итог: " + wordMultiple);
        sc.close();
    }
}
