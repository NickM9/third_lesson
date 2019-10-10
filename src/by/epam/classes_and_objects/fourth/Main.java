package by.epam.classes_and_objects.fourth;

public class Main {
    public static void main(String[] args) {

        Time clock = new Time();

        clock.setHours(25);
        System.out.println("Часы " + clock.getHours());
        clock.setMin(58);
        System.out.println("Минуты " + clock.getMin());
        clock.setSec(41);
        System.out.println("Секунды " + clock.getSec());
        System.out.println(clock.toString());
        System.out.println("--------------------------\n");

        Time watch = new Time(15, 89, 23);
        System.out.println(watch.toString());
        watch.setMin(42);
        System.out.println("Изменяем минуты на " + watch.getMin());
        System.out.println(watch.toString());
    }
}
