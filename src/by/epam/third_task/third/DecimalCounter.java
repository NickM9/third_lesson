package by.epam.third_task.third;

/*
Опишите класс, реализиющий десятичный счётчик, который может увеличивать или уменьшать
своё значение на единицу в заданном диапазоне. Предусмотрите инициализацию счётчика значениями по умолчанию
и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющий получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

public class DecimalCounter {

    private int min;
    private int max;
    private int current;

    public DecimalCounter(){
        this.min = 0;
        this.max = 99;
        this.current = 0;
    }

    public DecimalCounter(int min, int max){
        this.min = min;
        this.max = max;
        this.current = (int)(Math.random() * 100);
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
}
