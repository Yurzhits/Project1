package Lesson18.main;

//Создать коллекцию класса ArrayList наполнить ее элементами типа Integer.
//С помощью Stream'ов:
//-Удалить дубликаты
//-Оставить только четные элементы
//-Вывести сумму оставшихся элементов в стриме

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList(List.of(1, 1, 2, 3, 7, 0, -34, 2, 66, 3, 7, 0, 5, 9));
        input.stream()
                .distinct()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
    }
}
