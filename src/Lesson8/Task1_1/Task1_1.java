package Lesson8.Task1_1;

//Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.

//1_1
//Переопределить методы voice(), eat(String food) чтобы они выводили верную информацию.
//Метод eat может принимать “Meat”, “Grass” и другие строки.
//Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим туда “Grass”
//он должен написать в консоли что любит есть травку.
//Если передадим “Meat” или другую строку то он будет недоволен.

//1_2
//Написать такой конструктор, который запретит создание объекта класса Dog в других классах;
//Найти способ вызывать методы voice(), eat() класса Dog, который позволит обойти ограничение,
//наложенное конструктором выше.
//Объяснить, как работают оба способа.

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите, чем хотите покормить животных (grass/meat, другое никто не любит ;( ):");
        String food = scanner.next();

        Rabbit rabbit = new Rabbit();
        System.out.println("Реакция кролика:");
        rabbit.voice();
        rabbit.eat(food);
        System.out.println(rabbit.reaction);

        Dog dog = new Dog();
        System.out.println("Реакция собаки:");
        dog.voice();
        dog.eat(food);
        System.out.println(dog.reaction);

        Tiger tiger = new Tiger();
        System.out.println("Реакция тигра:");
        tiger.voice();
        tiger.eat(food);
        System.out.println(tiger.reaction);

        //1_2
        System.out.println("Реакция особой собаки:");
        PrivateDog.createPrivateDog();
        dog.voice();
        dog.eat(food);
        System.out.println(dog.reaction);

    }
}
