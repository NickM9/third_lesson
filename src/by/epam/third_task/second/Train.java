package by.epam.third_task.second;

/*
Создайте класс Train, содержащий поля: название пункта назначения,
номер поезда, время отправления. Создайте данные в массиве из пяти элементов
типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введён пользователем.
Добавьте возможность сортировки массива по пункту назначения, причём поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
 */

public class Train {

    private String destination;
    private int trainNumber;
    private String departureTime;

    public Train(String destination, int trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Пункт назначения " + destination +
                ", номер поезда " + trainNumber +
                ", время отправления " + departureTime;
    }

    public static Train[] sortingByTrainNumber(Train[] trains){

        for (int i = 0; i < trains.length-1; i++){
            int min = i;

            for (int j = i+1; j < trains.length; j++){

                if (trains[j].trainNumber < trains[min].trainNumber){
                    min = j;
                }

                Train tmp = trains[min];
                trains[min] = trains[i];
                trains[i] = tmp;
            }
        }

        return trains;
    }

    public static void printAllTrains(Train[] trains){

        for (int i = 0; i < trains.length; i++){
            System.out.println(trains[i].toString());
        }

    }

    public static void getInformation(Train[] trains, int userChoice){

        for (int i = 0; i < trains.length; i++){

            if (trains[i].trainNumber == userChoice){
                System.out.println(trains[i].toString());
            }

        }
    }

    public static Train[] sortingByDestination(Train[] trains){

        for (int i = 0; i < trains.length-1; i++){
            int min = i;
            for (int j = i+1; j < trains.length; j++){

                if (trains[min].destination.compareTo(trains[j].destination) > 0){
                    min = j;
                } else if (trains[min].destination.compareTo(trains[j].destination) == 0 &&
                        trains[min].departureTime.compareTo(trains[j].departureTime) > 0){
                    min = j;
                }

            }
            Train tmp = trains[i];
            trains[i] = trains[min];
            trains[min] = tmp;
        }
        return trains;
    }
}
