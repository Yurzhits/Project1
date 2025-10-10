package Lesson17;

//Пользователь вводит в консоль дату своего рождения.
//Программа должна вернуть дату, когда пользователю исполнится 100 лет.
//Использовать Date/Time API.

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите дату своего рождения:");
        Scanner scanner=new Scanner(System.in);
        String inputBirthDay = scanner.nextLine();
        LocalDate birthDay = LocalDate.parse(inputBirthDay,DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println("Дата, когда вам исполнится 100 лет: " + birthDay.plusYears(100)
                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
    scanner.close();
    }
}
