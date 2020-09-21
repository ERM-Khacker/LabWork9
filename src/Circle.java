public class Circle {
    public String color;
    public double circumference; //Длина окружности, измеряем в метрах
    public double circle_radius; //Радиус окружности, измеряем в метрах
    public double area; //Площадь окружности, измеряем в квадратных метрах
    public int diameter;


    public Circle(int diameter) {
        this.diameter = diameter;
        System.out.println("Диаметр пицы " + diameter);
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public Circle(double circle_radius) {
        this.circle_radius = circle_radius;
        circumference = circle_radius * 2 * Math.PI;
        area = circle_radius * circle_radius * Math.PI;
        System.out.println("Длина окружности равняется " + circumference + " метрам!");
        System.out.println("Площадь круга равняется " + area + " квадратным метрам!");
    }

    public Circle(String color, double circle_radius) {
        this.color = color;
        this.circle_radius = circle_radius;
        circumference = circle_radius * 2 * Math.PI;
        area = circle_radius * circle_radius * Math.PI;
        System.out.println("Цвет окружности " + color);
        System.out.println("Длина окружности равняется " + circumference + " метрам!");
        System.out.println("Площадь круга равняется " + area + " квадратных метрам!");
    }
    /**
     * Длину окружности можно вычислить, зная радиус или диаметр круга.
     Радиус равен половине диаметра, а диаметр, соответственно, — двум радиусам (2r).
     Тогда формула имеет вид: C = 2πr,
     где C — длина окружности, r — радиус окружности.
     То есть длина окружности равна удвоенному произведению радиуса на
     число пи (π примерно равно 3,14).
     */
    /**
     * Площадь круга можно вычислить по двум формулам, включающим диаметр или радиус:
     * A = πr2 или A = π(d/2)2, где π – число «пи» (математическая константа, приблизительно равная 3,14),
     * r – радиус круга, d – диаметр круга.
     1.1 Создать класс Circle. Описать поля: радиус длинна окружности, площадь, цвет.
     Создать 2 конструктора, в которые передавать параметры: радиус, и цвет и радиус.

     1.2 Параметры площадь и длинна окружности расcчитать в конструкторе на основе
     радиуса и Pi. Примечание число PI можно взять из класса Math, Math.PI.

     1.3 Создать метод main, в котором создать экземпляр класса Circle. Вывести на экран
     сообщение с данными о длинне окружности, площади и цвета.


     2  Создание комплексного класса.

     2.1 Создать класс Pizza. Описать поля:
     basis – поле типа Circle
     composition – состав пиццы
     name – название пиццы
     cost – цена.

     2.2 Создать конструктор, который принимает в качестве параметров имя, состав, цену и
     диаметр пиццы. Внутри конструктора создать объект класса Circle применив диаметр.


     2.3 Создать класс Pizzeria c методом main в котором создать массив из разных пицц.

     2.4 Вывести в цикле информацию о каждой пицце.

     2.5  Написать JavaDoc для всех классов.
*/
}
