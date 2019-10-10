package by.epam.classes_and_objects.second;

public class TrainLogic {

    public Train[] sortingByTrainNumber(Train[] trains){

        for (int i = 0; i < trains.length-1; i++){
            int min = i;

            for (int j = i+1; j < trains.length; j++){

                if (trains[j].getTrainNumber() < trains[min].getTrainNumber()){
                    min = j;
                }

                Train tmp = trains[min];
                trains[min] = trains[i];
                trains[i] = tmp;
            }
        }

        return trains;
    }

    public void viewAllTrains(Train[] trains){

        for (int i = 0; i < trains.length; i++){
            System.out.println(trains[i].toString());
        }
    }

    public Train findByTrainNumber (Train[] trains, int userChoice){
        Train res = null;

        for (int i = 0; i < trains.length; i++){

            if (trains[i].getTrainNumber() == userChoice){
                res = trains[i];
            }

        }

        return res;
    }

    public Train[] sortingByDestination(Train[] trains){

        for (int i = 0; i < trains.length-1; i++){
            int min = i;
            for (int j = i+1; j < trains.length; j++){

                if (trains[min].getDestination().compareTo(trains[j].getDestination()) > 0){
                    min = j;
                } else if (trains[min].getDestination().compareTo(trains[j].getDestination()) == 0 &&
                        trains[min].getDepartureTime().compareTo(trains[j].getDepartureTime()) > 0){
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
