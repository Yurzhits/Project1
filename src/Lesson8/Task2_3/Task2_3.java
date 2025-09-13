package Lesson8.Task2_3;

public class Task2_3 {
    public static void main(String[] args) {
        try {
            Man man1 = new Man("Maria", 19, "Student");
            Man man2 = (Man) man1.clone();

            System.out.println("Оригинал: " + man1.info());
            System.out.println("Клон: " + man2.info());

            //изменение оригинала
            man1 = new Man("Anna", 30, "Doctor");

            System.out.println("Оригинал: " + man1.info());
            System.out.println("Клон: " + man2.info());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(); //проверка на интерфейс Cloneble
        }
    }
}