package by.epam.classes_and_objects.second;

/*
Создайте класс Train, содержащий поля: название пункта назначения,
номер поезда, время отправления. Создайте данные в массиве из пяти элементов
типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введён пользователем.
Добавьте возможность сортировки массива по пункту назначения, причём поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
 */

import java.util.Objects;

public class Train {

    private String destination;
    private int trainNumber;
    private String departureTime;

    public Train(String destination, int trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Пункт назначения " + destination +
                ", номер поезда " + trainNumber +
                ", время отправления " + departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return trainNumber == train.trainNumber &&
                destination.equals(train.destination) &&
                departureTime.equals(train.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, trainNumber, departureTime);
    }
}
