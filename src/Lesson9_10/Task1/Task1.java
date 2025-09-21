package Lesson9_10.Task1;

//Создать класс для описания пользователя системы.
//Переопределить в классе методы toString,hashcode и equals.
//Создать несколько экземпляров класса с одним и тем же значением полей
//и сравнить с помощью метода equals.

public class Task1{
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Мария");
        person1.setAge(19);
        person1.setJob("Студент");

        Person person2 = new Person();
        person2.setName("Мария");
        person2.setAge(19);
        person2.setJob("Студент");

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode()==person2.hashCode());
        System.out.println(person1.toString());
        System.out.println(person2.toString());

        Person person3=new Person();
        person3.setName("Сергей");
        person3.setAge(25);
        person3.setJob("Преподаватель");

        System.out.println(person3.equals(person2));
        System.out.println(person1.hashCode()==person3.hashCode());
        System.out.println(person3.toString());

        person2.setAge(20);
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode()==person2.hashCode());
    }
}
