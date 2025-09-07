package Lesson6.Task1;

/*Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке.
Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
третьей. Выведите на экран текущее состояние всех трех карточек.*/

public class Task1 {
    public static void main(String[] args) {

        CreditCard creditCard1 = new CreditCard(123456, 450);
        CreditCard creditCard2 = new CreditCard(654321, 5550);
        CreditCard creditCard3 = new CreditCard(111111, 675);

        System.out.println("Первая карта:");
        double sum1 = creditCard1.plusCash();
        System.out.println("Вторая карта:");
        double sum2 = creditCard2.plusCash();
        System.out.println("Третья карта:");
        double sum3 = creditCard3.minusCash();

        creditCard1.info();
        creditCard2.info();
        creditCard3.info();
    }
}
