package Lesson6.Task2;

/*Создать класс, описывающий банкомат.
Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100.
Сделать метод для добавления денег в банкомат.

Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение - успешность выполнения
операции.
При снятии денег, функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.

Создать конструктор с тремя параметрами - количеством купюр каждого номинала.*/

import java.util.Scanner;

public class Bank {
    int banknote20;
    int banknote50;
    int banknote100;

    public Bank(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    void plusMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько купюр номиналом 20 вы хотите добавить?");
        int plus20 = scanner.nextInt();
        banknote20 += plus20;
        System.out.println("Сколько купюр номиналом 50 вы хотите добавить?");
        int plus50 = scanner.nextInt();
        banknote50 += plus50;
        System.out.println("Сколько купюр номиналом 100 вы хотите добавить?");
        int plus100 = scanner.nextInt();
        banknote100 += plus100;
    }

    void minusMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму, которую хотите снять:");
        int sum = scanner.nextInt();
        boolean flag = false;
        int allMoney = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;

        if (sum > allMoney) {
            System.out.println("Недостаточно средств в банкомате.");
        } else {
            int num100 = Math.min(sum / 100, banknote100);
            sum = sum - (num100 * 100);
            int num50 = Math.min(sum / 50, banknote50);
            sum = sum - (num50 * 50);
            int num20 = Math.min(sum / 20, banknote20);
            sum = sum - (num20 * 20);

            if (sum == 0) {
                banknote100 -= num100;
                banknote50 -= num50;
                banknote20 -= num20;
                System.out.println("Выдано купюр номиналом:");
                System.out.println("100 BYN: " + num100);
                System.out.println("50 BYN: " + num50);
                System.out.println("20 BYN: " + num20);
                flag = true;
            }
            System.out.println("Произведена ли операция: " + flag);
            System.out.println("Осталось купюр номиналом:");
            System.out.println("100 BYN: " + banknote100);
            System.out.println("50 BYN: " + banknote50);
            System.out.println("20 BYN: " + banknote20);
        }
    }
}
