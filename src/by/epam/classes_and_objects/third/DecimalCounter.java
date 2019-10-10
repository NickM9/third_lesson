package by.epam.classes_and_objects.third;

/*
Опишите класс, реализиющий десятичный счётчик, который может увеличивать или уменьшать
своё значение на единицу в заданном диапазоне. Предусмотрите инициализацию счётчика значениями по умолчанию
и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющий получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

import java.util.Objects;

public class DecimalCounter {

    private int min;
    private int max;
    private int current;

    public DecimalCounter(int min, int max, int current){
        this.min = min;
        this.max = max;
        this.current = current;
    }

    public DecimalCounter(){
        this(0, 99, 0);
    }

    public int getCurrent(){
        return current;
    }

    public void setCurrent(int current){
        this.current = current;
    }

    public void increase(){
        current++;
        if (current >= max){
            System.out.println("Выход за максимальное значение");
            current--;
        }
    }

    public void decrease(){
        current--;
        if (current < 0){
            System.out.println("Выход за минимальное значение");
            current++;
        }
    }

    @Override
    public String toString() {
        return "DecimalCounter{" +
                "min=" + min +
                ", max=" + max +
                ", current=" + current +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DecimalCounter counter = (DecimalCounter) o;
        return min == counter.min &&
                max == counter.max &&
                current == counter.current;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, max, current);
    }
}
