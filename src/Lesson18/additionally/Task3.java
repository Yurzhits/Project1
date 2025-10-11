package Lesson18.additionally;

//Подсчёт количества уникальных слов
//Дан список строк List<String> lines.

//Нужно посчитать количество уникальных слов (без учёта регистра).

//Input:
//List<String> lines = List.of(
//    "Stream API is powerful",
//    "Java stream is powerful",
//    "Powerful tools in Java"
//);

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> lines = List.of(
                "Stream API is powerful",
                "Java stream is powerful",
                "Powerful tools in Java"
        );

        long unique = lines.stream()
                .flatMap(line -> Arrays.stream(line.toLowerCase().split("\\W+")))
                .distinct()
                .count();

        System.out.println("Количество уникальных слов: " + unique);
    }
}
