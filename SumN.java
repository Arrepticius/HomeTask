import java.util.Scanner;

/*В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую

и выводящую на экран сумму цифр числа n (n – вводит пользователь).
 */
public class SumN {
    private int sum;                                            //объявляем перменные
    private int n;

    private Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        SumN sumN = new SumN();
        sumN.go();
    }

    public void go() {

        System.out.print("Enter your number : ");       //запрашиваем число
        n = scanner.nextInt();

        System.out.println("Your number is " + n);

        while (n > 0) {                     //получаем цифры нашего числа
            sum += n % 10;
            n /= 10;

        }

        System.out.println("The summ of digits : " + sum);      //выводим результат
    }

}
