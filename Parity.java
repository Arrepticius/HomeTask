import java.util.Scanner;

/*Создать программу, проверяющую и сообщающую на экран, является ли целое число,

записанное в переменную n, чётным либо нечётным (n – вводит пользователь).
 */
public class Parity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);        //создаем объект класса Scanner

        System.out.print("Enter number : ");      //просим пользывателя ввести число
        int n = scanner.nextInt();      //считываем число

        if (n % 2 == 0)                                            //выводим на консоль
            System.out.println("Digit " + n + " is parity");
        else
            System.out.println("Digit " + n + " is non-parity");


    }

}
