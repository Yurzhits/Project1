package Lesson13.Task1;

//Создать класс, в котором будет статический метод.
//Этот метод принимает на вход три параметра: login, password, confirmPassword.
//Все поля имеют тип данных String.
//Длина login должна быть меньше 20 символов и не должен содержать пробелы.
//Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
//Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
//Также password и confirmPassword должны быть равны.
//Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.

//WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами –
//один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
//Метод возвращает true, если значения верны.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите логин:");
            String login = scanner.nextLine();
            System.out.println("Введите пароль:");
            String password = scanner.nextLine();
            System.out.println("Подтверждение пароля:");
            String confirmPassword = scanner.nextLine();
            boolean registration = Account.validation(login, password, confirmPassword);
            System.out.println(login + ", Ваш аккаунт создан!!!! (" + registration + ")");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

