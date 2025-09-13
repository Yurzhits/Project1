package Lesson8.Task2_1;

//Создать классы "Директор", "Рабочий", "Бухгалтер".
//Реализовать интерфейс с методом, который печатает название должности и имплементировать этот метод в созданные классы.

//Сообщите, если я не так поняла и что-то не доделала в заданиях

public class Task2_1 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.title();
        Accountant accountant = new Accountant();
        accountant.title();
        Director director = new Director();
        director.title();
    }
}
