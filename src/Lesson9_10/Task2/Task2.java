package Lesson9_10.Task2;

//Создать программу для реализации поверхностного и глубокого клонирования объекта класса User.
//Пусть на вход программе будет передаваться тип операции клонирования
//(поверхностное клонирование или глубокое), а также id юзера для клонирования.

import java.util.Scanner;

//посмотрите метод глубоко клонирования в User

public class Task2 {
    public static void main(String[] args) throws CloneNotSupportedException {

        User user1 = new User();
        user1.setName("Илья");
        user1.setId(user1.hashCode());
        user1.setBook(new Book("Преступление и наказание", 350));

        User user2 = new User();
        user2.setName("Артем");
        user2.setId(user2.hashCode());
        user2.setBook(new Book("Колобок", 200));

        User user3 = new User();
        user3.setName("Оксана");
        user3.setId(user3.hashCode());
        user3.setBook(new Book("Как стать успешным. Пособие для чайников", 400));

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип операции клонирования (1-поверхностное, 2-глубокое):");
        int choice = scanner.nextInt();
        System.out.println("Введите id пользователя, которого хотите копировать:");
        int id = scanner.nextInt();
        User user4 = null;
        switch (choice) {
            case 1: {
                if (user1.getId() == id) {
                    user4 = (User) user1.clone();
                } else if (user2.getId() == id) {
                    user4 = (User) user2.clone();
                } else if (user3.getId() == id) {
                    user4 = (User) user3.clone();
                } else {
                    System.out.println("Введен несуществующий id");
                }
                break;
            }
            case 2: {
                if (user1.getId() == id) {
                    user4 = (User) user1.deepClone();
                } else if (user2.getId() == id) {
                    user4 = (User) user2.deepClone();
                } else if (user3.getId() == id) {
                    user4 = (User) user3.deepClone();
                } else {
                    System.out.println("Введен несуществующий id");
                }
                break;
            }
            default: {
                System.out.println("Выбор только между 1 и 2!!!");
                break;
            }
        }
        //Проверка на вид клонирования
        if (user4 != null) {
            System.out.println("Клон: " + user4);
            user4.getBook().setTitle("Измененная книга");
            System.out.println("После изменения названия книги клона:");

            if (user1.getId() == id) {
                System.out.println("Оригинал: " + user1);
            } else if (user2.getId() == id) {
                System.out.println("Оригинал: " + user2);
            } else if (user3.getId() == id) {
                System.out.println("Оригинал: " + user3);
            }
        }
        scanner.close();
    }
}
