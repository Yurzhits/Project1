package Lesson14;

//В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
//Проанализировать и записать в другой файл самое длинное слово.

//unthankfulness?

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try (FileReader fileReader = new FileReader("D:\\C37\\romeo-and-juliet.txt")) {
            int i;
            while ((i = fileReader.read()) != -1) {
                sb.append((char) i);
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }

        String longestWord = findLongest(sb.toString());
        try (FileWriter fileWriter = new FileWriter("D:\\C37\\longestWord.txt", true)) {
            fileWriter.write(longestWord);
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }

    public static String findLongest(String text) {
        String[] arr = text.split("\\W+");
        String longestWord = "";
        for (String word : arr) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
