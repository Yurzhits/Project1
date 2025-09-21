package Lesson11;

//Дана строка произвольной длины с произвольными словами.
//Написать программу для проверки является ли любое выбранное слово в строке палиндромом.
//Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е слово в этой строке палиндромом.
//Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций:
//например, в строке 5 слов, а на вход программе передали число 500.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        String[] words = str.split(" ");

        System.out.println("Введите номер слова, которое хотите проверить:");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num < 0 || num > words.length) {
                System.out.println("Введите слово от 1 до " + words.length);
            } else {
                if (isPalindrome(words[num - 1])) {
                    System.out.println("Слово под номером " + num + " является полиндромом.");
                }else {
                    System.out.println("Слово под номером " + num + " не является полиндромом.");
                }
            }
        }
    }

    private static boolean isPalindrome(String word) {
        String reverseWord = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reverseWord); //почему если тут написать compareto и в условии добавить ==1, то оно не работает?
    }
}
