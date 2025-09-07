package Lesson7.Task2;

/*Создать класс Apple и добавить в него поле color с модификатором доступа private и
инициализировать его. В методе main другого класса создать объект Apple, и не
используя сеттеры изменить значение поля color.*/

public class Task2 {
    public static void main(String[] args) {
        //разные варианты
        Apple apple1 = new Apple();
        Apple apple2 = new Apple("красное");
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        System.out.println(apple1.getColor());
        System.out.println(apple2.getColor());
        apple3.changeColor();
        System.out.println(apple3.getColor());
        //найденный в интернете способ
        try {
            java.lang.reflect.Field field = Apple.class.getDeclaredField("color");
            field.setAccessible(true);
            field.set(apple4, "разноцветное");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(apple4.getColor());
    }
}

//не уверенна, что правильно поняла задание