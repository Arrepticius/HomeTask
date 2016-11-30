import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/*Создать класс Dog, который будет содержать 2 поля name и says. В main( ) создать 2

экземпляра класса с name “spot” (says, “Ruff!”) и “scruffy” (says, “Wurf!”). И распечатать поля

объектов.
 */
public class Dog {

    private String name;                    //объявляем перменные
    private String says;

    public Dog(String n, String s) {        //создаем конструктор
        name = n;
        says = s;
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog("spot", "Ruff");         //передаем параметры в конструктор Dog()
        Dog dog2 = new Dog("scruffy", "Wurf");

        System.out.println(dog1.name + " says - " + dog1.says);     //выводим поля на консоль
        System.out.println(dog2.name + " says - " + dog2.says);

    }
}
