package Lesson16;

//Задана строка, которая может иметь внутри себя скобки.
//Скобкой считается любой из следующих символов — «(«, «)», «[«, «]», «{«, «}».
//Проверить сбалансированность расстановки скобок в этой строке.
//Набор скобок считается сбалансированной парой, если открывающая скобка "(", "[" и "{" стоит слева от
//соответствующей закрывающей скобки ")", "]" и "} ", соответственно.
//Строка, содержащая пары скобок, не сбалансирована, если набор заключенных в нее скобок не совпадает .

//Например, если ввод «{[(])}», пара квадратных скобок «[]» заключает в себя
//одну несбалансированную открывающую круглую скобку «(». Аналогично, пара
//круглых скобок «() ", заключает в себя одну несбалансированную
//закрывающую квадратную скобку "]". Таким образом, входная строка "{[(])}"
//несбалансированная.

//Пример
//() - сбалансирована
//[()] - сбалансирована
//{[()]} - сбалансирована
//([{{[(())]}}]) - сбалансирована
//{{[]()}}}} - не сбалансирована
//{[(])} - не сбалансирована

import java.util.HashMap;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите скобки: ");
        String brackets = sc.nextLine();

        if (isBalanced(brackets)) {
            System.out.println("Строка сбалансирована.");
        } else {
            System.out.println("Строка не сбалансирована.");
        }
    }

    public static boolean isBalanced(String str) {
        HashMap<Character, Integer> bracketCounts = new HashMap<>();
        bracketCounts.put('(', 0);
        bracketCounts.put('[', 0);
        bracketCounts.put('{', 0);
        bracketCounts.put(')', 0);
        bracketCounts.put(']', 0);
        bracketCounts.put('}', 0);

        for (char ch : str.toCharArray()) {
            if (bracketCounts.containsKey(ch)) {
                bracketCounts.put(ch, bracketCounts.get(ch) + 1);
            }
        }

        return bracketCounts.get('(').equals(bracketCounts.get(')')) &&
                bracketCounts.get('[').equals(bracketCounts.get(']')) &&
                bracketCounts.get('{').equals(bracketCounts.get('}'));
    }

}

