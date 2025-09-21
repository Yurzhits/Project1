package Lesson12;

//Программа на вход получает произвольный текст.
//В этом тексте может быть номер документа(один или несколько), емейл и номер телефона.
//Номер документа в формате: xxxx-xxxx-xx, где x - это любая цифра;
//номер телефона в формате: +(xx)xxxxxxx.
//Документ может содержать не всю информацию, т.е. например, может не содержать номер телефона, или другое.
//Необходимо найти эту информацию и вывести в консоль в формате:
//email: teachmeskills@gmail.com
//document number: 1423-1512-51
//и т.д

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        Pattern numDoc = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
        Pattern tel = Pattern.compile("\\+?\\(\\d{2}\\)\\d{7}");
        Pattern email = Pattern.compile("[a-zA-Z]{2,}@[a-z]{2,}\\.[a-z]{2,}");
        Matcher emailMat = email.matcher(text);
        if (emailMat.find()) {
            System.out.println("email: " + emailMat.group());
        }
        Matcher numDocMat = numDoc.matcher(text);
        while (numDocMat.find()) {
            System.out.println("document number: " + numDocMat.group());
        }
        Matcher telMat = tel.matcher(text);
        if (telMat.find()) {
            System.out.println("telephone number: " + telMat.group());
        }
    }
}

//Текст для проверки:
//Привет, мой email - teachmeskills@gmail.com, номер документа 1423-1512-51 и номер телефона +(12)3456789.