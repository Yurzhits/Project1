package Lesson18.additionally;

//Фильтрация и преобразование списка сотрудников
//Дан список сотрудников List<Employee> employees.
//Нужно получить список имен сотрудников из отдела "Security", у которых зарплата выше 100_000.
//Ожидаемый результат: List<String> — имена подходящих сотрудников.

import java.util.List;
import java.util.stream.Collectors;

public class Task1_1 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Maria", "Security", 110_000),
                new Employee("Bob", "IT", 110_000),
                new Employee("Sergey", "Security", 180_000),
                new Employee("Ilya", "HR", 15_000),
                new Employee("Rob", "Security", 10_000)
        );
        List<String> names = employees.stream()
                .filter(x -> "Security".equals(x.getDepartment()) && x.getSalary() > 100_000)
                .map(x -> x.getName())
                .collect(Collectors.toList());
        System.out.println("Итог: " + names);
    }
}
