package by.epam.classes_and_objects.third;

public class Main {
    public static void main(String[] args) {

        DecimalCounter counter = new DecimalCounter();

        System.out.println("Текущее значение");
        System.out.println(counter.getCurrent());

        counter.setCurrent(50);
        counter.increase();
        System.out.println(counter.getCurrent());

        counter.setCurrent(12);
        counter.decrease();
        System.out.println(counter.getCurrent());

        counter.setCurrent(0);
        counter.decrease();
        System.out.println(counter.getCurrent());

        counter.setCurrent(99);
        counter.increase();
        System.out.println(counter.getCurrent());
    }
}
