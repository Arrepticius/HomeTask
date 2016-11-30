import java.util.Scanner;

/*В три переменные a, b и c записаны три вещественных числа. Создать программу, которая

будет находить и выводить на экран вещественные корни квадратного уравнения

ax^2+bx+c=0, либо сообщать, что корней нет (a, b и c – вводит пользователь).
 */
public class SqrtRoot {
    private double a;                               //объявляем переменные
    private double b;
    private double c;


    public static void main(String[] args) {
        SqrtRoot root = new SqrtRoot();                 //создаем экземпляры классов
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");              //запрашиваем a,b,c
        root.a = scanner.nextDouble();
        System.out.print("Enter b: ");
        root.b = scanner.nextDouble();
        System.out.print("Enter c: ");
        root.c = scanner.nextDouble();

        System.out.println("\nFirst root is: " + root.getX1(root.a, root.b, root.c));  //выводим результат
        System.out.println("Second root is: " + root.getX2(root.a, root.b, root.c));
    }

    public double getX1(double var1, double var2, double var3) {               //вычисляем первый корень
        double x1 = -var1 + (Math.sqrt((Math.pow(var2, 2) - 4 * var1 * var3)));
        return x1;
    }

    public double getX2(double var1, double var2, double var3) {               //вычисляем второй корень
        double x2 = -var1 - (Math.sqrt((Math.pow(var2, 2) - 4 * var1 * var3)));
        return x2;
    }
}
