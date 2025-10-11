package Lesson18.main;

//Создать набор данных в формате id-name, сохраненный в Мар.
//Необходимо отобрать из этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
//Среди отобранных значений отобрать только те, которые имеют нечетное количество букв в имени.
//После чего вернуть список List имен, записанных буквами задом наперед.

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> input = new HashMap<>();
        input.put(1, "Maria");
        input.put(2, "Sergey");
        input.put(3, "Ilya");
        input.put(4, "Anna");
        input.put(5, "Marina");
        input.put(7, "Lena");
        input.put(8, "Kirill");
        input.put(9, "Milana");
        input.put(10, "Nagibator999");
        input.put(11, "Agent007");
        input.put(12, "Pro2005");
        input.put(13, "Sonya");

        List<Integer> neededID = List.of(1, 2, 5, 8, 9, 13);

        List<String> output = input.entrySet().stream()
                .filter(x -> neededID.contains(x.getKey()))
                .filter((x -> x.getValue().length() % 2 != 0))
                .map(entry -> new StringBuilder(entry.getValue()).reverse().toString())
                .collect(Collectors.toList());

        output.forEach(x -> System.out.println(x));
    }
}
