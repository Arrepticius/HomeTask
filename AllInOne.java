/*Создать класс, который будет хранить в одной целочисленной переменной несколько

значений меньшей длины. Например, возраст, вес, рост и год рождения. Добавить методы

получения и добавления параметров отдельно.
 */
public class AllInOne {

    private long a = 31581651985l;             //объявляем переменные
    private long age;
    private long weight;
    private int height;
    private int yob;

    public static void main(String[] args) {
        AllInOne aLiO = new AllInOne();
        aLiO.setAge(78);
        aLiO.setWeight(61);
        aLiO.setHeight(178);
        aLiO.setYob(1678);


        System.out.println();

    }

    public void setAge(long a) {
        this.a = (a * 1000000000) + (this.a % 1000000000);        //задаем возраст
    }

    public int getAge() {                 //получаем возраст
        long age = this.a / 1000000000;
        return (int) age;
    }

    public void setWeight(long w) {                         //задаем вес
        this.a = (w * 10000000) + (this.a % 100000);
    }

    public int getWeight() {                         //получаем вес
        long weight = (this.a % 1000000000) / 10000000;
        return (int) weight;
    }

    public void setHeight(long h) {                  //задаем рост
        this.a = (h * 10000) + (this.a % 10000);
    }


    public int getHeight() {                         //получаем рост
        long height = (this.a % 10000000) / 10000;
        return (int) height;
    }

    public void setYob(long yob) {
        this.a = (this.a - (this.a % 10000)) + (yob);
    }

    public int getYob() {                        //получаем дату рождения
        long yob = this.a % 10000;
        return (int) yob;
    }
}
