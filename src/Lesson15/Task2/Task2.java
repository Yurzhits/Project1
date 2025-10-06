package Lesson15.Task2;

//Создать класс, который будет хранить в себе коллекцию с названиями животных.
//Реализовать методы удаления и добавления животных по следующим правилам:
//добавляется всегда в начало коллекции, а удаляется всегда из конца.
//Показать работу объекта этого класса в main методе другого класса.

public class Task2 {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.addAnimal("Cat");
        animals.addAnimal("Dog");
        animals.addAnimal("Mouse");
        System.out.println("All: ");
        animals.names();
        animals.deleteAnimal();
        System.out.println("After delete: ");
        animals.names();
    }
}
