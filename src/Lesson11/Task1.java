package Lesson11;

//1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
//Вывести найденные строки и их длину.

//2. Ввести 3 строки с консоли.
//Упорядочить и вывести строки в порядке возрастания значений их длины.

//3. Ввести 3 строки с консоли.
//Вывести на консоль те строки, длина которых меньше средней, а также их длину.

//4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
//Если таких слов несколько, найти первое из них.

//5. Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки.
// Например, "Hello" -> "HHeelllloo".

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String str2 = scanner.nextLine();
        System.out.println("Введите третью строку:");
        String str3 = scanner.nextLine();

        scanner.close();

        int length1 = str1.length();
        int length2 = str2.length();
        int length3 = str3.length();

        String shortest = "";
        String middle = "";
        String longest = "";

        if (length1 >= length2 && length1 >= length3) {
            longest = str1;
            if (length2 > length3) {
                shortest = str3;
                middle = str2;
            } else {
                shortest = str2;
                middle = str3;
            }
        }
        if (length2 >= length1 && length2 >= length3) {
            longest = str2;
            if (length1 > length3) {
                shortest = str3;
                middle = str1;
            } else {
                shortest = str1;
                middle = str3;
            }
        }
        if (length3 >= length1 && length3 >= length2) {
            longest = str3;
            if (length1 > length2) {
                shortest = str2;
                middle = str1;
            } else {
                shortest = str1;
                middle = str2;
            }
        }

        //1
        System.out.println("Задание 1:");
        System.out.println("Самая длинная строка <" + longest + "> с длинной " + longest.length());
        System.out.println("Самая короткая строка <" + shortest + "> с длинной " + shortest.length());

        //2
        System.out.println("Задание 2:");
        System.out.println(shortest);
        System.out.println(middle);
        System.out.println(longest);

        //3
        System.out.println("Задание 3:");
        int averageLength = (length1 + length2 + length3) / 3;
        String[] arrStr = {
                str1,
                str2,
                str3
        };
        int count = 0;
        for (String str : arrStr) {
            if (str.length() < averageLength) {
                System.out.println("Строка, длина которой меньше средней: " + str + ". Длина: " + str.length());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Таких строк нет");
        }

        //4
        System.out.println("Задание 4:");
        String uniqueChar = "";

        if (isUniqueChars(str1)) {
            uniqueChar = str1;
        } else if (isUniqueChars(str2)) {
            uniqueChar = str2;
        } else if (isUniqueChars(str3)) {
            uniqueChar = str3;
        } else {
            System.out.println("Нет слов без дублирующихся букв");
        }

        System.out.println("Слово состоящее из различных символов: " + uniqueChar);

        //5
        System.out.println("Задание 5:");
        StringBuilder str = new StringBuilder();

        for (char c : str1.toCharArray()) {
            str.append(c).append(c);
        }
        System.out.println(str);

    }

    private static boolean isUniqueChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
