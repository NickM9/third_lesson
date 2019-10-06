package by.epam.third_task.second;

/*
Создайте класс Train, содержащий поля: название пункта назначения,
номер поезда, время отправления. Создайте данные в массиве из пяти элементов
типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введён пользователем.
Добавьте возможность сортировки массива по пункту назначения, причём поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Train[] trains = new Train[5];

        trains[0] = new Train("Хогвартс", 1, "13:23");
        trains[1] = new Train("Татуин", 3, "14:23");
        trains[2] = new Train("Нарния", 5, "17:23");
        trains[3] = new Train("Татуин", 4, "09:13");
        trains[4] = new Train("Звезда смерти", 2, "11:35");

        System.out.println("Поезда сортированные по номерам:\n");
        trains = Train.sortingByTrainNumber(trains);
        Train.printAllTrains(trains);
        System.out.println("-----------------------\n");

        System.out.println("Введите номер поезда для получения информации");
        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();
        Train.getInformation(trains, userChoice);
        System.out.println("-----------------------\n");

        System.out.println("Сортировка поездов по пункту назначения");
        trains = Train.sortingByDestination(trains);
        Train.printAllTrains(trains);
    }
}
