import javax.swing.table.TableRowSorter;
import java.util.Scanner;

/*В переменных a и b лежат положительные длины катетов прямоугольного треугольника.

Вычислить и вывести на экран площадь треугольника и его периметр (a и b – вводит

пользователь).
 */
public class Triangle {

    private double cathetusA;                                       //объявляем переменные
    private double cathetusB;


    public static void main(String[] args) {

        Triangle triangle = new Triangle();                         //создаем экземпляры классов
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first cathetus: ");             //выводим результат
        triangle.cathetusA = scanner.nextDouble();
        System.out.print("Enter second cathetus: ");
        triangle.cathetusB = scanner.nextDouble();

        System.out.println("The perimeter of triangle is: " + triangle.getPerimeter(triangle.cathetusA, triangle.cathetusB));
        System.out.println("The area of triangle is: " + triangle.getArea(triangle.cathetusA, triangle.cathetusB));


    }

    public double getArea(double cat1, double cat2) {               //вычисляем площадь
        double s = (cat1 * cat2) / 2;
        return s;

    }

    public double getPerimeter(double cat1, double cat2) {                  //вычисляем периметр
        double hep = (Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2)));
        double p = hep + cat1 + cat2;
        return p;

    }
}
