package Lesson15.Task3;

//Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.

//Создать коллекцию, содержащую объекты класса Student.

//Написать метод, который удаляет студентов со средним баллом < 3.
//Если средний балл >= 3, студент переводится на следующий курс.

//Дополнительно написать метод printStudents(List<Student> students, int course),
//который получает список студентов и номер курса.
//А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Student> students= new ArrayList<>();
        students.add(new Student("Maria","374001",3, List.of(10,9,8,10)));
        students.add(new Student("Anna","374002",1, List.of(2,1,3,1)));
        students.add(new Student("Ilya","374001",2, List.of(2,9,7,10)));
        students.add(new Student("Sonya","374003",3, List.of(1,9,8,1)));
        expelledStudent(students);
        printStudents(students,4);
        printStudents(students,3);
        printStudents(students,2);
    }

    public static void expelledStudent(List<Student> students){
        for(int i = students.size() - 1; i >= 0; i--){
            Student student = students.get(i);
            if(student.averageGrade() < 3){
                students.remove(i);
            } else{
                student.setCourse(student.getCourse()+1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на " + course + " курсе:");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
