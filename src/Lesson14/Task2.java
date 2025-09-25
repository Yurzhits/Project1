package Lesson14;

//Допустим есть txt файл с номерами документов.
//Номером документа является строка, состоящая из букв и цифр(без служебных символов).
//Пусть этот файл содержит каждый номер документа с новой строки
//и в строке никакой другой информации, только номер документа.

//Валидный номер документа должен иметь длину 15 символов и начинаться с последовательности docnum
//(далее любая последовательность букв/цифр) или contract(далее любая последовательность букв/цифр).

//Написать программу для чтения информации из входного файла - путь к входному файлу должен задаваться через консоль.

//Программа должна проверять номера документов на валидность.
//Валидные номера документов следует записать в один файл-отчет.
//Невалидные номера документов следует записать в другой файл-отчет,
//но после номеров документов следует добавить информацию о том, почему этот документ не валиден.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу: ");
        String path = scanner.nextLine(); //D:\\C37\\task2.txt
        StringBuilder sb = new StringBuilder();

        try (FileReader fileReader = new FileReader(path)) {
            int i;
            while ((i = fileReader.read()) != -1) {
                sb.append((char) i);
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }

        String[] docs = sb.toString().split("\\n+");
        String regex = "^(docnum\\w{9}|contract\\w{7})$";
        String regex1 = "^(docnum\\w{0,14}|contract\\w{0,14})$";
        String regex2 = "^(docnum\\w{15,}|contract\\w{15,})$";

        StringBuilder valid = new StringBuilder();
        StringBuilder notValid = new StringBuilder();

        for (String doc : docs) {
            doc = doc.trim(); //без этого не правльно работает, enter считается пробелом?
            if (doc.matches(regex)) {
                valid.append(doc + "\n");
            } else if (doc.matches(regex1)) {
                notValid.append(doc + " -- Документ не валиден, т.к. он содержит меньше 15 символов :( \n");
            } else if (doc.matches(regex2)) {
                notValid.append(doc + " -- Документ не валиден, т.к. он содержит больше 15 символов :( \n");
            } else {
                notValid.append(doc + " ¯\\_(ツ)_/¯ \n");
            }
        }

        try (FileWriter fileWriter = new FileWriter("D:\\C37\\valid.txt")) {
            fileWriter.write(valid.toString());
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }

        try (FileWriter fileWriter = new FileWriter("D:\\C37\\notValid.txt")) {
            fileWriter.write(notValid.toString());
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }
}
