package Lesson15.Task4;

//Представим, что в Java нет коллекции типа ArrayList.

//Создать свой класс, симулирующий работу класса динамической коллекции - т.е. создать свою кастомную коллекцию.
//В основе коллекции будет массив.
//Кастомная коллекция должна хранить элементы разных классов(т.е. это generic).

//Предусмотреть операции(методы):
//1. добавления элемента
//2. удаления элемента
//3. получение элемента по индексу
//4. проверка есть ли элемент в коллекции
//5. очистка всей коллекции

//Предусмотреть конструктор без параметров - создает массив размером по умолчанию.
//Предусмотреть конструктор с задаваемым размером внутреннего массива.

//Предусмотреть возможность автоматического расширения коллекции при добавлении элемента
//в том случае, когда коллекция уже заполнена.

import Lesson15.Task3.Student;

import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        CustomCollection Custom = new CustomCollection();

        Custom.add("Hello");
        Custom.add("world");
        Custom.add("Hi");
        Custom.add("Bye");

        System.out.println(Custom.isContains("Hello"));
        System.out.println(Custom.isContains("Hell"));

        Custom.delete(0);
        System.out.println(Custom);

        System.out.println(Custom.getByIndex(1));
        System.out.println(Custom.getByIndex(0));

        Custom.clear();
        System.out.println(Custom);
    }
}
