import java.util.Scanner;

/*Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в

переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45 (n и m –

вводит пользователь).
 */
public class CloseToTen {

    private double n;                               //объявляем переменные
    private double m;

    public static void main(String[] args) {

        CloseToTen ten = new CloseToTen();          //создаем экземпляр класса CloseToTen
        ten.go();                                   //запускаем метод go()
    }

    public void go() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");               //запрашиваем оба числа
        n = scanner.nextDouble();
        System.out.print("Enter second number: ");
        m = scanner.nextDouble();

        if ((Math.abs(10 - n)) < (Math.abs(10 - m))) {          //проверяем какое число ближе к 10
            System.out.println(n);
        } else System.out.println(m);
    }
}
