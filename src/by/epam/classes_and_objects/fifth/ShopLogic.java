package by.epam.classes_and_objects.fifth;

public class ShopLogic {

    public Customer[] alphabetSorting(Shop shop){
        Customer[] customers = shop.getCustomers();

        for (int i = 0; i < customers.length-1; i++){
            int min = i;
            for (int j = i+1; j < customers.length; j++){

                if (customers[min].getSurname().compareTo(customers[j].getSurname()) > 0){
                    min = j;
                }
                else if (customers[min].getSurname().compareTo(customers[j].getSurname()) == 0 &&
                        customers[min].getName().compareTo(customers[j].getName()) > 0) {
                    min = j;
                }
                else if (customers[min].getSurname().compareTo(customers[j].getSurname()) == 0 &&
                        customers[min].getName().compareTo(customers[j].getName()) == 0 &&
                        customers[min].getPatronymic().compareTo(customers[j].getPatronymic()) > 0){
                    min = j;
                }
            }

            Customer tmp = customers[i];
            customers[i] = customers[min];
            customers[min] = tmp;
        }
        return customers;
    }

    public Customer[] cardsInInterval(Shop shop, int left, int right){
        Customer[] customers = shop.getCustomers();
        Customer[] cardIntervalCustomers = new Customer[countIntervalCustomers(left, right, customers)];
        int index = 0;

        for (int i = 0; i < customers.length; i++){

            if (customers[i].getCreditCardNumber() >= left && customers[i].getCreditCardNumber() <= right){
                cardIntervalCustomers[index] = customers[i];
                index++;
            }

        }
        return customers;
    }

    public int countIntervalCustomers(int left, int right, Customer[] customers){
        int count = 0;

        for (int i = 0; i < customers.length; i++){

            if (customers[i].getCreditCardNumber() >= left && customers[i].getCreditCardNumber() <= right){
                count++;
            }

        }

        return count;
    }

    public void viewCustomers(Shop shop){

        for(Customer i : shop.getCustomers()){
            System.out.println(i.toString());
        }

    }

}
