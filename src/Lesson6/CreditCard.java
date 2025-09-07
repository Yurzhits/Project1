package Lesson6;

import java.util.Scanner;

public class CreditCard {
    int account;
    double sum;
    Scanner scanner = new Scanner(System.in);

    public CreditCard(int account, double sum) {
        this.account = account;
        this.sum = sum;
    }

    double plusCash() {
        System.out.println("Введите сумму для пополнения счета:");
        double cash = scanner.nextDouble();
        sum += cash;
        return sum;
    }

    double minusCash() {
        System.out.println("Введите сумму, которую хотите снять:");
        double cash = scanner.nextDouble();
        sum -= cash;
        return sum;
    }

    void info() {
        System.out.println("На карте с номером " + account + " осталось " + sum + " BYN");
    }
}
