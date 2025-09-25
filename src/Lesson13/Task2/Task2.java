package Lesson13.Task2;

//Написать try/catch/finally, в котором finally вызван не будет

//Или нужно было по другому как-то делать?

public class Task2 {
    public static void main(String[] args) {
        try {
            //System.out.println("Выходим из программы"); //второй способ
            //System.exit(0);
            while (true) { //первый способ
                System.out.println("finally не выполняется :)");
            }
        } catch (Exception e) {
            System.out.println("Ошибка");
        } finally {
            System.out.println("finally выполнился!!! :(");
        }
    }
}
