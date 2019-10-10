package by.epam.classes_and_objects.fourth;
/*
Составить описание класса для определения времени. Предусмотрите возможности установки
и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводиных
значений. В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения
времени на заданное количество часов, минут и секунд.
 */

import java.util.Objects;

public class Time {

    private int hours;
    private int min;
    private int sec;

    public Time(){
        this(0, 0, 0);
    }

    public Time(int hours, int min, int sec){
        this.hours = (hours < 24) ? hours : 0;
        this.min = (min < 60) ? min : 0;
        this.sec = (sec < 60) ? sec : 0;
    }

    public void setHours(int hours){
        this.hours = (hours < 24) ? hours : 0;
    }

    public int getHours(){
        return hours;
    }

    public void setMin(int min) {
        this.min = (min < 60) ? min : 0;
    }

    public int getMin(){
        return min;
    }

    public void setSec(int sec){
        this.sec = (sec < 60) ? sec : 0;
    }

    public int getSec(){
        return sec;
    }

    @Override
    public String toString(){
        return hours + " : " + min + " : " + sec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hours == time.hours &&
                min == time.min &&
                sec == time.sec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, min, sec);
    }
}
